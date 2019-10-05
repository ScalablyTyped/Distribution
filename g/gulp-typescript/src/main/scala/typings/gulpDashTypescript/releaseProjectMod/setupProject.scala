package typings.gulpDashTypescript.releaseProjectMod

import typings.gulpDashTypescript.Typeofts
import typings.gulpDashTypescript.releaseTypesMod.FinalTransformers
import typings.gulpDashTypescript.releaseTypesMod.TsConfig
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/project", "setupProject")
@js.native
object setupProject extends js.Object {
  def apply(
    projectDirectory: String,
    configFileName: String,
    rawConfig: js.Any,
    config: TsConfig,
    options: CompilerOptions,
    projectReferences: js.Array[ProjectReference],
    typescript: Typeofts,
    finalTransformers: FinalTransformers
  ): Project = js.native
}

