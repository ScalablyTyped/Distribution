package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.DistinctQuestion
import typings.inquirer.mod.KeyUnion
import typings.inquirer.mod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchAsyncQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchAsyncQuestionProperty")(question.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], answers.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
}
