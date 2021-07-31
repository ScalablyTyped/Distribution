package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.DistinctQuestion
import typings.inquirer.mod.KeyUnion
import typings.inquirer.mod.UnionToIntersection
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fetchAsyncQuestionPropertyQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Observable_[DistinctQuestion[Answers]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchAsyncQuestionPropertyQuestionProperty")(question.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], answers.asInstanceOf[js.Any])).asInstanceOf[Observable_[DistinctQuestion[Answers]]]
  
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
  
  /**
    * Unpacks a question-property.
    */
  type UnpackQuestionProperty[T] = T | js.Any
}
