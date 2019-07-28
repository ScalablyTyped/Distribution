package typings.ky.kyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgress extends js.Object {
  var percent: Double
  /**
  	Note: If it's not possible to retrieve the body size, it will be `0`.
  	*/
  var totalBytes: Double
  var transferredBytes: Double
}

object DownloadProgress {
  @scala.inline
  def apply(percent: Double, totalBytes: Double, transferredBytes: Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(percent = percent, totalBytes = totalBytes, transferredBytes = transferredBytes)
  
    __obj.asInstanceOf[DownloadProgress]
  }
}

