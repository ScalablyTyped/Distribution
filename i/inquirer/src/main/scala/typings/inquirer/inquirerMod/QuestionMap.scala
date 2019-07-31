package typings.inquirer.inquirerMod

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
    val __obj = js.Dynamic.literal(checkbox = checkbox, confirm = confirm, editor = editor, expand = expand, input = input, list = list, number = number, password = password, rawList = rawList)
  
    __obj.asInstanceOf[QuestionMap[T]]
  }
}

