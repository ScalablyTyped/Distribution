package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEscalateCaseRequest extends StObject {
  
  /**
    * The escalation object to be sent with the escalation request.
    */
  var escalation: js.UndefOr[SchemaEscalation] = js.undefined
}
object SchemaEscalateCaseRequest {
  
  inline def apply(): SchemaEscalateCaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEscalateCaseRequest]
  }
  
  extension [Self <: SchemaEscalateCaseRequest](x: Self) {
    
    inline def setEscalation(value: SchemaEscalation): Self = StObject.set(x, "escalation", value.asInstanceOf[js.Any])
    
    inline def setEscalationUndefined: Self = StObject.set(x, "escalation", js.undefined)
  }
}
