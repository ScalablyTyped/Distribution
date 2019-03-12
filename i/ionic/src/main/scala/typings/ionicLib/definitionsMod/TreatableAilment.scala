package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreatableAilment extends IAilment {
  val treatable: scala.Boolean
}

object TreatableAilment {
  @scala.inline
  def apply(
    detected: () => js.Promise[scala.Boolean],
    getMessage: () => js.Promise[java.lang.String],
    getTreatmentSteps: () => js.Promise[js.Array[DoctorTreatmentStep]],
    id: java.lang.String,
    `implicit`: scala.Boolean,
    treatable: scala.Boolean,
    projects: js.Array[ProjectType] = null
  ): TreatableAilment = {
    val __obj = js.Dynamic.literal(detected = js.Any.fromFunction0(detected), getMessage = js.Any.fromFunction0(getMessage), getTreatmentSteps = js.Any.fromFunction0(getTreatmentSteps), id = id, treatable = treatable)
    __obj.updateDynamic("implicit")(`implicit`)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[TreatableAilment]
  }
}

