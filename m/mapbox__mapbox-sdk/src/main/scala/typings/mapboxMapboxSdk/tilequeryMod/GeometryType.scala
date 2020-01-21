package typings.mapboxMapboxSdk.tilequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.point
*/
trait GeometryType extends js.Object

object GeometryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linestring: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring = this.cast("linestring")
  @scala.inline
  def point: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.point = this.cast("point")
  @scala.inline
  def polygon: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon = this.cast("polygon")
}

