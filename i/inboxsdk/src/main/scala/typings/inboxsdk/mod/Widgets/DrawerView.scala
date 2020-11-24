package typings.inboxsdk.mod.Widgets

import typings.inboxsdk.inboxsdkStrings.closing
import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.preautoclose
import typings.inboxsdk.inboxsdkStrings.slideAnimationDone
import typings.inboxsdk.mod.Common.PreAutoCloseEvent
import typings.inboxsdk.mod.Compose.ComposeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerView extends js.Object {
  
  def associateComposeView(composeView: ComposeView, closeWithCompose: Boolean): Unit = js.native
  
  def close(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  def disassociateComposeView(): Unit = js.native
  
  @JSName("on")
  def on_closing(name: closing, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_slideAnimationDone(name: slideAnimationDone, cb: js.Function0[Unit]): Unit = js.native
}
