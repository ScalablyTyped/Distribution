package typings.leafletGridlayerGooglemutant.mod.gridLayer

import typings.leaflet.mod.GridLayer_
import typings.leaflet.mod.Point_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleMutant_ extends GridLayer_ {
  /**
    * Add additional Google Maps layer.
    *
    * https://developers.google.com/maps/documentation/javascript/trafficlayer
    *
    * @param googleLayerName such as BicyclingLayer, TrafficLayer, or TransitLayer.
    * @param options? constructor arguments to pass through to the google layer.
    * @returns Promise for the native Google Maps Layer instance.
    */
  def addGoogleLayer(googleLayerName: String): js.Promise[js.Object] = js.native
  def addGoogleLayer(googleLayerName: String, options: js.Object): js.Promise[js.Object] = js.native
  /**
    * Removes Google Maps layer.
    *
    *  https://developers.google.com/maps/documentation/javascript/trafficlayer
    *
    * @param googleLayerName such as BicyclingLayer, TrafficLayer, or TransitLayer.
    */
  def removeGoogleLayer(googleLayerName: String): Unit = js.native
  def setElementSize(e: HTMLElement, size: Point_): Unit = js.native
}

