package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESTDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Settings related to REST compliant update routine
    */
  var restSettings: js.UndefOr[RESTDataSourceSettingsRestSettings] = js.native
}

object RESTDataSourceSettings {
  @scala.inline
  def apply(): RESTDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RESTDataSourceSettings]
  }
  @scala.inline
  implicit class RESTDataSourceSettingsOps[Self <: RESTDataSourceSettings] (val x: Self) extends AnyVal {
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
    def setRestSettings(value: RESTDataSourceSettingsRestSettings): Self = this.set("restSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSettings: Self = this.set("restSettings", js.undefined)
  }
  
}

