package typings.iframeResizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IFrameObject extends js.Object {
  
  def close(): Unit = js.native
  
  def moveToAnchor(anchor: String): Unit = js.native
  
  def resize(): Unit = js.native
  
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessage(message: js.Any, targetOrigin: String): Unit = js.native
}
