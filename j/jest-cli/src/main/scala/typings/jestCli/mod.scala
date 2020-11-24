package typings.jestCli

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cli", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def run(): js.Promise[Unit] = js.native
  def run(maybeArgv: js.UndefOr[scala.Nothing], project: Path): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String]): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String], project: Path): js.Promise[Unit] = js.native
}
