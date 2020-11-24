package typings.ionic

import typings.ionic.angularMod.AngularProject
import typings.ionic.definitionsMod.AngularServeOptions
import typings.ionic.libServeMod.ServeCLI
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/angular/serve", JSImport.Namespace)
@js.native
object angularServeMod extends js.Object {
  
  @js.native
  class AngularServeCLI () extends ServeCLI[AngularServeOptions] {
    
    /* protected */ def buildArchitectCommand(options: AngularServeOptions): js.Array[String] = js.native
    
    var chunks: Double = js.native
    
    @JSName("script")
    val script_AngularServeCLI: /* "ionic:serve" */ String = js.native
    
    /* protected */ def serveOptionsToNgArgs(options: AngularServeOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  class AngularServeRunner protected () extends ServeRunner[AngularServeOptions] {
    def this(e: AngularServeRunnerDeps) = this()
    
    @JSName("e")
    val e_AngularServeRunner: AngularServeRunnerDeps = js.native
    
    def platformToMode(platform: String): String = js.native
  }
  
  @js.native
  trait AngularServeRunnerDeps extends ServeRunnerDeps {
    
    @JSName("project")
    val project_AngularServeRunnerDeps: AngularProject = js.native
  }
}
