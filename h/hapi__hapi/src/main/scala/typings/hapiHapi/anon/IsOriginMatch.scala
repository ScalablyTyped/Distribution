package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsOriginMatch extends js.Object {
  /**
    * true if the request 'Origin' header matches the configured CORS restrictions. Set to false if no 'Origin' header is found or if it does not match. Note that this is only available after
    * the 'onRequest' extension point as CORS is configured per-route and no routing decisions are made at that point in the request lifecycle.
    */
  var isOriginMatch: js.UndefOr[Boolean] = js.undefined
}

object IsOriginMatch {
  @scala.inline
  def apply(isOriginMatch: js.UndefOr[Boolean] = js.undefined): IsOriginMatch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOriginMatch)) __obj.updateDynamic("isOriginMatch")(isOriginMatch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOriginMatch]
  }
}

