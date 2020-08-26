package typings.inquirer.mod

import typings.inquirer.inquirerStrings.choice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ChoiceOptions[T /* <: Answers */] extends ChoiceBase {
  /**
    * The extra properties of the choice.
    */
  var extra: js.UndefOr[js.Any] = js.native
  /**
    * The name of the choice to show to the user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The short form of the name of the choice.
    */
  var short: js.UndefOr[String] = js.native
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ChoiceOptions: js.UndefOr[choice] = js.native
  /**
    * The value of the choice.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object ChoiceOptions {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](): ChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceOptions[T]]
  }
  @scala.inline
  implicit class ChoiceOptionsOps[Self <: ChoiceOptions[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with ChoiceOptions[T]) extends AnyVal {
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
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
    @scala.inline
    def setType(value: choice): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

