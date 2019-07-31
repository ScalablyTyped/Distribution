package typings.inquirer.inquirerMod

import typings.inquirer.Anon_ChoicesDefault
import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.DistinctQuestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiNs {
  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: Answers */] = DistinctQuestion[T] with Anon_ChoicesDefault[T]
}
