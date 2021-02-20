package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ListQuestionOptionsMutableBuilder[Self <: ListQuestionOptions[_], T /* <: Answers */] (val x: Self with ListQuestionOptions[T]) extends AnyVal {
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
