package typings.hexoDashFs.hexoDashFsMod

import typings.chokidar.chokidarMod.FSWatcher
import typings.chokidar.chokidarMod.WatchOptions
import typings.hexoDashFs.Anon_AutoClose
import typings.hexoDashFs.Anon_Buffer
import typings.hexoDashFs.Anon_BufferBytesRead
import typings.hexoDashFs.Anon_BufferBytesWritten
import typings.hexoDashFs.Anon_BufferBytesWrittenNumber
import typings.hexoDashFs.Anon_BufferBytesWrittenNumberString
import typings.hexoDashFs.Anon_BufferEncoding
import typings.hexoDashFs.Anon_Encoding
import typings.hexoDashFs.Anon_EncodingBufferEncoding
import typings.hexoDashFs.Anon_EncodingEscape
import typings.hexoDashFs.Anon_EncodingFlag
import typings.hexoDashFs.Anon_EncodingNull
import typings.hexoDashFs.Anon_Exclude
import typings.hexoDashFs.hexoDashFsStrings.buffer
import typings.node.Anon_AutoCloseEncoding
import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_EncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingTrue
import typings.node.Anon_Interval
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.BinaryData
import typings.node.fsMod.Dirent
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.symlinkNs.Type
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var F_OK: js.UndefOr[Double] = js.native
  var R_OK: js.UndefOr[Double] = js.native
  var W_OK: js.UndefOr[Double] = js.native
  var X_OK: js.UndefOr[Double] = js.native
  var access: js.UndefOr[
    js.Function2[
      /* path */ PathLike, 
      /* mode */ js.UndefOr[Double], 
      typings.bluebird.bluebirdMod.^[Unit]
    ]
  ] = js.native
  var accessSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ js.UndefOr[Double], Unit]] = js.native
  def appendFile(path: String, data: js.Any): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def appendFile(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def appendFile(path: String, data: js.Any, options: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def appendFile(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def appendFile(path: String, data: js.Any, options: AppendFileOptions): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def appendFile(
    path: String,
    data: js.Any,
    options: AppendFileOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def appendFileSync(path: String, data: js.Any): Unit = js.native
  def appendFileSync(path: String, data: js.Any, options: String): Unit = js.native
  def appendFileSync(path: String, data: js.Any, options: AppendFileOptions): Unit = js.native
  def chmod(path: PathLike, mode: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def chmod(path: PathLike, mode: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def chmodSync(path: PathLike, mode: String): Unit = js.native
  def chmodSync(path: PathLike, mode: Double): Unit = js.native
  def chown(path: PathLike, uid: Double, gid: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  def close(fd: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def closeSync(fd: Double): Unit = js.native
  def copyDir(src: String, dest: String): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def copyDir(
    src: String,
    dest: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def copyDir(src: String, dest: String, options: DirectoryOptions): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def copyDir(
    src: String,
    dest: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def copyFile(src: PathLike, dest: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def copyFile(src: PathLike, dest: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = js.native
  def createReadStream(path: PathLike, options: String): typings.node.fsMod.ReadStream = js.native
  def createReadStream(path: PathLike, options: typings.node.Anon_AutoClose): typings.node.fsMod.ReadStream = js.native
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: String): typings.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: Anon_AutoCloseEncoding): typings.node.fsMod.WriteStream = js.native
  def emptyDir(path: String): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
  def emptyDir(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
  def emptyDir(path: String, options: DirectoryOptions with Anon_Exclude): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
  def emptyDir(
    path: String,
    options: DirectoryOptions with Anon_Exclude,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[String | js.Array[String]] = js.native
  def emptyDirSync(path: String): String | js.Array[String] = js.native
  def emptyDirSync(path: String, options: DirectoryOptions with Anon_Exclude): String | js.Array[String] = js.native
  def emptyDirSync(path: String, options: DirectoryOptions with Anon_Exclude, parent: String): String | js.Array[String] = js.native
  def ensurePath(path: String): typings.bluebird.bluebirdMod.^[String] = js.native
  def ensurePath(path: String, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.bluebirdMod.^[String] = js.native
  def ensurePathSync(path: String): String = js.native
  def ensureWriteStream(path: String): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(
    path: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typings.gracefulDashFs.gracefulDashFsMod.WriteStream], 
      Unit
    ]
  ): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(path: String, options: String): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(
    path: String,
    options: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typings.gracefulDashFs.gracefulDashFsMod.WriteStream], 
      Unit
    ]
  ): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(path: String, options: Anon_AutoClose): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStream(
    path: String,
    options: Anon_AutoClose,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typings.gracefulDashFs.gracefulDashFsMod.WriteStream], 
      Unit
    ]
  ): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def ensureWriteStreamSync(path: String): typings.gracefulDashFs.gracefulDashFsMod.WriteStream = js.native
  def ensureWriteStreamSync(path: String, options: String): typings.gracefulDashFs.gracefulDashFsMod.WriteStream = js.native
  def ensureWriteStreamSync(path: String, options: Anon_AutoClose): typings.gracefulDashFs.gracefulDashFsMod.WriteStream = js.native
  def escapeBOM(str: String): String = js.native
  def escapeEOL(str: String): String = js.native
  def exists(path: PathLike): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def exists(path: PathLike, callback: js.Function1[/* exist */ Boolean, Unit]): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def existsSync(path: PathLike): Boolean = js.native
  def fchmod(fd: Double, mode: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def fchmod(fd: Double, mode: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  def fchown(fd: Double, uid: Double, gid: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  def fstat(fd: Double): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.Stats] = js.native
  /**
    * Synchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def fstatSync(fd: Double): typings.node.fsMod.Stats = js.native
  def fsync(fd: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def fsyncSync(fd: Double): Unit = js.native
  def ftruncate(fd: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def ftruncate(fd: Double, len: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def ftruncateSync(fd: Double): Unit = js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  def futimes(fd: Double, atime: String, mtime: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: String, mtime: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: String, mtime: Date): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: Double, mtime: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: Double, mtime: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: Double, mtime: Date): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: Date, mtime: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: Date, mtime: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def futimes(fd: Double, atime: Date, mtime: Date): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def futimesSync(fd: Double, atime: String, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: Date): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Date): Unit = js.native
  def futimesSync(fd: Double, atime: Date, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: Date, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = js.native
  def lchmod(path: PathLike, mode: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def lchmod(path: PathLike, mode: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def lchmodSync(path: PathLike, mode: String): Unit = js.native
  def lchmodSync(path: PathLike, mode: Double): Unit = js.native
  def lchown(path: PathLike, uid: Double, gid: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  def link(existingPath: PathLike, newPath: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  def listDir(path: String): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def listDir(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def listDir(path: String, options: DirectoryOptions): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def listDir(
    path: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def listDirSync(path: String): String | js.Array[String] = js.native
  def listDirSync(path: String, options: DirectoryOptions): String | js.Array[String] = js.native
  def listDirSync(path: String, options: DirectoryOptions, parent: String): String | js.Array[String] = js.native
  def lstat(path: PathLike): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.Stats] = js.native
  /**
    * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lstatSync(path: PathLike): typings.node.fsMod.Stats = js.native
  def mkdir(path: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def mkdir(path: PathLike, mode: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def mkdir(path: PathLike, mode: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdirSync(path: PathLike): Unit = js.native
  def mkdirSync(path: PathLike, options: String): Unit = js.native
  def mkdirSync(path: PathLike, options: Double): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): Unit = js.native
  def mkdirs(path: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def mkdirs(path: PathLike, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def mkdirsSync(path: String): Unit = js.native
  def open(path: PathLike, flags: String): typings.bluebird.bluebirdMod.^[Double] = js.native
  def open(path: PathLike, flags: String, mode: String): typings.bluebird.bluebirdMod.^[Double] = js.native
  def open(path: PathLike, flags: String, mode: Double): typings.bluebird.bluebirdMod.^[Double] = js.native
  def open(path: PathLike, flags: Double): typings.bluebird.bluebirdMod.^[Double] = js.native
  def open(path: PathLike, flags: Double, mode: String): typings.bluebird.bluebirdMod.^[Double] = js.native
  def open(path: PathLike, flags: Double, mode: Double): typings.bluebird.bluebirdMod.^[Double] = js.native
  /**
    * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def openSync(path: PathLike, flags: String): Double = js.native
  def openSync(path: PathLike, flags: String, mode: String): Double = js.native
  def openSync(path: PathLike, flags: String, mode: Double): Double = js.native
  def openSync(path: PathLike, flags: Double): Double = js.native
  def openSync(path: PathLike, flags: Double, mode: String): Double = js.native
  def openSync(path: PathLike, flags: Double, mode: Double): Double = js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_Buffer] = js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_Buffer] = js.native
  def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesRead] = js.native
  def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesRead] = js.native
  def readFile(path: Double): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFile(path: Double, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFile(path: Double, options: Anon_EncodingEscape): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFile(
    path: Double,
    options: Anon_EncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFile(path: PathLike): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFile(path: PathLike, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFile(path: PathLike, options: Anon_EncodingEscape): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFile(
    path: PathLike,
    options: Anon_EncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.bluebirdMod.^[String] = js.native
  def readFileSync(path: Double): String = js.native
  def readFileSync(path: Double, options: Anon_EncodingEscape): String = js.native
  def readFileSync(path: PathLike): String = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingEscape): String = js.native
  def readSync(fd: Double, buffer: BinaryData, offset: Double, length: Double): Double = js.native
  /**
    * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def readSync(fd: Double, buffer: BinaryData, offset: Double, length: Double, position: Double): Double = js.native
  def readdir(path: PathLike): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def readdir(path: PathLike, options: String): typings.bluebird.bluebirdMod.^[js.Array[String | Buffer]] = js.native
  def readdir(path: PathLike, options: Anon_BufferEncoding): typings.bluebird.bluebirdMod.^[js.Array[Buffer]] = js.native
  def readdir(path: PathLike, options: Anon_Encoding): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def readdir(path: PathLike, options: Anon_EncodingNull): typings.bluebird.bluebirdMod.^[js.Array[String | Buffer]] = js.native
  def readdir(path: PathLike, options: BufferEncoding): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: PathLike): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  @JSName("readdir")
  def readdir_buffer(path: PathLike, options: buffer): typings.bluebird.bluebirdMod.^[js.Array[Buffer]] = js.native
  def readlink(path: PathLike): typings.bluebird.bluebirdMod.^[String] = js.native
  def readlink(path: PathLike, options: String): typings.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def readlink(path: PathLike, options: Anon_BufferEncoding): typings.bluebird.bluebirdMod.^[Buffer] = js.native
  def readlink(path: PathLike, options: Anon_EncodingBufferEncoding): typings.bluebird.bluebirdMod.^[String] = js.native
  def readlink(path: PathLike, options: Anon_EncodingNull): typings.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def readlink(path: PathLike, options: BufferEncoding): typings.bluebird.bluebirdMod.^[String] = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: PathLike): String | Buffer = js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: PathLike, options: typings.node.Anon_BufferEncoding): Buffer = js.native
  def readlinkSync(path: PathLike, options: typings.node.Anon_EncodingBufferEncoding): String = js.native
  def readlinkSync(path: PathLike, options: typings.node.Anon_EncodingNull): String | Buffer = js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("readlinkSync")
  def readlinkSync_String(path: PathLike): String = js.native
  @JSName("readlinkSync")
  def readlinkSync_buffer(path: PathLike, options: buffer): Buffer = js.native
  @JSName("readlink")
  def readlink_buffer(path: PathLike, options: buffer): typings.bluebird.bluebirdMod.^[Buffer] = js.native
  def realpath(path: PathLike): typings.bluebird.bluebirdMod.^[String] = js.native
  def realpath(path: PathLike, options: String): typings.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def realpath(path: PathLike, options: Anon_BufferEncoding): typings.bluebird.bluebirdMod.^[Buffer] = js.native
  def realpath(path: PathLike, options: Anon_EncodingBufferEncoding): typings.bluebird.bluebirdMod.^[String] = js.native
  def realpath(path: PathLike, options: Anon_EncodingNull): typings.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def realpath(path: PathLike, options: BufferEncoding): typings.bluebird.bluebirdMod.^[String] = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpathSync(path: PathLike): String | Buffer = js.native
  def realpathSync(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpathSync(path: PathLike, options: typings.node.Anon_BufferEncoding): Buffer = js.native
  def realpathSync(path: PathLike, options: typings.node.Anon_EncodingBufferEncoding): String = js.native
  def realpathSync(path: PathLike, options: typings.node.Anon_EncodingNull): String | Buffer = js.native
  def realpathSync(path: PathLike, options: BufferEncoding): String = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("realpathSync")
  def realpathSync_String(path: PathLike): String = js.native
  @JSName("realpathSync")
  def realpathSync_buffer(path: PathLike, options: buffer): Buffer = js.native
  @JSName("realpath")
  def realpath_buffer(path: PathLike, options: buffer): typings.bluebird.bluebirdMod.^[Buffer] = js.native
  def rename(oldPath: PathLike, newPath: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  def rmdir(path: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def rmdir(path: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def rmdirSync(path: String): Unit = js.native
  def stat(path: PathLike): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.Stats] = js.native
  /**
    * Synchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def statSync(path: PathLike): typings.node.fsMod.Stats = js.native
  def symlink(target: PathLike, path: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def symlink(target: PathLike, path: PathLike, `type`: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  def truncate(path: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def truncate(path: PathLike, len: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def truncateSync(path: PathLike): Unit = js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  def unlink(path: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def unlinkSync(path: PathLike): Unit = js.native
  /**
    * Stop watching for changes on `filename`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def unwatchFile(filename: PathLike): Unit = js.native
  def unwatchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  def utimes(path: PathLike, atime: String, mtime: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: String, mtime: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: String, mtime: Date): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: Date): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: Date, mtime: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: Date, mtime: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def utimes(path: PathLike, atime: Date, mtime: Date): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  def utimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  def watch(path: String): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def watch(path: String, options: WatchOptions): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def watch(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def watch(path: js.Array[String]): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def watch(path: js.Array[String], options: WatchOptions): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def watch(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typings.bluebird.bluebirdMod.^[FSWatcher] = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def watchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    */
  def watchFile(
    filename: PathLike,
    options: Anon_Interval,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  def write(fd: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def write(fd: Double, buffer: Buffer): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def write(fd: Double, buffer: Buffer, offset: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def write(fd: Double, buffer: Uint8Array): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def write(fd: Double, buffer: Uint8Array, offset: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def write(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def write(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def write(fd: Double, string: js.Any): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def write(fd: Double, string: js.Any, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def write(fd: Double, string: js.Any, position: Double, encoding: String): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def write(fd: Double, string: js.Any, position: Null, encoding: String): typings.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def writeFile(path: String, data: js.Any): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def writeFile(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def writeFile(path: String, data: js.Any, options: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def writeFile(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def writeFile(path: String, data: js.Any, options: Anon_EncodingFlag): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def writeFile(
    path: String,
    data: js.Any,
    options: Anon_EncodingFlag,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def writeFileSync(path: String, data: js.Any): Unit = js.native
  def writeFileSync(path: String, data: js.Any, options: String): Unit = js.native
  def writeFileSync(path: String, data: js.Any, options: Anon_EncodingFlag): Unit = js.native
  /**
    * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def writeSync(fd: Double, buffer: BinaryData): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Null, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Null, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Null, length: Null, position: Double): Double = js.native
  /**
    * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def writeSync(fd: Double, string: js.Any): Double = js.native
  def writeSync(fd: Double, string: js.Any, position: Double): Double = js.native
  def writeSync(fd: Double, string: js.Any, position: Double, encoding: String): Double = js.native
  def writeSync(fd: Double, string: js.Any, position: Null, encoding: String): Double = js.native
}

