package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudFunctionsV2betaStateMessage extends StObject {
  
  /**
    * The message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Severity of the state message.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One-word CamelCase type of the state message.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudFunctionsV2betaStateMessage {
  
  inline def apply(): SchemaGoogleCloudFunctionsV2betaStateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudFunctionsV2betaStateMessage]
  }
  
  extension [Self <: SchemaGoogleCloudFunctionsV2betaStateMessage](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
