package typings.harFormat.mod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
}

