package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: typings.inquirer.mod.Answers */] = typings.inquirer.mod.DistinctQuestion[T] with typings.inquirer.anon.Default[T]
}
