package typings.heremaps.H.ui.MapSettingsControl

import typings.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://developer.here.com/documentation/maps/api_reference/H.ui.MapSettingsControl.html#.Options}
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
  * @property entries {Array<H.ui.MapSettingsControl.MapTypeEntry>=} - the map type entries to be shown in this map settings control
  * @property incidents {H.map.layer.Layer} - the traffic incidents layer to be activated by the map settings control
  */
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.undefined
  var baseLayers: js.UndefOr[js.Array[Entry]] = js.undefined
  var layers: js.UndefOr[js.Array[Entry]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alignment: LayoutAlignment = null,
    baseLayers: js.Array[Entry] = null,
    layers: js.Array[Entry] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (baseLayers != null) __obj.updateDynamic("baseLayers")(baseLayers.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

