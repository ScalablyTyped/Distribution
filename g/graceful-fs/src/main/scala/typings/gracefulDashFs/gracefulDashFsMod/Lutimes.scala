package typings.gracefulDashFs.gracefulDashFsMod

import typings.gracefulDashFs.Typeoflutimes
import typings.node.fsMod.PathLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lutimes extends js.Object {
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  var lutimes: Typeoflutimes = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @JSName("lutimesSync")
  var lutimesSync_Original: js.Function3[
    /* path */ PathLike, 
    /* atime */ String | Double | Date, 
    /* mtime */ String | Double | Date, 
    Unit
  ] = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def lutimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
}

