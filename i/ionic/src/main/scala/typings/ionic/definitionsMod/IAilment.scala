package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAilment extends StObject {
  
  def detected(): js.Promise[Boolean] = js.native
  
  def getMessage(): js.Promise[String] = js.native
  
  def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]] = js.native
  
  val id: String = js.native
  
  var `implicit`: Boolean = js.native
  
  var projects: js.UndefOr[js.Array[ProjectType]] = js.native
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
  implicit class IAilmentMutableBuilder[Self <: IAilment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "detected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTreatmentSteps(value: () => js.Promise[js.Array[PatientTreatmentStep]]): Self = StObject.set(x, "getTreatmentSteps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjects(value: js.Array[ProjectType]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: ProjectType*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
