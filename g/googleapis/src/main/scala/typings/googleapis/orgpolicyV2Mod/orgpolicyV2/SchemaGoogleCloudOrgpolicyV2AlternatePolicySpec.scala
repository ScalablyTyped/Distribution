package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2AlternatePolicySpec extends StObject {
  
  /**
    * Reference to the launch that will be used while audit logging and to control the launch. Should be set only in the alternate policy.
    */
  var launch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specify `Constraint` for configurations of Cloud Platform resources.
    */
  var spec: js.UndefOr[SchemaGoogleCloudOrgpolicyV2PolicySpec] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2AlternatePolicySpec {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2AlternatePolicySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2AlternatePolicySpec]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2AlternatePolicySpec](x: Self) {
    
    inline def setLaunch(value: String): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
    
    inline def setLaunchNull: Self = StObject.set(x, "launch", null)
    
    inline def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
    
    inline def setSpec(value: SchemaGoogleCloudOrgpolicyV2PolicySpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
