package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudFunctionsV2Stage extends StObject {
  
  /** Message describing the Stage */
  var message: js.UndefOr[String] = js.undefined
  
  /** Name of the Stage. This will be unique for each Stage. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Resource of the Stage */
  var resource: js.UndefOr[String] = js.undefined
  
  /** Link to the current Stage resource */
  var resourceUri: js.UndefOr[String] = js.undefined
  
  /** Current state of the Stage */
  var state: js.UndefOr[String] = js.undefined
  
  /** State messages from the current Stage. */
  var stateMessages: js.UndefOr[js.Array[GoogleCloudFunctionsV2StateMessage]] = js.undefined
}
object GoogleCloudFunctionsV2Stage {
  
  inline def apply(): GoogleCloudFunctionsV2Stage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudFunctionsV2Stage]
  }
  
  extension [Self <: GoogleCloudFunctionsV2Stage](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessages(value: js.Array[GoogleCloudFunctionsV2StateMessage]): Self = StObject.set(x, "stateMessages", value.asInstanceOf[js.Any])
    
    inline def setStateMessagesUndefined: Self = StObject.set(x, "stateMessages", js.undefined)
    
    inline def setStateMessagesVarargs(value: GoogleCloudFunctionsV2StateMessage*): Self = StObject.set(x, "stateMessages", js.Array(value*))
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
