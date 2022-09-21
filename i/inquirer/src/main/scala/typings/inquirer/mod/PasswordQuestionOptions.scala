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
  
  extension [Self <: PasswordQuestionOptions[?], T /* <: Answers */](x: Self & PasswordQuestionOptions[T]) {
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
