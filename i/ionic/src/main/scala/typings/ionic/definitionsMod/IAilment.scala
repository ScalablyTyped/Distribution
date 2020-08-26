package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAilment extends js.Object {
  val id: String = js.native
  var `implicit`: Boolean = js.native
  var projects: js.UndefOr[js.Array[ProjectType]] = js.native
  def detected(): js.Promise[Boolean] = js.native
  def getMessage(): js.Promise[String] = js.native
  def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]] = js.native
}

object IAilment {
  @scala.inline
  def apply(
    detected: () => js.Promise[Boolean],
    getMessage: () => js.Promise[String],
    getTreatmentSteps: () => js.Promise[js.Array[PatientTreatmentStep]],
    id: String,
    `implicit`: Boolean
  ): IAilment = {
    val __obj = js.Dynamic.literal(detected = js.Any.fromFunction0(detected), getMessage = js.Any.fromFunction0(getMessage), getTreatmentSteps = js.Any.fromFunction0(getTreatmentSteps), id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAilment]
  }
  @scala.inline
  implicit class IAilmentOps[Self <: IAilment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetected(value: () => js.Promise[Boolean]): Self = this.set("detected", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMessage(value: () => js.Promise[String]): Self = this.set("getMessage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTreatmentSteps(value: () => js.Promise[js.Array[PatientTreatmentStep]]): Self = this.set("getTreatmentSteps", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImplicit(value: Boolean): Self = this.set("implicit", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectsVarargs(value: ProjectType*): Self = this.set("projects", js.Array(value :_*))
    @scala.inline
    def setProjects(value: js.Array[ProjectType]): Self = this.set("projects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
  }
  
}

