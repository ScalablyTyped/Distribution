package typings
package ibmDashMobilefirstLib.WLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var level: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[scala.Boolean] = js.undefined
}

object Tag {
  @scala.inline
  def apply(level: js.UndefOr[scala.Boolean] = js.undefined, tag: js.UndefOr[scala.Boolean] = js.undefined): Tag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Tag]
  }
}

