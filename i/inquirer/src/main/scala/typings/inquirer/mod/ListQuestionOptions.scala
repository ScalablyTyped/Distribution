package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `ListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ListQuestionOptions[T /* <: Answers */] extends ListQuestionOptionsBase[T, ListChoiceMap[T]] {
  
  /**
    * A value indicating whether choices in a list should be looped.
    */
  var loop: js.UndefOr[Boolean] = js.native
}
object ListQuestionOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): ListQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuestionOptions[T]]
  }
  
  @scala.inline
  implicit class ListQuestionOptionsOps[Self <: ListQuestionOptions[_], T /* <: Answers */] (val x: Self with ListQuestionOptions[T]) extends AnyVal {
    
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
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
  }
}
