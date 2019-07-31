package typings.inquirer.libObjectsSeparatorMod

import typings.inquirer.inquirerMod.ChoiceBase
import typings.inquirer.inquirerStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice-item separator.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.inquirer.inquirerMod.SeparatorOptions because var conflicts: `type`. Inlined line */ trait Separator extends ChoiceBase {
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
  def apply(line: String, `type`: separator): Separator = {
    val __obj = js.Dynamic.literal(line = line)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Separator]
  }
}

