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

