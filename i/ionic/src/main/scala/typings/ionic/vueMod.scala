package typings.ionic

import typings.ionic.ionicStrings.vue
import typings.ionic.libProjectMod.Project
import typings.ionic.libProjectMod.ProjectDeps
import typings.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  @JSImport("ionic/lib/project/vue", "VueProject")
  @js.native
  class VueProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_VueProject: vue = js.native
  }
}
