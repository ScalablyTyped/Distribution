package typings.inboxsdk.mod.Lists

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowView extends js.Object {
  
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): Unit = js.native
  
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): Unit = js.native
  
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): Unit = js.native
  
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): Unit = js.native
  
  def addLabel(labelDescriptor: LabelDescriptor): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  def getContacts(): js.Array[Contact] = js.native
  
  def getDateString(): String = js.native
  
  def getDraftID(): js.Promise[String] = js.native
  
  // replaceDraftLabel(draftLabelDescriptor: Stream<ThreadRowDraftLabelDescriptor>): void;
  def getSubject(): String = js.native
  
  def getThreadIDAsync(): js.Promise[String] = js.native
  
  def getThreadIDIfStableAsync(): js.Promise[String | Null] = js.native
  
  def getVisibleDraftCount(): Double = js.native
  
  def getVisibleMessageCount(): Double = js.native
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  
  // addAttachmentIcon(threadRowAttachmentIconDescriptor: stream<ThreadRowAttachmentIconDescriptor>): void
  def replaceDate(threadRowDateDescriptor: ThreadRowDateDescriptor): Unit = js.native
  
  // replaceDate(threadRowDateDescriptor: Stream<ThreadRowDateDescriptor>): void;
  def replaceDraftLabel(draftLabelDescriptor: ThreadRowDraftLabelDescriptor): Unit = js.native
}
object ThreadRowView {
  
  @scala.inline
  def apply(
    addActionButton: ThreadRowActionButtonDescriptor => Unit,
    addAttachmentIcon: ThreadRowAttachmentIconDescriptor => Unit,
    addButton: ThreadRowButtonDescriptor => Unit,
    addImage: ImageDescriptor => Unit,
    addLabel: LabelDescriptor => Unit,
    destroyed: Boolean,
    getContacts: () => js.Array[Contact],
    getDateString: () => String,
    getDraftID: () => js.Promise[String],
    getSubject: () => String,
    getThreadIDAsync: () => js.Promise[String],
    getThreadIDIfStableAsync: () => js.Promise[String | Null],
    getVisibleDraftCount: () => Double,
    getVisibleMessageCount: () => Double,
    on: (destroy, js.Function0[Unit]) => Unit,
    replaceDate: ThreadRowDateDescriptor => Unit,
    replaceDraftLabel: ThreadRowDraftLabelDescriptor => Unit
  ): ThreadRowView = {
    val __obj = js.Dynamic.literal(addActionButton = js.Any.fromFunction1(addActionButton), addAttachmentIcon = js.Any.fromFunction1(addAttachmentIcon), addButton = js.Any.fromFunction1(addButton), addImage = js.Any.fromFunction1(addImage), addLabel = js.Any.fromFunction1(addLabel), destroyed = destroyed.asInstanceOf[js.Any], getContacts = js.Any.fromFunction0(getContacts), getDateString = js.Any.fromFunction0(getDateString), getDraftID = js.Any.fromFunction0(getDraftID), getSubject = js.Any.fromFunction0(getSubject), getThreadIDAsync = js.Any.fromFunction0(getThreadIDAsync), getThreadIDIfStableAsync = js.Any.fromFunction0(getThreadIDIfStableAsync), getVisibleDraftCount = js.Any.fromFunction0(getVisibleDraftCount), getVisibleMessageCount = js.Any.fromFunction0(getVisibleMessageCount), on = js.Any.fromFunction2(on), replaceDate = js.Any.fromFunction1(replaceDate), replaceDraftLabel = js.Any.fromFunction1(replaceDraftLabel))
    __obj.asInstanceOf[ThreadRowView]
  }
  
  @scala.inline
  implicit class ThreadRowViewOps[Self <: ThreadRowView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddActionButton(value: ThreadRowActionButtonDescriptor => Unit): Self = this.set("addActionButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddAttachmentIcon(value: ThreadRowAttachmentIconDescriptor => Unit): Self = this.set("addAttachmentIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddButton(value: ThreadRowButtonDescriptor => Unit): Self = this.set("addButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddImage(value: ImageDescriptor => Unit): Self = this.set("addImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddLabel(value: LabelDescriptor => Unit): Self = this.set("addLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContacts(value: () => js.Array[Contact]): Self = this.set("getContacts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDateString(value: () => String): Self = this.set("getDateString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDraftID(value: () => js.Promise[String]): Self = this.set("getDraftID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => String): Self = this.set("getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThreadIDAsync(value: () => js.Promise[String]): Self = this.set("getThreadIDAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThreadIDIfStableAsync(value: () => js.Promise[String | Null]): Self = this.set("getThreadIDIfStableAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleDraftCount(value: () => Double): Self = this.set("getVisibleDraftCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleMessageCount(value: () => Double): Self = this.set("getVisibleMessageCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceDate(value: ThreadRowDateDescriptor => Unit): Self = this.set("replaceDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceDraftLabel(value: ThreadRowDraftLabelDescriptor => Unit): Self = this.set("replaceDraftLabel", js.Any.fromFunction1(value))
  }
}
