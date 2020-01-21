package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZonePeeringConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNetwork: js.UndefOr[SchemaManagedZonePeeringConfigTargetNetwork] = js.native
}

object SchemaManagedZonePeeringConfig {
  @scala.inline
  def apply(kind: String = null, targetNetwork: SchemaManagedZonePeeringConfigTargetNetwork = null): SchemaManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (targetNetwork != null) __obj.updateDynamic("targetNetwork")(targetNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZonePeeringConfig]
  }
}

