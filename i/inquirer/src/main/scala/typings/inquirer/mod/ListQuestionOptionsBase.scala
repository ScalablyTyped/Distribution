package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait ListQuestionOptionsBase[T, TChoiceMap] extends Question[T] {
  
  /**
    * The choices of the prompt.
    */
  var choices: js.UndefOr[AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T]] = js.native
  
  /**
    * The number of elements to show on each page.
    */
  var pageSize: js.UndefOr[Double] = js.native
}
object ListQuestionOptionsBase {
  
  @scala.inline
  def apply[T, TChoiceMap](): ListQuestionOptionsBase[T, TChoiceMap] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuestionOptionsBase[T, TChoiceMap]]
  }
  
  @scala.inline
  implicit class ListQuestionOptionsBaseOps[Self <: ListQuestionOptionsBase[_, _], T, TChoiceMap] (val x: Self with (ListQuestionOptionsBase[T, TChoiceMap])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChoicesVarargs(value: DistinctChoice[TChoiceMap]*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoicesFunction1(
      value: T => js.Array[DistinctChoice[TChoiceMap]] | js.Promise[js.Array[DistinctChoice[TChoiceMap]]]
    ): Self = this.set("choices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChoices(value: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
}
