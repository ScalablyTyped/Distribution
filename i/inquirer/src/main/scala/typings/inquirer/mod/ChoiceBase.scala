package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice-item.
  */
trait ChoiceBase extends js.Object {
  /**
    * The type of the choice.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChoiceBase {
  @scala.inline
  def apply(`type`: String = null): ChoiceBase = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceBase]
  }
}

