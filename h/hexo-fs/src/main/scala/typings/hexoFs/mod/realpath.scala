package typings.hexoFs.mod

import typings.hexoFs.AnonBufferEncoding
import typings.hexoFs.AnonEncodingBufferEncoding
import typings.hexoFs.AnonEncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: PathLike): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: String): typings.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: AnonBufferEncoding): typings.bluebird.mod.^[Buffer] = js.native
  def apply(path: PathLike, options: AnonEncodingBufferEncoding): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: AnonEncodingNull): typings.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncoding): typings.bluebird.mod.^[String] = js.native
}

