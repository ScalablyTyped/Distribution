package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZone extends js.Object {
  var creationTime: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var dnsName: js.UndefOr[String] = js.native
  var dnssecConfig: js.UndefOr[SchemaManagedZoneDnsSecConfig] = js.native
  var forwardingConfig: js.UndefOr[SchemaManagedZoneForwardingConfig] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZone&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var nameServerSet: js.UndefOr[String] = js.native
  var nameServers: js.UndefOr[js.Array[String]] = js.native
  var peeringConfig: js.UndefOr[SchemaManagedZonePeeringConfig] = js.native
  var privateVisibilityConfig: js.UndefOr[SchemaManagedZonePrivateVisibilityConfig] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object SchemaManagedZone {
  @scala.inline
  def apply(
    creationTime: String = null,
    description: String = null,
    dnsName: String = null,
    dnssecConfig: SchemaManagedZoneDnsSecConfig = null,
    forwardingConfig: SchemaManagedZoneForwardingConfig = null,
    id: String = null,
    kind: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    nameServerSet: String = null,
    nameServers: js.Array[String] = null,
    peeringConfig: SchemaManagedZonePeeringConfig = null,
    privateVisibilityConfig: SchemaManagedZonePrivateVisibilityConfig = null,
    visibility: String = null
  ): SchemaManagedZone = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (dnssecConfig != null) __obj.updateDynamic("dnssecConfig")(dnssecConfig.asInstanceOf[js.Any])
    if (forwardingConfig != null) __obj.updateDynamic("forwardingConfig")(forwardingConfig.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameServerSet != null) __obj.updateDynamic("nameServerSet")(nameServerSet.asInstanceOf[js.Any])
    if (nameServers != null) __obj.updateDynamic("nameServers")(nameServers.asInstanceOf[js.Any])
    if (peeringConfig != null) __obj.updateDynamic("peeringConfig")(peeringConfig.asInstanceOf[js.Any])
    if (privateVisibilityConfig != null) __obj.updateDynamic("privateVisibilityConfig")(privateVisibilityConfig.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZone]
  }
}

