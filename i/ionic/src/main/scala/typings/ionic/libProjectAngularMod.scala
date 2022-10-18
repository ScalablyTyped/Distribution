package typings.ionic

import typings.ionic.ionicStrings.angular
import typings.ionic.libProjectMod.Project
import typings.ionic.libProjectMod.ProjectDeps
import typings.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectAngularMod {
  
  @JSImport("ionic/lib/project/angular", "AngularProject")
  @js.native
  open class AngularProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_AngularProject: angular = js.native
  }
}
