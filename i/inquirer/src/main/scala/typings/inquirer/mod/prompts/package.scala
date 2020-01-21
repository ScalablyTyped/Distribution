package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prompts {
  /**
    * Provides a set of prompt-constructors.
    */
  type PromptCollection = typings.std.Record[java.lang.String, typings.inquirer.mod.prompts.PromptConstructor]
  /**
    * Provides a base for and prompt-options.
    *
    * @template T
    * The type of the answers.
    */
  type PromptOptions[T /* <: typings.inquirer.mod.Question[typings.inquirer.mod.Answers] */] = T with typings.inquirer.AnonChoices
  /**
    * Represents the state of a prompt.
    */
  type PromptState = typings.inquirer.mod.LiteralUnion[
    typings.inquirer.inquirerStrings.pending | typings.inquirer.inquirerStrings.idle | typings.inquirer.inquirerStrings.loading | typings.inquirer.inquirerStrings.answered | typings.inquirer.inquirerStrings.done, 
    java.lang.String
  ]
}
