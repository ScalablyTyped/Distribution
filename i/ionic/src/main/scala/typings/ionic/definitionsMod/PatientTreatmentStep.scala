package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientTreatmentStep extends StObject {
  
  var message: String
}
object PatientTreatmentStep {
  
  inline def apply(message: String): PatientTreatmentStep = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientTreatmentStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatientTreatmentStep] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
