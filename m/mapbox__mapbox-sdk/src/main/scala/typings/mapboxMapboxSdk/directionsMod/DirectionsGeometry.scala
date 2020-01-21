package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6
*/
trait DirectionsGeometry extends js.Object

object DirectionsGeometry {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def geojson: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson = this.cast("geojson")
  @scala.inline
  def polyline: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline = this.cast("polyline")
  @scala.inline
  def polyline6: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6 = this.cast("polyline6")
}

