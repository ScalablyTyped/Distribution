package typings.inquirer.mod

import typings.inquirer.anon.IsFinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `InputPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait InputQuestionOptions[T /* <: Answers */] extends Question[T] {
  /**
    * Transforms the value to display to the user.
    *
    * @param input
    * The input provided by the user.
    *
    * @param answers
    * The answers provided by the users.
    *
    * @param flags
    * Additional information about the value.
    *
    * @returns
    * The value to display to the user.
    */
  var transformer: js.UndefOr[
    js.Function3[/* input */ js.Any, /* answers */ T, /* flags */ IsFinal, String | js.Promise[String]]
  ] = js.native
}

object InputQuestionOptions {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](): InputQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuestionOptions[T]]
  }
  @scala.inline
  implicit class InputQuestionOptionsOps[Self <: InputQuestionOptions[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with InputQuestionOptions[T]) extends AnyVal {
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
    def setTransformer(value: (/* input */ js.Any, /* answers */ T, /* flags */ IsFinal) => String | js.Promise[String]): Self = this.set("transformer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTransformer: Self = this.set("transformer", js.undefined)
  }
  
}

