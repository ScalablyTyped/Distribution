package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a separator.
  */
trait SeparatorOptions extends js.Object {
  /**
    * Gets or sets the text of the separator.
    */
  var line: js.UndefOr[String] = js.undefined
  /**
    * Gets the type of the choice.
    */
  var `type`: separator
}

object SeparatorOptions {
  @scala.inline
  def apply(`type`: separator, line: String = null): SeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[SeparatorOptions]
  }
}

