package typings.inquirer.mod

import typings.inquirer.inquirerStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputQuestion[T /* <: Answers */]
  extends StObject
     with InputQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_InputQuestion: js.UndefOr[input] = js.undefined
}
object InputQuestion {
  
  inline def apply[T /* <: Answers */](): InputQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuestion[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputQuestion[?], T /* <: Answers */] (val x: Self & InputQuestion[T]) extends AnyVal {
    
    inline def setType(value: input): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
