package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `PasswordPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait PasswordQuestionOptions[T /* <: Answers */]
  extends StObject
     with InputQuestionOptions[T] {
  
  /**
    * The character to replace the user-input.
    */
  var mask: js.UndefOr[String] = js.undefined
}
object PasswordQuestionOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): PasswordQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordQuestionOptions[T]]
  }
  
  @scala.inline
  implicit class PasswordQuestionOptionsMutableBuilder[Self <: PasswordQuestionOptions[?], T /* <: Answers */] (val x: Self & PasswordQuestionOptions[T]) extends AnyVal {
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
