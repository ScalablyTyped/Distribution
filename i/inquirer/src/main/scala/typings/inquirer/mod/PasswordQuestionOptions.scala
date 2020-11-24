package typings.inquirer.mod

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
trait PasswordQuestionOptions[T /* <: Answers */] extends InputQuestionOptions[T] {
  
  /**
    * The character to replace the user-input.
    */
  var mask: js.UndefOr[String] = js.native
}
object PasswordQuestionOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): PasswordQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordQuestionOptions[T]]
  }
  
  @scala.inline
  implicit class PasswordQuestionOptionsOps[Self <: PasswordQuestionOptions[_], T /* <: Answers */] (val x: Self with PasswordQuestionOptions[T]) extends AnyVal {
    
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
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
  }
}
