package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateClientEventRequest extends StObject {
  
  /**
    * Required. Events issued when end user interacts with customer's application that uses Cloud Talent Solution.
    */
  var clientEvent: js.UndefOr[SchemaClientEvent] = js.undefined
}
object SchemaCreateClientEventRequest {
  
  inline def apply(): SchemaCreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClientEventRequest]
  }
  
  extension [Self <: SchemaCreateClientEventRequest](x: Self) {
    
    inline def setClientEvent(value: SchemaClientEvent): Self = StObject.set(x, "clientEvent", value.asInstanceOf[js.Any])
    
    inline def setClientEventUndefined: Self = StObject.set(x, "clientEvent", js.undefined)
  }
}
