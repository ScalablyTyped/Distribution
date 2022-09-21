package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudFunctionInfo extends StObject {
  
  /**
    * Name of a Cloud function.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location in which the Cloud function is deployed.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a Cloud function.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Latest successfully deployed version id of the Cloud function.
    */
  var versionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudFunctionInfo {
  
  inline def apply(): SchemaCloudFunctionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudFunctionInfo]
  }
  
  extension [Self <: SchemaCloudFunctionInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdNull: Self = StObject.set(x, "versionId", null)
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
