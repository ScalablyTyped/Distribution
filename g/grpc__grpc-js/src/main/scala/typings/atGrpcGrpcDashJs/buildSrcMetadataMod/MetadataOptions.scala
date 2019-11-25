package typings.atGrpcGrpcDashJs.buildSrcMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataOptions extends js.Object {
  var cacheableRequest: js.UndefOr[Boolean] = js.undefined
  var corked: js.UndefOr[Boolean] = js.undefined
  var idempotentRequest: js.UndefOr[Boolean] = js.undefined
  var waitForReady: js.UndefOr[Boolean] = js.undefined
}

object MetadataOptions {
  @scala.inline
  def apply(
    cacheableRequest: js.UndefOr[Boolean] = js.undefined,
    corked: js.UndefOr[Boolean] = js.undefined,
    idempotentRequest: js.UndefOr[Boolean] = js.undefined,
    waitForReady: js.UndefOr[Boolean] = js.undefined
  ): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheableRequest)) __obj.updateDynamic("cacheableRequest")(cacheableRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(corked)) __obj.updateDynamic("corked")(corked.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotentRequest)) __obj.updateDynamic("idempotentRequest")(idempotentRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForReady)) __obj.updateDynamic("waitForReady")(waitForReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataOptions]
  }
}

