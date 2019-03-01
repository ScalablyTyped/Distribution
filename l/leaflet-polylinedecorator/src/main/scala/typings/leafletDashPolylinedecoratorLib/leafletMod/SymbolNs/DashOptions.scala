package typings
package leafletDashPolylinedecoratorLib.leafletMod.SymbolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashOptions extends js.Object {
  var pathOptions: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
  var pixelSize: js.UndefOr[scala.Double] = js.undefined
}

object DashOptions {
  @scala.inline
  def apply(pathOptions: leafletLib.leafletMod.PathOptions = null, pixelSize: scala.Int | scala.Double = null): DashOptions = {
    val __obj = js.Dynamic.literal()
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions)
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashOptions]
  }
}

