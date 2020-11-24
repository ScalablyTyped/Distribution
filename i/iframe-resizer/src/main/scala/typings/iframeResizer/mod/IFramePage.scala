package typings.iframeResizer.mod

import typings.iframeResizer.iframeResizerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IFramePage extends js.Object {
  
  /**
    * Turn autoResizing of the iFrame on and off. Returns bool of current state.
    */
  def autoResize(): Boolean = js.native
  def autoResize(resize: Boolean): Boolean = js.native
  
  /**
    * Remove the iFrame from the parent page.
    */
  def close(): Unit = js.native
  
  /**
    * Returns the ID of the iFrame that the page is contained in.
    */
  def getId(): String = js.native
  
  /**
    * Ask the containing page for its positioning coordinates.
    *
    * Your callback function will be recalled when the parent page is scrolled or resized.
    *
    * Pass false to disable the callback.
    */
  def getPageInfo(callback: js.Function1[/* data */ PageInfo, Unit]): Unit = js.native
  @JSName("getPageInfo")
  def getPageInfo_false(callback: `false`): Unit = js.native
  
  /**
    * Scroll the parent page to the coordinates x and y
    */
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  /**
    * Scroll the parent page to the coordinates x and y relative to the position of the iFrame.
    */
  def scrollToOffset(x: Double, y: Double): Unit = js.native
  
  /**
    * Send data to the containing page, message can be any data type that can be serialized into JSON. The `targetOrigin`
    * option is used to restrict where the message is sent to; to stop an attacker mimicking your parent page.
    * See the MDN documentation on postMessage for more details.
    */
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessage(message: js.Any, targetOrigin: String): Unit = js.native
  
  /**
    * Change the method use to workout the height of the iFrame.
    */
  def setHeightCalculationMethod(method: HeightCalculationMethod): Unit = js.native
  
  /**
    * Set default target origin.
    */
  def setTargetOrigin(targetOrigin: String): Unit = js.native
  
  /**
    * Change the method use to workout the width of the iFrame.
    */
  def setWidthCalculationMethod(method: WidthCalculationMethod): Unit = js.native
  
  /**
    * Manually force iFrame to resize. To use passed arguments you need first to disable the `autoResize` option to
    * prevent auto resizing and enable the `sizeWidth` option if you wish to set the width.
    */
  def size(): Unit = js.native
  def size(customHeight: js.UndefOr[scala.Nothing], customWidth: String): Unit = js.native
  def size(customHeight: String): Unit = js.native
  def size(customHeight: String, customWidth: String): Unit = js.native
}
