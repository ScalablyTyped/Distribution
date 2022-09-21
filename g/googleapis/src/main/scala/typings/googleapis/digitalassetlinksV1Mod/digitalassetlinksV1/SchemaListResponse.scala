package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListResponse extends StObject {
  
  /**
    * Human-readable message containing information intended to help end users understand, reproduce and debug the result. The message will be in English and we are currently not planning to offer any translations. Please note that no guarantees are made about the contents or format of this string. Any aspect of it may be subject to change without notice. You should not attempt to programmatically parse this data. For programmatic access, use the error_code field below.
    */
  var debugString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Error codes that describe the result of the List operation.
    */
  var errorCode: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * From serving time, how much longer the response should be considered valid barring further updates. REQUIRED
    */
  var maxAge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of all the matching statements that have been found.
    */
  var statements: js.UndefOr[js.Array[SchemaStatement]] = js.undefined
}
object SchemaListResponse {
  
  inline def apply(): SchemaListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListResponse]
  }
  
  extension [Self <: SchemaListResponse](x: Self) {
    
    inline def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
    
    inline def setDebugStringNull: Self = StObject.set(x, "debugString", null)
    
    inline def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
    
    inline def setErrorCode(value: js.Array[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorCodeVarargs(value: String*): Self = StObject.set(x, "errorCode", js.Array(value*))
    
    inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeNull: Self = StObject.set(x, "maxAge", null)
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setStatements(value: js.Array[SchemaStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: SchemaStatement*): Self = StObject.set(x, "statements", js.Array(value*))
  }
}
