package typings.ionic.ionicAngularAilmentsMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicAngularMod.IonicAngularProject
import typings.ionic.libDoctorMod.Ailment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularAilment")
@js.native
abstract class IonicAngularAilment protected () extends Ailment {
  def this(deps: IonicAngularAilmentDeps) = this()
  
  @JSName("project")
  val project_IonicAngularAilment: IonicAngularProject = js.native
  
  @JSName("projects")
  val projects_IonicAngularAilment: js.Array[ProjectType] = js.native
}
