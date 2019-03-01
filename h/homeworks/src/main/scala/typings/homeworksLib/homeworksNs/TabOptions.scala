package typings
package homeworksLib.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.0
  */
trait TabOptions extends js.Object {
  var active: js.UndefOr[scala.Double] = js.undefined
}

object TabOptions {
  @scala.inline
  def apply(active: scala.Int | scala.Double = null): TabOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOptions]
  }
}

