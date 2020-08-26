package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `ExpandPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ExpandChoiceOptions[T /* <: Answers */] extends ChoiceOptions[T] {
  /**
    * The key to press for selecting the choice.
    */
  var key: js.UndefOr[String] = js.native
}

object ExpandChoiceOptions {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](): ExpandChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandChoiceOptions[T]]
  }
  @scala.inline
  implicit class ExpandChoiceOptionsOps[Self <: ExpandChoiceOptions[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with ExpandChoiceOptions[T]) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

