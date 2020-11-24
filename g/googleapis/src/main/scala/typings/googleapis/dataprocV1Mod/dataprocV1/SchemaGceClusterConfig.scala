package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common config settings for resources of Compute Engine cluster instances,
  * applicable to all instances in the cluster.
  */
@js.native
trait SchemaGceClusterConfig extends js.Object {
  
  /**
    * Optional. If true, all instances in the cluster will only have internal
    * IP addresses. By default, clusters are not restricted to internal IP
    * addresses, and will have ephemeral external IP addresses assigned to each
    * instance. This internal_ip_only restriction can only be enabled for
    * subnetwork enabled networks, and all off-cluster dependencies must be
    * configured to be accessible without external IP addresses.
    */
  var internalIpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The Compute Engine metadata entries to add to all instances (see Project
    * and instance metadata
    * (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Optional. The Compute Engine network to be used for machine
    * communications. Cannot be specified with subnetwork_uri. If neither
    * network_uri nor subnetwork_uri is specified, the &quot;default&quot;
    * network of the project is used, if it exists. Cannot be a &quot;Custom
    * Subnet Network&quot; (see Using Subnetworks for more information).A full
    * URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default
    * projects/[project_id]/regions/global/default default
    */
  var networkUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The service account of the instances. Defaults to the default
    * Compute Engine service account. Custom service accounts need permissions
    * equivalent to the following IAM roles: roles/logging.logWriter
    * roles/storage.objectAdmin(see
    * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
    * for more information). Example:
    * [account_id]@[project_id].iam.gserviceaccount.com
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /**
    * Optional. The URIs of service account scopes to be included in Compute
    * Engine instances. The following base set of scopes is always included:
    * https://www.googleapis.com/auth/cloud.useraccounts.readonly
    * https://www.googleapis.com/auth/devstorage.read_write
    * https://www.googleapis.com/auth/logging.writeIf no scopes are specified,
    * the following defaults are also provided:
    * https://www.googleapis.com/auth/bigquery
    * https://www.googleapis.com/auth/bigtable.admin.table
    * https://www.googleapis.com/auth/bigtable.data
    * https://www.googleapis.com/auth/devstorage.full_control
    */
  var serviceAccountScopes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The Compute Engine subnetwork to be used for machine
    * communications. Cannot be specified with network_uri.A full URL, partial
    * URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/sub0
    * projects/[project_id]/regions/us-east1/sub0 sub0
    */
  var subnetworkUri: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine tags to add to all instances (see Tagging instances).
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The zone where the Compute Engine cluster will be located. On a
    * create request, it is required in the &quot;global&quot; region. If
    * omitted in a non-global Cloud Dataproc region, the service will pick a
    * zone in the corresponding Compute Engine region. On a get request, zone
    * will always be present.A full URL, partial URI, or short name are valid.
    * Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]
    * projects/[project_id]/zones/[zone] us-central1-f
    */
  var zoneUri: js.UndefOr[String] = js.native
}
object SchemaGceClusterConfig {
  
  @scala.inline
  def apply(): SchemaGceClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGceClusterConfig]
  }
  
  @scala.inline
  implicit class SchemaGceClusterConfigOps[Self <: SchemaGceClusterConfig] (val x: Self) extends AnyVal {
    
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
    def setInternalIpOnly(value: Boolean): Self = this.set("internalIpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalIpOnly: Self = this.set("internalIpOnly", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = this.set("networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUri: Self = this.set("networkUri", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setServiceAccountScopesVarargs(value: String*): Self = this.set("serviceAccountScopes", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccountScopes(value: js.Array[String]): Self = this.set("serviceAccountScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountScopes: Self = this.set("serviceAccountScopes", js.undefined)
    
    @scala.inline
    def setSubnetworkUri(value: String): Self = this.set("subnetworkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetworkUri: Self = this.set("subnetworkUri", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setZoneUri(value: String): Self = this.set("zoneUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneUri: Self = this.set("zoneUri", js.undefined)
  }
}
