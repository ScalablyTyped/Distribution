package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoctorTreatmentStep extends PatientTreatmentStep {
  def treat(): js.Promise[Unit]
}

object DoctorTreatmentStep {
  @scala.inline
  def apply(message: String, treat: () => js.Promise[Unit]): DoctorTreatmentStep = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = js.Any.fromFunction0(treat))
  
    __obj.asInstanceOf[DoctorTreatmentStep]
  }
}

