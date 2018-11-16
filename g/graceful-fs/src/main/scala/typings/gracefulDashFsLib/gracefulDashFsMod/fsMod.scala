package typings
package gracefulDashFsLib.gracefulDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "fs")
@js.native
object fsMod extends js.Object {
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
       * of the symbolic link are changed.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String | scala.Double | stdLib.Date,
    mtime: java.lang.String | scala.Double | stdLib.Date
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
       * of the symbolic link are changed.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def lutimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String | scala.Double | stdLib.Date,
    mtime: java.lang.String | scala.Double | stdLib.Date,
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
  def lutimesSync(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String | scala.Double | stdLib.Date,
    mtime: java.lang.String | scala.Double | stdLib.Date
  ): scala.Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("lutimes")
  @js.native
  object lutimesNs extends js.Object {
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: java.lang.String): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
    /**
             * Asynchronously change file timestamps of the file referenced by the supplied path.
             * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
             * of the symbolic link are changed.
             * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
             * @param atime The last access time. If a string is provided, it will be coerced to number.
             * @param mtime The last modified time. If a string is provided, it will be coerced to number.
             */
    def `__promisify__`(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  }
  
}

