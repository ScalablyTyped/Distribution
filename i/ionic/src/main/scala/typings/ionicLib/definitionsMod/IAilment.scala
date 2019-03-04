package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAilment extends js.Object {
  val id: java.lang.String
  var `implicit`: scala.Boolean
  var projects: js.UndefOr[js.Array[ProjectType]] = js.undefined
  def detected(): js.Promise[scala.Boolean]
  def getMessage(): js.Promise[java.lang.String]
  def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]]
}

object IAilment {
  @scala.inline
  def apply(
    detected: js.Function0[js.Promise[scala.Boolean]],
    getMessage: js.Function0[js.Promise[java.lang.String]],
    getTreatmentSteps: js.Function0[js.Promise[js.Array[PatientTreatmentStep]]],
    id: java.lang.String,
    `implicit`: scala.Boolean,
    projects: js.Array[ProjectType] = null
  ): IAilment = {
    val __obj = js.Dynamic.literal(detected = detected, getMessage = getMessage, getTreatmentSteps = getTreatmentSteps, id = id)
    __obj.updateDynamic("implicit")(`implicit`)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[IAilment]
  }
}

