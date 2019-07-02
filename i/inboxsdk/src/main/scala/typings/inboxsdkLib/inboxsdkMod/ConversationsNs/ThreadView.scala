package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadView extends js.Object {
  var destroyed: scala.Boolean = js.native
  def addLabel(): inboxsdkLib.inboxsdkMod.CommonNs.SimpleElementView = js.native
  def addNoticeBar(): inboxsdkLib.inboxsdkMod.CommonNs.SimpleElementView = js.native
  def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): ContentPanelView = js.native
  def getMessageViews(): js.Array[MessageView] = js.native
  def getMessageViewsAll(): js.Array[MessageView] = js.native
  def getSubject(): java.lang.String = js.native
  def getThreadIDAsync(): js.Promise[java.lang.String] = js.native
  @JSName("on")
  def on_contactHover(
    name: inboxsdkLib.inboxsdkLibStrings.contactHover,
    cb: js.Function1[/* event */ ContactHoverEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

