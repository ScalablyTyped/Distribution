package typings.googlemaps.global.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size Maps JavaScript API}
  */
@JSGlobal("google.maps.Size")
@js.native
class Size protected ()
  extends typings.googlemaps.google.maps.Size {
  /**
    * Two-dimensional size.
    * @param width the distance on the x-axis
    * @param height the distance on the y-axis
    * @param widthUnit
    * @param heightUnit
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.constructor Maps JavaScript API}
    */
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, widthUnit: String) = this()
  def this(width: Double, height: Double, widthUnit: js.UndefOr[scala.Nothing], heightUnit: String) = this()
  def this(width: Double, height: Double, widthUnit: String, heightUnit: String) = this()
}
