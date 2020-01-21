package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZonePrivateVisibilityConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var networks: js.UndefOr[js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]] = js.native
}

object SchemaManagedZonePrivateVisibilityConfig {
  @scala.inline
  def apply(kind: String = null, networks: js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork] = null): SchemaManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfig]
  }
}

