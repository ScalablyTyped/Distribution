package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Override the callback function name in a jsonp request. Sets option jsonp in $.ajax functionbool Setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation
    *
    */
  var jsonp: js.UndefOr[String | Boolean] = js.native
  /**
    * Specify the callback function name for a JSONP request. Sets option jsonpCallback in $.ajax function
    */
  var jsonpCallback: js.UndefOr[String | js.Function] = js.native
  /**
    * Type of the data source.
    */
  var `type`: js.UndefOr[String] = js.native
}

object JSONPDataSourceSettings {
  @scala.inline
  def apply(): JSONPDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONPDataSourceSettings]
  }
  @scala.inline
  implicit class JSONPDataSourceSettingsOps[Self <: JSONPDataSourceSettings] (val x: Self) extends AnyVal {
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
    def setJsonp(value: String | Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    @scala.inline
    def setJsonpCallback(value: String | js.Function): Self = this.set("jsonpCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonpCallback: Self = this.set("jsonpCallback", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

