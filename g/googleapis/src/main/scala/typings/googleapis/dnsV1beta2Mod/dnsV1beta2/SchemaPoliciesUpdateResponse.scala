package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPoliciesUpdateResponse extends js.Object {
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  var policy: js.UndefOr[SchemaPolicy] = js.native
}

object SchemaPoliciesUpdateResponse {
  @scala.inline
  def apply(header: SchemaResponseHeader = null, policy: SchemaPolicy = null): SchemaPoliciesUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPoliciesUpdateResponse]
  }
}

