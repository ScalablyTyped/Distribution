package typings.inquirer.mod

import typings.inquirer.inquirerStrings.confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `ConfirmPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ConfirmQuestion[T /* <: Answers */] extends Question[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ConfirmQuestion: confirm = js.native
}
object ConfirmQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: confirm): ConfirmQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmQuestion[T]]
  }
  
  @scala.inline
  implicit class ConfirmQuestionOps[Self <: ConfirmQuestion[_], T /* <: Answers */] (val x: Self with ConfirmQuestion[T]) extends AnyVal {
    
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
    def setType(value: confirm): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
