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

