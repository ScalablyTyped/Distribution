package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
*/
trait DirectionsProfile extends js.Object

object DirectionsProfile {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = this.cast("driving")
  @scala.inline
  def `driving-traffic`: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic` = this.cast("driving-traffic")
  @scala.inline
  def walking: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = this.cast("walking")
}

