package typings.ionicUtilsFs.mod

import typings.node.anon.AutoClose
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  
  def apply(path: PathLike): typings.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: String): typings.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: AutoClose): typings.node.fsMod.ReadStream = js.native
}
