package typings.highcharts.exportDataMod.highchartsAugmentingMod

import typings.highcharts.highchartsStrings.DELETE
import typings.highcharts.highchartsStrings.GET
import typings.highcharts.highchartsStrings.POST
import typings.highcharts.highchartsStrings.UPDATE
import typings.highcharts.highchartsStrings.json
import typings.highcharts.highchartsStrings.octet
import typings.highcharts.highchartsStrings.text
import typings.highcharts.highchartsStrings.xml
import typings.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxSettingsObject extends js.Object {
  var data: String | Dictionary[_] = js.native
  var dataType: json | octet | text | xml = js.native
  var error: js.Function = js.native
  var headers: Dictionary[String] = js.native
  var success: js.Function = js.native
  var `type`: DELETE | GET | POST | UPDATE = js.native
  var url: String = js.native
}

object AjaxSettingsObject {
  @scala.inline
  def apply(
    data: String | Dictionary[_],
    dataType: json | octet | text | xml,
    error: js.Function,
    headers: Dictionary[String],
    success: js.Function,
    `type`: DELETE | GET | POST | UPDATE,
    url: String
  ): AjaxSettingsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettingsObject]
  }
  @scala.inline
  implicit class AjaxSettingsObjectOps[Self <: AjaxSettingsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: String | Dictionary[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataType(value: json | octet | text | xml): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Function): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Dictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: js.Function): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DELETE | GET | POST | UPDATE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

