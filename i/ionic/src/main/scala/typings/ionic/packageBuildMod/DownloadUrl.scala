package typings.ionic.packageBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadUrl extends js.Object {
  var url: String | Null
}

object DownloadUrl {
  @scala.inline
  def apply(url: String = null): DownloadUrl = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadUrl]
  }
}

