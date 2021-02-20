package typings.ionicUtilsFs

import org.scalablytyped.runtime.StringDictionary
import typings.fsExtra.anon.BufferBytesRead
import typings.fsExtra.anon.BufferDataView
import typings.fsExtra.anon.BufferDataViewBytesWrittenNumber
import typings.fsExtra.anon.BufferFloat32Array
import typings.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferFloat64Array
import typings.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferInt16Array
import typings.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferInt32Array
import typings.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferInt8Array
import typings.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber
import typings.fsExtra.anon.BufferString
import typings.fsExtra.anon.BufferUint16Array
import typings.fsExtra.anon.BufferUint32Array
import typings.fsExtra.anon.BytesRead
import typings.fsExtra.anon.BytesWrittenNumber
import typings.fsExtra.anon.Encoding
import typings.fsExtra.anon.EncodingWithFileTypes
import typings.fsExtra.anon.WithFileTypes
import typings.fsExtra.anon.`0`
import typings.fsExtra.anon.`1`
import typings.fsExtra.mod.CopyOptions
import typings.fsExtra.mod.CopyOptionsSync
import typings.fsExtra.mod.EnsureOptions
import typings.fsExtra.mod.Mode
import typings.fsExtra.mod.MoveOptions
import typings.fsExtra.mod.ReadOptions
import typings.fsExtra.mod.SymlinkType
import typings.fsExtra.mod.WriteOptions
import typings.fsExtra.mod.WritevResult
import typings.ionicUtilsFs.ionicUtilsFsStrings.buffer
import typings.ionicUtilsFs.ionicUtilsFsStrings.data
import typings.ionicUtilsFs.ionicUtilsFsStrings.directory
import typings.ionicUtilsFs.ionicUtilsFsStrings.file
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import typings.node.anon.AutoClose
import typings.node.anon.BaseEncodingOptionsflagOp
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.BaseEncodingOptionsmodeMo
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.BufferBytesWritten
import typings.node.anon.BytesWritten
import typings.node.anon.EmitClose
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.Interval
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.Persistent
import typings.node.anon.Recursive
import typings.node.anon.`3`
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.node.promisesMod.FileHandle
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.DataView
import typings.std.Date
import typings.std.Error
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-fs", "BigIntStats")
  @js.native
  class BigIntStats ()
    extends typings.fsExtra.mod.BigIntStats
  
  @JSImport("@ionic/utils-fs", "Dir")
  @js.native
  class Dir ()
    extends typings.fsExtra.mod.Dir
  
  @JSImport("@ionic/utils-fs", "Dirent")
  @js.native
  class Dirent ()
    extends typings.fsExtra.mod.Dirent
  
  @JSImport("@ionic/utils-fs", "ReadStream")
  @js.native
  class ReadStream ()
    extends typings.fsExtra.mod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("@ionic/utils-fs", "Stats")
  @js.native
  class Stats ()
    extends typings.fsExtra.mod.Stats
  
  @JSImport("@ionic/utils-fs", "Walker")
  @js.native
  class Walker protected () extends Readable {
    def this(p: String) = this()
    def this(p: String, options: WalkerOptions) = this()
    
    def _read(): Unit = js.native
    
    @JSName("on")
    def on_data(event: data, callback: js.Function1[/* item */ WalkerItem, Unit]): this.type = js.native
    
    val options: WalkerOptions = js.native
    
    val p: String = js.native
    
    val paths: js.Array[String] = js.native
  }
  
  @JSImport("@ionic/utils-fs", "WriteStream")
  @js.native
  class WriteStream ()
    extends typings.fsExtra.mod.WriteStream {
    def this(opts: WritableOptions) = this()
  }
  
  @JSImport("@ionic/utils-fs", "access")
  @js.native
  def access(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "access")
  @js.native
  def access(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "access")
  @js.native
  def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "access")
  @js.native
  def access(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "accessSync")
  @js.native
  def accessSync(path: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "accessSync")
  @js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(file: Double, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(file: Double, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(
    file: Double,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(file: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(file: PathLike, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  def appendFile(
    file: PathLike,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: Uint8Array): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: Uint8Array, options: WriteFileOptions): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: Uint8Array): Unit = js.native
  @JSImport("@ionic/utils-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: Uint8Array, options: WriteFileOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "cacheFileChecksum")
  @js.native
  def cacheFileChecksum(p: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "cacheFileChecksum")
  @js.native
  def cacheFileChecksum(p: String, checksum: String): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/utils-fs", "chmod")
  @js.native
  def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "chmod")
  @js.native
  def chmod(path: PathLike, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "chmodSync")
  @js.native
  def chmodSync(path: PathLike, mode: typings.node.fsMod.Mode): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "chown")
  @js.native
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "chown")
  @js.native
  def chown(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "chownSync")
  @js.native
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "close")
  @js.native
  def close(fd: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "close")
  @js.native
  def close(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "closeSync")
  @js.native
  def closeSync(fd: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "compilePaths")
  @js.native
  def compilePaths(filePath: String): js.Array[String] = js.native
  
  object constants {
    
    // File Copy Constants
    /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
    @JSImport("@ionic/utils-fs", "constants.COPYFILE_EXCL")
    @js.native
    val COPYFILE_EXCL: Double = js.native
    
    /**
      * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
      */
    @JSImport("@ionic/utils-fs", "constants.COPYFILE_FICLONE")
    @js.native
    val COPYFILE_FICLONE: Double = js.native
    
    /**
      * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
      */
    @JSImport("@ionic/utils-fs", "constants.COPYFILE_FICLONE_FORCE")
    @js.native
    val COPYFILE_FICLONE_FORCE: Double = js.native
    
    // File Access Constants
    /** Constant for fs.access(). File is visible to the calling process. */
    @JSImport("@ionic/utils-fs", "constants.F_OK")
    @js.native
    val F_OK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    @JSImport("@ionic/utils-fs", "constants.O_APPEND")
    @js.native
    val O_APPEND: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    @JSImport("@ionic/utils-fs", "constants.O_CREAT")
    @js.native
    val O_CREAT: Double = js.native
    
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    @JSImport("@ionic/utils-fs", "constants.O_DIRECT")
    @js.native
    val O_DIRECT: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    @JSImport("@ionic/utils-fs", "constants.O_DIRECTORY")
    @js.native
    val O_DIRECTORY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
    @JSImport("@ionic/utils-fs", "constants.O_DSYNC")
    @js.native
    val O_DSYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    @JSImport("@ionic/utils-fs", "constants.O_EXCL")
    @js.native
    val O_EXCL: Double = js.native
    
    /**
      * constant for fs.open().
      * Flag indicating reading accesses to the file system will no longer result in
      * an update to the atime information associated with the file.
      * This flag is available on Linux operating systems only.
      */
    @JSImport("@ionic/utils-fs", "constants.O_NOATIME")
    @js.native
    val O_NOATIME: Double = js.native
    
    /**
      * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
      * opening the path shall not cause that terminal to become the controlling terminal for the process
      * (if the process does not already have one).
      */
    @JSImport("@ionic/utils-fs", "constants.O_NOCTTY")
    @js.native
    val O_NOCTTY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    @JSImport("@ionic/utils-fs", "constants.O_NOFOLLOW")
    @js.native
    val O_NOFOLLOW: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    @JSImport("@ionic/utils-fs", "constants.O_NONBLOCK")
    @js.native
    val O_NONBLOCK: Double = js.native
    
    // File Open Constants
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    @JSImport("@ionic/utils-fs", "constants.O_RDONLY")
    @js.native
    val O_RDONLY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    @JSImport("@ionic/utils-fs", "constants.O_RDWR")
    @js.native
    val O_RDWR: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    @JSImport("@ionic/utils-fs", "constants.O_SYMLINK")
    @js.native
    val O_SYMLINK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    @JSImport("@ionic/utils-fs", "constants.O_SYNC")
    @js.native
    val O_SYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    @JSImport("@ionic/utils-fs", "constants.O_TRUNC")
    @js.native
    val O_TRUNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    @JSImport("@ionic/utils-fs", "constants.O_WRONLY")
    @js.native
    val O_WRONLY: Double = js.native
    
    /** Constant for fs.access(). File can be read by the calling process. */
    @JSImport("@ionic/utils-fs", "constants.R_OK")
    @js.native
    val R_OK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    @JSImport("@ionic/utils-fs", "constants.S_IFBLK")
    @js.native
    val S_IFBLK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    @JSImport("@ionic/utils-fs", "constants.S_IFCHR")
    @js.native
    val S_IFCHR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    @JSImport("@ionic/utils-fs", "constants.S_IFDIR")
    @js.native
    val S_IFDIR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    @JSImport("@ionic/utils-fs", "constants.S_IFIFO")
    @js.native
    val S_IFIFO: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    @JSImport("@ionic/utils-fs", "constants.S_IFLNK")
    @js.native
    val S_IFLNK: Double = js.native
    
    // File Type Constants
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    @JSImport("@ionic/utils-fs", "constants.S_IFMT")
    @js.native
    val S_IFMT: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    @JSImport("@ionic/utils-fs", "constants.S_IFREG")
    @js.native
    val S_IFREG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    @JSImport("@ionic/utils-fs", "constants.S_IFSOCK")
    @js.native
    val S_IFSOCK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    @JSImport("@ionic/utils-fs", "constants.S_IRGRP")
    @js.native
    val S_IRGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    @JSImport("@ionic/utils-fs", "constants.S_IROTH")
    @js.native
    val S_IROTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    @JSImport("@ionic/utils-fs", "constants.S_IRUSR")
    @js.native
    val S_IRUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    @JSImport("@ionic/utils-fs", "constants.S_IRWXG")
    @js.native
    val S_IRWXG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    @JSImport("@ionic/utils-fs", "constants.S_IRWXO")
    @js.native
    val S_IRWXO: Double = js.native
    
    // File Mode Constants
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    @JSImport("@ionic/utils-fs", "constants.S_IRWXU")
    @js.native
    val S_IRWXU: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    @JSImport("@ionic/utils-fs", "constants.S_IWGRP")
    @js.native
    val S_IWGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    @JSImport("@ionic/utils-fs", "constants.S_IWOTH")
    @js.native
    val S_IWOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    @JSImport("@ionic/utils-fs", "constants.S_IWUSR")
    @js.native
    val S_IWUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    @JSImport("@ionic/utils-fs", "constants.S_IXGRP")
    @js.native
    val S_IXGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    @JSImport("@ionic/utils-fs", "constants.S_IXOTH")
    @js.native
    val S_IXOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    @JSImport("@ionic/utils-fs", "constants.S_IXUSR")
    @js.native
    val S_IXUSR: Double = js.native
    
    /**
      * When set, a memory file mapping is used to access the file. This flag
      * is available on Windows operating systems only. On other operating systems,
      * this flag is ignored.
      */
    @JSImport("@ionic/utils-fs", "constants.UV_FS_O_FILEMAP")
    @js.native
    val UV_FS_O_FILEMAP: Double = js.native
    
    /** Constant for fs.access(). File can be written by the calling process. */
    @JSImport("@ionic/utils-fs", "constants.W_OK")
    @js.native
    val W_OK: Double = js.native
    
    /** Constant for fs.access(). File can be executed by the calling process. */
    @JSImport("@ionic/utils-fs", "constants.X_OK")
    @js.native
    val X_OK: Double = js.native
  }
  
  @JSImport("@ionic/utils-fs", "copy")
  @js.native
  def copy(src: String, dest: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "copy")
  @js.native
  def copy(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "copy")
  @js.native
  def copy(src: String, dest: String, options: CopyOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "copy")
  @js.native
  def copy(src: String, dest: String, options: CopyOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "copyFile")
  @js.native
  def copyFile(src: String, dest: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "copyFile")
  @js.native
  def copyFile(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "copyFile")
  @js.native
  def copyFile(src: String, dest: String, flags: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "copyFile")
  @js.native
  def copyFile(src: String, dest: String, flags: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "copyFileSync")
  @js.native
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "copyFileSync")
  @js.native
  def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "copySync")
  @js.native
  def copySync(src: String, dest: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "copySync")
  @js.native
  def copySync(src: String, dest: String, options: CopyOptionsSync): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "createFile")
  @js.native
  def createFile(file: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "createFile")
  @js.native
  def createFile(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "createFileSync")
  @js.native
  def createFileSync(file: String): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "createLink")
  @js.native
  def createLink(src: String, dest: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "createLink")
  @js.native
  def createLink(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "createLinkSync")
  @js.native
  val createLinkSync: js.Function2[/* src */ String, /* dest */ String, Unit] = js.native
  
  @JSImport("@ionic/utils-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = js.native
  @JSImport("@ionic/utils-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: String): typings.node.fsMod.ReadStream = js.native
  @JSImport("@ionic/utils-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: AutoClose): typings.node.fsMod.ReadStream = js.native
  
  @JSImport("@ionic/utils-fs", "createSymlink")
  @js.native
  def createSymlink(src: String, dest: String, `type`: SymlinkType): Unit = js.native
  @JSImport("@ionic/utils-fs", "createSymlink")
  @js.native
  def createSymlink(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "createSymlinkSync")
  @js.native
  def createSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "createSymlink")
  @js.native
  def createSymlink_Promise(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/utils-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = js.native
  @JSImport("@ionic/utils-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike, options: String): typings.node.fsMod.WriteStream = js.native
  @JSImport("@ionic/utils-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike, options: EmitClose): typings.node.fsMod.WriteStream = js.native
  
  @JSImport("@ionic/utils-fs", "emptyDirSync")
  @js.native
  def emptyDirSync_(path: String): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "emptyDir")
  @js.native
  def emptyDir_(path: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "emptyDir")
  @js.native
  def emptyDir_(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "emptydir")
  @js.native
  def emptydir(path: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "emptydir")
  @js.native
  def emptydir(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "emptydirSync")
  @js.native
  val emptydirSync: js.Function1[/* path */ String, Unit] = js.native
  
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir(path: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir(path: String, options: js.UndefOr[scala.Nothing], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir(path: String, options: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir(path: String, options: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir(path: String, options: EnsureOptions): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir(path: String, options: EnsureOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ensureDirSync")
  @js.native
  def ensureDirSync(path: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureDirSync")
  @js.native
  def ensureDirSync(path: String, options: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureDirSync")
  @js.native
  def ensureDirSync(path: String, options: EnsureOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir_Promise(path: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir_Promise(path: String, options: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ensureDir")
  @js.native
  def ensureDir_Promise(path: String, options: EnsureOptions): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/utils-fs", "ensureFile")
  @js.native
  def ensureFile(path: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ensureFile")
  @js.native
  def ensureFile(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ensureFileSync")
  @js.native
  def ensureFileSync(path: String): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ensureLink")
  @js.native
  def ensureLink(src: String, dest: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ensureLink")
  @js.native
  def ensureLink(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ensureLinkSync")
  @js.native
  def ensureLinkSync(src: String, dest: String): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ensureSymlink")
  @js.native
  def ensureSymlink(src: String, dest: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ensureSymlink")
  @js.native
  def ensureSymlink(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureSymlink")
  @js.native
  def ensureSymlink(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ensureSymlink")
  @js.native
  def ensureSymlink(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ensureSymlinkSync")
  @js.native
  def ensureSymlinkSync(src: String, dest: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "ensureSymlinkSync")
  @js.native
  def ensureSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "exists")
  @js.native
  def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "existsSync")
  @js.native
  def existsSync(path: PathLike): Boolean = js.native
  
  @JSImport("@ionic/utils-fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Mode): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fchmodSync")
  @js.native
  def fchmodSync(fd: Double, mode: typings.node.fsMod.Mode): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fchownSync")
  @js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fdatasync")
  @js.native
  def fdatasync(fd: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "fdatasync")
  @js.native
  def fdatasync(fd: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fdatasyncSync")
  @js.native
  def fdatasyncSync(fd: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fileToString")
  @js.native
  def fileToString(filePath: String): js.Promise[String] = js.native
  
  @JSImport("@ionic/utils-fs", "findBaseDirectory")
  @js.native
  def findBaseDirectory(dir: String, file: String): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("@ionic/utils-fs", "fstat")
  @js.native
  def fstat(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
  @JSImport("@ionic/utils-fs", "fstat")
  @js.native
  def fstat(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, _]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fstatSync")
  @js.native
  def fstatSync(fd: Double): typings.node.fsMod.Stats = js.native
  
  @JSImport("@ionic/utils-fs", "fsync")
  @js.native
  def fsync(fd: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "fsync")
  @js.native
  def fsync(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "fsyncSync")
  @js.native
  def fsyncSync(fd: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, len: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Date, mtime: Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: Date): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: Date): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Date, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Date, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "getFileChecksum")
  @js.native
  def getFileChecksum(filePath: String): js.Promise[String] = js.native
  
  @JSImport("@ionic/utils-fs", "getFileChecksums")
  @js.native
  def getFileChecksums(p: String): js.Promise[js.Tuple2[String, js.UndefOr[String]]] = js.native
  
  @JSImport("@ionic/utils-fs", "getFileTree")
  @js.native
  def getFileTree[RE, DE](dir: String): js.Promise[(RegularFileNode with RE) | (DirectoryNode with DE)] = js.native
  @JSImport("@ionic/utils-fs", "getFileTree")
  @js.native
  def getFileTree[RE, DE](dir: String, hasOnErrorOnFileNodeOnDirectoryNodeWalkerOptions: GetFileTreeOptions[RE, DE]): js.Promise[(RegularFileNode with RE) | (DirectoryNode with DE)] = js.native
  
  @JSImport("@ionic/utils-fs", "isExecutableFile")
  @js.native
  def isExecutableFile(filePath: String): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/utils-fs", "lchmod")
  @js.native
  def lchmod(path: PathLike, mode: typings.node.fsMod.Mode, callback: NoParamCallback): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "lchmodSync")
  @js.native
  def lchmodSync(path: PathLike, mode: typings.node.fsMod.Mode): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "lchown")
  @js.native
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "lchown")
  @js.native
  def lchown(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "lchownSync")
  @js.native
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "link")
  @js.native
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "link")
  @js.native
  def link(existingPath: PathLike, newPath: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "linkSync")
  @js.native
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "lstat")
  @js.native
  def lstat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
  @JSImport("@ionic/utils-fs", "lstat")
  @js.native
  def lstat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, _]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "lstatSync")
  @js.native
  def lstatSync(path: PathLike): typings.node.fsMod.Stats = js.native
  
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: Date, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: Double, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: Date, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Date, mtime: String, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Date, mtime: Date, callback: NoParamCallback): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, options: Null, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, options: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "mkdir")
  @js.native
  def mkdir(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  @JSImport("@ionic/utils-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  @JSImport("@ionic/utils-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  @JSImport("@ionic/utils-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  @JSImport("@ionic/utils-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: typings.node.fsMod.Mode): js.UndefOr[String] = js.native
  @JSImport("@ionic/utils-fs", "mkdirSync")
  @js.native
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "mkdirSync")
  @js.native
  def mkdirSync_Unit(path: PathLike, options: typings.node.fsMod.Mode): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdirp")
  @js.native
  def mkdirp(dir: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "mkdirp")
  @js.native
  def mkdirp(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdirpSync")
  @js.native
  def mkdirpSync(dir: String): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdirs")
  @js.native
  def mkdirs(dir: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "mkdirs")
  @js.native
  def mkdirs(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdirsSync")
  @js.native
  def mkdirsSync(dir: String): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdtemp")
  @js.native
  def mkdtemp(prefix: String): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "mkdtemp")
  @js.native
  def mkdtemp(prefix: String, callback: js.Function2[/* err */ ErrnoException, /* folder */ String, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String): String = js.native
  @JSImport("@ionic/utils-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: String): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: BufferEncoding): String = js.native
  @JSImport("@ionic/utils-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: BaseEncodingOptions): String = js.native
  @JSImport("@ionic/utils-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = js.native
  @JSImport("@ionic/utils-fs", "mkdtempSync")
  @js.native
  def mkdtempSync_Union(prefix: String): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "mkdtempSync")
  @js.native
  def mkdtempSync_Union(prefix: String, options: BaseEncodingOptions): String | Buffer = js.native
  
  @JSImport("@ionic/utils-fs", "move")
  @js.native
  def move(src: String, dest: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "move")
  @js.native
  def move(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "move")
  @js.native
  def move(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "move")
  @js.native
  def move(src: String, dest: String, options: MoveOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "moveSync")
  @js.native
  def moveSync(src: String, dest: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "moveSync")
  @js.native
  def moveSync(src: String, dest: String, options: MoveOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(path: PathLike, flags: String): js.Promise[Double] = js.native
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(
    path: PathLike,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(path: PathLike, flags: String, mode: Mode): js.Promise[Double] = js.native
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(
    path: PathLike,
    flags: String,
    mode: Mode,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double): js.Promise[Double] = js.native
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(
    path: PathLike,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double, mode: Mode): js.Promise[Double] = js.native
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  def open(
    path: PathLike,
    flags: Double,
    mode: Mode,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "openSync")
  @js.native
  def openSync(path: PathLike, flags: OpenMode): Double = js.native
  @JSImport("@ionic/utils-fs", "openSync")
  @js.native
  def openSync(path: PathLike, flags: OpenMode, mode: typings.node.fsMod.Mode): Double = js.native
  
  @JSImport("@ionic/utils-fs", "opendir")
  @js.native
  def opendir(path: String): js.Promise[typings.node.fsMod.Dir] = js.native
  @JSImport("@ionic/utils-fs", "opendir")
  @js.native
  def opendir(
    path: String,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "opendir")
  @js.native
  def opendir(path: String, options: OpenDirOptions): js.Promise[typings.node.fsMod.Dir] = js.native
  @JSImport("@ionic/utils-fs", "opendir")
  @js.native
  def opendir(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "opendirSync")
  @js.native
  def opendirSync(path: String): typings.node.fsMod.Dir = js.native
  @JSImport("@ionic/utils-fs", "opendirSync")
  @js.native
  def opendirSync(path: String, options: OpenDirOptions): typings.node.fsMod.Dir = js.native
  
  @JSImport("@ionic/utils-fs", "outputFile")
  @js.native
  def outputFile(file: String, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "outputFile")
  @js.native
  def outputFile(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputFile")
  @js.native
  def outputFile(file: String, data: js.Any, options: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "outputFile")
  @js.native
  def outputFile(file: String, data: js.Any, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputFile")
  @js.native
  def outputFile(file: String, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "outputFile")
  @js.native
  def outputFile(
    file: String,
    data: js.Any,
    options: typings.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "outputFileSync")
  @js.native
  def outputFileSync(file: String, data: js.Any): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputFileSync")
  @js.native
  def outputFileSync(file: String, data: js.Any, options: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputFileSync")
  @js.native
  def outputFileSync(file: String, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "outputJSONSync")
  @js.native
  def outputJSONSync_(file: String, data: js.Any): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputJSONSync")
  @js.native
  def outputJSONSync_(file: String, data: js.Any, options: WriteOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "outputJSON")
  @js.native
  def outputJSON_(file: String, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "outputJSON")
  @js.native
  def outputJSON_(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputJSON")
  @js.native
  def outputJSON_(file: String, data: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "outputJSON")
  @js.native
  def outputJSON_(file: String, data: js.Any, options: WriteOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "outputJson")
  @js.native
  def outputJson(file: String, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "outputJson")
  @js.native
  def outputJson(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputJson")
  @js.native
  def outputJson(file: String, data: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "outputJson")
  @js.native
  def outputJson(file: String, data: js.Any, options: WriteOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "outputJsonSync")
  @js.native
  def outputJsonSync(file: String, data: js.Any): Unit = js.native
  @JSImport("@ionic/utils-fs", "outputJsonSync")
  @js.native
  def outputJsonSync(file: String, data: js.Any, options: WriteOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "pathAccessible")
  @js.native
  def pathAccessible(filePath: String, mode: Double): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/utils-fs", "pathExecutable")
  @js.native
  def pathExecutable(filePath: String): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/utils-fs", "pathExists")
  @js.native
  def pathExists(filePath: String): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/utils-fs", "pathExistsSync")
  @js.native
  def pathExistsSync(path: String): Boolean = js.native
  
  @JSImport("@ionic/utils-fs", "pathReadable")
  @js.native
  def pathReadable(filePath: String): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/utils-fs", "pathWritable")
  @js.native
  def pathWritable(filePath: String): js.Promise[Boolean] = js.native
  
  object promises {
    
    /**
      * Asynchronously tests a user's permissions for the file specified by path.
      * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    @JSImport("@ionic/utils-fs", "promises.access")
    @js.native
    def access(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.access")
    @js.native
    def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously append data to a file, creating the file if it does not exist.
      * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    @JSImport("@ionic/utils-fs", "promises.chmod")
    @js.native
    def chmod(path: PathLike, mode: typings.node.fsMod.Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous chown(2) - Change ownership of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("@ionic/utils-fs", "promises.chown")
    @js.native
    def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
      * Node.js makes no guarantees about the atomicity of the copy operation.
      * If an error occurs after the destination file has been opened for writing, Node.js will attempt
      * to remove the destination.
      * @param src A path to the source file.
      * @param dest A path to the destination file.
      * @param flags An optional integer that specifies the behavior of the copy operation. The only
      * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
      * `dest` already exists.
      */
    @JSImport("@ionic/utils-fs", "promises.copyFile")
    @js.native
    def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.copyFile")
    @js.native
    def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param handle A `FileHandle`.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    @JSImport("@ionic/utils-fs", "promises.fchmod")
    @js.native
    def fchmod(handle: FileHandle, mode: typings.node.fsMod.Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      * @param handle A `FileHandle`.
      */
    @JSImport("@ionic/utils-fs", "promises.fchown")
    @js.native
    def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      * @param handle A `FileHandle`.
      */
    @JSImport("@ionic/utils-fs", "promises.fdatasync")
    @js.native
    def fdatasync(handle: FileHandle): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fstat(2) - Get file status.
      * @param handle A `FileHandle`.
      */
    @JSImport("@ionic/utils-fs", "promises.fstat")
    @js.native
    def fstat(handle: FileHandle): js.Promise[typings.node.fsMod.Stats] = js.native
    
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      * @param handle A `FileHandle`.
      */
    @JSImport("@ionic/utils-fs", "promises.fsync")
    @js.native
    def fsync(handle: FileHandle): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param handle A `FileHandle`.
      * @param len If not specified, defaults to `0`.
      */
    @JSImport("@ionic/utils-fs", "promises.ftruncate")
    @js.native
    def ftruncate(handle: FileHandle): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.ftruncate")
    @js.native
    def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: String, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: String, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: String, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Double, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Date, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    @JSImport("@ionic/utils-fs", "promises.lchmod")
    @js.native
    def lchmod(path: PathLike, mode: typings.node.fsMod.Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("@ionic/utils-fs", "promises.lchown")
    @js.native
    def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
      * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("@ionic/utils-fs", "promises.link")
    @js.native
    def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("@ionic/utils-fs", "promises.lstat")
    @js.native
    def lstat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
    
    /**
      * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`,
      * with the difference that if the path refers to a symbolic link, then the link is not
      * dereferenced: instead, the timestamps of the symbolic link itself are changed.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    @JSImport("@ionic/utils-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike): js.Promise[Unit] = js.native
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    @JSImport("@ionic/utils-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
    @JSImport("@ionic/utils-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: typings.node.fsMod.Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous open(2) - open and possibly create a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
      * supplied, defaults to `0o666`.
      */
    @JSImport("@ionic/utils-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: String): js.Promise[FileHandle] = js.native
    @JSImport("@ionic/utils-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: String, mode: typings.node.fsMod.Mode): js.Promise[FileHandle] = js.native
    @JSImport("@ionic/utils-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: Double): js.Promise[FileHandle] = js.native
    @JSImport("@ionic/utils-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: Double, mode: typings.node.fsMod.Mode): js.Promise[FileHandle] = js.native
    
    @JSImport("@ionic/utils-fs", "promises.opendir")
    @js.native
    def opendir(path: String): js.Promise[typings.node.fsMod.Dir] = js.native
    @JSImport("@ionic/utils-fs", "promises.opendir")
    @js.native
    def opendir(path: String, options: OpenDirOptions): js.Promise[typings.node.fsMod.Dir] = js.native
    
    /**
      * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If
      * `null`, data will be read from the current position.
      */
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Null,
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Null,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike): js.Promise[Buffer] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: EncodingFlag): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: Flag): js.Promise[Buffer] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle): js.Promise[Buffer] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: EncodingFlag): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: Flag): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
    @JSImport("@ionic/utils-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
    @JSImport("@ionic/utils-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
      */
    @JSImport("@ionic/utils-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[typings.node.fsMod.Dirent]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: typings.node.anon.Encoding): js.Promise[js.Array[Buffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.readdir")
    @js.native
    def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
    
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    @JSImport("@ionic/utils-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("@ionic/utils-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous rename(2) - Change the name or location of a file or directory.
      * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    @JSImport("@ionic/utils-fs", "promises.rename")
    @js.native
    def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously removes files and directories (modeled on the standard POSIX `rm` utility).
      */
    @JSImport("@ionic/utils-fs", "promises.rm")
    @js.native
    def rm(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.rm")
    @js.native
    def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("@ionic/utils-fs", "promises.rmdir")
    @js.native
    def rmdir(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.rmdir")
    @js.native
    def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("@ionic/utils-fs", "promises.stat")
    @js.native
    def stat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
    
    /**
      * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
      * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
      * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
      * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
      * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
      */
    @JSImport("@ionic/utils-fs", "promises.symlink")
    @js.native
    def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.symlink")
    @js.native
    def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous truncate(2) - Truncate a file to a specified length.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param len If not specified, defaults to `0`.
      */
    @JSImport("@ionic/utils-fs", "promises.truncate")
    @js.native
    def truncate(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.truncate")
    @js.native
    def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("@ionic/utils-fs", "promises.unlink")
    @js.native
    def unlink(path: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied path.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param string A string to write.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String): js.Promise[BufferBytesWritten] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: Double): js.Promise[BufferBytesWritten] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    /**
      * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Null,
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Null,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("@ionic/utils-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.
      * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("@ionic/utils-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  }
  
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[BufferDataView] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[BufferBytesRead] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferBytesRead] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[typings.fsExtra.anon.Buffer] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typings.fsExtra.anon.Buffer] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[BytesRead] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[BytesRead] = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: Double): js.Promise[Buffer] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: Double, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: Double, encoding: String): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(
    file: Double,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: Double, options: typings.fsExtra.anon.EncodingFlag): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(
    file: Double,
    options: typings.fsExtra.anon.EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: Double, options: typings.fsExtra.anon.Flag): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(
    file: Double,
    options: typings.fsExtra.anon.Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: PathLike): js.Promise[Buffer] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: PathLike, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: PathLike, encoding: String): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(
    file: PathLike,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: PathLike, options: typings.fsExtra.anon.EncodingFlag): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(
    file: PathLike,
    options: typings.fsExtra.anon.EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(file: PathLike, options: typings.fsExtra.anon.Flag): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  def readFile(
    file: PathLike,
    options: typings.fsExtra.anon.Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: BufferEncoding): String = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: `3`): Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: `3`): Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync_Buffer(path: Double): Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync_Buffer(path: PathLike): Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "readFileSync")
  @js.native
  def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
  
  @JSImport("@ionic/utils-fs", "readJSONSync")
  @js.native
  def readJSONSync_(file: String): js.Any = js.native
  @JSImport("@ionic/utils-fs", "readJSONSync")
  @js.native
  def readJSONSync_(file: String, options: ReadOptions): js.Any = js.native
  
  @JSImport("@ionic/utils-fs", "readJSON")
  @js.native
  def readJSON_(file: String): js.Promise[_] = js.native
  @JSImport("@ionic/utils-fs", "readJSON")
  @js.native
  def readJSON_(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "readJSON")
  @js.native
  def readJSON_(file: String, options: ReadOptions): js.Promise[_] = js.native
  @JSImport("@ionic/utils-fs", "readJSON")
  @js.native
  def readJSON_(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "readJson")
  @js.native
  def readJson(file: String): js.Promise[_] = js.native
  @JSImport("@ionic/utils-fs", "readJson")
  @js.native
  def readJson(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "readJson")
  @js.native
  def readJson(file: String, options: ReadOptions): js.Promise[_] = js.native
  @JSImport("@ionic/utils-fs", "readJson")
  @js.native
  def readJson(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "readJsonSync")
  @js.native
  def readJsonSync(file: String): js.Any = js.native
  @JSImport("@ionic/utils-fs", "readJsonSync")
  @js.native
  def readJsonSync(file: String, options: ReadOptions): js.Any = js.native
  
  @JSImport("@ionic/utils-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  @JSImport("@ionic/utils-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
  
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: `0`): js.Promise[js.Array[Buffer | String]] = js.native
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: `1`): js.Promise[js.Array[typings.node.fsMod.Dirent]] = js.native
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  
  @JSImport("@ionic/utils-fs", "readdirSafe")
  @js.native
  def readdirSafe(dir: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("@ionic/utils-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike): js.Array[String] = js.native
  @JSImport("@ionic/utils-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSImport("@ionic/utils-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  @JSImport("@ionic/utils-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[typings.node.fsMod.Dirent] = js.native
  @JSImport("@ionic/utils-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: typings.node.anon.Encoding): js.Array[Buffer] = js.native
  @JSImport("@ionic/utils-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: typings.node.anon.WithFileTypes): js.Array[String] = js.native
  @JSImport("@ionic/utils-fs", "readdirSync")
  @js.native
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  
  @JSImport("@ionic/utils-fs", "readdirp")
  @js.native
  def readdirp(dir: String): js.Promise[js.Array[String]] = js.native
  @JSImport("@ionic/utils-fs", "readdirp")
  @js.native
  def readdirp(dir: String, hasFilterOnErrorWalkerOptions: ReaddirPOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("@ionic/utils-fs", "readlink")
  @js.native
  def readlink(path: PathLike): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "readlink")
  @js.native
  def readlink(path: PathLike, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike): String = js.native
  @JSImport("@ionic/utils-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  @JSImport("@ionic/utils-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BaseEncodingOptions): String = js.native
  @JSImport("@ionic/utils-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  @JSImport("@ionic/utils-fs", "readlinkSync")
  @js.native
  def readlinkSync_Union(path: PathLike): String | Buffer = js.native
  @JSImport("@ionic/utils-fs", "readlinkSync")
  @js.native
  def readlinkSync_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  
  @JSImport("@ionic/utils-fs", "readv")
  @js.native
  def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "readv")
  @js.native
  def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "readvSync")
  @js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  @JSImport("@ionic/utils-fs", "readvSync")
  @js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  
  @JSImport("@ionic/utils-fs", "realpath")
  @js.native
  def realpath(path: PathLike): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "realpath")
  @js.native
  def realpath(path: PathLike, cache: StringDictionary[String]): js.Promise[String] = js.native
  @JSImport("@ionic/utils-fs", "realpath")
  @js.native
  def realpath(
    path: PathLike,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "realpath")
  @js.native
  def realpath(path: PathLike, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
  
  object realpathSync {
    
    @JSImport("@ionic/utils-fs", "realpathSync")
    @js.native
    def apply(path: PathLike): String = js.native
    @JSImport("@ionic/utils-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: String): String | Buffer = js.native
    @JSImport("@ionic/utils-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    @JSImport("@ionic/utils-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
    @JSImport("@ionic/utils-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    
    @JSImport("@ionic/utils-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike): String = js.native
    @JSImport("@ionic/utils-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: String): String | Buffer = js.native
    @JSImport("@ionic/utils-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BufferEncoding): String = js.native
    @JSImport("@ionic/utils-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BaseEncodingOptions): String = js.native
    @JSImport("@ionic/utils-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    @JSImport("@ionic/utils-fs", "realpathSync.native")
    @js.native
    def native_Union(path: PathLike): String | Buffer = js.native
    @JSImport("@ionic/utils-fs", "realpathSync.native")
    @js.native
    def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  }
  
  @JSImport("@ionic/utils-fs", "remove")
  @js.native
  def remove(dir: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "remove")
  @js.native
  def remove(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "removeSync")
  @js.native
  def removeSync(dir: String): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "rename")
  @js.native
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "rename")
  @js.native
  def rename(oldPath: PathLike, newPath: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "renameSync")
  @js.native
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "rm")
  @js.native
  def rm(path: PathLike, callback: NoParamCallback): Unit = js.native
  @JSImport("@ionic/utils-fs", "rm")
  @js.native
  def rm(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "rmSync")
  @js.native
  def rmSync(path: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "rmSync")
  @js.native
  def rmSync(path: PathLike, options: RmOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "rmdir")
  @js.native
  def rmdir(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "rmdir")
  @js.native
  def rmdir(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "rmdirSync")
  @js.native
  def rmdirSync(path: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "rmdirSync")
  @js.native
  def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "stat")
  @js.native
  def stat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
  @JSImport("@ionic/utils-fs", "stat")
  @js.native
  def stat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, _]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "statSafe")
  @js.native
  def statSafe(p: String): js.Promise[js.UndefOr[typings.fsExtra.mod.Stats]] = js.native
  
  @JSImport("@ionic/utils-fs", "statSync")
  @js.native
  def statSync(path: PathLike): typings.node.fsMod.Stats = js.native
  @JSImport("@ionic/utils-fs", "statSync")
  @js.native
  def statSync(path: PathLike, options: BigIntOptions): typings.node.fsMod.BigIntStats = js.native
  @JSImport("@ionic/utils-fs", "statSync")
  @js.native
  def statSync(path: PathLike, options: StatOptions): typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats = js.native
  
  @JSImport("@ionic/utils-fs", "symlink")
  @js.native
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "symlink")
  @js.native
  def symlink(target: PathLike, path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "symlink")
  @js.native
  def symlink(
    target: PathLike,
    path: PathLike,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "symlink")
  @js.native
  def symlink(target: PathLike, path: PathLike, `type`: SymlinkType): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "symlink")
  @js.native
  def symlink(
    target: PathLike,
    path: PathLike,
    `type`: SymlinkType,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "symlinkSync")
  @js.native
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "symlinkSync")
  @js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "tmpfilepath")
  @js.native
  def tmpfilepath(): String = js.native
  @JSImport("@ionic/utils-fs", "tmpfilepath")
  @js.native
  def tmpfilepath(prefix: String): String = js.native
  
  @JSImport("@ionic/utils-fs", "truncate")
  @js.native
  def truncate(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "truncate")
  @js.native
  def truncate(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "truncate")
  @js.native
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "truncate")
  @js.native
  def truncate(path: PathLike, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "truncateSync")
  @js.native
  def truncateSync(path: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "truncateSync")
  @js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "unlink")
  @js.native
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "unlink")
  @js.native
  def unlink(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "unlinkSync")
  @js.native
  def unlinkSync(path: PathLike): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "unwatchFile")
  @js.native
  def unwatchFile(filename: PathLike): Unit = js.native
  @JSImport("@ionic/utils-fs", "unwatchFile")
  @js.native
  def unwatchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "utimes")
  @js.native
  def utimes(
    path: PathLike,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Date, mtime: Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  @JSImport("@ionic/utils-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "walk")
  @js.native
  def walk(p: String): Walker = js.native
  @JSImport("@ionic/utils-fs", "walk")
  @js.native
  def walk(p: String, options: WalkerOptions): Walker = js.native
  
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(filename: PathLike): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: String): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: Persistent): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: Persistent,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: Recursive): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: Recursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  @JSImport("@ionic/utils-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
  @JSImport("@ionic/utils-fs", "watch")
  @js.native
  def watch_buffer(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: DataView): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: DataView, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: DataView, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: DataView, offset: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: DataView, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float32Array): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float32Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float32Array, offset: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float64Array): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float64Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float64Array, offset: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int16Array): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int16Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int16Array, offset: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int32Array): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int32Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int32Array, offset: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int8Array): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int8Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int8Array, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int8Array, offset: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int8Array, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint16Array): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint16Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint16Array, offset: Double): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint16Array] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint32Array): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint32Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint32Array, offset: Double): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BytesWrittenNumber] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8Array): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8Array, offset: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typings.fsExtra.anon.BytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8ClampedArray): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8ClampedArray, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8ClampedArray, offset: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[typings.fsExtra.anon.BufferBytesWritten] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, data: js.Any): js.Promise[BufferString] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    data: js.Any,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, data: js.Any, offset: js.UndefOr[scala.Nothing], encoding: String): js.Promise[BufferString] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, data: js.Any, offset: Double): js.Promise[BufferString] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    data: js.Any,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(fd: Double, data: js.Any, offset: Double, encoding: String): js.Promise[BufferString] = js.native
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  def write(
    fd: Double,
    data: js.Any,
    offset: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: Double, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: Double, data: js.Any, options: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(
    file: Double,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: Double, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(
    file: Double,
    data: js.Any,
    options: typings.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: PathLike, data: js.Any, options: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(
    file: PathLike,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(file: PathLike, data: js.Any, options: typings.fsExtra.mod.WriteFileOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  def writeFile(
    file: PathLike,
    data: js.Any,
    options: typings.fsExtra.mod.WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: ArrayBufferView): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: String): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writeJSONSync")
  @js.native
  def writeJSONSync_(file: String, `object`: js.Any): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeJSONSync")
  @js.native
  def writeJSONSync_(file: String, `object`: js.Any, options: WriteOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writeJSON")
  @js.native
  def writeJSON_(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeJSON")
  @js.native
  def writeJSON_(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeJSON")
  @js.native
  def writeJSON_(file: String, `object`: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeJSON")
  @js.native
  def writeJSON_(
    file: String,
    `object`: js.Any,
    options: WriteOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writeJson")
  @js.native
  def writeJson(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeJson")
  @js.native
  def writeJson(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeJson")
  @js.native
  def writeJson(file: String, `object`: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-fs", "writeJson")
  @js.native
  def writeJson(
    file: String,
    `object`: js.Any,
    options: WriteOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writeJsonSync")
  @js.native
  def writeJsonSync(file: String, `object`: js.Any): Unit = js.native
  @JSImport("@ionic/utils-fs", "writeJsonSync")
  @js.native
  def writeJsonSync(file: String, `object`: js.Any, options: WriteOptions): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writeStreamToFile")
  @js.native
  def writeStreamToFile(stream: ReadableStream, destination: String): js.Promise[_] = js.native
  
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    position: Double
  ): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Double): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
  @JSImport("@ionic/utils-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
  
  @JSImport("@ionic/utils-fs", "writev")
  @js.native
  def writev(fd: Double, buffers: js.Array[ArrayBufferView]): js.Promise[WritevResult] = js.native
  @JSImport("@ionic/utils-fs", "writev")
  @js.native
  def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  @JSImport("@ionic/utils-fs", "writev")
  @js.native
  def writev(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WritevResult] = js.native
  @JSImport("@ionic/utils-fs", "writev")
  @js.native
  def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("@ionic/utils-fs", "writevSync")
  @js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  @JSImport("@ionic/utils-fs", "writevSync")
  @js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  
  @js.native
  trait DirectoryNode extends FileNode {
    
    var children: js.Array[FileNode] = js.native
    
    var parent: js.UndefOr[FileNode] = js.native
    
    var path: String = js.native
    
    var `type`: directory = js.native
  }
  object DirectoryNode {
    
    @scala.inline
    def apply(children: js.Array[FileNode], path: String, `type`: directory): DirectoryNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryNode]
    }
    
    @scala.inline
    implicit class DirectoryNodeMutableBuilder[Self <: DirectoryNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[FileNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: FileNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setParent(value: FileNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: directory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicUtilsFs.mod.RegularFileNode
    - typings.ionicUtilsFs.mod.DirectoryNode
  */
  trait FileNode extends StObject
  object FileNode {
    
    @scala.inline
    def DirectoryNode(children: js.Array[FileNode], path: String, `type`: directory): typings.ionicUtilsFs.mod.DirectoryNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionicUtilsFs.mod.DirectoryNode]
    }
    
    @scala.inline
    def RegularFileNode(parent: FileNode, path: String, `type`: file): typings.ionicUtilsFs.mod.RegularFileNode = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionicUtilsFs.mod.RegularFileNode]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicUtilsFs.ionicUtilsFsStrings.file
    - typings.ionicUtilsFs.ionicUtilsFsStrings.directory
  */
  trait FileType extends StObject
  object FileType {
    
    @scala.inline
    def DIRECTORY: directory = "directory".asInstanceOf[directory]
    
    @scala.inline
    def FILE: file = "file".asInstanceOf[file]
  }
  
  @js.native
  trait GetFileTreeOptions[RE, DE] extends StObject {
    
    /**
      * Called whenever a directory node is added to the tree.
      *
      * Directory nodes can be supplemented by returning a new object from this
      * function.
      */
    val onDirectoryNode: js.UndefOr[js.Function1[/* node */ DirectoryNode, DirectoryNode with DE]] = js.native
    
    /**
      * Called whenever an error occurs during the walk process.
      *
      * If excluded, the function will throw an error when first encountered.
      */
    val onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
    
    /**
      * Called whenever a file node is added to the tree.
      *
      * File nodes can be supplemented by returning a new object from this
      * function.
      */
    val onFileNode: js.UndefOr[js.Function1[/* node */ RegularFileNode, RegularFileNode with RE]] = js.native
    
    val walkerOptions: js.UndefOr[WalkerOptions] = js.native
  }
  object GetFileTreeOptions {
    
    @scala.inline
    def apply[RE, DE](): GetFileTreeOptions[RE, DE] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFileTreeOptions[RE, DE]]
    }
    
    @scala.inline
    implicit class GetFileTreeOptionsMutableBuilder[Self <: GetFileTreeOptions[_, _], RE, DE] (val x: Self with (GetFileTreeOptions[RE, DE])) extends AnyVal {
      
      @scala.inline
      def setOnDirectoryNode(value: /* node */ DirectoryNode => DirectoryNode with DE): Self = StObject.set(x, "onDirectoryNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDirectoryNodeUndefined: Self = StObject.set(x, "onDirectoryNode", js.undefined)
      
      @scala.inline
      def setOnError(value: /* err */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFileNode(value: /* node */ RegularFileNode => RegularFileNode with RE): Self = StObject.set(x, "onFileNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFileNodeUndefined: Self = StObject.set(x, "onFileNode", js.undefined)
      
      @scala.inline
      def setWalkerOptions(value: WalkerOptions): Self = StObject.set(x, "walkerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalkerOptionsUndefined: Self = StObject.set(x, "walkerOptions", js.undefined)
    }
  }
  
  @js.native
  trait ReaddirPOptions extends StObject {
    
    /**
      * Filter out items from the walk process from the final result.
      *
      * @return `true` to keep, otherwise the item is filtered out
      */
    val filter: js.UndefOr[js.Function1[/* item */ WalkerItem, Boolean]] = js.native
    
    /**
      * Called whenever an error occurs during the walk process.
      *
      * If excluded, the function will throw an error when first encountered.
      */
    val onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
    
    val walkerOptions: js.UndefOr[WalkerOptions] = js.native
  }
  object ReaddirPOptions {
    
    @scala.inline
    def apply(): ReaddirPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaddirPOptions]
    }
    
    @scala.inline
    implicit class ReaddirPOptionsMutableBuilder[Self <: ReaddirPOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: /* item */ WalkerItem => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setOnError(value: /* err */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setWalkerOptions(value: WalkerOptions): Self = StObject.set(x, "walkerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalkerOptionsUndefined: Self = StObject.set(x, "walkerOptions", js.undefined)
    }
  }
  
  @js.native
  trait RegularFileNode extends FileNode {
    
    var parent: FileNode = js.native
    
    var path: String = js.native
    
    var `type`: file = js.native
  }
  object RegularFileNode {
    
    @scala.inline
    def apply(parent: FileNode, path: String, `type`: file): RegularFileNode = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegularFileNode]
    }
    
    @scala.inline
    implicit class RegularFileNodeMutableBuilder[Self <: RegularFileNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: FileNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WalkerItem extends StObject {
    
    var path: String = js.native
    
    var stats: typings.fsExtra.mod.Stats = js.native
  }
  object WalkerItem {
    
    @scala.inline
    def apply(path: String, stats: typings.fsExtra.mod.Stats): WalkerItem = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkerItem]
    }
    
    @scala.inline
    implicit class WalkerItemMutableBuilder[Self <: WalkerItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: typings.fsExtra.mod.Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WalkerOptions extends StObject {
    
    /**
      * Filter out file paths during walk.
      *
      * As the file tree is walked, this function can be used to exclude files and
      * directories from the final result.
      *
      * It can also be used to tune performance. If a subdirectory is excluded, it
      * is not walked.
      *
      * @param p The file path.
      * @return `true` to include file path, otherwise it is excluded
      */
    val pathFilter: js.UndefOr[js.Function1[/* p */ String, Boolean]] = js.native
  }
  object WalkerOptions {
    
    @scala.inline
    def apply(): WalkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkerOptions]
    }
    
    @scala.inline
    implicit class WalkerOptionsMutableBuilder[Self <: WalkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPathFilter(value: /* p */ String => Boolean): Self = StObject.set(x, "pathFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
    }
  }
}
