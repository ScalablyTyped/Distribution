package typings.inquirer.mod

import typings.inquirer.inquirerStrings.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `EditorPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait EditorQuestion[T /* <: Answers */] extends Question[T] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_EditorQuestion: editor = js.native
}

object EditorQuestion {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](`type`: editor): EditorQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorQuestion[T]]
  }
  @scala.inline
  implicit class EditorQuestionOps[Self <: EditorQuestion[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with EditorQuestion[T]) extends AnyVal {
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
    def setType(value: editor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

