package typings.ionicCliFrameworkPrompts.mod

import typings.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptQuestionBase
  extends typings.inquirer.mod.Question[Answers] {
  /**
    * Default value to use if nothing is entered.
    */
  @JSName("default")
  var default_PromptQuestionBase: js.UndefOr[PromptValue] = js.native
  /**
    * The fallback value to use in non-TTY mode.
    */
  var fallback: js.UndefOr[PromptValue] = js.native
  /**
    * The question to print.
    */
  @JSName("message")
  var message_PromptQuestionBase: String = js.native
  /**
    * The prompt type for this question.
    *    - 'confirm': Y/n
    *    - 'checkbox': Multi-value selection.
    *    - 'input': Text input.
    *    - 'password': Masked text input.
    *    - 'list': Single-value selection.
    */
  @JSName("type")
  var type_PromptQuestionBase: PromptType = js.native
}

object PromptQuestionBase {
  @scala.inline
  def apply(message: String, `type`: PromptType): PromptQuestionBase = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionBase]
  }
  @scala.inline
  implicit class PromptQuestionBaseOps[Self <: PromptQuestionBase] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PromptType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultVarargs(value: String*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: PromptValue): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFallbackVarargs(value: String*): Self = this.set("fallback", js.Array(value :_*))
    @scala.inline
    def setFallback(value: PromptValue): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
  }
  
}

