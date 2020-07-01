package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the HTTP configuration for an API service. It contains a list of
  * HttpRule, each specifying the mapping of an RPC method to one or more HTTP
  * REST API methods.
  */
@js.native
trait SchemaHttp extends js.Object {
  /**
    * When set to true, URL path parameters will be fully URI-decoded except in
    * cases of single segment matches in reserved expansion, where
    * &quot;%2F&quot; will be left encoded.  The default behavior is to not
    * decode RFC 6570 reserved characters in multi segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.native
  /**
    * A list of HTTP configuration rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaHttpRule]] = js.native
}

object SchemaHttp {
  @scala.inline
  def apply(
    fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.undefined,
    rules: js.Array[SchemaHttpRule] = null
  ): SchemaHttp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullyDecodeReservedExpansion)) __obj.updateDynamic("fullyDecodeReservedExpansion")(fullyDecodeReservedExpansion.get.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttp]
  }
}

