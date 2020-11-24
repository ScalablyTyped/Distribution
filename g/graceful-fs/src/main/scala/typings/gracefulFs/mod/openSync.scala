package typings.gracefulFs.mod

import typings.node.fsMod.Mode
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graceful-fs", "openSync")
@js.native
object openSync extends js.Object {
  
  def apply(path: PathLike, flags: OpenMode): Double = js.native
  def apply(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
}
