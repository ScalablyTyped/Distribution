package typings.ionic

import typings.ionic.ionicStrings.bare
import typings.ionic.libProjectMod.Project
import typings.ionic.libProjectMod.ProjectDeps
import typings.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bareMod {
  
  @JSImport("ionic/lib/project/bare", "BareProject")
  @js.native
  class BareProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_BareProject: bare = js.native
  }
}
