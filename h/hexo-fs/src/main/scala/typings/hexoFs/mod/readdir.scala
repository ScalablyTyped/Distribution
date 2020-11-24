package typings.hexoFs.mod

import typings.hexoFs.anon.Encoding
import typings.hexoFs.anon.`0`
import typings.hexoFs.anon.`1`
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "readdir")
@js.native
object readdir extends js.Object {
  
  def apply(path: PathLike): typings.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): typings.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: Encoding): typings.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: `0`): typings.bluebird.mod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: `1`): typings.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typings.bluebird.mod.^[js.Array[String]] = js.native
}
