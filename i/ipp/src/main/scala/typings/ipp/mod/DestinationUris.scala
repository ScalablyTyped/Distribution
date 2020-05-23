package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationUris extends js.Object {
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `destination-uri`: js.UndefOr[String] = js.undefined
  var `feed-orientation`: js.UndefOr[FeedOrientation] = js.undefined
  var `post-dial-string`: js.UndefOr[String] = js.undefined
  var `pre-dial-string`: js.UndefOr[String] = js.undefined
  var `t33-subaddress`: js.UndefOr[Double] = js.undefined
}

object DestinationUris {
  @scala.inline
  def apply(
    `destination-attributes`: js.Array[js.Object] = null,
    `destination-uri`: String = null,
    `feed-orientation`: FeedOrientation = null,
    `post-dial-string`: String = null,
    `pre-dial-string`: String = null,
    `t33-subaddress`: js.UndefOr[Double] = js.undefined
  ): DestinationUris = {
    val __obj = js.Dynamic.literal()
    if (`destination-attributes` != null) __obj.updateDynamic("destination-attributes")(`destination-attributes`.asInstanceOf[js.Any])
    if (`destination-uri` != null) __obj.updateDynamic("destination-uri")(`destination-uri`.asInstanceOf[js.Any])
    if (`feed-orientation` != null) __obj.updateDynamic("feed-orientation")(`feed-orientation`.asInstanceOf[js.Any])
    if (`post-dial-string` != null) __obj.updateDynamic("post-dial-string")(`post-dial-string`.asInstanceOf[js.Any])
    if (`pre-dial-string` != null) __obj.updateDynamic("pre-dial-string")(`pre-dial-string`.asInstanceOf[js.Any])
    if (!js.isUndefined(`t33-subaddress`)) __obj.updateDynamic("t33-subaddress")(`t33-subaddress`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationUris]
  }
}

