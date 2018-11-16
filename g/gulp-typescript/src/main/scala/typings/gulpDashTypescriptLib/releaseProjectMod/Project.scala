package typings
package gulpDashTypescriptLib.releaseProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  val config: gulpDashTypescriptLib.releaseTypesMod.TsConfig = js.native
  val configFileName: java.lang.String = js.native
  val options: typescriptLib.typescriptMod.tsNs.CompilerOptions = js.native
  val projectDirectory: java.lang.String = js.native
  val projectReferences: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]] = js.native
  val rawConfig: js.Any = js.native
  val typescript: js.UndefOr[js.Any] = js.native
  def apply(): ICompileStream = js.native
  def apply(reporter: gulpDashTypescriptLib.releaseReporterMod.Reporter): ICompileStream = js.native
  def src(`this`: Project): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

