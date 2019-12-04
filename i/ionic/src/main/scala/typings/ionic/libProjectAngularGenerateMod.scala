package typings.ionic

import typings.ionic.definitionsMod.AngularGenerateOptions
import typings.ionic.libGenerateMod.GenerateRunner
import typings.ionic.libGenerateMod.GenerateRunnerDeps
import typings.ionic.libProjectAngularGenerateMod.AngularGenerateRunnerDeps
import typings.ionic.libProjectAngularMod.AngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/angular/generate", JSImport.Namespace)
@js.native
object libProjectAngularGenerateMod extends js.Object {
  @js.native
  class AngularGenerateRunner protected () extends GenerateRunner[AngularGenerateOptions] {
    def this(e: AngularGenerateRunnerDeps) = this()
    @JSName("e")
    val e_AngularGenerateRunner: AngularGenerateRunnerDeps = js.native
    var generateComponent: js.Any = js.native
    var validateFeatureType: js.Any = js.native
  }
  
  @js.native
  trait AngularGenerateRunnerDeps extends GenerateRunnerDeps {
    @JSName("project")
    val project_AngularGenerateRunnerDeps: AngularProject = js.native
  }
  
}

