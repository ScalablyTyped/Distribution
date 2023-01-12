package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionMap[T /* <: Answers */] extends StObject {
  
  /**
    * The {@link CheckboxQuestion `CheckboxQuestion<T>`} type.
    */
  var checkbox: CheckboxQuestion[T]
  
  /**
    * The {@link ConfirmQuestion `ConfirmQuestion<T>`} type.
    */
  var confirm: ConfirmQuestion[T]
  
  /**
    * The {@link EditorQuestion `EditorQuestion<T>`} type.
    */
  var editor: EditorQuestion[T]
  
  /**
    * The {@link ExpandQuestion `ExpandQuestion<T>`} type.
    */
  var expand: ExpandQuestion[T]
  
  /**
    * The {@link InputQuestion `InputQuestion<T>`} type.
    */
  var input: InputQuestion[T]
  
  /**
    * The {@link ListQuestion `ListQuestion<T>`} type.
    */
  var list: ListQuestion[T]
  
  /**
    * The {@link NumberQuestion `NumberQuestion<T>`} type.
    */
  var number: NumberQuestion[T]
  
  /**
    * The {@link PasswordQuestion `PasswordQuestion<T>`} type.
    */
  var password: PasswordQuestion[T]
  
  /**
    * The {@link RawListQuestion `RawListQuestion<T>`} type.
    */
  var rawList: RawListQuestion[T]
}
object QuestionMap {
  
  inline def apply[T /* <: Answers */](
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
  implicit open class MutableBuilder[Self <: QuestionMap[?], T /* <: Answers */] (val x: Self & QuestionMap[T]) extends AnyVal {
    
    inline def setCheckbox(value: CheckboxQuestion[T]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: ConfirmQuestion[T]): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: EditorQuestion[T]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: ExpandQuestion[T]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setInput(value: InputQuestion[T]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setList(value: ListQuestion[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: NumberQuestion[T]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: PasswordQuestion[T]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setRawList(value: RawListQuestion[T]): Self = StObject.set(x, "rawList", value.asInstanceOf[js.Any])
  }
}
