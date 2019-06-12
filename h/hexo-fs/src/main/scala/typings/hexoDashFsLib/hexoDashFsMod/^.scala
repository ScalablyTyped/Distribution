package typings
package hexoDashFsLib.hexoDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var F_OK: js.UndefOr[scala.Double] = js.native
  var R_OK: js.UndefOr[scala.Double] = js.native
  var W_OK: js.UndefOr[scala.Double] = js.native
  var X_OK: js.UndefOr[scala.Double] = js.native
  var access: js.UndefOr[
    js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* mode */ js.UndefOr[scala.Double], 
      bluebirdLib.bluebirdMod.^[scala.Unit]
    ]
  ] = js.native
  var accessSync: js.UndefOr[
    js.Function2[/* path */ nodeLib.fsMod.PathLike, /* mode */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.native
  def appendFile(path: java.lang.String, data: js.Any): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def appendFile(path: java.lang.String, data: js.Any, callback: js.Function1[/* err */ js.Any, scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def appendFile(path: java.lang.String, data: js.Any, options: AppendFileOptions): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def appendFile(
    path: java.lang.String,
    data: js.Any,
    options: AppendFileOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def appendFile(path: java.lang.String, data: js.Any, options: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def appendFile(
    path: java.lang.String,
    data: js.Any,
    options: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def appendFileSync(path: java.lang.String, data: js.Any): scala.Unit = js.native
  def appendFileSync(path: java.lang.String, data: js.Any, options: AppendFileOptions): scala.Unit = js.native
  def appendFileSync(path: java.lang.String, data: js.Any, options: java.lang.String): scala.Unit = js.native
  def chmod(path: nodeLib.fsMod.PathLike, mode: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def chmod(path: nodeLib.fsMod.PathLike, mode: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def chmodSync(path: nodeLib.fsMod.PathLike, mode: java.lang.String): scala.Unit = js.native
  def chmodSync(path: nodeLib.fsMod.PathLike, mode: scala.Double): scala.Unit = js.native
  def chown(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def chownSync(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def close(fd: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def closeSync(fd: scala.Double): scala.Unit = js.native
  def copyDir(src: java.lang.String, dest: java.lang.String): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def copyDir(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def copyDir(src: java.lang.String, dest: java.lang.String, options: DirectoryOptions): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def copyDir(
    src: java.lang.String,
    dest: java.lang.String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def copyFile(src: nodeLib.fsMod.PathLike, dest: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def copyFile(
    src: nodeLib.fsMod.PathLike,
    dest: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createReadStream(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.ReadStream = js.native
  def createReadStream(path: nodeLib.fsMod.PathLike, options: java.lang.String): nodeLib.fsMod.ReadStream = js.native
  def createReadStream(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_AutoClose): nodeLib.fsMod.ReadStream = js.native
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createWriteStream(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(path: nodeLib.fsMod.PathLike, options: java.lang.String): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_AutoCloseEncoding): nodeLib.fsMod.WriteStream = js.native
  def emptyDir(path: java.lang.String): bluebirdLib.bluebirdMod.^[java.lang.String | js.Array[java.lang.String]] = js.native
  def emptyDir(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[java.lang.String | js.Array[java.lang.String]] = js.native
  def emptyDir(path: java.lang.String, options: DirectoryOptions with hexoDashFsLib.Anon_Exclude): bluebirdLib.bluebirdMod.^[java.lang.String | js.Array[java.lang.String]] = js.native
  def emptyDir(
    path: java.lang.String,
    options: DirectoryOptions with hexoDashFsLib.Anon_Exclude,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[java.lang.String | js.Array[java.lang.String]] = js.native
  def emptyDirSync(path: java.lang.String): java.lang.String | js.Array[java.lang.String] = js.native
  def emptyDirSync(path: java.lang.String, options: DirectoryOptions with hexoDashFsLib.Anon_Exclude): java.lang.String | js.Array[java.lang.String] = js.native
  def emptyDirSync(
    path: java.lang.String,
    options: DirectoryOptions with hexoDashFsLib.Anon_Exclude,
    parent: java.lang.String
  ): java.lang.String | js.Array[java.lang.String] = js.native
  def ensurePath(path: java.lang.String): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def ensurePath(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def ensurePathSync(path: java.lang.String): java.lang.String = js.native
  def ensureWriteStream(path: java.lang.String): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[gracefulDashFsLib.gracefulDashFsMod.WriteStream], 
      scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(path: java.lang.String, options: hexoDashFsLib.Anon_AutoClose): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(
    path: java.lang.String,
    options: hexoDashFsLib.Anon_AutoClose,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[gracefulDashFsLib.gracefulDashFsMod.WriteStream], 
      scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(path: java.lang.String, options: java.lang.String): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(
    path: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[gracefulDashFsLib.gracefulDashFsMod.WriteStream], 
      scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStreamSync(path: java.lang.String): gracefulDashFsLib.gracefulDashFsMod.WriteStream = js.native
  def ensureWriteStreamSync(path: java.lang.String, options: hexoDashFsLib.Anon_AutoClose): gracefulDashFsLib.gracefulDashFsMod.WriteStream = js.native
  def ensureWriteStreamSync(path: java.lang.String, options: java.lang.String): gracefulDashFsLib.gracefulDashFsMod.WriteStream = js.native
  def escapeBOM(str: java.lang.String): java.lang.String = js.native
  def escapeEOL(str: java.lang.String): java.lang.String = js.native
  def exists(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  def exists(path: nodeLib.fsMod.PathLike, callback: js.Function1[/* exist */ scala.Boolean, scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  def existsSync(path: nodeLib.fsMod.PathLike): scala.Boolean = js.native
  def fchmod(fd: scala.Double, mode: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def fchmod(fd: scala.Double, mode: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def fchmodSync(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  def fchmodSync(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def fstat(fd: scala.Double): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.Stats] = js.native
  /**
    * Synchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def fstatSync(fd: scala.Double): nodeLib.fsMod.Stats = js.native
  def fsync(fd: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def fsyncSync(fd: scala.Double): scala.Unit = js.native
  def ftruncate(fd: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def ftruncate(fd: scala.Double, len: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def ftruncateSync(fd: scala.Double): scala.Unit = js.native
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: java.lang.String, mtime: stdLib.Date): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: stdLib.Date): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: stdLib.Date, mtime: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: stdLib.Date, mtime: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def futimes(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def lchmod(path: nodeLib.fsMod.PathLike, mode: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def lchmod(path: nodeLib.fsMod.PathLike, mode: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def lchmodSync(path: nodeLib.fsMod.PathLike, mode: java.lang.String): scala.Unit = js.native
  def lchmodSync(path: nodeLib.fsMod.PathLike, mode: scala.Double): scala.Unit = js.native
  def lchown(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lchownSync(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def link(existingPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def linkSync(existingPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def listDir(path: java.lang.String): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def listDir(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def listDir(path: java.lang.String, options: DirectoryOptions): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def listDir(
    path: java.lang.String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def listDirSync(path: java.lang.String): java.lang.String | js.Array[java.lang.String] = js.native
  def listDirSync(path: java.lang.String, options: DirectoryOptions): java.lang.String | js.Array[java.lang.String] = js.native
  def listDirSync(path: java.lang.String, options: DirectoryOptions, parent: java.lang.String): java.lang.String | js.Array[java.lang.String] = js.native
  def lstat(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.Stats] = js.native
  /**
    * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lstatSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def mkdir(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def mkdir(path: nodeLib.fsMod.PathLike, mode: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def mkdir(path: nodeLib.fsMod.PathLike, mode: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdirSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.fsMod.MakeDirectoryOptions): scala.Unit = js.native
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: scala.Double): scala.Unit = js.native
  def mkdirs(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def mkdirs(path: nodeLib.fsMod.PathLike, callback: js.Function1[/* err */ js.Any, scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def mkdirsSync(path: java.lang.String): scala.Unit = js.native
  def open(path: nodeLib.fsMod.PathLike, flags: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def open(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def open(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: scala.Double): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def open(path: nodeLib.fsMod.PathLike, flags: scala.Double): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def open(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def open(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: scala.Double): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  /**
    * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def openSync(path: nodeLib.fsMod.PathLike, flags: java.lang.String): scala.Double = js.native
  def openSync(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: java.lang.String): scala.Double = js.native
  def openSync(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: scala.Double): scala.Double = js.native
  def openSync(path: nodeLib.fsMod.PathLike, flags: scala.Double): scala.Double = js.native
  def openSync(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: java.lang.String): scala.Double = js.native
  def openSync(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: scala.Double): scala.Double = js.native
  def read(fd: scala.Double, buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_Buffer] = js.native
  def read(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_Buffer] = js.native
  def read(fd: scala.Double, buffer: stdLib.Uint8Array, offset: scala.Double, length: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesRead] = js.native
  def read(
    fd: scala.Double,
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesRead] = js.native
  def readFile(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFile(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_EncodingEscape): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: hexoDashFsLib.Anon_EncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFile(path: scala.Double): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFile(
    path: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFile(path: scala.Double, options: hexoDashFsLib.Anon_EncodingEscape): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFile(
    path: scala.Double,
    options: hexoDashFsLib.Anon_EncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readFileSync(path: nodeLib.fsMod.PathLike): java.lang.String = js.native
  def readFileSync(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_EncodingEscape): java.lang.String = js.native
  def readFileSync(path: scala.Double): java.lang.String = js.native
  def readFileSync(path: scala.Double, options: hexoDashFsLib.Anon_EncodingEscape): java.lang.String = js.native
  def readSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Double, length: scala.Double): scala.Double = js.native
  /**
    * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def readSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def readdir(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def readdir(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_BufferEncoding): bluebirdLib.bluebirdMod.^[js.Array[nodeLib.Buffer]] = js.native
  def readdir(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_Encoding): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def readdir(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_EncodingNull): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String | nodeLib.Buffer]] = js.native
  def readdir(path: nodeLib.fsMod.PathLike, options: java.lang.String): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String | nodeLib.Buffer]] = js.native
  def readdir(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: nodeLib.fsMod.PathLike): js.Array[java.lang.String] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncodingFalse): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalse): js.Array[java.lang.String] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalseWithFileTypes): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingTrue): js.Array[nodeLib.fsMod.Dirent] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Array[java.lang.String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.hexoDashFsLibStrings.buffer): js.Array[nodeLib.Buffer] = js.native
  @JSName("readdir")
  def readdir_buffer(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.hexoDashFsLibStrings.buffer): bluebirdLib.bluebirdMod.^[js.Array[nodeLib.Buffer]] = js.native
  def readlink(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readlink(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_BufferEncoding): bluebirdLib.bluebirdMod.^[nodeLib.Buffer] = js.native
  def readlink(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_EncodingBufferEncoding): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def readlink(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_EncodingNull): bluebirdLib.bluebirdMod.^[java.lang.String | nodeLib.Buffer] = js.native
  def readlink(path: nodeLib.fsMod.PathLike, options: java.lang.String): bluebirdLib.bluebirdMod.^[java.lang.String | nodeLib.Buffer] = js.native
  def readlink(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncoding): nodeLib.Buffer = js.native
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncoding): java.lang.String = js.native
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingNull): java.lang.String | nodeLib.Buffer = js.native
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("readlinkSync")
  def readlinkSync_String(path: nodeLib.fsMod.PathLike): java.lang.String = js.native
  @JSName("readlinkSync")
  def readlinkSync_buffer(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.hexoDashFsLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("readlink")
  def readlink_buffer(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.hexoDashFsLibStrings.buffer): bluebirdLib.bluebirdMod.^[nodeLib.Buffer] = js.native
  def realpath(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def realpath(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_BufferEncoding): bluebirdLib.bluebirdMod.^[nodeLib.Buffer] = js.native
  def realpath(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_EncodingBufferEncoding): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  def realpath(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.Anon_EncodingNull): bluebirdLib.bluebirdMod.^[java.lang.String | nodeLib.Buffer] = js.native
  def realpath(path: nodeLib.fsMod.PathLike, options: java.lang.String): bluebirdLib.bluebirdMod.^[java.lang.String | nodeLib.Buffer] = js.native
  def realpath(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): bluebirdLib.bluebirdMod.^[java.lang.String] = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpathSync(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  def realpathSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncoding): nodeLib.Buffer = js.native
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncoding): java.lang.String = js.native
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingNull): java.lang.String | nodeLib.Buffer = js.native
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("realpathSync")
  def realpathSync_String(path: nodeLib.fsMod.PathLike): java.lang.String = js.native
  @JSName("realpathSync")
  def realpathSync_buffer(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.hexoDashFsLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("realpath")
  def realpath_buffer(path: nodeLib.fsMod.PathLike, options: hexoDashFsLib.hexoDashFsLibStrings.buffer): bluebirdLib.bluebirdMod.^[nodeLib.Buffer] = js.native
  def rename(oldPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def renameSync(oldPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def rmdir(path: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def rmdir(path: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def rmdirSync(path: java.lang.String): scala.Unit = js.native
  def stat(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[gracefulDashFsLib.gracefulDashFsMod.Stats] = js.native
  /**
    * Synchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def statSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def symlink(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def symlink(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike, `type`: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def symlinkSync(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def symlinkSync(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike, `type`: nodeLib.fsMod.symlinkNs.Type): scala.Unit = js.native
  def truncate(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def truncate(path: nodeLib.fsMod.PathLike, len: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def truncateSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def truncateSync(path: nodeLib.fsMod.PathLike, len: scala.Double): scala.Unit = js.native
  def unlink(path: nodeLib.fsMod.PathLike): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def unlinkSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
    * Stop watching for changes on `filename`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def unwatchFile(filename: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def unwatchFile(
    filename: nodeLib.fsMod.PathLike,
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: stdLib.Date): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: stdLib.Date): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: scala.Double): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def utimes(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: stdLib.Date): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def watch(path: java.lang.String): bluebirdLib.bluebirdMod.^[chokidarLib.chokidarMod.FSWatcher] = js.native
  def watch(path: java.lang.String, options: chokidarLib.chokidarMod.WatchOptions): bluebirdLib.bluebirdMod.^[chokidarLib.chokidarMod.FSWatcher] = js.native
  def watch(
    path: java.lang.String,
    options: chokidarLib.chokidarMod.WatchOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[chokidarLib.chokidarMod.FSWatcher], 
      scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[chokidarLib.chokidarMod.FSWatcher] = js.native
  def watch(path: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.^[chokidarLib.chokidarMod.FSWatcher] = js.native
  def watch(path: js.Array[java.lang.String], options: chokidarLib.chokidarMod.WatchOptions): bluebirdLib.bluebirdMod.^[chokidarLib.chokidarMod.FSWatcher] = js.native
  def watch(
    path: js.Array[java.lang.String],
    options: chokidarLib.chokidarMod.WatchOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[chokidarLib.chokidarMod.FSWatcher], 
      scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[chokidarLib.chokidarMod.FSWatcher] = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def watchFile(
    filename: nodeLib.fsMod.PathLike,
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  def watchFile(
    filename: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    */
  def watchFile(
    filename: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_Interval,
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  def write(fd: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWritten] = js.native
  def write(fd: scala.Double, buffer: nodeLib.Buffer): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWritten] = js.native
  def write(fd: scala.Double, buffer: nodeLib.Buffer, offset: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWritten] = js.native
  def write(fd: scala.Double, buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWritten] = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWritten] = js.native
  def write(fd: scala.Double, buffer: stdLib.Uint8Array): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumber] = js.native
  def write(fd: scala.Double, buffer: stdLib.Uint8Array, offset: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumber] = js.native
  def write(fd: scala.Double, buffer: stdLib.Uint8Array, offset: scala.Double, length: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumber] = js.native
  def write(
    fd: scala.Double,
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumber] = js.native
  def write(fd: scala.Double, string: js.Any): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumberString] = js.native
  def write(fd: scala.Double, string: js.Any, position: scala.Double): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumberString] = js.native
  def write(fd: scala.Double, string: js.Any, position: scala.Double, encoding: java.lang.String): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumberString] = js.native
  def write(fd: scala.Double, string: js.Any, position: scala.Null, encoding: java.lang.String): bluebirdLib.bluebirdMod.^[hexoDashFsLib.Anon_BufferBytesWrittenNumberString] = js.native
  def writeFile(path: java.lang.String, data: js.Any): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def writeFile(path: java.lang.String, data: js.Any, callback: js.Function1[/* err */ js.Any, scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def writeFile(path: java.lang.String, data: js.Any, options: hexoDashFsLib.Anon_EncodingFlag): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def writeFile(
    path: java.lang.String,
    data: js.Any,
    options: hexoDashFsLib.Anon_EncodingFlag,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def writeFile(path: java.lang.String, data: js.Any, options: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def writeFile(
    path: java.lang.String,
    data: js.Any,
    options: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def writeFileSync(path: java.lang.String, data: js.Any): scala.Unit = js.native
  def writeFileSync(path: java.lang.String, data: js.Any, options: hexoDashFsLib.Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(path: java.lang.String, data: js.Any, options: java.lang.String): scala.Unit = js.native
  /**
    * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData): scala.Double = js.native
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Double): scala.Double = js.native
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = js.native
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Null, length: scala.Double): scala.Double = js.native
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = js.native
  /**
    * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def writeSync(fd: scala.Double, string: js.Any): scala.Double = js.native
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Double): scala.Double = js.native
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Null, encoding: java.lang.String): scala.Double = js.native
}

