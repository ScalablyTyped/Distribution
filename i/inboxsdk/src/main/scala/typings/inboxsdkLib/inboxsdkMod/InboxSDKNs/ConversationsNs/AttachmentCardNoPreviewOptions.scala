package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AttachmentCardNoPreviewOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  var description: java.lang.String
  var fileIconImageUrl: java.lang.String
  var foldColor: js.UndefOr[java.lang.String] = js.undefined
  var iconThumbnailUrl: java.lang.String
  var previewUrl: java.lang.String
  var title: java.lang.String
  def previewOnClick(event: PreviewClickEvent): scala.Unit
}

