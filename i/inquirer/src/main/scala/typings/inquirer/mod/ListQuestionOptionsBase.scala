package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list-based question.
  *
  * @template T
  * The type of the answers.
  *
  * @template TChoiceMap
  * The valid choices for the question.
  */
trait ListQuestionOptionsBase[T /* <: Answers */, TChoiceMap]
  extends StObject
     with Question[T] {
  
  /**
    * The choices of the prompt.
    */
  var choices: js.UndefOr[AsyncDynamicQuestionProperty[js.Array[DistinctChoice[T, TChoiceMap]], T]] = js.undefined
  
  /**
    * The number of elements to show on each page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object ListQuestionOptionsBase {
  
  inline def apply[T /* <: Answers */, TChoiceMap](): ListQuestionOptionsBase[T, TChoiceMap] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuestionOptionsBase[T, TChoiceMap]]
  }
  
  extension [Self <: ListQuestionOptionsBase[?, ?], T /* <: Answers */, TChoiceMap](x: Self & (ListQuestionOptionsBase[T, TChoiceMap])) {
    
    inline def setChoices(value: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[T, TChoiceMap]], T]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesFunction1(
      value: T => (js.Array[DistinctChoice[T, TChoiceMap]]) | (js.Promise[js.Array[DistinctChoice[T, TChoiceMap]]])
    ): Self = StObject.set(x, "choices", js.Any.fromFunction1(value))
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setChoicesVarargs(value: (DistinctChoice[T, TChoiceMap])*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
