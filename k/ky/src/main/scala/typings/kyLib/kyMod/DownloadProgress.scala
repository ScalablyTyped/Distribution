package typings
package kyLib.kyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgress extends js.Object {
  var percent: scala.Double
  /**
  	Note: If it's not possible to retrieve the body size, it will be `0`.
  	*/
  var totalBytes: scala.Double
  var transferredBytes: scala.Double
}

object DownloadProgress {
  @scala.inline
  def apply(percent: scala.Double, totalBytes: scala.Double, transferredBytes: scala.Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(percent = percent, totalBytes = totalBytes, transferredBytes = transferredBytes)
  
    __obj.asInstanceOf[DownloadProgress]
  }
}

