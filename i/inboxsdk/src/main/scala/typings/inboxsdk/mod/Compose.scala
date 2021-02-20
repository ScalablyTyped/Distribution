package typings.inboxsdk.mod

import typings.inboxsdk.anon.Added
import typings.inboxsdk.anon.Cancel
import typings.inboxsdk.anon.ClosedByInboxSDK
import typings.inboxsdk.anon.Fullscreen
import typings.inboxsdk.anon.GetMessageID
import typings.inboxsdk.anon.IsForward
import typings.inboxsdk.inboxsdkStrings.MODIFIER
import typings.inboxsdk.inboxsdkStrings.SEND_ACTION
import typings.inboxsdk.inboxsdkStrings.bccContactAdded
import typings.inboxsdk.inboxsdkStrings.bccContactRemoved
import typings.inboxsdk.inboxsdkStrings.bodyChanged
import typings.inboxsdk.inboxsdkStrings.ccContactAdded
import typings.inboxsdk.inboxsdkStrings.ccContactRemoved
import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.discard
import typings.inboxsdk.inboxsdkStrings.fromContactChanged
import typings.inboxsdk.inboxsdkStrings.fullscreenChanged
import typings.inboxsdk.inboxsdkStrings.minimized
import typings.inboxsdk.inboxsdkStrings.presending
import typings.inboxsdk.inboxsdkStrings.recipientsChanged
import typings.inboxsdk.inboxsdkStrings.responseTypeChanged
import typings.inboxsdk.inboxsdkStrings.restored
import typings.inboxsdk.inboxsdkStrings.sendCanceled
import typings.inboxsdk.inboxsdkStrings.sending
import typings.inboxsdk.inboxsdkStrings.sent
import typings.inboxsdk.inboxsdkStrings.toContactAdded
import typings.inboxsdk.inboxsdkStrings.toContactRemoved
import typings.inboxsdk.mod.Common.Contact
import typings.inboxsdk.mod.Common.DropdownView
import typings.inboxsdk.mod.Common.SimpleElementView
import typings.std.Blob
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compose {
  
  @js.native
  trait ComposeButtonClickEvent extends StObject {
    
    var composeView: ComposeView = js.native
    
    var dropdown: DropdownView = js.native
  }
  object ComposeButtonClickEvent {
    
    @scala.inline
    def apply(composeView: ComposeView, dropdown: DropdownView): ComposeButtonClickEvent = {
      val __obj = js.Dynamic.literal(composeView = composeView.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposeButtonClickEvent]
    }
    
    @scala.inline
    implicit class ComposeButtonClickEventMutableBuilder[Self <: ComposeButtonClickEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComposeView(value: ComposeView): Self = StObject.set(x, "composeView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComposeButtonDescriptor extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var hasDropdown: js.UndefOr[Boolean] = js.native
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconUrl: js.UndefOr[String] = js.native
    
    def onClick(event: ComposeButtonClickEvent): Unit = js.native
    
    var orderHint: js.UndefOr[Double] = js.native
    
    var title: String = js.native
    
    var `type`: js.UndefOr[MODIFIER | SEND_ACTION] = js.native
  }
  object ComposeButtonDescriptor {
    
    @scala.inline
    def apply(onClick: ComposeButtonClickEvent => Unit, title: String): ComposeButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposeButtonDescriptor]
    }
    
    @scala.inline
    implicit class ComposeButtonDescriptorMutableBuilder[Self <: ComposeButtonDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setOnClick(value: ComposeButtonClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: MODIFIER | SEND_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ComposeInstance extends StObject {
    
    def openNewComposeView(): js.Promise[ComposeView] = js.native
    
    def registerComposeViewHandler(handler: js.Function1[/* composeView */ ComposeView, Unit]): js.Function0[Unit] = js.native
  }
  object ComposeInstance {
    
    @scala.inline
    def apply(
      openNewComposeView: () => js.Promise[ComposeView],
      registerComposeViewHandler: js.Function1[/* composeView */ ComposeView, Unit] => js.Function0[Unit]
    ): ComposeInstance = {
      val __obj = js.Dynamic.literal(openNewComposeView = js.Any.fromFunction0(openNewComposeView), registerComposeViewHandler = js.Any.fromFunction1(registerComposeViewHandler))
      __obj.asInstanceOf[ComposeInstance]
    }
    
    @scala.inline
    implicit class ComposeInstanceMutableBuilder[Self <: ComposeInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenNewComposeView(value: () => js.Promise[ComposeView]): Self = StObject.set(x, "openNewComposeView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterComposeViewHandler(value: js.Function1[/* composeView */ ComposeView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerComposeViewHandler", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ComposeNoticeDescriptor extends StObject {
    
    var orderHint: js.UndefOr[Double] = js.native
  }
  object ComposeNoticeDescriptor {
    
    @scala.inline
    def apply(): ComposeNoticeDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeNoticeDescriptor]
    }
    
    @scala.inline
    implicit class ComposeNoticeDescriptorMutableBuilder[Self <: ComposeNoticeDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    }
  }
  
  @js.native
  trait ComposeView extends StObject {
    
    def addButton(buttonDescriptor: ComposeButtonDescriptor): Unit = js.native
    
    def addComposeNotice(composeNoticeDescriptor: ComposeNoticeDescriptor): Unit = js.native
    
    def addStatusBar(statusBarDescriptor: StatusBarDescriptor): StatusBarView = js.native
    
    def attachFiles(files: js.Array[Blob]): js.Promise[Unit] = js.native
    
    def attachInlineFiles(Files: js.Array[Blob]): js.Promise[Unit] = js.native
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def getBccRecipients(): js.Array[Contact] = js.native
    
    def getBodyElement(): HTMLElement = js.native
    
    def getCcRecipients(): js.Array[Contact] = js.native
    
    def getCurrentDraftID(): js.Promise[String | Null] = js.native
    
    def getDraftID(): js.Promise[String] = js.native
    
    def getFromContact(): Contact = js.native
    
    def getFromContactChoices(): js.Array[Contact] = js.native
    
    def getHTMLContent(): String = js.native
    
    def getInitialMessageID(): String = js.native
    
    def getMetadataFormElement(): HTMLElement = js.native
    
    def getSelectedBodyHTML(): String = js.native
    
    def getSelectedBodyText(): String = js.native
    
    def getSubject(): String = js.native
    
    def getTextContent(): String = js.native
    
    def getThreadID(): String = js.native
    
    def getToRecipients(): js.Array[Contact] = js.native
    
    def insertHTMLIntoBodyAtCursor(html: String): HTMLElement = js.native
    def insertHTMLIntoBodyAtCursor(html: HTMLElement): HTMLElement = js.native
    
    def insertLinkChipIntoBodyAtCursor(text: String, url: String, iconUrl: String): HTMLElement = js.native
    
    def insertLinkIntoBodyAtCursor(text: String, url: String): HTMLElement = js.native
    
    def insertTextIntoBodyAtCursor(text: String): Unit = js.native
    
    def isForward(): Boolean = js.native
    
    def isFullscreen(): Boolean = js.native
    
    def isInlineReplyForm(): Boolean = js.native
    
    def isMinimized(): Boolean = js.native
    
    def isReply(): Boolean = js.native
    
    @JSName("on")
    def on_bccContactAdded(name: bccContactAdded, cb: js.Function1[/* event */ typings.inboxsdk.anon.Contact, Unit]): Unit = js.native
    @JSName("on")
    def on_bccContactRemoved(name: bccContactRemoved, cb: js.Function1[/* event */ typings.inboxsdk.anon.Contact, Unit]): Unit = js.native
    @JSName("on")
    def on_bodyChanged(name: bodyChanged, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_ccContactAdded(name: ccContactAdded, cb: js.Function1[/* event */ typings.inboxsdk.anon.Contact, Unit]): Unit = js.native
    @JSName("on")
    def on_ccContactRemoved(name: ccContactRemoved, cb: js.Function1[/* event */ typings.inboxsdk.anon.Contact, Unit]): Unit = js.native
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function1[/* event */ ClosedByInboxSDK, Unit]): Unit = js.native
    @JSName("on")
    def on_discard(name: discard, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_fromContactChanged(name: fromContactChanged, cb: js.Function1[/* event */ typings.inboxsdk.anon.Contact, Unit]): Unit = js.native
    @JSName("on")
    def on_fullscreenChanged(name: fullscreenChanged, cb: js.Function1[/* event */ Fullscreen, Unit]): Unit = js.native
    @JSName("on")
    def on_minimized(name: minimized, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_presending(name: presending, cb: js.Function1[/* event */ Cancel, Unit]): Unit = js.native
    @JSName("on")
    def on_recipientsChanged(name: recipientsChanged, cb: js.Function1[/* event */ RecipientsChangedEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_responseTypeChanged(name: responseTypeChanged, cb: js.Function1[/* event */ IsForward, Unit]): Unit = js.native
    @JSName("on")
    def on_restored(name: restored, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_sendCanceled(name: sendCanceled, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_sending(name: sending, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_sent(name: sent, cb: js.Function1[/* event */ GetMessageID, Unit]): Unit = js.native
    @JSName("on")
    def on_toContactAdded(name: toContactAdded, cb: js.Function1[/* event */ typings.inboxsdk.anon.Contact, Unit]): Unit = js.native
    @JSName("on")
    def on_toContactRemoved(name: toContactRemoved, cb: js.Function1[/* event */ typings.inboxsdk.anon.Contact, Unit]): Unit = js.native
    
    def popOut(): js.Promise[ComposeView] = js.native
    
    def send(): Unit = js.native
    def send(options: SendOptions): Unit = js.native
    
    def setBccRecipients(emails: js.Array[String]): Unit = js.native
    
    def setBodyHTML(html: String): Unit = js.native
    
    def setBodyText(text: String): Unit = js.native
    
    def setCcRecipients(emails: js.Array[String]): Unit = js.native
    
    def setFromEmail(email: String): Unit = js.native
    
    def setFullscreen(minimized: Boolean): Unit = js.native
    
    def setMinimized(minimized: Boolean): Unit = js.native
    
    def setSubject(text: String): Unit = js.native
    
    def setTitleBarColor(color: String): js.Function0[Unit] = js.native
    
    def setToRecipients(emails: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait RecipientsChangedEvent extends StObject {
    
    var bcc: Added = js.native
    
    var cc: Added = js.native
    
    var to: Added = js.native
  }
  object RecipientsChangedEvent {
    
    @scala.inline
    def apply(bcc: Added, cc: Added, to: Added): RecipientsChangedEvent = {
      val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecipientsChangedEvent]
    }
    
    @scala.inline
    implicit class RecipientsChangedEventMutableBuilder[Self <: RecipientsChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBcc(value: Added): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCc(value: Added): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Added): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendOptions extends StObject {
    
    var sendAndArchive: js.UndefOr[Boolean] = js.native
  }
  object SendOptions {
    
    @scala.inline
    def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSendAndArchive(value: Boolean): Self = StObject.set(x, "sendAndArchive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendAndArchiveUndefined: Self = StObject.set(x, "sendAndArchive", js.undefined)
    }
  }
  
  @js.native
  trait StatusBarDescriptor extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var orderHint: js.UndefOr[Double] = js.native
  }
  object StatusBarDescriptor {
    
    @scala.inline
    def apply(): StatusBarDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusBarDescriptor]
    }
    
    @scala.inline
    implicit class StatusBarDescriptorMutableBuilder[Self <: StatusBarDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    }
  }
  
  @js.native
  trait StatusBarView extends SimpleElementView {
    
    def setHeight(height: Double): Unit = js.native
  }
  object StatusBarView {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      destroyed: Boolean,
      el: HTMLElement,
      on: (destroy, js.Function0[Unit]) => Unit,
      setHeight: Double => Unit
    ): StatusBarView = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), setHeight = js.Any.fromFunction1(setHeight))
      __obj.asInstanceOf[StatusBarView]
    }
    
    @scala.inline
    implicit class StatusBarViewMutableBuilder[Self <: StatusBarView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    }
  }
}
