package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Creator extends js.Object {
  /** A comment provided by the user or the application. */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the application/browser used to export the log. */
  var name: java.lang.String
  /** Version of the application/browser used to export the log. */
  var version: java.lang.String
}

object Creator {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String, comment: java.lang.String = null): Creator = {
    val __obj = js.Dynamic.literal(name = name, version = version)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[Creator]
  }
}

