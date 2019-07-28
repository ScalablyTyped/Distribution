package typings.leafletDashPolylinedecorator.leafletMod

import typings.leafletDashPolylinedecorator.leafletMod.SymbolNs.ArrowHead
import typings.leafletDashPolylinedecorator.leafletMod.SymbolNs.Dash
import typings.leafletDashPolylinedecorator.leafletMod.SymbolNs.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var endOffset: js.UndefOr[Double | String] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var repeat: Double | String
  var symbol: Dash | ArrowHead | Marker
}

object Pattern {
  @scala.inline
  def apply(
    repeat: Double | String,
    symbol: Dash | ArrowHead | Marker,
    endOffset: Double | String = null,
    offset: Double | String = null
  ): Pattern = {
    val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    if (endOffset != null) __obj.updateDynamic("endOffset")(endOffset.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

