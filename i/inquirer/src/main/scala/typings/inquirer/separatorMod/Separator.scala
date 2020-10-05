package typings.inquirer.separatorMod

import typings.inquirer.inquirerStrings.separator
import typings.inquirer.mod.ChoiceBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a choice-item separator.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.inquirer.mod.SeparatorOptions because var conflicts: `type`. Inlined line */ @js.native
trait Separator extends ChoiceBase {
  /**
    * @inheritdoc
    */
  var line: js.UndefOr[String] = js.native
  /**
    * @inheritdoc
    */
  @JSName("type")
  val type_Separator: separator = js.native
}

object Separator {
  @scala.inline
  def apply(`type`: separator): Separator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
  @scala.inline
  implicit class SeparatorOps[Self <: Separator] (val x: Self) extends AnyVal {
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
    def setType(value: separator): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

