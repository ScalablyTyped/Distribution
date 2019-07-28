package typings.inboxsdk.inboxsdkMod.ConversationsNs

import typings.inboxsdk.inboxsdkMod.CommonNs.SimpleElementView
import typings.inboxsdk.inboxsdkStrings.contactHover
import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadView extends js.Object {
  var destroyed: Boolean = js.native
  def addLabel(): SimpleElementView = js.native
  def addNoticeBar(): SimpleElementView = js.native
  def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): ContentPanelView = js.native
  def getMessageViews(): js.Array[MessageView] = js.native
  def getMessageViewsAll(): js.Array[MessageView] = js.native
  def getSubject(): String = js.native
  def getThreadIDAsync(): js.Promise[String] = js.native
  @JSName("on")
  def on_contactHover(name: contactHover, cb: js.Function1[/* event */ ContactHoverEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
}

