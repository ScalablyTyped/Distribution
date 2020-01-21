package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.toll
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.restricted
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.motorway
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.tunnel
*/
trait DirectionsClass extends js.Object

object DirectionsClass {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ferry: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry = this.cast("ferry")
  @scala.inline
  def motorway: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.motorway = this.cast("motorway")
  @scala.inline
  def restricted: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.restricted = this.cast("restricted")
  @scala.inline
  def toll: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.toll = this.cast("toll")
  @scala.inline
  def tunnel: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.tunnel = this.cast("tunnel")
}

