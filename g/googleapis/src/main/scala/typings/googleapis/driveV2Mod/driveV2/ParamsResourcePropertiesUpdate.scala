package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the property.
    */
  var propertyKey: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProperty] = js.undefined
  
  /**
    * The visibility of the property. Allowed values are PRIVATE and PUBLIC. (Default: PRIVATE)
    */
  var visibility: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesUpdate {
  
  inline def apply(): ParamsResourcePropertiesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesUpdate]
  }
  
  extension [Self <: ParamsResourcePropertiesUpdate](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setPropertyKey(value: String): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
    
    inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
    
    inline def setRequestBody(value: SchemaProperty): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
