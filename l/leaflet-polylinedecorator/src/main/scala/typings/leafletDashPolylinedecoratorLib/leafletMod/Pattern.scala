package typings
package leafletDashPolylinedecoratorLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var endOffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var repeat: scala.Double | java.lang.String
  var symbol: leafletDashPolylinedecoratorLib.leafletMod.SymbolNs.Dash | leafletDashPolylinedecoratorLib.leafletMod.SymbolNs.ArrowHead | leafletDashPolylinedecoratorLib.leafletMod.SymbolNs.Marker
}

object Pattern {
  @scala.inline
  def apply(
    repeat: scala.Double | java.lang.String,
    symbol: leafletDashPolylinedecoratorLib.leafletMod.SymbolNs.Dash | leafletDashPolylinedecoratorLib.leafletMod.SymbolNs.ArrowHead | leafletDashPolylinedecoratorLib.leafletMod.SymbolNs.Marker,
    endOffset: scala.Double | java.lang.String = null,
    offset: scala.Double | java.lang.String = null
  ): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (endOffset != null) __obj.updateDynamic("endOffset")(endOffset.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

