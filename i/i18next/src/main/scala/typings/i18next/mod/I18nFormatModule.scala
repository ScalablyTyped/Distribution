package typings.i18next.mod

import typings.i18next.i18nextStrings.i18nFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nFormatModule extends Module {
  @JSName("type")
  var type_I18nFormatModule: i18nFormat = js.native
}

object I18nFormatModule {
  @scala.inline
  def apply(`type`: i18nFormat): I18nFormatModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nFormatModule]
  }
  @scala.inline
  implicit class I18nFormatModuleOps[Self <: I18nFormatModule] (val x: Self) extends AnyVal {
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
    def setType(value: i18nFormat): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

