package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreatableAilment extends IAilment {
  val treatable: Boolean
}

object TreatableAilment {
  @scala.inline
  def apply(
    detected: () => js.Promise[Boolean],
    getMessage: () => js.Promise[String],
    getTreatmentSteps: () => js.Promise[js.Array[DoctorTreatmentStep]],
    id: String,
    `implicit`: Boolean,
    treatable: Boolean,
    projects: js.Array[ProjectType] = null
  ): TreatableAilment = {
    val __obj = js.Dynamic.literal(detected = js.Any.fromFunction0(detected), getMessage = js.Any.fromFunction0(getMessage), getTreatmentSteps = js.Any.fromFunction0(getTreatmentSteps), id = id, treatable = treatable)
    __obj.updateDynamic("implicit")(`implicit`)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[TreatableAilment]
  }
}

