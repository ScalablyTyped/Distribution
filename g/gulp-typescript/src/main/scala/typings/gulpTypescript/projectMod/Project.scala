package typings.gulpTypescript.projectMod

import typings.gulpTypescript.Typeofts
import typings.gulpTypescript.reporterMod.Reporter
import typings.gulpTypescript.typesMod.TsConfig
import typings.node.NodeJS.ReadWriteStream
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ProjectReference
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
  def src(): ReadWriteStream = js.native
}

