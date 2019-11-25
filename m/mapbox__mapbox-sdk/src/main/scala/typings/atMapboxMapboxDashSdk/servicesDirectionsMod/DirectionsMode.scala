package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.driving
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.ferry
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.unaccessible
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.walking
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.cycling
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.train
*/
trait DirectionsMode extends js.Object

object DirectionsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.driving = this.cast("driving")
  @scala.inline
  def ferry: typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.ferry = this.cast("ferry")
  @scala.inline
  def train: typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.train = this.cast("train")
  @scala.inline
  def unaccessible: typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.unaccessible = this.cast("unaccessible")
  @scala.inline
  def walking: typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.walking = this.cast("walking")
}

