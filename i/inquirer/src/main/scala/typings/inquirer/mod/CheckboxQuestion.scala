package typings.inquirer.mod

import typings.inquirer.inquirerStrings.checkbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait CheckboxQuestion[T /* <: Answers */]
  extends StObject
     with ListQuestionOptionsBase[T, CheckboxChoiceMap[T]] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_CheckboxQuestion: checkbox
}
object CheckboxQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): CheckboxQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("checkbox")
    __obj.asInstanceOf[CheckboxQuestion[T]]
  }
  
  @scala.inline
  implicit class CheckboxQuestionMutableBuilder[Self <: CheckboxQuestion[?], T /* <: Answers */] (val x: Self & CheckboxQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
