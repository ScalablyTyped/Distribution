package typings.ionic

import typings.ionic.ionicStrings.`ionic-angular`
import typings.ionic.libProjectMod.Project
import typings.ionic.libProjectMod.ProjectDeps
import typings.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicAngularMod {
  
  @JSImport("ionic/lib/project/ionic-angular", "IonicAngularProject")
  @js.native
  class IonicAngularProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_IonicAngularProject: `ionic-angular` = js.native
  }
}
