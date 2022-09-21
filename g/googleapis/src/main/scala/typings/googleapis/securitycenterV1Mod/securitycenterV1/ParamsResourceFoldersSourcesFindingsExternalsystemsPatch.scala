package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersSourcesFindingsExternalsystemsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * External System Name e.g. jira, demisto, etc. e.g.: `organizations/1234/sources/5678/findings/123456/externalSystems/jira` `folders/1234/sources/5678/findings/123456/externalSystems/jira` `projects/1234/sources/5678/findings/123456/externalSystems/jira`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudSecuritycenterV1ExternalSystem] = js.undefined
  
  /**
    * The FieldMask to use when updating the external system resource. If empty all mutable fields will be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersSourcesFindingsExternalsystemsPatch {
  
  inline def apply(): ParamsResourceFoldersSourcesFindingsExternalsystemsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersSourcesFindingsExternalsystemsPatch]
  }
  
  extension [Self <: ParamsResourceFoldersSourcesFindingsExternalsystemsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudSecuritycenterV1ExternalSystem): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
