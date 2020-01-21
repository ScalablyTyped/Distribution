package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZoneForwardingConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNameServers: js.UndefOr[js.Array[SchemaManagedZoneForwardingConfigNameServerTarget]] = js.native
}

object SchemaManagedZoneForwardingConfig {
  @scala.inline
  def apply(
    kind: String = null,
    targetNameServers: js.Array[SchemaManagedZoneForwardingConfigNameServerTarget] = null
  ): SchemaManagedZoneForwardingConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (targetNameServers != null) __obj.updateDynamic("targetNameServers")(targetNameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfig]
  }
}

