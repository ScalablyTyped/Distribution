package typings.inquirer.choiceMod

import typings.inquirer.mod.Answers
import typings.inquirer.mod.CheckboxChoiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a choice for several question-types.
  *
  * @template T
  * The type of the answers.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.inquirer.mod.ChoiceBase because Already inherited
- typings.inquirer.mod.ChoiceOptions because Already inherited
- typings.inquirer.mod.ExpandChoiceOptions because var conflicts: extra, name, short, `type`, value. Inlined key */ @js.native
trait Choice[T /* <: Answers */] extends CheckboxChoiceOptions[T] {
  /**
    * @inheritdoc
    */
  @JSName("disabled")
  var disabled_Choice: Boolean = js.native
  /**
    * The key to press for selecting the choice.
    *
    * @inheritdoc
    */
  var key: js.UndefOr[String] = js.native
  /**
    * @inheritdoc
    */
  @JSName("name")
  var name_Choice: String = js.native
  /**
    * @inheritdoc
    */
  @JSName("short")
  var short_Choice: String = js.native
}

object Choice {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](disabled: Boolean, name: String, short: String): Choice[T] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choice[T]]
  }
  @scala.inline
  implicit class ChoiceOps[Self <: Choice[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with Choice[T]) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

