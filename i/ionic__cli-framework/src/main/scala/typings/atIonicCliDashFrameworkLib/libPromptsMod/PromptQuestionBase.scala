package typings
package atIonicCliDashFrameworkLib.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped inquirer.inquirer.ListQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.RawListQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.ExpandQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.CheckboxQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.ConfirmQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.InputQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.NumberQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.PasswordQuestion<inquirer.inquirer.Answers> | inquirer.inquirer.EditorQuestion<inquirer.inquirer.Answers> */ trait PromptQuestionBase extends js.Object {
  /**
    * Default value to use if nothing is entered.
    */
  var default: js.UndefOr[PromptValue] = js.undefined
  /**
    * The fallback value to use in non-TTY mode.
    */
  var fallback: js.UndefOr[PromptValue] = js.undefined
  /**
    * The question to print.
    */
  var message: java.lang.String
  /**
    * The prompt type for this question.
    *    - 'confirm': Y/n
    *    - 'checkbox': Multi-value selection.
    *    - 'input': Text input.
    *    - 'password': Masked text input.
    *    - 'list': Single-value selection.
    */
  var `type`: PromptType
}

object PromptQuestionBase {
  @scala.inline
  def apply(
    message: java.lang.String,
    `type`: PromptType,
    default: PromptValue = null,
    fallback: PromptValue = null
  ): PromptQuestionBase = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionBase]
  }
}

