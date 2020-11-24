package typings.inquirer.mod

import typings.inquirer.inquirerStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `PasswordPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait PasswordQuestion[T /* <: Answers */] extends PasswordQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_PasswordQuestion: password = js.native
}
object PasswordQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: password): PasswordQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordQuestion[T]]
  }
  
  @scala.inline
  implicit class PasswordQuestionOps[Self <: PasswordQuestion[_], T /* <: Answers */] (val x: Self with PasswordQuestion[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: password): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
