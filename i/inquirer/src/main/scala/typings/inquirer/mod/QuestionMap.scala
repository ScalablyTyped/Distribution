package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the available question-types.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait QuestionMap[T /* <: Answers */] extends js.Object {
  
  /**
    * The `CheckboxQuestion` type.
    */
  var checkbox: CheckboxQuestion[T] = js.native
  
  /**
    * The `ConfirmQuestion` type.
    */
  var confirm: ConfirmQuestion[T] = js.native
  
  /**
    * The `EditorQuestion` type.
    */
  var editor: EditorQuestion[T] = js.native
  
  /**
    * The `ExpandQuestion` type.
    */
  var expand: ExpandQuestion[T] = js.native
  
  /**
    * The `InputQuestion` type.
    */
  var input: InputQuestion[T] = js.native
  
  /**
    * The `ListQuestion` type.
    */
  var list: ListQuestion[T] = js.native
  
  /**
    * The `NumberQuestion` type.
    */
  var number: NumberQuestion[T] = js.native
  
  /**
    * The `PasswordQuestion` type.
    */
  var password: PasswordQuestion[T] = js.native
  
  /**
    * The `RawListQuestion` type.
    */
  var rawList: RawListQuestion[T] = js.native
}
object QuestionMap {
  
  @scala.inline
  def apply[T /* <: Answers */](
    checkbox: CheckboxQuestion[T],
    confirm: ConfirmQuestion[T],
    editor: EditorQuestion[T],
    expand: ExpandQuestion[T],
    input: InputQuestion[T],
    list: ListQuestion[T],
    number: NumberQuestion[T],
    password: PasswordQuestion[T],
    rawList: RawListQuestion[T]
  ): QuestionMap[T] = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], rawList = rawList.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionMap[T]]
  }
  
  @scala.inline
  implicit class QuestionMapOps[Self <: QuestionMap[_], T /* <: Answers */] (val x: Self with QuestionMap[T]) extends AnyVal {
    
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
    def setCheckbox(value: CheckboxQuestion[T]): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirm(value: ConfirmQuestion[T]): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: EditorQuestion[T]): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: ExpandQuestion[T]): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: InputQuestion[T]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: ListQuestion[T]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: NumberQuestion[T]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: PasswordQuestion[T]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawList(value: RawListQuestion[T]): Self = this.set("rawList", value.asInstanceOf[js.Any])
  }
}
