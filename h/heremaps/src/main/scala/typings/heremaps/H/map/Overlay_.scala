package typings.heremaps.H.map

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents an overlay, which offers a bitmap that covers a geographical reactangular area on the map.
  */
@js.native
trait Overlay_ extends Object {
  /**
    * Returns this overlay's current bitmap.
    * @returns {?(HTMLImageElement | HTMLCanvasElement)} - the bitmap of this Overlay or null if it isn't ready yet
    */
  def getBitmap(): HTMLImageElement | HTMLCanvasElement = js.native
  /**
    * This method returns this overlay's current bounds.
    * @returns {H.geo.Rect}
    */
  def getBounds(): typings.heremaps.H.geo.Rect = js.native
  /**
    * Returns this overlay's current opacity.
    * @returns {number}
    */
  def getOpacity(): Double = js.native
  /**
    * Sets the overlay's current bitmap.
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setBitmap(bitmap: String): Overlay = js.native
  def setBitmap(bitmap: HTMLCanvasElement): Overlay = js.native
  def setBitmap(bitmap: HTMLImageElement): Overlay = js.native
  /**
    * This method sets the overlay's current bounds.
    * @param bounds {H.geo.Rect}
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setBounds(bounds: typings.heremaps.H.geo.Rect): Overlay = js.native
  /**
    * Sets the overlay's current opacity.
    * @param opacity {number} - The opacity in range from 0 (transparent) to 1 (opaque).
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setOpacity(opacity: Double): Overlay = js.native
}

