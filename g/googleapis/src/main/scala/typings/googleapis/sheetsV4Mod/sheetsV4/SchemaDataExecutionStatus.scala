package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataExecutionStatus extends StObject {
  
  /**
    * The error code.
    */
  var errorCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The error message, which may be empty.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Gets the time the data last successfully refreshed.
    */
  var lastRefreshTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the data execution.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataExecutionStatus {
  
  inline def apply(): SchemaDataExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataExecutionStatus]
  }
  
  extension [Self <: SchemaDataExecutionStatus](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeNull: Self = StObject.set(x, "lastRefreshTime", null)
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
