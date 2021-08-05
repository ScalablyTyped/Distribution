package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreatableAilment
  extends StObject
     with IAilment {
  
  val treatable: Boolean
}
object TreatableAilment {
  
  inline def apply(
    detected: () => js.Promise[Boolean],
    getMessage: () => js.Promise[String],
    getTreatmentSteps: () => js.Promise[js.Array[PatientTreatmentStep]],
    id: String,
    `implicit`: Boolean,
    treatable: Boolean
  ): TreatableAilment = {
    val __obj = js.Dynamic.literal(detected = js.Any.fromFunction0(detected), getMessage = js.Any.fromFunction0(getMessage), getTreatmentSteps = js.Any.fromFunction0(getTreatmentSteps), id = id.asInstanceOf[js.Any], treatable = treatable.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatableAilment]
  }
  
  extension [Self <: TreatableAilment](x: Self) {
    
    inline def setTreatable(value: Boolean): Self = StObject.set(x, "treatable", value.asInstanceOf[js.Any])
  }
}
