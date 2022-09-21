package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembership extends StObject {
  
  /**
    * Optional. How to identify workloads from this Membership. See the documentation on Workload Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
    */
  var authority: js.UndefOr[SchemaAuthority] = js.undefined
  
  /**
    * Output only. When the Membership was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When the Membership was deleted.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Description of this membership, limited to 63 characters. Must match the regex: `a-zA-Z0-9*` This field is present for legacy purposes.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Endpoint information to reach this member.
    */
  var endpoint: js.UndefOr[SchemaMembershipEndpoint] = js.undefined
  
  /**
    * Optional. An externally-generated and managed ID for this Membership. This ID may be modified after creation, but this is not recommended. For GKE clusters, external_id is managed by the Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-system` namespace object.
    */
  var externalId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The infrastructure type this Membership is running on.
    */
  var infrastructureType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. GCP labels for this membership.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. For clusters using Connect, the timestamp of the most recent connection established with Google Cloud. This time is updated every several minutes, not continuously. For clusters that do not use GKE Connect, or that have never connected successfully, this field will be unset.
    */
  var lastConnectionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The full, unique name of this Membership resource in the format `projects/x/locations/x/memberships/{membership_id\}`, set during creation. `membership_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the Membership resource.
    */
  var state: js.UndefOr[SchemaMembershipState] = js.undefined
  
  /**
    * Output only. Google-generated UUID for this resource. This is unique across all Membership resources. If a Membership resource is deleted and another resource with the same name is created, it gets a different unique_id.
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When the Membership was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembership {
  
  inline def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  
  extension [Self <: SchemaMembership](x: Self) {
    
    inline def setAuthority(value: SchemaAuthority): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: SchemaMembershipEndpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setInfrastructureType(value: String): Self = StObject.set(x, "infrastructureType", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureTypeNull: Self = StObject.set(x, "infrastructureType", null)
    
    inline def setInfrastructureTypeUndefined: Self = StObject.set(x, "infrastructureType", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastConnectionTime(value: String): Self = StObject.set(x, "lastConnectionTime", value.asInstanceOf[js.Any])
    
    inline def setLastConnectionTimeNull: Self = StObject.set(x, "lastConnectionTime", null)
    
    inline def setLastConnectionTimeUndefined: Self = StObject.set(x, "lastConnectionTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: SchemaMembershipState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdNull: Self = StObject.set(x, "uniqueId", null)
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
