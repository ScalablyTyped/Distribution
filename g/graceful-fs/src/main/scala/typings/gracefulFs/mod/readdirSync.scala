package typings.gracefulFs.mod

import typings.node.Anon4
import typings.node.Anon5
import typings.node.AnonEncodingWithFileTypes
import typings.node.AnonWithFileTypes
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readdirSync")
@js.native
object readdirSync extends js.Object {
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): js.Array[String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def apply(path: PathLike, options: Anon5): js.Array[typings.node.fsMod.Dirent] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: AnonWithFileTypes): js.Array[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

