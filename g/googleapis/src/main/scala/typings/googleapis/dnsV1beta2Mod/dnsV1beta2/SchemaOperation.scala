package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOperation extends js.Object {
  var dnsKeyContext: js.UndefOr[SchemaOperationDnsKeyContext] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#operation&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var user: js.UndefOr[String] = js.native
  var zoneContext: js.UndefOr[SchemaOperationManagedZoneContext] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(
    dnsKeyContext: SchemaOperationDnsKeyContext = null,
    id: String = null,
    kind: String = null,
    startTime: String = null,
    status: String = null,
    `type`: String = null,
    user: String = null,
    zoneContext: SchemaOperationManagedZoneContext = null
  ): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    if (dnsKeyContext != null) __obj.updateDynamic("dnsKeyContext")(dnsKeyContext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (zoneContext != null) __obj.updateDynamic("zoneContext")(zoneContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperation]
  }
}

