package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalUrl extends js.Object {
  var originalUrl: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object OriginalUrl {
  @scala.inline
  def apply(originalUrl: String = null, url: String = null): OriginalUrl = {
    val __obj = js.Dynamic.literal()
    if (originalUrl != null) __obj.updateDynamic("originalUrl")(originalUrl.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalUrl]
  }
}

