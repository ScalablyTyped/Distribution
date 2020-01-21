package typings.gulpTypescript.projectMod

import typings.gulpTypescript.Typeofts
import typings.gulpTypescript.typesMod.FinalTransformers
import typings.gulpTypescript.typesMod.TsConfig
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ProjectReference
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

