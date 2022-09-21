package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBufferQueueRequest extends StObject {
  
  /**
    * Body of the HTTP request. The body can take any generic value. The value will be written to the HttpRequest of the [Task].
    */
  var body: js.UndefOr[SchemaHttpBody] = js.undefined
}
object SchemaBufferQueueRequest {
  
  inline def apply(): SchemaBufferQueueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBufferQueueRequest]
  }
  
  extension [Self <: SchemaBufferQueueRequest](x: Self) {
    
    inline def setBody(value: SchemaHttpBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
