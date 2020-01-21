package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResponseHeader extends js.Object {
  var operationId: js.UndefOr[String] = js.native
}

object SchemaResponseHeader {
  @scala.inline
  def apply(operationId: String = null): SchemaResponseHeader = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResponseHeader]
  }
}

