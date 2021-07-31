package typings.ionic

import typings.ionic.ionicStrings.custom
import typings.ionic.libProjectMod.Project
import typings.ionic.libProjectMod.ProjectDeps
import typings.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customMod {
  
  @JSImport("ionic/lib/project/custom", "CustomProject")
  @js.native
  class CustomProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_CustomProject: custom = js.native
  }
}
