package typings.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptQuestionCheckbox
  extends PromptQuestionBase
     with PromptQuestion {
  @JSName("default")
  var default_PromptQuestionCheckbox: js.UndefOr[PromptValueCheckbox] = js.native
  @JSName("fallback")
  var fallback_PromptQuestionCheckbox: js.UndefOr[PromptValueCheckbox] = js.native
  @JSName("type")
  var type_PromptQuestionCheckbox: PromptTypeCheckbox = js.native
}

object PromptQuestionCheckbox {
  @scala.inline
  def apply(message: String, `type`: PromptTypeCheckbox): PromptQuestionCheckbox = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionCheckbox]
  }
  @scala.inline
  implicit class PromptQuestionCheckboxOps[Self <: PromptQuestionCheckbox] (val x: Self) extends AnyVal {
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
    def setType(value: PromptTypeCheckbox): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultVarargs(value: String*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: PromptValueCheckbox): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFallbackVarargs(value: String*): Self = this.set("fallback", js.Array(value :_*))
    @scala.inline
    def setFallback(value: PromptValueCheckbox): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
  }
  
}

