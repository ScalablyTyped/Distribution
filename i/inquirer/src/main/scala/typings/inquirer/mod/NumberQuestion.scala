package typings.inquirer.mod

import typings.inquirer.inquirerStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `NumberPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait NumberQuestion[T /* <: Answers */]
  extends StObject
     with InputQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_NumberQuestion: number
}
object NumberQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): NumberQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[NumberQuestion[T]]
  }
  
  @scala.inline
  implicit class NumberQuestionMutableBuilder[Self <: NumberQuestion[?], T /* <: Answers */] (val x: Self & NumberQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
