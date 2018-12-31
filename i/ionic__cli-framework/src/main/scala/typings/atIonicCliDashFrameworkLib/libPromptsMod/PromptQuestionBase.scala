package typings
package atIonicCliDashFrameworkLib.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptQuestionBase
  extends inquirerLib.inquirerMod.inquirerNs.Question[inquirerLib.inquirerMod.inquirerNs.Answers] {
  /**
    * Default value to use if nothing is entered.
    */
  @JSName("default")
  var default_PromptQuestionBase: js.UndefOr[PromptValue] = js.undefined
  /**
    * The fallback value to use in non-TTY mode.
    */
  var fallback: js.UndefOr[PromptValue] = js.undefined
  /**
    * The question to print.
    */
  @JSName("message")
  var message_PromptQuestionBase: java.lang.String
  /**
    * The prompt type for this question.
    *    - 'confirm': Y/n
    *    - 'checkbox': Multi-value selection.
    *    - 'input': Text input.
    *    - 'password': Masked text input.
    *    - 'list': Single-value selection.
    */
  @JSName("type")
  var type_PromptQuestionBase: PromptType
}

