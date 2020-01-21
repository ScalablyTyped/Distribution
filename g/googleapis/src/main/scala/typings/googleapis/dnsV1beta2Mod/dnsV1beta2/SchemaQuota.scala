package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQuota extends js.Object {
  var dnsKeysPerManagedZone: js.UndefOr[Double] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#quota&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var managedZones: js.UndefOr[Double] = js.native
  var managedZonesPerNetwork: js.UndefOr[Double] = js.native
  var networksPerManagedZone: js.UndefOr[Double] = js.native
  var networksPerPolicy: js.UndefOr[Double] = js.native
  var policies: js.UndefOr[Double] = js.native
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.native
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.native
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.native
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.native
  var targetNameServersPerManagedZone: js.UndefOr[Double] = js.native
  var targetNameServersPerPolicy: js.UndefOr[Double] = js.native
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.native
  var whitelistedKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.native
}

object SchemaQuota {
  @scala.inline
  def apply(
    dnsKeysPerManagedZone: Int | Double = null,
    kind: String = null,
    managedZones: Int | Double = null,
    managedZonesPerNetwork: Int | Double = null,
    networksPerManagedZone: Int | Double = null,
    networksPerPolicy: Int | Double = null,
    policies: Int | Double = null,
    resourceRecordsPerRrset: Int | Double = null,
    rrsetAdditionsPerChange: Int | Double = null,
    rrsetDeletionsPerChange: Int | Double = null,
    rrsetsPerManagedZone: Int | Double = null,
    targetNameServersPerManagedZone: Int | Double = null,
    targetNameServersPerPolicy: Int | Double = null,
    totalRrdataSizePerChange: Int | Double = null,
    whitelistedKeySpecs: js.Array[SchemaDnsKeySpec] = null
  ): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    if (dnsKeysPerManagedZone != null) __obj.updateDynamic("dnsKeysPerManagedZone")(dnsKeysPerManagedZone.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedZones != null) __obj.updateDynamic("managedZones")(managedZones.asInstanceOf[js.Any])
    if (managedZonesPerNetwork != null) __obj.updateDynamic("managedZonesPerNetwork")(managedZonesPerNetwork.asInstanceOf[js.Any])
    if (networksPerManagedZone != null) __obj.updateDynamic("networksPerManagedZone")(networksPerManagedZone.asInstanceOf[js.Any])
    if (networksPerPolicy != null) __obj.updateDynamic("networksPerPolicy")(networksPerPolicy.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (resourceRecordsPerRrset != null) __obj.updateDynamic("resourceRecordsPerRrset")(resourceRecordsPerRrset.asInstanceOf[js.Any])
    if (rrsetAdditionsPerChange != null) __obj.updateDynamic("rrsetAdditionsPerChange")(rrsetAdditionsPerChange.asInstanceOf[js.Any])
    if (rrsetDeletionsPerChange != null) __obj.updateDynamic("rrsetDeletionsPerChange")(rrsetDeletionsPerChange.asInstanceOf[js.Any])
    if (rrsetsPerManagedZone != null) __obj.updateDynamic("rrsetsPerManagedZone")(rrsetsPerManagedZone.asInstanceOf[js.Any])
    if (targetNameServersPerManagedZone != null) __obj.updateDynamic("targetNameServersPerManagedZone")(targetNameServersPerManagedZone.asInstanceOf[js.Any])
    if (targetNameServersPerPolicy != null) __obj.updateDynamic("targetNameServersPerPolicy")(targetNameServersPerPolicy.asInstanceOf[js.Any])
    if (totalRrdataSizePerChange != null) __obj.updateDynamic("totalRrdataSizePerChange")(totalRrdataSizePerChange.asInstanceOf[js.Any])
    if (whitelistedKeySpecs != null) __obj.updateDynamic("whitelistedKeySpecs")(whitelistedKeySpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuota]
  }
}

