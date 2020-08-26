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
  def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  @scala.inline
  implicit class SchemaQuotaOps[Self <: SchemaQuota] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDnsKeysPerManagedZone(value: Double): Self = this.set("dnsKeysPerManagedZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsKeysPerManagedZone: Self = this.set("dnsKeysPerManagedZone", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setManagedZones(value: Double): Self = this.set("managedZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedZones: Self = this.set("managedZones", js.undefined)
    @scala.inline
    def setManagedZonesPerNetwork(value: Double): Self = this.set("managedZonesPerNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedZonesPerNetwork: Self = this.set("managedZonesPerNetwork", js.undefined)
    @scala.inline
    def setNetworksPerManagedZone(value: Double): Self = this.set("networksPerManagedZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworksPerManagedZone: Self = this.set("networksPerManagedZone", js.undefined)
    @scala.inline
    def setNetworksPerPolicy(value: Double): Self = this.set("networksPerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworksPerPolicy: Self = this.set("networksPerPolicy", js.undefined)
    @scala.inline
    def setPolicies(value: Double): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    @scala.inline
    def setResourceRecordsPerRrset(value: Double): Self = this.set("resourceRecordsPerRrset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRecordsPerRrset: Self = this.set("resourceRecordsPerRrset", js.undefined)
    @scala.inline
    def setRrsetAdditionsPerChange(value: Double): Self = this.set("rrsetAdditionsPerChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRrsetAdditionsPerChange: Self = this.set("rrsetAdditionsPerChange", js.undefined)
    @scala.inline
    def setRrsetDeletionsPerChange(value: Double): Self = this.set("rrsetDeletionsPerChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRrsetDeletionsPerChange: Self = this.set("rrsetDeletionsPerChange", js.undefined)
    @scala.inline
    def setRrsetsPerManagedZone(value: Double): Self = this.set("rrsetsPerManagedZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRrsetsPerManagedZone: Self = this.set("rrsetsPerManagedZone", js.undefined)
    @scala.inline
    def setTargetNameServersPerManagedZone(value: Double): Self = this.set("targetNameServersPerManagedZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNameServersPerManagedZone: Self = this.set("targetNameServersPerManagedZone", js.undefined)
    @scala.inline
    def setTargetNameServersPerPolicy(value: Double): Self = this.set("targetNameServersPerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNameServersPerPolicy: Self = this.set("targetNameServersPerPolicy", js.undefined)
    @scala.inline
    def setTotalRrdataSizePerChange(value: Double): Self = this.set("totalRrdataSizePerChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRrdataSizePerChange: Self = this.set("totalRrdataSizePerChange", js.undefined)
    @scala.inline
    def setWhitelistedKeySpecsVarargs(value: SchemaDnsKeySpec*): Self = this.set("whitelistedKeySpecs", js.Array(value :_*))
    @scala.inline
    def setWhitelistedKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = this.set("whitelistedKeySpecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelistedKeySpecs: Self = this.set("whitelistedKeySpecs", js.undefined)
  }
  
}

