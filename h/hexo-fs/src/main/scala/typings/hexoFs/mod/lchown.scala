package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "lchown")
@js.native
object lchown extends js.Object {
  
  def apply(path: PathLike, uid: Double, gid: Double): typings.bluebird.mod.^[Unit] = js.native
}
