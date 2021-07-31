package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoctorTreatmentStep
  extends StObject
     with PatientTreatmentStep {
  
  def treat(): js.Promise[Unit]
}
object DoctorTreatmentStep {
  
  @scala.inline
  def apply(message: String, treat: () => js.Promise[Unit]): DoctorTreatmentStep = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = js.Any.fromFunction0(treat))
    __obj.asInstanceOf[DoctorTreatmentStep]
  }
  
  @scala.inline
  implicit class DoctorTreatmentStepMutableBuilder[Self <: DoctorTreatmentStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTreat(value: () => js.Promise[Unit]): Self = StObject.set(x, "treat", js.Any.fromFunction0(value))
  }
}
