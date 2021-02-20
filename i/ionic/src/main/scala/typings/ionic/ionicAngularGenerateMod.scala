package typings.ionic

import typings.ionic.definitionsMod.IonicAngularGenerateOptions
import typings.ionic.ionicAngularMod.IonicAngularProject
import typings.ionic.libGenerateMod.GenerateRunner
import typings.ionic.libGenerateMod.GenerateRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicAngularGenerateMod {
  
  @JSImport("ionic/lib/project/ionic-angular/generate", "IonicAngularGenerateRunner")
  @js.native
  class IonicAngularGenerateRunner protected () extends GenerateRunner[IonicAngularGenerateOptions] {
    def this(e: IonicAngularGenerateRunnerDeps) = this()
    
    @JSName("e")
    val e_IonicAngularGenerateRunner: IonicAngularGenerateRunnerDeps = js.native
    
    def getModules(context: js.Any, kind: String): js.Promise[_] = js.native
    
    def tabsPrompt(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait IonicAngularGenerateRunnerDeps extends GenerateRunnerDeps {
    
    @JSName("project")
    val project_IonicAngularGenerateRunnerDeps: IonicAngularProject = js.native
  }
}
