package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "exists")
@js.native
object exists extends js.Object {
  
  def apply(path: PathLike): typings.bluebird.mod.^[Boolean] = js.native
  def apply(path: PathLike, callback: js.Function1[/* exist */ Boolean, Unit]): typings.bluebird.mod.^[Boolean] = js.native
}
