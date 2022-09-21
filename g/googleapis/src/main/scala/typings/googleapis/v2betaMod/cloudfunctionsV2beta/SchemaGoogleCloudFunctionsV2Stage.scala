package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudFunctionsV2Stage extends StObject {
  
  /**
    * Message describing the Stage
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the Stage. This will be unique for each Stage.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource of the Stage
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to the current Stage resource
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current state of the Stage
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State messages from the current Stage.
    */
  var stateMessages: js.UndefOr[js.Array[SchemaGoogleCloudFunctionsV2StateMessage]] = js.undefined
}
object SchemaGoogleCloudFunctionsV2Stage {
  
  inline def apply(): SchemaGoogleCloudFunctionsV2Stage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudFunctionsV2Stage]
  }
  
  extension [Self <: SchemaGoogleCloudFunctionsV2Stage](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessages(value: js.Array[SchemaGoogleCloudFunctionsV2StateMessage]): Self = StObject.set(x, "stateMessages", value.asInstanceOf[js.Any])
    
    inline def setStateMessagesUndefined: Self = StObject.set(x, "stateMessages", js.undefined)
    
    inline def setStateMessagesVarargs(value: SchemaGoogleCloudFunctionsV2StateMessage*): Self = StObject.set(x, "stateMessages", js.Array(value*))
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
