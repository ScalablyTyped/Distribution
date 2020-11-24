package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a choice of the `ListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ListChoiceOptions[T /* <: Answers */] extends ChoiceOptions[T] {
  
  /**
    * A value indicating whether the choice is disabled.
    */
  var disabled: js.UndefOr[DynamicQuestionProperty[Boolean | String, T]] = js.native
}
object ListChoiceOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): ListChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChoiceOptions[T]]
  }
  
  @scala.inline
  implicit class ListChoiceOptionsOps[Self <: ListChoiceOptions[_], T /* <: Answers */] (val x: Self with ListChoiceOptions[T]) extends AnyVal {
    
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
    def setDisabledFunction1(value: T => Boolean | String): Self = this.set("disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: DynamicQuestionProperty[Boolean | String, T]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
