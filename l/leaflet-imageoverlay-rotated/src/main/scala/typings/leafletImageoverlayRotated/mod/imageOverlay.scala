package typings.leafletImageoverlayRotated.mod

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngExpression
import typings.leafletImageoverlayRotated.mod.ImageOverlay_.Rotated
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "imageOverlay")
@js.native
object imageOverlay extends js.Object {
  def rotated(
    imgSrc: String,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression
  ): Rotated = js.native
  def rotated(
    imgSrc: String,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression,
    options: ImageOverlayOptions
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLCanvasElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLCanvasElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression,
    options: ImageOverlayOptions
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLImageElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression
  ): Rotated = js.native
  def rotated(
    imgSrc: HTMLImageElement,
    topleft: LatLngExpression,
    topright: LatLngExpression,
    bottomleft: LatLngExpression,
    options: ImageOverlayOptions
  ): Rotated = js.native
}

