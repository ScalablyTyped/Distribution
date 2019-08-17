package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsUtilsMod {
  import typings.inquirer.inquirerMod.Answers
  import typings.inquirer.inquirerMod.DistinctQuestion
  import typings.inquirer.inquirerMod.KeyUnion
  import typings.inquirer.inquirerMod.UnionToIntersection

  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
  /**
    * Unpacks a question-property.
    */
  type UnpackQuestionProperty[T] = T | js.Any
}
