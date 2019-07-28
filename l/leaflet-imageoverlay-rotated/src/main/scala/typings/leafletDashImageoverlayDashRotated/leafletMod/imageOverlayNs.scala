package typings.leafletDashImageoverlayDashRotated.leafletMod

import typings.leaflet.leafletMod.ImageOverlayOptions
import typings.leaflet.leafletMod.LatLngExpression
import typings.leafletDashImageoverlayDashRotated.leafletMod.ImageOverlayNs.Rotated
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.imageOverlay")
@js.native
object imageOverlayNs extends js.Object {
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

