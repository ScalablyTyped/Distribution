package typings.inquirer.mod

import typings.inquirer.inquirerStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `InputPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait InputQuestion[T /* <: Answers */] extends InputQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_InputQuestion: js.UndefOr[input] = js.native
}
object InputQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): InputQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuestion[T]]
  }
  
  @scala.inline
  implicit class InputQuestionMutableBuilder[Self <: InputQuestion[_], T /* <: Answers */] (val x: Self with InputQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: input): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
