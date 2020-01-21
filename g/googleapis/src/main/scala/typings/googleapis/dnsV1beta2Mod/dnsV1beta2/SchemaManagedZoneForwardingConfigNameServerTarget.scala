package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZoneForwardingConfigNameServerTarget extends js.Object {
  var ipv4Address: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfigNameServerTarget&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaManagedZoneForwardingConfigNameServerTarget {
  @scala.inline
  def apply(ipv4Address: String = null, kind: String = null): SchemaManagedZoneForwardingConfigNameServerTarget = {
    val __obj = js.Dynamic.literal()
    if (ipv4Address != null) __obj.updateDynamic("ipv4Address")(ipv4Address.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfigNameServerTarget]
  }
}

