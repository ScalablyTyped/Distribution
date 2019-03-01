package typings
package leafletDashPolylinedecoratorLib.leafletMod.SymbolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var markerOptions: js.UndefOr[leafletLib.leafletMod.MarkerOptions] = js.undefined
  var rotate: js.UndefOr[scala.Boolean] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    markerOptions: leafletLib.leafletMod.MarkerOptions = null,
    rotate: js.UndefOr[scala.Boolean] = js.undefined
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions)
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate)
    __obj.asInstanceOf[MarkerOptions]
  }
}

