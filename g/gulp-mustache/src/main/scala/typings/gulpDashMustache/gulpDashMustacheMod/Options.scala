package typings.gulpDashMustache.gulpDashMustacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extension: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(extension: String = null, tags: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Options]
  }
}

