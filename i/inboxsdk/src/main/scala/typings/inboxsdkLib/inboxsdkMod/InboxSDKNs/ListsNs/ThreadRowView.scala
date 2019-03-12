package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowView extends js.Object {
  var destroyed: scala.Boolean
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): scala.Unit
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): scala.Unit
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): scala.Unit
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): scala.Unit
  def addLabel(labelDescriptor: LabelDescriptor): scala.Unit
  def getContacts(): js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]
  def getDateString(): java.lang.String
  def getDraftID(): js.Promise[java.lang.String]
  // replaceDraftLabel(draftLabelDescriptor: Stream<ThreadRowDraftLabelDescriptor>): void;
  def getSubject(): java.lang.String
  def getThreadIDAsync(): js.Promise[java.lang.String]
  def getThreadIDIfStableAsync(): js.Promise[java.lang.String | scala.Null]
  def getVisibleDraftCount(): scala.Double
  def getVisibleMessageCount(): scala.Double
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
  // addAttachmentIcon(threadRowAttachmentIconDescriptor: stream<ThreadRowAttachmentIconDescriptor>): void
  def replaceDate(threadRowDateDescriptor: ThreadRowDateDescriptor): scala.Unit
  // replaceDate(threadRowDateDescriptor: Stream<ThreadRowDateDescriptor>): void;
  def replaceDraftLabel(draftLabelDescriptor: ThreadRowDraftLabelDescriptor): scala.Unit
}

object ThreadRowView {
  @scala.inline
  def apply(
    addActionButton: ThreadRowActionButtonDescriptor => scala.Unit,
    addAttachmentIcon: ThreadRowAttachmentIconDescriptor => scala.Unit,
    addButton: ThreadRowButtonDescriptor => scala.Unit,
    addImage: ImageDescriptor => scala.Unit,
    addLabel: LabelDescriptor => scala.Unit,
    destroyed: scala.Boolean,
    getContacts: () => js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact],
    getDateString: () => java.lang.String,
    getDraftID: () => js.Promise[java.lang.String],
    getSubject: () => java.lang.String,
    getThreadIDAsync: () => js.Promise[java.lang.String],
    getThreadIDIfStableAsync: () => js.Promise[java.lang.String | scala.Null],
    getVisibleDraftCount: () => scala.Double,
    getVisibleMessageCount: () => scala.Double,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit,
    replaceDate: ThreadRowDateDescriptor => scala.Unit,
    replaceDraftLabel: ThreadRowDraftLabelDescriptor => scala.Unit
  ): ThreadRowView = {
    val __obj = js.Dynamic.literal(addActionButton = js.Any.fromFunction1(addActionButton), addAttachmentIcon = js.Any.fromFunction1(addAttachmentIcon), addButton = js.Any.fromFunction1(addButton), addImage = js.Any.fromFunction1(addImage), addLabel = js.Any.fromFunction1(addLabel), destroyed = destroyed, getContacts = js.Any.fromFunction0(getContacts), getDateString = js.Any.fromFunction0(getDateString), getDraftID = js.Any.fromFunction0(getDraftID), getSubject = js.Any.fromFunction0(getSubject), getThreadIDAsync = js.Any.fromFunction0(getThreadIDAsync), getThreadIDIfStableAsync = js.Any.fromFunction0(getThreadIDIfStableAsync), getVisibleDraftCount = js.Any.fromFunction0(getVisibleDraftCount), getVisibleMessageCount = js.Any.fromFunction0(getVisibleMessageCount), replaceDate = js.Any.fromFunction1(replaceDate), replaceDraftLabel = js.Any.fromFunction1(replaceDraftLabel))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[ThreadRowView]
  }
}

