package typings.inquirer

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.DistinctQuestion
import typings.inquirer.inquirerMod.KeyUnion
import typings.inquirer.inquirerMod.UnionToIntersection
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
@js.native
object libUtilsUtilsMod extends js.Object {
  def fetchAsyncQuestionPropertyQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Observable[DistinctQuestion[Answers]] = js.native
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
  /**
    * Unpacks a question-property.
    */
  type UnpackQuestionProperty[T] = T | js.Any
}

