package typings
package inboxsdkLib.inboxsdkMod.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeView extends js.Object {
  var destroyed: scala.Boolean = js.native
  def addButton(buttonDescriptor: ComposeButtonDescriptor): scala.Unit = js.native
  def addComposeNotice(composeNoticeDescriptor: ComposeNoticeDescriptor): scala.Unit = js.native
  def addStatusBar(statusBarDescriptor: StatusBarDescriptor): StatusBarView = js.native
  def attachFiles(files: js.Array[stdLib.Blob]): js.Promise[scala.Unit] = js.native
  def attachInlineFiles(Files: js.Array[stdLib.Blob]): js.Promise[scala.Unit] = js.native
  def close(): scala.Unit = js.native
  def getBccRecipients(): js.Array[inboxsdkLib.inboxsdkMod.CommonNs.Contact] = js.native
  def getBodyElement(): stdLib.HTMLElement = js.native
  def getCcRecipients(): js.Array[inboxsdkLib.inboxsdkMod.CommonNs.Contact] = js.native
  def getCurrentDraftID(): js.Promise[java.lang.String | scala.Null] = js.native
  def getDraftID(): js.Promise[java.lang.String] = js.native
  def getFromContact(): inboxsdkLib.inboxsdkMod.CommonNs.Contact = js.native
  def getFromContactChoices(): js.Array[inboxsdkLib.inboxsdkMod.CommonNs.Contact] = js.native
  def getHTMLContent(): java.lang.String = js.native
  def getInitialMessageID(): java.lang.String = js.native
  def getMetadataFormElement(): stdLib.HTMLElement = js.native
  def getSelectedBodyHTML(): java.lang.String = js.native
  def getSelectedBodyText(): java.lang.String = js.native
  def getSubject(): java.lang.String = js.native
  def getTextContent(): java.lang.String = js.native
  def getThreadID(): java.lang.String = js.native
  def getToRecipients(): js.Array[inboxsdkLib.inboxsdkMod.CommonNs.Contact] = js.native
  def insertHTMLIntoBodyAtCursor(html: java.lang.String): stdLib.HTMLElement = js.native
  def insertHTMLIntoBodyAtCursor(html: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def insertLinkChipIntoBodyAtCursor(text: java.lang.String, url: java.lang.String, iconUrl: java.lang.String): stdLib.HTMLElement = js.native
  def insertLinkIntoBodyAtCursor(text: java.lang.String, url: java.lang.String): stdLib.HTMLElement = js.native
  def insertTextIntoBodyAtCursor(text: java.lang.String): scala.Unit = js.native
  def isForward(): scala.Boolean = js.native
  def isFullscreen(): scala.Boolean = js.native
  def isInlineReplyForm(): scala.Boolean = js.native
  def isMinimized(): scala.Boolean = js.native
  def isReply(): scala.Boolean = js.native
  @JSName("on")
  def on_bccContactAdded(
    name: inboxsdkLib.inboxsdkLibStrings.bccContactAdded,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Contact, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_bccContactRemoved(
    name: inboxsdkLib.inboxsdkLibStrings.bccContactRemoved,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Contact, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_bodyChanged(name: inboxsdkLib.inboxsdkLibStrings.bodyChanged, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_ccContactAdded(
    name: inboxsdkLib.inboxsdkLibStrings.ccContactAdded,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Contact, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_ccContactRemoved(
    name: inboxsdkLib.inboxsdkLibStrings.ccContactRemoved,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Contact, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_destroy(
    name: inboxsdkLib.inboxsdkLibStrings.destroy,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_ClosedByInboxSDK, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_discard(name: inboxsdkLib.inboxsdkLibStrings.discard, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_fromContactChanged(
    name: inboxsdkLib.inboxsdkLibStrings.fromContactChanged,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Contact, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_fullscreenChanged(
    name: inboxsdkLib.inboxsdkLibStrings.fullscreenChanged,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Fullscreen, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_minimized(name: inboxsdkLib.inboxsdkLibStrings.minimized, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_presending(
    name: inboxsdkLib.inboxsdkLibStrings.presending,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Cancel, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_recipientsChanged(
    name: inboxsdkLib.inboxsdkLibStrings.recipientsChanged,
    cb: js.Function1[/* event */ RecipientsChangedEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_responseTypeChanged(
    name: inboxsdkLib.inboxsdkLibStrings.responseTypeChanged,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_IsForward, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_restored(name: inboxsdkLib.inboxsdkLibStrings.restored, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_sendCanceled(name: inboxsdkLib.inboxsdkLibStrings.sendCanceled, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_sending(name: inboxsdkLib.inboxsdkLibStrings.sending, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_sent(
    name: inboxsdkLib.inboxsdkLibStrings.sent,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_GetMessageID, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_toContactAdded(
    name: inboxsdkLib.inboxsdkLibStrings.toContactAdded,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Contact, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_toContactRemoved(
    name: inboxsdkLib.inboxsdkLibStrings.toContactRemoved,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_Contact, scala.Unit]
  ): scala.Unit = js.native
  def popOut(): js.Promise[ComposeView] = js.native
  def send(): scala.Unit = js.native
  def send(options: SendOptions): scala.Unit = js.native
  def setBccRecipients(emails: js.Array[java.lang.String]): scala.Unit = js.native
  def setBodyHTML(html: java.lang.String): scala.Unit = js.native
  def setBodyText(text: java.lang.String): scala.Unit = js.native
  def setCcRecipients(emails: js.Array[java.lang.String]): scala.Unit = js.native
  def setFromEmail(email: java.lang.String): scala.Unit = js.native
  def setFullscreen(minimized: scala.Boolean): scala.Unit = js.native
  def setMinimized(minimized: scala.Boolean): scala.Unit = js.native
  def setSubject(text: java.lang.String): scala.Unit = js.native
  def setTitleBarColor(color: java.lang.String): js.Function0[scala.Unit] = js.native
  def setToRecipients(emails: js.Array[java.lang.String]): scala.Unit = js.native
}

