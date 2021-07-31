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
trait ListQuestionOptionsBase[T, TChoiceMap]
  extends StObject
     with Question[T] {
  
  /**
    * The choices of the prompt.
    */
  var choices: js.UndefOr[AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T]] = js.undefined
  
  /**
    * The number of elements to show on each page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object ListQuestionOptionsBase {
  
  @scala.inline
  def apply[T, TChoiceMap](): ListQuestionOptionsBase[T, TChoiceMap] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuestionOptionsBase[T, TChoiceMap]]
  }
  
  @scala.inline
  implicit class ListQuestionOptionsBaseMutableBuilder[Self <: ListQuestionOptionsBase[?, ?], T, TChoiceMap] (val x: Self & (ListQuestionOptionsBase[T, TChoiceMap])) extends AnyVal {
    
    @scala.inline
    def setChoices(value: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesFunction1(
      value: T => js.Array[DistinctChoice[TChoiceMap]] | js.Promise[js.Array[DistinctChoice[TChoiceMap]]]
    ): Self = StObject.set(x, "choices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    @scala.inline
    def setChoicesVarargs(value: DistinctChoice[TChoiceMap]*): Self = StObject.set(x, "choices", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
