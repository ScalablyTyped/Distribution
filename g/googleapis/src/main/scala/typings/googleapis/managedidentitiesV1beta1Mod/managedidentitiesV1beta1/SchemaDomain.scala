package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomain extends StObject {
  
  /**
    * Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
    */
  var admin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
    */
  var auditLogsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
    */
  var authorizedNetworks: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The time the instance was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an internal network.
    */
  var fqdn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource labels that can contain user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
    */
  var locations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The unique name of the domain using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
    */
  var reservedIpRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of this domain.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional information about the current status of this domain, if available.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current trusts associated with the domain.
    */
  var trusts: js.UndefOr[js.Array[SchemaTrust]] = js.undefined
  
  /**
    * Output only. The last update time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDomain {
  
  inline def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  
  extension [Self <: SchemaDomain](x: Self) {
    
    inline def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminNull: Self = StObject.set(x, "admin", null)
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setAuditLogsEnabled(value: Boolean): Self = StObject.set(x, "auditLogsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAuditLogsEnabledNull: Self = StObject.set(x, "auditLogsEnabled", null)
    
    inline def setAuditLogsEnabledUndefined: Self = StObject.set(x, "auditLogsEnabled", js.undefined)
    
    inline def setAuthorizedNetworks(value: js.Array[String]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworksNull: Self = StObject.set(x, "authorizedNetworks", null)
    
    inline def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    inline def setAuthorizedNetworksVarargs(value: String*): Self = StObject.set(x, "authorizedNetworks", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    inline def setFqdnNull: Self = StObject.set(x, "fqdn", null)
    
    inline def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    inline def setReservedIpRangeNull: Self = StObject.set(x, "reservedIpRange", null)
    
    inline def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTrusts(value: js.Array[SchemaTrust]): Self = StObject.set(x, "trusts", value.asInstanceOf[js.Any])
    
    inline def setTrustsUndefined: Self = StObject.set(x, "trusts", js.undefined)
    
    inline def setTrustsVarargs(value: SchemaTrust*): Self = StObject.set(x, "trusts", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
