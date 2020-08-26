package typings.i18nJs.mod

import typings.i18nJs.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateOptions extends InterpolateOptions {
  var defaultValue: js.UndefOr[String] = js.native
  var defaults: js.UndefOr[js.Array[Message | typings.i18nJs.anon.Scope]] = js.native
  var message: js.UndefOr[String] = js.native
  var scope: js.UndefOr[Scope] = js.native
}

object TranslateOptions {
  @scala.inline
  def apply(): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateOptions]
  }
  @scala.inline
  implicit class TranslateOptionsOps[Self <: TranslateOptions] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultsVarargs(value: (Message | typings.i18nJs.anon.Scope)*): Self = this.set("defaults", js.Array(value :_*))
    @scala.inline
    def setDefaults(value: js.Array[Message | typings.i18nJs.anon.Scope]): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

