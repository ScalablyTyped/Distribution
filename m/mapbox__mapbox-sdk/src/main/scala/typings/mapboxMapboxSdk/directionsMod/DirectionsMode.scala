package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unaccessible
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.train
*/
trait DirectionsMode extends js.Object

object DirectionsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = this.cast("driving")
  @scala.inline
  def ferry: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry = this.cast("ferry")
  @scala.inline
  def train: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.train = this.cast("train")
  @scala.inline
  def unaccessible: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unaccessible = this.cast("unaccessible")
  @scala.inline
  def walking: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = this.cast("walking")
}

