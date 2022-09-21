package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProject extends StObject {
  
  /**
    * Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information.
    */
  var commonInstanceMetadata: js.UndefOr[SchemaMetadata] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This signifies the default network tier used for configuring resources of the project and can only take the following values: PREMIUM, STANDARD. Initially the default network tier is PREMIUM.
    */
  var defaultNetworkTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Default service account used by VMs running in this project.
    */
  var defaultServiceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional textual description of the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Restricted features enabled for use on this project.
    */
  var enabledFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is *not* the project ID, and is just a unique ID used by Compute Engine to identify resources.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#project for projects.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Quotas assigned to this project.
    */
  var quotas: js.UndefOr[js.Array[SchemaQuota]] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored.
    */
  var usageExportLocation: js.UndefOr[SchemaUsageExportLocation] = js.undefined
  
  /**
    * [Output Only] The role this project has in a shared VPC configuration. Currently, only projects with the host role, which is specified by the value HOST, are differentiated.
    */
  var xpnProjectStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaProject {
  
  inline def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  
  extension [Self <: SchemaProject](x: Self) {
    
    inline def setCommonInstanceMetadata(value: SchemaMetadata): Self = StObject.set(x, "commonInstanceMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonInstanceMetadataUndefined: Self = StObject.set(x, "commonInstanceMetadata", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDefaultNetworkTier(value: String): Self = StObject.set(x, "defaultNetworkTier", value.asInstanceOf[js.Any])
    
    inline def setDefaultNetworkTierNull: Self = StObject.set(x, "defaultNetworkTier", null)
    
    inline def setDefaultNetworkTierUndefined: Self = StObject.set(x, "defaultNetworkTier", js.undefined)
    
    inline def setDefaultServiceAccount(value: String): Self = StObject.set(x, "defaultServiceAccount", value.asInstanceOf[js.Any])
    
    inline def setDefaultServiceAccountNull: Self = StObject.set(x, "defaultServiceAccount", null)
    
    inline def setDefaultServiceAccountUndefined: Self = StObject.set(x, "defaultServiceAccount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabledFeatures(value: js.Array[String]): Self = StObject.set(x, "enabledFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnabledFeaturesNull: Self = StObject.set(x, "enabledFeatures", null)
    
    inline def setEnabledFeaturesUndefined: Self = StObject.set(x, "enabledFeatures", js.undefined)
    
    inline def setEnabledFeaturesVarargs(value: String*): Self = StObject.set(x, "enabledFeatures", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuotas(value: js.Array[SchemaQuota]): Self = StObject.set(x, "quotas", value.asInstanceOf[js.Any])
    
    inline def setQuotasUndefined: Self = StObject.set(x, "quotas", js.undefined)
    
    inline def setQuotasVarargs(value: SchemaQuota*): Self = StObject.set(x, "quotas", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUsageExportLocation(value: SchemaUsageExportLocation): Self = StObject.set(x, "usageExportLocation", value.asInstanceOf[js.Any])
    
    inline def setUsageExportLocationUndefined: Self = StObject.set(x, "usageExportLocation", js.undefined)
    
    inline def setXpnProjectStatus(value: String): Self = StObject.set(x, "xpnProjectStatus", value.asInstanceOf[js.Any])
    
    inline def setXpnProjectStatusNull: Self = StObject.set(x, "xpnProjectStatus", null)
    
    inline def setXpnProjectStatusUndefined: Self = StObject.set(x, "xpnProjectStatus", js.undefined)
  }
}
