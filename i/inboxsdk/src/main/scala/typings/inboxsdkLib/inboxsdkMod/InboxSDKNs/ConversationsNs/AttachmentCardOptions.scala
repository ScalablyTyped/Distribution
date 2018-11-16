package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ConversationsDescriptors

trait AttachmentCardOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  var description: java.lang.String
  var failoverPreviewIconUrl: java.lang.String
  var fileIconImageUrl: java.lang.String
  var foldColor: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var previewThumbnailUrl: java.lang.String
  var previewUrl: java.lang.String
  var title: java.lang.String
  def previewOnClick(event: PreviewClickEvent): scala.Unit
}

