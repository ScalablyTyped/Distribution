package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BufferOptions extends js.Object {
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[java.lang.String] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncoding): js.Promise[nodeLib.Buffer] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingNull): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(path: nodeLib.fsMod.PathLike, options: makeDashDirLib.makeDashDirLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
}

