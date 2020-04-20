package typings.ky.mod

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
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], transferredBytes = transferredBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgress]
  }
}

