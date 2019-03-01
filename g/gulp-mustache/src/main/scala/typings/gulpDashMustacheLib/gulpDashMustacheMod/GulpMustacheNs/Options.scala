package typings
package gulpDashMustacheLib.gulpDashMustacheMod.GulpMustacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extension: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(extension: java.lang.String = null, tags: js.Array[java.lang.String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Options]
  }
}

