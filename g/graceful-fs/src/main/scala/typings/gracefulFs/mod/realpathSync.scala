package typings.gracefulFs.mod

import typings.gracefulFs.gracefulFsStrings.buffer
import typings.node.Anon2
import typings.node.Anon3
import typings.node.AnonEncoding
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "realpathSync")
@js.native
object realpathSync extends js.Object {
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): String = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def apply(path: PathLike, options: buffer): Buffer = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: Anon2): Buffer = js.native
  def apply(path: PathLike, options: Anon3): String | Buffer = js.native
  def apply(path: PathLike, options: AnonEncoding): String = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
  def native(path: PathLike): String = js.native
  def native(path: PathLike, options: String): String | Buffer = js.native
  def native(path: PathLike, options: Anon2): Buffer = js.native
  def native(path: PathLike, options: Anon3): String | Buffer = js.native
  def native(path: PathLike, options: AnonEncoding): String = js.native
  def native(path: PathLike, options: BufferEncoding): String = js.native
  @JSName("native")
  def native_Union(path: PathLike): String | Buffer = js.native
  @JSName("native")
  def native_buffer(path: PathLike, options: buffer): Buffer = js.native
}

