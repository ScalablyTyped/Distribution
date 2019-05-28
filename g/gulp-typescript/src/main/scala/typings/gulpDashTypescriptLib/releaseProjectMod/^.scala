package typings
package gulpDashTypescriptLib.releaseProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/project", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def setupProject(
    projectDirectory: java.lang.String,
    configFileName: java.lang.String,
    rawConfig: js.Any,
    config: gulpDashTypescriptLib.releaseTypesMod.TsConfig,
    options: typescriptLib.typescriptMod.CompilerOptions,
    projectReferences: js.Array[typescriptLib.typescriptMod.ProjectReference],
    typescript: gulpDashTypescriptLib.Typeofts,
    finalTransformers: gulpDashTypescriptLib.releaseTypesMod.FinalTransformers
  ): Project = js.native
}

