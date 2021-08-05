package typings.inboxsdk.mod.Lists

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.mod.Common.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowView extends StObject {
  
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): Unit
  
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): Unit
  
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): Unit
  
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): Unit
  
  def addLabel(labelDescriptor: LabelDescriptor): Unit
  
  var destroyed: Boolean
  
  def getContacts(): js.Array[Contact]
  
  def getDateString(): String
  
  def getDraftID(): js.Promise[String]
  
  // replaceDraftLabel(draftLabelDescriptor: Stream<ThreadRowDraftLabelDescriptor>): void;
  def getSubject(): String
  
  def getThreadIDAsync(): js.Promise[String]
  
  def getThreadIDIfStableAsync(): js.Promise[String | Null]
  
  def getVisibleDraftCount(): Double
  
  def getVisibleMessageCount(): Double
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  
  // addAttachmentIcon(threadRowAttachmentIconDescriptor: stream<ThreadRowAttachmentIconDescriptor>): void
  def replaceDate(threadRowDateDescriptor: ThreadRowDateDescriptor): Unit
  
  // replaceDate(threadRowDateDescriptor: Stream<ThreadRowDateDescriptor>): void;
  def replaceDraftLabel(draftLabelDescriptor: ThreadRowDraftLabelDescriptor): Unit
}
object ThreadRowView {
  
  inline def apply(
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
  
  extension [Self <: ThreadRowView](x: Self) {
    
    inline def setAddActionButton(value: ThreadRowActionButtonDescriptor => Unit): Self = StObject.set(x, "addActionButton", js.Any.fromFunction1(value))
    
    inline def setAddAttachmentIcon(value: ThreadRowAttachmentIconDescriptor => Unit): Self = StObject.set(x, "addAttachmentIcon", js.Any.fromFunction1(value))
    
    inline def setAddButton(value: ThreadRowButtonDescriptor => Unit): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
    
    inline def setAddImage(value: ImageDescriptor => Unit): Self = StObject.set(x, "addImage", js.Any.fromFunction1(value))
    
    inline def setAddLabel(value: LabelDescriptor => Unit): Self = StObject.set(x, "addLabel", js.Any.fromFunction1(value))
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setGetContacts(value: () => js.Array[Contact]): Self = StObject.set(x, "getContacts", js.Any.fromFunction0(value))
    
    inline def setGetDateString(value: () => String): Self = StObject.set(x, "getDateString", js.Any.fromFunction0(value))
    
    inline def setGetDraftID(value: () => js.Promise[String]): Self = StObject.set(x, "getDraftID", js.Any.fromFunction0(value))
    
    inline def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    inline def setGetThreadIDAsync(value: () => js.Promise[String]): Self = StObject.set(x, "getThreadIDAsync", js.Any.fromFunction0(value))
    
    inline def setGetThreadIDIfStableAsync(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getThreadIDIfStableAsync", js.Any.fromFunction0(value))
    
    inline def setGetVisibleDraftCount(value: () => Double): Self = StObject.set(x, "getVisibleDraftCount", js.Any.fromFunction0(value))
    
    inline def setGetVisibleMessageCount(value: () => Double): Self = StObject.set(x, "getVisibleMessageCount", js.Any.fromFunction0(value))
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setReplaceDate(value: ThreadRowDateDescriptor => Unit): Self = StObject.set(x, "replaceDate", js.Any.fromFunction1(value))
    
    inline def setReplaceDraftLabel(value: ThreadRowDraftLabelDescriptor => Unit): Self = StObject.set(x, "replaceDraftLabel", js.Any.fromFunction1(value))
  }
}
