package typings
package leafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var coords: leafletLib.leafletMod.Coords
  var current: scala.Boolean
  var el: stdLib.HTMLElement
  var loaded: js.UndefOr[stdLib.Date] = js.undefined
  var retain: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(
    coords: leafletLib.leafletMod.Coords,
    current: scala.Boolean,
    el: stdLib.HTMLElement,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    loaded: stdLib.Date = null,
    retain: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(coords = coords, current = current, el = el)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded)
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain)
    __obj.asInstanceOf[Anon_Active]
  }
}

