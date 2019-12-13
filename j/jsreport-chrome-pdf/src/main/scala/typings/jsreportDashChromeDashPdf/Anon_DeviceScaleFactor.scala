package typings.jsreportDashChromeDashPdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceScaleFactor extends js.Object {
  var deviceScaleFactor: String
  var hasTouch: Boolean
  var height: String
  var isLandscape: Boolean
  var isMobile: Boolean
  var width: String
}

object Anon_DeviceScaleFactor {
  @scala.inline
  def apply(
    deviceScaleFactor: String,
    hasTouch: Boolean,
    height: String,
    isLandscape: Boolean,
    isMobile: Boolean,
    width: String
  ): Anon_DeviceScaleFactor = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeviceScaleFactor]
  }
}

