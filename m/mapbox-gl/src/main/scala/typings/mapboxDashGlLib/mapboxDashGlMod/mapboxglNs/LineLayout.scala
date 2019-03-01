package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineLayout extends js.Object {
  var `line-cap`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.butt | mapboxDashGlLib.mapboxDashGlLibStrings.round | mapboxDashGlLib.mapboxDashGlLibStrings.square
  ] = js.undefined
  var `line-join`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.bevel | mapboxDashGlLib.mapboxDashGlLibStrings.round | mapboxDashGlLib.mapboxDashGlLibStrings.miter | Expression
  ] = js.undefined
  var `line-miter-limit`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `line-round-limit`: js.UndefOr[scala.Double | Expression] = js.undefined
  var visibility: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none
  ] = js.undefined
}

object LineLayout {
  @scala.inline
  def apply(
    `line-cap`: mapboxDashGlLib.mapboxDashGlLibStrings.butt | mapboxDashGlLib.mapboxDashGlLibStrings.round | mapboxDashGlLib.mapboxDashGlLibStrings.square = null,
    `line-join`: mapboxDashGlLib.mapboxDashGlLibStrings.bevel | mapboxDashGlLib.mapboxDashGlLibStrings.round | mapboxDashGlLib.mapboxDashGlLibStrings.miter | Expression = null,
    `line-miter-limit`: scala.Double | Expression = null,
    `line-round-limit`: scala.Double | Expression = null,
    visibility: mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none = null
  ): LineLayout = {
    val __obj = js.Dynamic.literal()
    if (`line-cap` != null) __obj.updateDynamic("line-cap")(`line-cap`.asInstanceOf[js.Any])
    if (`line-join` != null) __obj.updateDynamic("line-join")(`line-join`.asInstanceOf[js.Any])
    if (`line-miter-limit` != null) __obj.updateDynamic("line-miter-limit")(`line-miter-limit`.asInstanceOf[js.Any])
    if (`line-round-limit` != null) __obj.updateDynamic("line-round-limit")(`line-round-limit`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineLayout]
  }
}

