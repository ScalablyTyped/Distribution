package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAilment extends js.Object {
  val id: String
  var `implicit`: Boolean
  var projects: js.UndefOr[js.Array[ProjectType]] = js.undefined
  def detected(): js.Promise[Boolean]
  def getMessage(): js.Promise[String]
  def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]]
}

object IAilment {
  @scala.inline
  def apply(
    detected: () => js.Promise[Boolean],
    getMessage: () => js.Promise[String],
    getTreatmentSteps: () => js.Promise[js.Array[PatientTreatmentStep]],
    id: String,
    `implicit`: Boolean,
    projects: js.Array[ProjectType] = null
  ): IAilment = {
    val __obj = js.Dynamic.literal(detected = js.Any.fromFunction0(detected), getMessage = js.Any.fromFunction0(getMessage), getTreatmentSteps = js.Any.fromFunction0(getTreatmentSteps), id = id)
    __obj.updateDynamic("implicit")(`implicit`)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[IAilment]
  }
}

