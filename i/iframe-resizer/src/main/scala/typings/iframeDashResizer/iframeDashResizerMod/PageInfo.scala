package typings.iframeDashResizer.iframeDashResizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  /**
    * The height of the viewport in pixels
    */
  var clientHeight: Double
  /**
    * The width of the viewport in pixels
    */
  var clientWidth: Double
  /**
    * The height of the iframe in pixels
    */
  var iframeHeight: Double
  /**
    * The width of the iframe in pixels
    */
  var iframeWidth: Double
  /**
    * The number of pixels between the left edge of the containing page and the left edge of the iframe
    */
  var offsetLeft: Double
  /**
    * The number of pixels between the top edge of the containing page and the top edge of the iframe
    */
  var offsetTop: Double
  /**
    * The number of pixels between the left edge of the iframe and the left edge of the iframe viewport
    */
  var scrollLeft: Double
  /**
    * The number of pixels between the top edge of the iframe and the top edge of the iframe viewport
    */
  var scrollTop: Double
}

object PageInfo {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    iframeHeight: Double,
    iframeWidth: Double,
    offsetLeft: Double,
    offsetTop: Double,
    scrollLeft: Double,
    scrollTop: Double
  ): PageInfo = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], iframeHeight = iframeHeight.asInstanceOf[js.Any], iframeWidth = iframeWidth.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageInfo]
  }
}

