package typings.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prompts {
  import typings.inquirer.Anon_Choices
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.LiteralUnion
  import typings.inquirer.inquirerMod.Question
  import typings.inquirer.inquirerStrings.answered
  import typings.inquirer.inquirerStrings.done
  import typings.inquirer.inquirerStrings.idle
  import typings.inquirer.inquirerStrings.loading
  import typings.inquirer.inquirerStrings.pending
  import typings.std.Record

  /**
    * Provides a set of prompt-constructors.
    */
  type PromptCollection = Record[String, PromptConstructor]
  /**
    * Provides a base for and prompt-options.
    *
    * @template T
    * The type of the answers.
    */
  type PromptOptions[T /* <: Question[Answers] */] = T with Anon_Choices
  /**
    * Represents the state of a prompt.
    */
  type PromptState = LiteralUnion[pending | idle | loading | answered | done, String]
}
