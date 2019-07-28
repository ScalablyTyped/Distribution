package typings.gulpDashTypescript.releaseProjectMod

import typings.gulpDashTypescript.Typeofts
import typings.gulpDashTypescript.releaseReporterMod.Reporter
import typings.gulpDashTypescript.releaseTypesMod.TsConfig
import typings.node.NodeJSNs.ReadWriteStream
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  val config: TsConfig = js.native
  val configFileName: String = js.native
  val options: CompilerOptions = js.native
  val projectDirectory: String = js.native
  val projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  val rawConfig: js.Any = js.native
  val typescript: js.UndefOr[Typeofts] = js.native
  def apply(): ICompileStream = js.native
  def apply(reporter: Reporter): ICompileStream = js.native
  def src(`this`: Project): ReadWriteStream = js.native
}

