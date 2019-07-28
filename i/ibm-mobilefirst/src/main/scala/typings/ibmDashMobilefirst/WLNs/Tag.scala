package typings.ibmDashMobilefirst.WLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var level: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[Boolean] = js.undefined
}

object Tag {
  @scala.inline
  def apply(level: js.UndefOr[Boolean] = js.undefined, tag: js.UndefOr[Boolean] = js.undefined): Tag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Tag]
  }
}

