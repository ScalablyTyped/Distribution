package typings.inquirer.mod

import typings.inquirer.inquirerStrings.checkbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxQuestion[T /* <: Answers */] extends ListQuestionOptionsBase[T, CheckboxChoiceMap[T]] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_CheckboxQuestion: checkbox = js.native
}
object CheckboxQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: checkbox): CheckboxQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxQuestion[T]]
  }
  
  @scala.inline
  implicit class CheckboxQuestionMutableBuilder[Self <: CheckboxQuestion[_], T /* <: Answers */] (val x: Self with CheckboxQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
