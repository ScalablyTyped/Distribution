package typings.gulpTypescript.projectMod

import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.reporterMod.Reporter
import typings.gulpTypescript.typesMod.TsConfig
import typings.node.NodeJS.ReadWriteStream
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Project extends js.Object {
  
  def apply(): ICompileStream = js.native
  def apply(reporter: Reporter): ICompileStream = js.native
  
  val config: TsConfig = js.native
  
  val configFileName: String = js.native
  
  val options: CompilerOptions = js.native
  
  val projectDirectory: String = js.native
  
  val projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  
  val rawConfig: js.Any = js.native
  
  def src(): ReadWriteStream = js.native
  
  val typescript: js.UndefOr[Typeofts] = js.native
}
