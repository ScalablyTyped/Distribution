package typings.gracefulFs.mod

import typings.node.AnonEncodingFlag
import typings.node.AnonFlag
import typings.node.AnonFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(path: Double): String | Buffer = js.native
  def apply(path: Double, options: String): String = js.native
  def apply(path: Double, options: AnonEncodingFlag): String = js.native
  def apply(path: Double, options: AnonFlag): Buffer = js.native
  def apply(path: Double, options: AnonFlagString): String | Buffer = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: String): String = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: PathLike, options: AnonEncodingFlag): String = js.native
  def apply(path: PathLike, options: AnonFlag): Buffer = js.native
  def apply(path: PathLike, options: AnonFlagString): String | Buffer = js.native
}

