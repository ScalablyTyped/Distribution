package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.congestion
*/
trait DirectionsAnnotation extends js.Object

object DirectionsAnnotation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def congestion: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.congestion = this.cast("congestion")
  @scala.inline
  def distance: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance = this.cast("distance")
  @scala.inline
  def duration: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration = this.cast("duration")
  @scala.inline
  def speed: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed = this.cast("speed")
}

