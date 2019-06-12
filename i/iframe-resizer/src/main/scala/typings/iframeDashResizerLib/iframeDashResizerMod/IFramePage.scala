package typings
package iframeDashResizerLib.iframeDashResizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IFramePage extends js.Object {
  /**
    * Turn autoResizing of the iFrame on and off. Returns bool of current state.
    */
  def autoResize(): scala.Boolean = js.native
  def autoResize(resize: scala.Boolean): scala.Boolean = js.native
  /**
    * Remove the iFrame from the parent page.
    */
  def close(): scala.Unit = js.native
  /**
    * Returns the ID of the iFrame that the page is contained in.
    */
  def getId(): java.lang.String = js.native
  /**
    * Ask the containing page for its positioning coordinates.
    *
    * Your callback function will be recalled when the parent page is scrolled or resized.
    *
    * Pass false to disable the callback.
    */
  def getPageInfo(callback: js.Function1[/* data */ PageInfo, scala.Unit]): scala.Unit = js.native
  @JSName("getPageInfo")
  def getPageInfo_false(callback: iframeDashResizerLib.iframeDashResizerLibNumbers.`false`): scala.Unit = js.native
  /**
    * Scroll the parent page to the coordinates x and y
    */
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Scroll the parent page to the coordinates x and y relative to the position of the iFrame.
    */
  def scrollToOffset(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Send data to the containing page, message can be any data type that can be serialized into JSON. The `targetOrigin`
    * option is used to restrict where the message is sent to; to stop an attacker mimicking your parent page.
    * See the MDN documentation on postMessage for more details.
    */
  def sendMessage(message: js.Any): scala.Unit = js.native
  def sendMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit = js.native
  /**
    * Change the method use to workout the height of the iFrame.
    */
  def setHeightCalculationMethod(method: HeightCalculationMethod): scala.Unit = js.native
  /**
    * Set default target origin.
    */
  def setTargetOrigin(targetOrigin: java.lang.String): scala.Unit = js.native
  /**
    * Change the method use to workout the width of the iFrame.
    */
  def setWidthCalculationMethod(method: WidthCalculationMethod): scala.Unit = js.native
  /**
    * Manually force iFrame to resize. To use passed arguments you need first to disable the `autoResize` option to
    * prevent auto resizing and enable the `sizeWidth` option if you wish to set the width.
    */
  def size(): scala.Unit = js.native
  def size(customHeight: java.lang.String): scala.Unit = js.native
  def size(customHeight: java.lang.String, customWidth: java.lang.String): scala.Unit = js.native
}

