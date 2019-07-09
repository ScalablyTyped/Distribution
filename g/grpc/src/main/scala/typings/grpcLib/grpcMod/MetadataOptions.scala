package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataOptions extends js.Object {
  /* Signal that the call is cacheable. GRPC is free to use GET verb.
    * Defaults to false */
  var cacheableRequest: js.UndefOr[scala.Boolean] = js.undefined
  /* Signal that the initial metadata should be corked. Defaults to false. */
  var corked: js.UndefOr[scala.Boolean] = js.undefined
  /* Signal that the request is idempotent. Defaults to false */
  var idempotentRequest: js.UndefOr[scala.Boolean] = js.undefined
  /* Signal that the call should not return UNAVAILABLE before it has
    * started. Defaults to true. */
  var waitForReady: js.UndefOr[scala.Boolean] = js.undefined
}

object MetadataOptions {
  @scala.inline
  def apply(
    cacheableRequest: js.UndefOr[scala.Boolean] = js.undefined,
    corked: js.UndefOr[scala.Boolean] = js.undefined,
    idempotentRequest: js.UndefOr[scala.Boolean] = js.undefined,
    waitForReady: js.UndefOr[scala.Boolean] = js.undefined
  ): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheableRequest)) __obj.updateDynamic("cacheableRequest")(cacheableRequest)
    if (!js.isUndefined(corked)) __obj.updateDynamic("corked")(corked)
    if (!js.isUndefined(idempotentRequest)) __obj.updateDynamic("idempotentRequest")(idempotentRequest)
    if (!js.isUndefined(waitForReady)) __obj.updateDynamic("waitForReady")(waitForReady)
    __obj.asInstanceOf[MetadataOptions]
  }
}

