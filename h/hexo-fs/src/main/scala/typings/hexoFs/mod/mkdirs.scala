package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "mkdirs")
@js.native
object mkdirs extends js.Object {
  
  def apply(path: PathLike): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.mod.^[Unit] = js.native
}
