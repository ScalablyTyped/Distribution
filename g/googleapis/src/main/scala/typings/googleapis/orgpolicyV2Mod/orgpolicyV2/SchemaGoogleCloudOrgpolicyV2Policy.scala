package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2Policy extends StObject {
  
  /**
    * Deprecated.
    */
  var alternate: js.UndefOr[SchemaGoogleCloudOrgpolicyV2AlternatePolicySpec] = js.undefined
  
  /**
    * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number\}/policies/{constraint_name\}` * `folders/{folder_id\}/policies/{constraint_name\}` * `organizations/{organization_id\}/policies/{constraint_name\}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id\}/policies/{constraint_name\}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Basic information about the Organization Policy.
    */
  var spec: js.UndefOr[SchemaGoogleCloudOrgpolicyV2PolicySpec] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2Policy {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2Policy]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2Policy](x: Self) {
    
    inline def setAlternate(value: SchemaGoogleCloudOrgpolicyV2AlternatePolicySpec): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpec(value: SchemaGoogleCloudOrgpolicyV2PolicySpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
