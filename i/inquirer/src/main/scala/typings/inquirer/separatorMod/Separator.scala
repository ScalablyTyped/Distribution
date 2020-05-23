package typings.inquirer.separatorMod

import typings.inquirer.inquirerStrings.separator
import typings.inquirer.mod.ChoiceBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice-item separator.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.inquirer.mod.SeparatorOptions because var conflicts: `type`. Inlined line */ trait Separator extends ChoiceBase {
  /**
    * @inheritdoc
    */
  var line: js.UndefOr[String]
  /**
    * @inheritdoc
    */
  @JSName("type")
  val type_Separator: separator
}

object Separator {
  @scala.inline
  def apply(`type`: separator, line: String = null): Separator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
}

