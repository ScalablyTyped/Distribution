package typings.i18next.mod

import typings.i18next.i18nextStrings.`3rdParty`
import typings.i18next.i18nextStrings.backend
import typings.i18next.i18nextStrings.i18nFormat
import typings.i18next.i18nextStrings.languageDetector
import typings.i18next.i18nextStrings.logger
import typings.i18next.i18nextStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
}

object Module {
  @scala.inline
  def apply(`type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty`): Module = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
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
    def setType(value: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

