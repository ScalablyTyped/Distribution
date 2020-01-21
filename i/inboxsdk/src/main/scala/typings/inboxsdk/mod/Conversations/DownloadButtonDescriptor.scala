package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadButtonDescriptor extends js.Object {
  var downloadFilename: js.UndefOr[String] = js.undefined
  var downloadUrl: String
  var openInNewTab: js.UndefOr[Boolean] = js.undefined
  def onClick(event: js.Any): Unit
}

object DownloadButtonDescriptor {
  @scala.inline
  def apply(
    downloadUrl: String,
    onClick: js.Any => Unit,
    downloadFilename: String = null,
    openInNewTab: js.UndefOr[Boolean] = js.undefined
  ): DownloadButtonDescriptor = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (downloadFilename != null) __obj.updateDynamic("downloadFilename")(downloadFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(openInNewTab)) __obj.updateDynamic("openInNewTab")(openInNewTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadButtonDescriptor]
  }
}

