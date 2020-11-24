package typings.heremaps.H.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the UI controls for zooming in an out of the map.
  */
@js.native
trait ZoomControl_ extends Control {
  
  /**
    * This method returns the zoom speed (in levels per millisecond) which is applied when the button is pressed constantly.
    * @returns {number} - the current zoom speed
    */
  def getZoomSpeed(): Double = js.native
}
