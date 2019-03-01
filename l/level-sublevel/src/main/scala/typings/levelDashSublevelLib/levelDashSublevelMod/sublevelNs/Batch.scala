package typings
package levelDashSublevelLib.levelDashSublevelMod.sublevelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Batch extends js.Object {
  var prefix: js.UndefOr[Sublevel] = js.undefined
}

object Batch {
  @scala.inline
  def apply(prefix: Sublevel = null): Batch = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Batch]
  }
}

