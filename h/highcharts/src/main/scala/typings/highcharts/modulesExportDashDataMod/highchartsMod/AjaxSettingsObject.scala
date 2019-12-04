package typings.highcharts.modulesExportDashDataMod.highchartsMod

import typings.highcharts.highchartsMod.Dictionary
import typings.highcharts.highchartsStrings.DELETE
import typings.highcharts.highchartsStrings.GET
import typings.highcharts.highchartsStrings.POST
import typings.highcharts.highchartsStrings.UPDATE
import typings.highcharts.highchartsStrings.json
import typings.highcharts.highchartsStrings.octet
import typings.highcharts.highchartsStrings.text
import typings.highcharts.highchartsStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettingsObject extends js.Object {
  var data: String | Dictionary[_]
  var dataType: json | octet | text | xml
  var error: js.Function
  var headers: Dictionary[String]
  var success: js.Function
  var `type`: DELETE | GET | POST | UPDATE
  var url: String
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
}

