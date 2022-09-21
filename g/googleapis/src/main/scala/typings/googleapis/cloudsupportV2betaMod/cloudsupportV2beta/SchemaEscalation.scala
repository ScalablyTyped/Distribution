package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEscalation extends StObject {
  
  /**
    * Required. A free text description to accompany the `reason` field above. Provides additional context on why the case is being escalated.
    */
  var justification: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The reason why the Case is being escalated.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaEscalation {
  
  inline def apply(): SchemaEscalation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEscalation]
  }
  
  extension [Self <: SchemaEscalation](x: Self) {
    
    inline def setJustification(value: String): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationNull: Self = StObject.set(x, "justification", null)
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
