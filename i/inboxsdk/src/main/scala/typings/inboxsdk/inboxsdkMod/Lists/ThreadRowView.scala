package typings.inboxsdk.inboxsdkMod.Lists

import typings.inboxsdk.inboxsdkMod.Common.Contact
import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowView extends js.Object {
  var destroyed: Boolean
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): Unit
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): Unit
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): Unit
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): Unit
  def addLabel(labelDescriptor: LabelDescriptor): Unit
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
}

