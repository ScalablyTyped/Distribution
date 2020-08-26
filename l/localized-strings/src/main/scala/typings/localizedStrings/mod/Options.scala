package typings.localizedStrings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var customLanguageInterface: js.UndefOr[GetInterfaceLanguageCallback] = js.native
  var logsEnabled: js.UndefOr[Boolean] = js.native
  var pseudo: js.UndefOr[Boolean] = js.native
  var pseudoMultipleLanguages: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCustomLanguageInterface(value: () => String): Self = this.set("customLanguageInterface", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCustomLanguageInterface: Self = this.set("customLanguageInterface", js.undefined)
    @scala.inline
    def setLogsEnabled(value: Boolean): Self = this.set("logsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogsEnabled: Self = this.set("logsEnabled", js.undefined)
    @scala.inline
    def setPseudo(value: Boolean): Self = this.set("pseudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudo: Self = this.set("pseudo", js.undefined)
    @scala.inline
    def setPseudoMultipleLanguages(value: Boolean): Self = this.set("pseudoMultipleLanguages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoMultipleLanguages: Self = this.set("pseudoMultipleLanguages", js.undefined)
  }
  
}

