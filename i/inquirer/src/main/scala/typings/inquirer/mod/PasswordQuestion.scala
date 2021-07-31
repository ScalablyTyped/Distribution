package typings.inquirer.mod

import typings.inquirer.inquirerStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `PasswordPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait PasswordQuestion[T /* <: Answers */]
  extends StObject
     with PasswordQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_PasswordQuestion: password
}
object PasswordQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): PasswordQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("password")
    __obj.asInstanceOf[PasswordQuestion[T]]
  }
  
  @scala.inline
  implicit class PasswordQuestionMutableBuilder[Self <: PasswordQuestion[?], T /* <: Answers */] (val x: Self & PasswordQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
