package typings.leaflet

import typings.leaflet.leafletMod.Coords
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var coords: Coords
  var current: Boolean
  var el: HTMLElement
  var loaded: js.UndefOr[Date] = js.undefined
  var retain: js.UndefOr[Boolean] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(
    coords: Coords,
    current: Boolean,
    el: HTMLElement,
    active: js.UndefOr[Boolean] = js.undefined,
    loaded: Date = null,
    retain: js.UndefOr[Boolean] = js.undefined
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

