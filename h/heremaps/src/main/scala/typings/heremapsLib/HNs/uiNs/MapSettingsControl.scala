package typings
package heremapsLib.HNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a menu control allowing to control which map type the map shows, etc.
  */
@JSGlobal("H.ui.MapSettingsControl")
@js.native
/**
  * Constructor
  * @param opt_options {H.ui.MapSettingsControl.Options=} - optional parameters to be passed to this control
  */
class MapSettingsControl () extends Control {
  def this(opt_options: heremapsLib.HNs.uiNs.MapSettingsControlNs.Options) = this()
  /**
    * Sets the traffic incidents layer to be shown when activating the respective button on the map settings control.
    * @param incidentsLayer {H.map.layer.Layer} - the incidents layer
    */
  def setIncidentsLayer(incidentsLayer: heremapsLib.HNs.mapNs.layerNs.Layer): scala.Unit = js.native
}

