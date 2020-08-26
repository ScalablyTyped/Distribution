package typings.makeDir.anon

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftruncate extends js.Object {
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, len: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, len: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, len: Null, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, len: Double): js.Promise[Unit] = js.native
}

