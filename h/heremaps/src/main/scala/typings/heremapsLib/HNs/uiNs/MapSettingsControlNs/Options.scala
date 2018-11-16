package typings
package heremapsLib.HNs.uiNs.MapSettingsControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
             * @property entries {Array<H.ui.MapSettingsControl.MapTypeEntry>=} - the map type entries to be shown in this map settings control
             * @property incidents {H.map.layer.Layer} - the traffic incidents layer to be activated by the map settings control
             */

trait Options extends js.Object {
  var alignment: js.UndefOr[heremapsLib.HNs.uiNs.LayoutAlignment] = js.undefined
  var entries: js.UndefOr[js.Array[MapTypeEntry]] = js.undefined
  var incidents: heremapsLib.HNs.mapNs.layerNs.Layer
}

