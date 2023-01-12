package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordQuestionOptions[T /* <: Answers */]
  extends StObject
     with InputQuestionOptions[T] {
  
  /**
    * The character to replace the user-input.
    */
  var mask: js.UndefOr[String] = js.undefined
}
object PasswordQuestionOptions {
  
  inline def apply[T /* <: Answers */](): PasswordQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordQuestionOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordQuestionOptions[?], T /* <: Answers */] (val x: Self & PasswordQuestionOptions[T]) extends AnyVal {
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
