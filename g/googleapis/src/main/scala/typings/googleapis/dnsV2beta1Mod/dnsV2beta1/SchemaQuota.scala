package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

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
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.native
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.native
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.native
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.native
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.native
  var whitelistedKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.native
}

object SchemaQuota {
  @scala.inline
  def apply(
    dnsKeysPerManagedZone: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    managedZones: js.UndefOr[Double] = js.undefined,
    managedZonesPerNetwork: js.UndefOr[Double] = js.undefined,
    networksPerManagedZone: js.UndefOr[Double] = js.undefined,
    resourceRecordsPerRrset: js.UndefOr[Double] = js.undefined,
    rrsetAdditionsPerChange: js.UndefOr[Double] = js.undefined,
    rrsetDeletionsPerChange: js.UndefOr[Double] = js.undefined,
    rrsetsPerManagedZone: js.UndefOr[Double] = js.undefined,
    totalRrdataSizePerChange: js.UndefOr[Double] = js.undefined,
    whitelistedKeySpecs: js.Array[SchemaDnsKeySpec] = null
  ): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dnsKeysPerManagedZone)) __obj.updateDynamic("dnsKeysPerManagedZone")(dnsKeysPerManagedZone.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(managedZones)) __obj.updateDynamic("managedZones")(managedZones.get.asInstanceOf[js.Any])
    if (!js.isUndefined(managedZonesPerNetwork)) __obj.updateDynamic("managedZonesPerNetwork")(managedZonesPerNetwork.get.asInstanceOf[js.Any])
    if (!js.isUndefined(networksPerManagedZone)) __obj.updateDynamic("networksPerManagedZone")(networksPerManagedZone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceRecordsPerRrset)) __obj.updateDynamic("resourceRecordsPerRrset")(resourceRecordsPerRrset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rrsetAdditionsPerChange)) __obj.updateDynamic("rrsetAdditionsPerChange")(rrsetAdditionsPerChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rrsetDeletionsPerChange)) __obj.updateDynamic("rrsetDeletionsPerChange")(rrsetDeletionsPerChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rrsetsPerManagedZone)) __obj.updateDynamic("rrsetsPerManagedZone")(rrsetsPerManagedZone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRrdataSizePerChange)) __obj.updateDynamic("totalRrdataSizePerChange")(totalRrdataSizePerChange.get.asInstanceOf[js.Any])
    if (whitelistedKeySpecs != null) __obj.updateDynamic("whitelistedKeySpecs")(whitelistedKeySpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuota]
  }
}

