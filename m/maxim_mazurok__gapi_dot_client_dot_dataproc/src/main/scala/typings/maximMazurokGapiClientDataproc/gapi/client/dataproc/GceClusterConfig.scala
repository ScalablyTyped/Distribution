package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GceClusterConfig extends StObject {
  
  /** Optional. Confidential Instance Config for clusters using Confidential VMs (https://cloud.google.com/compute/confidential-vm/docs). */
  var confidentialInstanceConfig: js.UndefOr[ConfidentialInstanceConfig] = js.undefined
  
  /**
    * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral
    * external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be
    * configured to be accessible without external IP addresses.
    */
  var internalIpOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Compute Engine metadata entries to add to all instances (see Project and instance metadata
    * (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.GceClusterConfig & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the
    * "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more
    * information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default
    * projects/[project_id]/regions/global/default default
    */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Optional. Node Group Affinity for sole-tenant clusters. */
  var nodeGroupAffinity: js.UndefOr[NodeGroupAffinity] = js.undefined
  
  /** Optional. The type of IPv6 access for a cluster. */
  var privateIpv6GoogleAccess: js.UndefOr[String] = js.undefined
  
  /** Optional. Reservation Affinity for consuming Zonal reservation. */
  var reservationAffinity: js.UndefOr[ReservationAffinity] = js.undefined
  
  /**
    * Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane
    * identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google
    * Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included:
    * https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are
    * specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table
    * https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
    */
  var serviceAccountScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm). */
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
    */
  var subnetworkUri: js.UndefOr[String] = js.undefined
  
  /** The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)). */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the
    * service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
    */
  var zoneUri: js.UndefOr[String] = js.undefined
}
object GceClusterConfig {
  
  inline def apply(): GceClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GceClusterConfig]
  }
  
  extension [Self <: GceClusterConfig](x: Self) {
    
    inline def setConfidentialInstanceConfig(value: ConfidentialInstanceConfig): Self = StObject.set(x, "confidentialInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setConfidentialInstanceConfigUndefined: Self = StObject.set(x, "confidentialInstanceConfig", js.undefined)
    
    inline def setInternalIpOnly(value: Boolean): Self = StObject.set(x, "internalIpOnly", value.asInstanceOf[js.Any])
    
    inline def setInternalIpOnlyUndefined: Self = StObject.set(x, "internalIpOnly", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.GceClusterConfig & TopLevel[Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setNodeGroupAffinity(value: NodeGroupAffinity): Self = StObject.set(x, "nodeGroupAffinity", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupAffinityUndefined: Self = StObject.set(x, "nodeGroupAffinity", js.undefined)
    
    inline def setPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "privateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "privateIpv6GoogleAccess", js.undefined)
    
    inline def setReservationAffinity(value: ReservationAffinity): Self = StObject.set(x, "reservationAffinity", value.asInstanceOf[js.Any])
    
    inline def setReservationAffinityUndefined: Self = StObject.set(x, "reservationAffinity", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountScopes(value: js.Array[String]): Self = StObject.set(x, "serviceAccountScopes", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountScopesUndefined: Self = StObject.set(x, "serviceAccountScopes", js.undefined)
    
    inline def setServiceAccountScopesVarargs(value: String*): Self = StObject.set(x, "serviceAccountScopes", js.Array(value*))
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    inline def setSubnetworkUri(value: String): Self = StObject.set(x, "subnetworkUri", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUriUndefined: Self = StObject.set(x, "subnetworkUri", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setZoneUri(value: String): Self = StObject.set(x, "zoneUri", value.asInstanceOf[js.Any])
    
    inline def setZoneUriUndefined: Self = StObject.set(x, "zoneUri", js.undefined)
  }
}
