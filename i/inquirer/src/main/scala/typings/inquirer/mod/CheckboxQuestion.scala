package typings.inquirer.mod

import typings.inquirer.inquirerStrings.checkbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxQuestion[T /* <: Answers */]
  extends StObject
     with LoopableListQuestionOptionsBase[T, CheckboxChoiceMap[T]] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_CheckboxQuestion: checkbox
}
object CheckboxQuestion {
  
  inline def apply[T /* <: Answers */](): CheckboxQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("checkbox")
    __obj.asInstanceOf[CheckboxQuestion[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxQuestion[?], T /* <: Answers */] (val x: Self & CheckboxQuestion[T]) extends AnyVal {
    
    inline def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
