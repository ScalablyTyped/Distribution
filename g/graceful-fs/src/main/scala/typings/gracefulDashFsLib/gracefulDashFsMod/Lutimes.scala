package typings
package gracefulDashFsLib.gracefulDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lutimes extends js.Object {
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
    /* path */ nodeLib.fsMod.PathLike, 
    /* atime */ java.lang.String | scala.Double | stdLib.Date, 
    /* mtime */ java.lang.String | scala.Double | stdLib.Date, 
    scala.Unit
  ] = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @JSName("lutimes")
  var lutimes_Original: (js.Function4[
    /* path */ nodeLib.fsMod.PathLike, 
    /* atime */ java.lang.String | scala.Double | stdLib.Date, 
    /* mtime */ java.lang.String | scala.Double | stdLib.Date, 
    /* callback */ js.UndefOr[js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]], 
    scala.Unit
  ]) with gracefulDashFsLib.Typeoflutimes = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def lutimes(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: stdLib.Date,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lutimes(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  def lutimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
}

