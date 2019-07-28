package typings.harDashFormat.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  /** A comment provided by the user or the application. */
  var comment: js.UndefOr[String] = js.undefined
  /** Name of the application/browser used to export the log. */
  var name: String
  /** Version of the application/browser used to export the log. */
  var version: String
}

object Browser {
  @scala.inline
  def apply(name: String, version: String, comment: String = null): Browser = {
    val __obj = js.Dynamic.literal(name = name, version = version)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[Browser]
  }
}

