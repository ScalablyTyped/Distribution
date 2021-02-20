package typings.inquirer.mod

import typings.inquirer.inquirerStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `NumberPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait NumberQuestion[T /* <: Answers */] extends InputQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_NumberQuestion: number = js.native
}
object NumberQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: number): NumberQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberQuestion[T]]
  }
  
  @scala.inline
  implicit class NumberQuestionMutableBuilder[Self <: NumberQuestion[_], T /* <: Answers */] (val x: Self with NumberQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
