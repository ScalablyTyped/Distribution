package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the available question-types.
  *
  * @template T
  * The type of the answers.
  */
trait QuestionMap[T /* <: Answers */] extends js.Object {
  /**
    * The `CheckboxQuestion` type.
    */
  var checkbox: CheckboxQuestion[T]
  /**
    * The `ConfirmQuestion` type.
    */
  var confirm: ConfirmQuestion[T]
  /**
    * The `EditorQuestion` type.
    */
  var editor: EditorQuestion[T]
  /**
    * The `ExpandQuestion` type.
    */
  var expand: ExpandQuestion[T]
  /**
    * The `InputQuestion` type.
    */
  var input: InputQuestion[T]
  /**
    * The `ListQuestion` type.
    */
  var list: ListQuestion[T]
  /**
    * The `NumberQuestion` type.
    */
  var number: NumberQuestion[T]
  /**
    * The `PasswordQuestion` type.
    */
  var password: PasswordQuestion[T]
  /**
    * The `RawListQuestion` type.
    */
  var rawList: RawListQuestion[T]
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
}

