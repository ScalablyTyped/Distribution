package typings.makeDir

import org.scalablytyped.runtime.Instantiable0
import typings.makeDir.makeDirStrings.buffer
import typings.node.Anon2
import typings.node.Anon3
import typings.node.Anon4
import typings.node.Anon5
import typings.node.AnonAutoClose
import typings.node.AnonEmitClose
import typings.node.AnonEncoding
import typings.node.AnonEncodingFlag
import typings.node.AnonEncodingPersistent
import typings.node.AnonEncodingWithFileTypes
import typings.node.AnonFlag
import typings.node.AnonFlagString
import typings.node.AnonInterval
import typings.node.AnonPersistent
import typings.node.AnonRecursive
import typings.node.AnonWithFileTypes
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.MakeDirectoryOptionsrecur
import typings.node.MakeDirectoryOptionsrecurMode
import typings.node.NodeJS.ArrayBufferView
import typings.node.fsMod.Dir
import typings.node.fsMod.Dirent
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.WriteStream
import typings.node.fsMod.symlink.Type
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffs extends js.Object {
  /**
    * A class representing a directory stream.
    */
  var Dir: Instantiable0[typings.node.fsMod.Dir] = js.native
  var Dirent: Instantiable0[typings.node.fsMod.Dirent] = js.native
  var ReadStream: Instantiable0[typings.node.fsMod.ReadStream] = js.native
  var Stats: Instantiable0[typings.node.fsMod.Stats] = js.native
  var WriteStream: Instantiable0[typings.node.fsMod.WriteStream] = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val access: Typeofaccess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val appendFile: TypeofappendFile = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val chmod: Typeofchmod = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val chown: Typeofchown = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val close: Typeofclose = js.native
  val constants: Typeofconstants = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val copyFile: TypeofcopyFile = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val exists: Typeofexists = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val fchmod: Typeoffchmod = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val fchown: Typeoffchown = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val fdatasync: Typeoffdatasync = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val fstat: Typeoffstat = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val fsync: Typeoffsync = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val ftruncate: Typeofftruncate = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val futimes: Typeoffutimes = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val lchmod: Typeoflchmod = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val lchown: Typeoflchown = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val link: Typeoflink = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val lstat: Typeoflstat = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val mkdir: Typeofmkdir = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val mkdtemp: Typeofmkdtemp = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val open: Typeofopen = js.native
  val opendir: Typeofopendir = js.native
  val promises: Typeofpromises = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val read: Typeofread = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val readFile: TypeofreadFile = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val readdir: Typeofreaddir = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val readlink: Typeofreadlink = js.native
  val readv: Typeofreadv = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val realpath: Typeofrealpath = js.native
  val realpathSync: TypeofrealpathSync = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val rename: Typeofrename = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val rmdir: Typeofrmdir = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val stat: Typeofstat = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val symlink: Typeofsymlink = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val truncate: Typeoftruncate = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val unlink: Typeofunlink = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val utimes: Typeofutimes = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val write: Typeofwrite = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val writeFile: TypeofwriteFile = js.native
  val writev: Typeofwritev = js.native
  /**
    * Synchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def accessSync(path: PathLike): Unit = js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  def appendFileSync(file: Double, data: js.Any): Unit = js.native
  def appendFileSync(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Synchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  def appendFileSync(file: PathLike, data: js.Any): Unit = js.native
  def appendFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Synchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def chmodSync(path: PathLike, mode: String): Unit = js.native
  def chmodSync(path: PathLike, mode: Double): Unit = js.native
  /**
    * Synchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  /**
    * Synchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def closeSync(fd: Double): Unit = js.native
  /**
    * Synchronously copies src to dest. By default, dest is overwritten if it already exists.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation.
    * The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
    */
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createReadStream(path: PathLike): ReadStream = js.native
  def createReadStream(path: PathLike, options: String): ReadStream = js.native
  def createReadStream(path: PathLike, options: AnonAutoClose): ReadStream = js.native
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createWriteStream(path: PathLike): WriteStream = js.native
  def createWriteStream(path: PathLike, options: String): WriteStream = js.native
  def createWriteStream(path: PathLike, options: AnonEmitClose): WriteStream = js.native
  /**
    * Synchronously tests whether or not the given path exists by checking with the file system.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def existsSync(path: PathLike): Boolean = js.native
  /**
    * Synchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  /**
    * Synchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  /**
    * Synchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def fdatasyncSync(fd: Double): Unit = js.native
  /**
    * Synchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def fstatSync(fd: Double): Stats = js.native
  /**
    * Synchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def fsyncSync(fd: Double): Unit = js.native
  /**
    * Synchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def ftruncateSync(fd: Double): Unit = js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
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
  /**
    * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def lchmodSync(path: PathLike, mode: String): Unit = js.native
  def lchmodSync(path: PathLike, mode: Double): Unit = js.native
  /**
    * Synchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  /**
    * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  /**
    * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lstatSync(path: PathLike): Stats = js.native
  /**
    * Synchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: String): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: Double): js.UndefOr[String] = js.native
  /**
    * Synchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  /**
    * Synchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: String): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: Double): Unit = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtempSync(prefix: String): String = js.native
  def mkdtempSync(prefix: String, options: String): String | Buffer = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtempSync(prefix: String, options: Anon2): Buffer = js.native
  def mkdtempSync(prefix: String, options: Anon3): String | Buffer = js.native
  def mkdtempSync(prefix: String, options: AnonEncoding): String = js.native
  def mkdtempSync(prefix: String, options: BufferEncoding): String = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("mkdtempSync")
  def mkdtempSync_Union(prefix: String): String | Buffer = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_buffer(prefix: String, options: buffer): Buffer = js.native
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
  def opendirSync(path: String): Dir = js.native
  def opendirSync(path: String, options: OpenDirOptions): Dir = js.native
  def readFileSync(path: Double): String | Buffer = js.native
  def readFileSync(path: Double, options: String): String = js.native
  def readFileSync(path: Double, options: AnonEncodingFlag): String = js.native
  def readFileSync(path: Double, options: AnonFlag): Buffer = js.native
  def readFileSync(path: Double, options: AnonFlagString): String | Buffer = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFileSync(path: PathLike): String | Buffer = js.native
  def readFileSync(path: PathLike, options: String): String = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFileSync(path: PathLike, options: AnonEncodingFlag): String = js.native
  def readFileSync(path: PathLike, options: AnonFlag): Buffer = js.native
  def readFileSync(path: PathLike, options: AnonFlagString): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: Double): Buffer = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
    */
  @JSName("readFileSync")
  def readFileSync_Buffer(path: PathLike): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double, options: String): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Similar to the above `fs.readSync` function, this version takes an optional `options` object.
    * If no `options` object is specified, it will default with the above values.
    */
  def readSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  /**
    * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: PathLike): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def readdirSync(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: AnonWithFileTypes): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: PathLike): String = js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: PathLike, options: Anon2): Buffer = js.native
  def readlinkSync(path: PathLike, options: Anon3): String | Buffer = js.native
  def readlinkSync(path: PathLike, options: AnonEncoding): String = js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("readlinkSync")
  def readlinkSync_Union(path: PathLike): String | Buffer = js.native
  @JSName("readlinkSync")
  def readlinkSync_buffer(path: PathLike, options: buffer): Buffer = js.native
  /**
    * See `readv`.
    */
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  /**
    * Synchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  /**
    * Synchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def rmdirSync(path: PathLike): Unit = js.native
  def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
  /**
    * Synchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def statSync(path: PathLike): Stats = js.native
  /**
    * Synchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  /**
    * Synchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def truncateSync(path: PathLike): Unit = js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
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
  def unwatchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
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
  def watch(filename: PathLike): FSWatcher = js.native
  def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: String): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike, options: AnonEncodingPersistent): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: AnonEncodingPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike, options: AnonPersistent): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: AnonPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike, options: AnonRecursive): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: AnonRecursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    */
  def watchFile(
    filename: PathLike,
    options: AnonInterval,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
  @JSName("watch")
  def watch_buffer(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  def writeFileSync(path: Double, data: js.Any): Unit = js.native
  def writeFileSync(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Synchronously writes data to a file, replacing the file if it already exists.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  def writeFileSync(path: PathLike, data: js.Any): Unit = js.native
  def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
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
  /**
    * See `writev`.
    */
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
}

