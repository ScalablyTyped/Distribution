package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadButtonDescriptor extends js.Object {
  var downloadFilename: js.UndefOr[java.lang.String] = js.undefined
  var downloadUrl: java.lang.String
  var openInNewTab: js.UndefOr[scala.Boolean] = js.undefined
  def onClick(event: js.Any): scala.Unit
}

object DownloadButtonDescriptor {
  @scala.inline
  def apply(
    downloadUrl: java.lang.String,
    onClick: js.Function1[js.Any, scala.Unit],
    downloadFilename: java.lang.String = null,
    openInNewTab: js.UndefOr[scala.Boolean] = js.undefined
  ): DownloadButtonDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downloadUrl")(downloadUrl)
    __obj.updateDynamic("onClick")(onClick)
    if (downloadFilename != null) __obj.updateDynamic("downloadFilename")(downloadFilename)
    if (!js.isUndefined(openInNewTab)) __obj.updateDynamic("openInNewTab")(openInNewTab)
    __obj.asInstanceOf[DownloadButtonDescriptor]
  }
}

