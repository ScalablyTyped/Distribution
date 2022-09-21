package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementSyncError extends StObject {
  
  /**
    * An ACM defined error code
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the error
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of config(s) associated with the error, if any
    */
  var errorResources: js.UndefOr[js.Array[SchemaConfigManagementErrorResource]] = js.undefined
}
object SchemaConfigManagementSyncError {
  
  inline def apply(): SchemaConfigManagementSyncError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementSyncError]
  }
  
  extension [Self <: SchemaConfigManagementSyncError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorResources(value: js.Array[SchemaConfigManagementErrorResource]): Self = StObject.set(x, "errorResources", value.asInstanceOf[js.Any])
    
    inline def setErrorResourcesUndefined: Self = StObject.set(x, "errorResources", js.undefined)
    
    inline def setErrorResourcesVarargs(value: SchemaConfigManagementErrorResource*): Self = StObject.set(x, "errorResources", js.Array(value*))
  }
}
