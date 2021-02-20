package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
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
trait QuestionMap[T /* <: Answers */] extends StObject {
  
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
  implicit class QuestionMapMutableBuilder[Self <: QuestionMap[_], T /* <: Answers */] (val x: Self with QuestionMap[T]) extends AnyVal {
    
    @scala.inline
    def setCheckbox(value: CheckboxQuestion[T]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirm(value: ConfirmQuestion[T]): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: EditorQuestion[T]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: ExpandQuestion[T]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: InputQuestion[T]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: ListQuestion[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: NumberQuestion[T]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: PasswordQuestion[T]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawList(value: RawListQuestion[T]): Self = StObject.set(x, "rawList", value.asInstanceOf[js.Any])
  }
}
