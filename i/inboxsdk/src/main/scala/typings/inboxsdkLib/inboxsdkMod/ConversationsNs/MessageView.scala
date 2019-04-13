package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageView extends js.Object {
  var destroyed: scala.Boolean = js.native
  def addAttachmentCardView(cardOptions: AttachmentCardNoPreviewOptions): AttachmentCardView = js.native
  def addAttachmentCardView(cardOptions: AttachmentCardOptions): AttachmentCardView = js.native
  def addAttachmentIcon(iconDescriptor: MessageAttachmentIconDescriptor): scala.Unit = js.native
  def addAttachmentsToolbarButton(buttonOptions: AttachmentsToolbarButtonDescriptor): scala.Unit = js.native
  def addToolbarButton(options: MessageViewToolbarButtonDescriptor): scala.Unit = js.native
  def getBodyElement(): stdLib.HTMLElement = js.native
  def getDateString(): java.lang.String = js.native
  def getFileAttachmentCardViews(): js.Array[AttachmentCardView] = js.native
  def getLinksInBody(): js.Array[MessageViewLinkDescriptor] = js.native
  def getMessageIDAsync(): js.Promise[java.lang.String] = js.native
  def getRecipientEmailAddresses(): js.Array[java.lang.String] = js.native
  def getRecipientsFull(): js.Promise[js.Array[inboxsdkLib.inboxsdkMod.CommonNs.Contact]] = js.native
  def getSender(): inboxsdkLib.inboxsdkMod.CommonNs.Contact = js.native
  def getThreadView(): ThreadView = js.native
  // addAttachmentIcon(iconDescriptor: Stream<MessageAttachmentIconDescriptor>): void;
  def getViewState(): MessageViewViewStates = js.native
  def isElementInQuotedArea(): scala.Boolean = js.native
  def isLoaded(): scala.Boolean = js.native
  @JSName("on")
  def on_contactHover(
    name: inboxsdkLib.inboxsdkLibStrings.contactHover,
    cb: js.Function1[/* event */ ContactHoverEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_load(name: inboxsdkLib.inboxsdkLibStrings.load, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_viewStateChange(
    name: inboxsdkLib.inboxsdkLibStrings.viewStateChange,
    cb: js.Function1[/* event */ inboxsdkLib.Anon_MessageView, scala.Unit]
  ): scala.Unit = js.native
}

