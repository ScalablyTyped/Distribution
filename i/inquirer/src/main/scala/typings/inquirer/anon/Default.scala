package typings.inquirer.anon

import typings.inquirer.mod.AllChoiceMap
import typings.inquirer.mod.Answers
import typings.inquirer.mod.ChoiceCollection
import typings.inquirer.mod.DistinctChoice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default[T /* <: Answers */] extends js.Object {
  
  /**
    * The choices of the question.
    */
  var choices: ChoiceCollection[T] = js.native
  
  /**
    * The default value of the question.
    */
  var default: js.Any = js.native
  
  /**
    * The message to show to the user.
    */
  var message: String = js.native
  
  /**
    * The type of the question.
    */
  var `type`: String = js.native
}
object Default {
  
  @scala.inline
  def apply[T /* <: Answers */](choices: ChoiceCollection[T], default: js.Any, message: String, `type`: String): Default[T] = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
  
  @scala.inline
  implicit class DefaultOps[Self <: Default[_], T /* <: Answers */] (val x: Self with Default[T]) extends AnyVal {
    
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
    def setChoicesVarargs(value: DistinctChoice[AllChoiceMap[Answers]]*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: ChoiceCollection[T]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
