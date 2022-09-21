package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryRequestInput extends StObject {
  
  /**
    * Payload containing third-party device IDs.
    */
  var payload: js.UndefOr[SchemaQueryRequestPayload] = js.undefined
}
object SchemaQueryRequestInput {
  
  inline def apply(): SchemaQueryRequestInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryRequestInput]
  }
  
  extension [Self <: SchemaQueryRequestInput](x: Self) {
    
    inline def setPayload(value: SchemaQueryRequestPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
