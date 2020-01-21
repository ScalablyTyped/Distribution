package typings.inquirer

import typings.inquirer.inquirerStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeparator extends js.Object {
  var `type`: separator
}

object AnonSeparator {
  @scala.inline
  def apply(`type`: separator): AnonSeparator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeparator]
  }
}

