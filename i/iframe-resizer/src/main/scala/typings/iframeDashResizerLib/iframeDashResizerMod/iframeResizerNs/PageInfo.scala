package typings
package iframeDashResizerLib.iframeDashResizerMod.iframeResizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  /**
    * The height of the viewport in pixels
    */
  var clientHeight: scala.Double
  /**
    * The width of the viewport in pixels
    */
  var clientWidth: scala.Double
  /**
    * The height of the iframe in pixels
    */
  var iframeHeight: scala.Double
  /**
    * The width of the iframe in pixels
    */
  var iframeWidth: scala.Double
  /**
    * The number of pixels between the left edge of the containing page and the left edge of the iframe
    */
  var offsetLeft: scala.Double
  /**
    * The number of pixels between the top edge of the containing page and the top edge of the iframe
    */
  var offsetTop: scala.Double
  /**
    * The number of pixels between the left edge of the iframe and the left edge of the iframe viewport
    */
  var scrollLeft: scala.Double
  /**
    * The number of pixels between the top edge of the iframe and the top edge of the iframe viewport
    */
  var scrollTop: scala.Double
}

object PageInfo {
  @scala.inline
  def apply(
    clientHeight: scala.Double,
    clientWidth: scala.Double,
    iframeHeight: scala.Double,
    iframeWidth: scala.Double,
    offsetLeft: scala.Double,
    offsetTop: scala.Double,
    scrollLeft: scala.Double,
    scrollTop: scala.Double
  ): PageInfo = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, iframeHeight = iframeHeight, iframeWidth = iframeWidth, offsetLeft = offsetLeft, offsetTop = offsetTop, scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[PageInfo]
  }
}

