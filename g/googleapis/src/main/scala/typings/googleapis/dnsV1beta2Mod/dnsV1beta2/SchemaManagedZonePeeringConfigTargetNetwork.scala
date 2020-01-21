package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZonePeeringConfigTargetNetwork extends js.Object {
  var deactivateTime: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfigTargetNetwork&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var networkUrl: js.UndefOr[String] = js.native
}

object SchemaManagedZonePeeringConfigTargetNetwork {
  @scala.inline
  def apply(deactivateTime: String = null, kind: String = null, networkUrl: String = null): SchemaManagedZonePeeringConfigTargetNetwork = {
    val __obj = js.Dynamic.literal()
    if (deactivateTime != null) __obj.updateDynamic("deactivateTime")(deactivateTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networkUrl != null) __obj.updateDynamic("networkUrl")(networkUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZonePeeringConfigTargetNetwork]
  }
}

