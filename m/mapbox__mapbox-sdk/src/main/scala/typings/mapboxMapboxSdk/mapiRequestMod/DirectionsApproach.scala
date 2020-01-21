package typings.mapboxMapboxSdk.mapiRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb
*/
trait DirectionsApproach extends js.Object

object DirectionsApproach {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def curb: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb = this.cast("curb")
  @scala.inline
  def unrestricted: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted = this.cast("unrestricted")
}

