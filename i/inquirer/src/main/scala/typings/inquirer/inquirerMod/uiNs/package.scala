package typings.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiNs {
  import typings.inquirer.Anon_ChoicesDefault
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.DistinctQuestion

  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: Answers */] = DistinctQuestion[T] with Anon_ChoicesDefault[T]
}
