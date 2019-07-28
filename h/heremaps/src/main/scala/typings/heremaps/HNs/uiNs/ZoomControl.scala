package typings.heremaps.HNs.uiNs

import typings.heremaps.HNs.uiNs.ZoomControlNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the UI controls for zooming in an out of the map.
  */
@JSGlobal("H.ui.ZoomControl")
@js.native
/**
  * Constructor
  * @param opt_options {H.ui.ZoomControl.Options=} - optional parameters to be passed to the map.
  */
class ZoomControl () extends Control {
  def this(opt_options: Options) = this()
  /**
    * This method returns the zoom speed (in levels per millisecond) which is applied when the button is pressed constantly.
    * @returns {number} - the current zoom speed
    */
  def getZoomSpeed(): Double = js.native
}

