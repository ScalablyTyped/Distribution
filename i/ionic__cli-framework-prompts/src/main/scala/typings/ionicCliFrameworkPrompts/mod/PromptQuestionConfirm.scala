package typings.ionicCliFrameworkPrompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptQuestionConfirm
  extends PromptQuestionBase
     with PromptQuestion {
  @JSName("default")
  var default_PromptQuestionConfirm: js.UndefOr[PromptValueConfirm] = js.native
  @JSName("fallback")
  var fallback_PromptQuestionConfirm: js.UndefOr[PromptValueConfirm] = js.native
  @JSName("type")
  var type_PromptQuestionConfirm: PromptTypeConfirm = js.native
}

object PromptQuestionConfirm {
  @scala.inline
  def apply(message: String, `type`: PromptTypeConfirm): PromptQuestionConfirm = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionConfirm]
  }
  @scala.inline
  implicit class PromptQuestionConfirmOps[Self <: PromptQuestionConfirm] (val x: Self) extends AnyVal {
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
    def setType(value: PromptTypeConfirm): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: PromptValueConfirm): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFallback(value: PromptValueConfirm): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
  }
  
}

