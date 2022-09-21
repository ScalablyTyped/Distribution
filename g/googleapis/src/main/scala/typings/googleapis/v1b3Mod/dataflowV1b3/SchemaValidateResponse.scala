package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateResponse extends StObject {
  
  /**
    * Will be empty if validation succeeds.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the validated query. Not defined if validation fails.
    */
  var queryInfo: js.UndefOr[SchemaQueryInfo] = js.undefined
}
object SchemaValidateResponse {
  
  inline def apply(): SchemaValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateResponse]
  }
  
  extension [Self <: SchemaValidateResponse](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setQueryInfo(value: SchemaQueryInfo): Self = StObject.set(x, "queryInfo", value.asInstanceOf[js.Any])
    
    inline def setQueryInfoUndefined: Self = StObject.set(x, "queryInfo", js.undefined)
  }
}
