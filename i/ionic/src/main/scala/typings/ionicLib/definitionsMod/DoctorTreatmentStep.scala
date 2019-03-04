package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoctorTreatmentStep extends PatientTreatmentStep {
  def treat(): js.Promise[scala.Unit]
}

object DoctorTreatmentStep {
  @scala.inline
  def apply(message: java.lang.String, treat: js.Function0[js.Promise[scala.Unit]]): DoctorTreatmentStep = {
    val __obj = js.Dynamic.literal(message = message, treat = treat)
  
    __obj.asInstanceOf[DoctorTreatmentStep]
  }
}

