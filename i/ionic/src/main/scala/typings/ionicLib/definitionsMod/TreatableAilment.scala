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
    detected: js.Function0[js.Promise[scala.Boolean]],
    getMessage: js.Function0[js.Promise[java.lang.String]],
    getTreatmentSteps: js.Function0[js.Promise[js.Array[DoctorTreatmentStep]]],
    id: java.lang.String,
    `implicit`: scala.Boolean,
    treatable: scala.Boolean,
    projects: js.Array[ProjectType] = null
  ): TreatableAilment = {
    val __obj = js.Dynamic.literal(`implicit` = `implicit`)
    __obj.updateDynamic("detected")(detected)
    __obj.updateDynamic("getMessage")(getMessage)
    __obj.updateDynamic("getTreatmentSteps")(getTreatmentSteps)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("treatable")(treatable)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[TreatableAilment]
  }
}

