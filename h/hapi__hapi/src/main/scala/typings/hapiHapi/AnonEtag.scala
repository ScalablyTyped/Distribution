package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEtag extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var modified: js.UndefOr[String] = js.undefined
  var vary: js.UndefOr[Boolean] = js.undefined
}

object AnonEtag {
  @scala.inline
  def apply(etag: String = null, modified: String = null, vary: js.UndefOr[Boolean] = js.undefined): AnonEtag = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (!js.isUndefined(vary)) __obj.updateDynamic("vary")(vary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEtag]
  }
}

