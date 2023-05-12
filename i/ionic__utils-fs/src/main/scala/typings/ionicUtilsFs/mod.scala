package typings.ionicUtilsFs

import typings.fsExtra.anon.Native
import typings.fsExtra.anon.Typeofaccess
import typings.fsExtra.anon.TypeofappendFile
import typings.fsExtra.anon.Typeofchmod
import typings.fsExtra.anon.Typeofchown
import typings.fsExtra.anon.Typeofclose
import typings.fsExtra.anon.TypeofcopyFile
import typings.fsExtra.anon.Typeofexists
import typings.fsExtra.anon.Typeoffchmod
import typings.fsExtra.anon.Typeoffchown
import typings.fsExtra.anon.Typeoffdatasync
import typings.fsExtra.anon.Typeoffstat
import typings.fsExtra.anon.Typeoffsync
import typings.fsExtra.anon.Typeofftruncate
import typings.fsExtra.anon.Typeoffutimes
import typings.fsExtra.anon.Typeoflchmod
import typings.fsExtra.anon.Typeoflchown
import typings.fsExtra.anon.Typeoflink
import typings.fsExtra.anon.Typeoflstat
import typings.fsExtra.anon.Typeofmkdir
import typings.fsExtra.anon.Typeofmkdtemp
import typings.fsExtra.anon.Typeofopen
import typings.fsExtra.anon.Typeofopendir
import typings.fsExtra.anon.Typeofread
import typings.fsExtra.anon.TypeofreadFile
import typings.fsExtra.anon.Typeofreaddir
import typings.fsExtra.anon.Typeofreadlink
import typings.fsExtra.anon.Typeofreadv
import typings.fsExtra.anon.Typeofrealpath
import typings.fsExtra.anon.Typeofrename
import typings.fsExtra.anon.Typeofrm
import typings.fsExtra.anon.Typeofrmdir
import typings.fsExtra.anon.Typeofstat
import typings.fsExtra.anon.Typeofsymlink
import typings.fsExtra.anon.Typeoftruncate
import typings.fsExtra.anon.Typeofunlink
import typings.fsExtra.anon.Typeofutimes
import typings.fsExtra.anon.Typeofwrite
import typings.fsExtra.anon.TypeofwriteFile
import typings.fsExtra.anon.Typeofwritev
import typings.fsExtra.mod.CopyOptions
import typings.fsExtra.mod.CopyOptionsSync
import typings.fsExtra.mod.EnsureDirOptions
import typings.fsExtra.mod.JsonOutputOptions
import typings.fsExtra.mod.MoveOptions
import typings.fsExtra.mod.NoParamCallbackWithUndefined
import typings.fsExtra.mod.SymlinkType
import typings.ionicUtilsFs.ionicUtilsFsStrings.buffer
import typings.ionicUtilsFs.ionicUtilsFsStrings.data
import typings.ionicUtilsFs.ionicUtilsFsStrings.directory
import typings.ionicUtilsFs.ionicUtilsFsStrings.file
import typings.jsonfile.mod.JFReadOptions
import typings.jsonfile.mod.JFWriteOptions
import typings.jsonfile.mod.Path
import typings.jsonfile.mod.ReadCallback
import typings.jsonfile.mod.WriteCallback
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import typings.node.anon.Encoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsAbor
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.ObjectEncodingOptionsmode
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.Recursive
import typings.node.anon.StatFsOptionsbigintfalseu
import typings.node.anon.StatFsOptionsbiginttrue
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.WatchFileOptionsbigintfal
import typings.node.anon.WatchFileOptionsbiginttru
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.encodingBufferEncodingfla
import typings.node.anon.encodingnullundefinedflag
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.BigIntStatsFs
import typings.node.fsMod.BigIntStatsListener
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.CopySyncOptions
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.ObjectEncodingOptions
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.ReadPosition
import typings.node.fsMod.ReadStreamOptions
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatFsOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.StatWatcher
import typings.node.fsMod.StatsListener
import typings.node.fsMod.StreamOptions
import typings.node.fsMod.TimeLike
import typings.node.fsMod.WatchListener
import typings.node.fsMod.WatchOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.node.fsPromisesMod.FileChangeInfo
import typings.node.fsPromisesMod.FileHandle
import typings.node.fsPromisesMod.FlagAndOpenMode
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeColonurlMod.URL
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-fs", "Dir")
  @js.native
  open class Dir ()
    extends typings.fsExtra.mod.Dir
  
  @JSImport("@ionic/utils-fs", "Dirent")
  @js.native
  open class Dirent ()
    extends typings.fsExtra.mod.Dirent
  
  @JSImport("@ionic/utils-fs", "ReadStream")
  @js.native
  open class ReadStream ()
    extends typings.fsExtra.mod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("@ionic/utils-fs", "Stats")
  @js.native
  open class Stats ()
    extends typings.fsExtra.mod.Stats
  
  @JSImport("@ionic/utils-fs", "StatsFs")
  @js.native
  open class StatsFs ()
    extends typings.fsExtra.mod.StatsFs
  
  @JSImport("@ionic/utils-fs", "Walker")
  @js.native
  open class Walker protected () extends Readable {
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
  open class WriteStream ()
    extends typings.fsExtra.mod.WriteStream {
    def this(opts: WritableOptions) = this()
  }
  
  @JSImport("@ionic/utils-fs", "access")
  @js.native
  val access: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.access.__promisify__ */ Any) & Typeofaccess = js.native
  
  inline def accessSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def accessSync(path: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "appendFile")
  @js.native
  val appendFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.appendFile.__promisify__ */ Any) & TypeofappendFile = js.native
  
  inline def appendFileSync(path: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(path: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cacheFileChecksum(p: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheFileChecksum")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def cacheFileChecksum(p: String, checksum: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheFileChecksum")(p.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@ionic/utils-fs", "chmod")
  @js.native
  val chmod: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any) & Typeofchmod = js.native
  
  inline def chmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "chown")
  @js.native
  val chown: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any) & Typeofchown = js.native
  
  inline def chownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "close")
  @js.native
  val close: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any) & Typeofclose = js.native
  
  inline def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def compilePaths(filePath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compilePaths")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
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
  
  inline def copy(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copy(src: String, dest: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(src: String, dest: String, options: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copy(src: String, dest: String, options: CopyOptions, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "copyFile")
  @js.native
  val copyFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.copyFile.__promisify__ */ Any) & TypeofcopyFile = js.native
  
  inline def copyFileSync(src: PathLike, dest: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyFileSync(src: PathLike, dest: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copySync(src: String, dest: String, options: CopyOptionsSync): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cp(source: String, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cp(
    source: String,
    destination: String,
    opts: typings.node.fsMod.CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cp(source: String, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cp(
    source: String,
    destination: URL,
    opts: typings.node.fsMod.CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cp(source: URL, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cp(
    source: URL,
    destination: String,
    opts: typings.node.fsMod.CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cp(source: URL, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cp(
    source: URL,
    destination: URL,
    opts: typings.node.fsMod.CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cpSync(source: String, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cpSync(source: String, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cpSync(source: String, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cpSync(source: String, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cpSync(source: URL, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cpSync(source: URL, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cpSync(source: URL, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cpSync(source: URL, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFile(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def createFile(file: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "createFileSync")
  @js.native
  val createFileSync: js.Function1[/* file */ String, Unit] = js.native
  
  inline def createLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def createLink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "createLinkSync")
  @js.native
  val createLinkSync: js.Function2[/* src */ String, /* dest */ String, Unit] = js.native
  
  inline def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.ReadStream]
  inline def createReadStream(path: PathLike, options: BufferEncoding): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  inline def createReadStream(path: PathLike, options: ReadStreamOptions): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  
  inline def createSymlink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def createSymlink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createSymlink(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def createSymlink(src: String, dest: String, `type`: SymlinkType, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "createSymlinkSync")
  @js.native
  val createSymlinkSync: js.Function3[/* src */ String, /* dest */ String, /* type */ js.UndefOr[SymlinkType], Unit] = js.native
  
  inline def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.WriteStream]
  inline def createWriteStream(path: PathLike, options: BufferEncoding): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  inline def createWriteStream(path: PathLike, options: StreamOptions): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  
  inline def emptyDirSync_(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def emptyDir_(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def emptyDir_(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def emptydir(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def emptydir(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "emptydirSync")
  @js.native
  val emptydirSync: js.Function1[/* path */ String, Unit] = js.native
  
  inline def ensureDir(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ensureDir(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDir(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureDir(path: String, options: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDir(path: String, options: EnsureDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureDir(path: String, options: EnsureDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureDirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ensureDirSync(path: String, options: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureDirSync(path: String, options: EnsureDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureFile(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ensureFile(file: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureFileSync(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ensureLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureLink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureLinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureSymlink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureSymlink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureSymlinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "exists")
  @js.native
  val exists: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.exists.__promisify__ */ Any) & Typeofexists = js.native
  
  inline def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@ionic/utils-fs", "fchmod")
  @js.native
  val fchmod: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fchmod.__promisify__ */ Any) & Typeoffchmod = js.native
  
  inline def fchmodSync(fd: Double, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "fchown")
  @js.native
  val fchown: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fchown.__promisify__ */ Any) & Typeoffchown = js.native
  
  inline def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "fdatasync")
  @js.native
  val fdatasync: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fdatasync.__promisify__ */ Any) & Typeoffdatasync = js.native
  
  inline def fdatasyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fileToString(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileToString")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def findBaseDirectory(dir: String, file: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findBaseDirectory")(dir.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @JSImport("@ionic/utils-fs", "fstat")
  @js.native
  val fstat: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fstat.__promisify__ */ Any) & Typeoffstat = js.native
  
  inline def fstatSync(fd: Double): typings.node.fsMod.Stats | BigIntStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats | BigIntStats]
  inline def fstatSync(fd: Double, options: StatOptionsbigintfalseund): typings.node.fsMod.Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Stats]
  inline def fstatSync(fd: Double, options: StatOptionsbiginttrue): BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStats]
  inline def fstatSync(fd: Double, options: StatOptions): typings.node.fsMod.Stats | BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Stats | BigIntStats]
  
  inline def fstatSync_Stats(fd: Double): typings.node.fsMod.Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
  
  @JSImport("@ionic/utils-fs", "fsync")
  @js.native
  val fsync: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any) & Typeoffsync = js.native
  
  inline def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "ftruncate")
  @js.native
  val ftruncate: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.ftruncate.__promisify__ */ Any) & Typeofftruncate = js.native
  
  inline def ftruncateSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ftruncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "futimes")
  @js.native
  val futimes: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.futimes.__promisify__ */ Any) & Typeoffutimes = js.native
  
  inline def futimesSync(fd: Double, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFileChecksum(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileChecksum")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getFileChecksums(p: String): js.Promise[js.Tuple2[String, js.UndefOr[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileChecksums")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[String, js.UndefOr[String]]]]
  
  inline def getFileTree[RE, DE](dir: String): js.Promise[(RegularFileNode & RE) | (DirectoryNode & DE)] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileTree")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[(RegularFileNode & RE) | (DirectoryNode & DE)]]
  inline def getFileTree[RE, DE](dir: String, param1: GetFileTreeOptions[RE, DE]): js.Promise[(RegularFileNode & RE) | (DirectoryNode & DE)] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileTree")(dir.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[(RegularFileNode & RE) | (DirectoryNode & DE)]]
  
  inline def isExecutableFile(filePath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecutableFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@ionic/utils-fs", "lchmod")
  @js.native
  val lchmod: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchmod.__promisify__ */ Any) & Typeoflchmod = js.native
  
  inline def lchmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "lchown")
  @js.native
  val lchown: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchown.__promisify__ */ Any) & Typeoflchown = js.native
  
  inline def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "link")
  @js.native
  val link: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.link.__promisify__ */ Any) & Typeoflink = js.native
  
  inline def linkSync(existingPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "lstat")
  @js.native
  val lstat: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lstat.__promisify__ */ Any) & Typeoflstat = js.native
  
  @JSImport("@ionic/utils-fs", "lstatSync")
  @js.native
  val lstatSync: StatSyncFn = js.native
  
  inline def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lutimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "mkdir")
  @js.native
  val mkdir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any) & Typeofmkdir = js.native
  
  inline def mkdirSync(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def mkdirSync_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdirSync_Unit(path: PathLike, options: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirp(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mkdirp(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirp(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def mkdirp(path: String, options: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirp(path: String, options: EnsureDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def mkdirp(path: String, options: EnsureDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "mkdirpSync")
  @js.native
  val mkdirpSync: js.Function2[/* path */ String, /* options */ js.UndefOr[EnsureDirOptions | Double], Unit] = js.native
  
  inline def mkdirs(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mkdirs(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirs(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def mkdirs(path: String, options: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirs(path: String, options: EnsureDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def mkdirs(path: String, options: EnsureDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "mkdirsSync")
  @js.native
  val mkdirsSync: js.Function2[/* path */ String, /* options */ js.UndefOr[EnsureDirOptions | Double], Unit] = js.native
  
  @JSImport("@ionic/utils-fs", "mkdtemp")
  @js.native
  val mkdtemp: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdtemp.__promisify__ */ Any) & Typeofmkdtemp = js.native
  
  inline def mkdtempSync(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def mkdtempSync(prefix: String, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mkdtempSync_Union(prefix: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def mkdtempSync_Union(prefix: String, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def move(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def move(src: String, dest: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def move(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def move(src: String, dest: String, options: MoveOptions, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def moveSync(src: String, dest: String, options: MoveOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "open")
  @js.native
  val open: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ Any) & Typeofopen = js.native
  
  inline def openSync(path: PathLike, flags: OpenMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@ionic/utils-fs", "opendir")
  @js.native
  val opendir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.opendir.__promisify__ */ Any) & Typeofopendir = js.native
  
  inline def opendirSync(path: PathLike): typings.node.fsMod.Dir = ^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Dir]
  inline def opendirSync(path: PathLike, options: OpenDirOptions): typings.node.fsMod.Dir = (^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Dir]
  
  inline def outputFile(file: String, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputFile(file: String, data: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFile(file: String, data: String, options: WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputFile(file: String, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFile(file: String, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputFile(file: String, data: ArrayBufferView, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFile(file: String, data: ArrayBufferView, options: WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputFile(file: String, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputFileSync(file: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFileSync(file: String, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFileSync(file: String, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFileSync(file: String, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "outputJSONSync")
  @js.native
  val outputJSONSync_ : js.Function3[/* file */ String, /* data */ Any, /* options */ js.UndefOr[JsonOutputOptions], Unit] = js.native
  
  inline def outputJSON_(file: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJSON_(file: String, data: Any, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJSON_(file: String, data: Any, options: JsonOutputOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJSON_(file: String, data: Any, options: JsonOutputOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJson(file: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJson(file: String, data: Any, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJson(file: String, data: Any, options: JsonOutputOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def outputJson(file: String, data: Any, options: JsonOutputOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJsonSync(file: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJsonSync(file: String, data: Any, options: JsonOutputOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pathAccessible(filePath: String, mode: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathAccessible")(filePath.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def pathExecutable(filePath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExecutable")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def pathExists(filePath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def pathExistsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pathReadable(filePath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathReadable")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def pathWritable(filePath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathWritable")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  object promises {
    
    @JSImport("@ionic/utils-fs", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Tests a user's permissions for the file or directory specified by `path`.
      * The `mode` argument is an optional integer that specifies the accessibility
      * checks to be performed. `mode` should be either the value `fs.constants.F_OK`or a mask consisting of the bitwise OR of any of `fs.constants.R_OK`,`fs.constants.W_OK`, and `fs.constants.X_OK`
      * (e.g.`fs.constants.W_OK | fs.constants.R_OK`). Check `File access constants` for
      * possible values of `mode`.
      *
      * If the accessibility check is successful, the promise is resolved with no
      * value. If any of the accessibility checks fail, the promise is rejected
      * with an [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object. The following example checks if the file`/etc/passwd` can be read and
      * written by the current process.
      *
      * ```js
      * import { access, constants } from 'node:fs/promises';
      *
      * try {
      *   await access('/etc/passwd', constants.R_OK | constants.W_OK);
      *   console.log('can access');
      * } catch {
      *   console.error('cannot access');
      * }
      * ```
      *
      * Using `fsPromises.access()` to check for the accessibility of a file before
      * calling `fsPromises.open()` is not recommended. Doing so introduces a race
      * condition, since other processes may change the file's state between the two
      * calls. Instead, user code should open/read/write the file directly and handle
      * the error raised if the file is not accessible.
      * @since v10.0.0
      * @param [mode=fs.constants.F_OK]
      * @return Fulfills with `undefined` upon success.
      */
    inline def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously append data to a file, creating the file if it does not yet
      * exist. `data` can be a string or a `Buffer`.
      *
      * If `options` is a string, then it specifies the `encoding`.
      *
      * The `mode` option only affects the newly created file. See `fs.open()` for more details.
      *
      * The `path` may be specified as a `FileHandle` that has been opened
      * for appending (using `fsPromises.open()`).
      * @since v10.0.0
      * @param path filename or {FileHandle}
      * @return Fulfills with `undefined` upon success.
      */
    inline def appendFile(path: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Changes the permissions of a file.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Changes the ownership of a file.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /* was `typeof fsConstants` */
    object constants {
      
      // File Copy Constants
      /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
      @JSImport("@ionic/utils-fs", "promises.constants.COPYFILE_EXCL")
      @js.native
      val COPYFILE_EXCL: Double = js.native
      
      /**
        * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
        * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
        */
      @JSImport("@ionic/utils-fs", "promises.constants.COPYFILE_FICLONE")
      @js.native
      val COPYFILE_FICLONE: Double = js.native
      
      /**
        * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
        * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
        */
      @JSImport("@ionic/utils-fs", "promises.constants.COPYFILE_FICLONE_FORCE")
      @js.native
      val COPYFILE_FICLONE_FORCE: Double = js.native
      
      // File Access Constants
      /** Constant for fs.access(). File is visible to the calling process. */
      @JSImport("@ionic/utils-fs", "promises.constants.F_OK")
      @js.native
      val F_OK: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_APPEND")
      @js.native
      val O_APPEND: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_CREAT")
      @js.native
      val O_CREAT: Double = js.native
      
      /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_DIRECT")
      @js.native
      val O_DIRECT: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_DIRECTORY")
      @js.native
      val O_DIRECTORY: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_DSYNC")
      @js.native
      val O_DSYNC: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_EXCL")
      @js.native
      val O_EXCL: Double = js.native
      
      /**
        * constant for fs.open().
        * Flag indicating reading accesses to the file system will no longer result in
        * an update to the atime information associated with the file.
        * This flag is available on Linux operating systems only.
        */
      @JSImport("@ionic/utils-fs", "promises.constants.O_NOATIME")
      @js.native
      val O_NOATIME: Double = js.native
      
      /**
        * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
        * opening the path shall not cause that terminal to become the controlling terminal for the process
        * (if the process does not already have one).
        */
      @JSImport("@ionic/utils-fs", "promises.constants.O_NOCTTY")
      @js.native
      val O_NOCTTY: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_NOFOLLOW")
      @js.native
      val O_NOFOLLOW: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_NONBLOCK")
      @js.native
      val O_NONBLOCK: Double = js.native
      
      // File Open Constants
      /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_RDONLY")
      @js.native
      val O_RDONLY: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_RDWR")
      @js.native
      val O_RDWR: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_SYMLINK")
      @js.native
      val O_SYMLINK: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_SYNC")
      @js.native
      val O_SYNC: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_TRUNC")
      @js.native
      val O_TRUNC: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
      @JSImport("@ionic/utils-fs", "promises.constants.O_WRONLY")
      @js.native
      val O_WRONLY: Double = js.native
      
      /** Constant for fs.access(). File can be read by the calling process. */
      @JSImport("@ionic/utils-fs", "promises.constants.R_OK")
      @js.native
      val R_OK: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFBLK")
      @js.native
      val S_IFBLK: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFCHR")
      @js.native
      val S_IFCHR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFDIR")
      @js.native
      val S_IFDIR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFIFO")
      @js.native
      val S_IFIFO: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFLNK")
      @js.native
      val S_IFLNK: Double = js.native
      
      // File Type Constants
      /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFMT")
      @js.native
      val S_IFMT: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFREG")
      @js.native
      val S_IFREG: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IFSOCK")
      @js.native
      val S_IFSOCK: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IRGRP")
      @js.native
      val S_IRGRP: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IROTH")
      @js.native
      val S_IROTH: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IRUSR")
      @js.native
      val S_IRUSR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IRWXG")
      @js.native
      val S_IRWXG: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IRWXO")
      @js.native
      val S_IRWXO: Double = js.native
      
      // File Mode Constants
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IRWXU")
      @js.native
      val S_IRWXU: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IWGRP")
      @js.native
      val S_IWGRP: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IWOTH")
      @js.native
      val S_IWOTH: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IWUSR")
      @js.native
      val S_IWUSR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IXGRP")
      @js.native
      val S_IXGRP: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IXOTH")
      @js.native
      val S_IXOTH: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
      @JSImport("@ionic/utils-fs", "promises.constants.S_IXUSR")
      @js.native
      val S_IXUSR: Double = js.native
      
      /**
        * When set, a memory file mapping is used to access the file. This flag
        * is available on Windows operating systems only. On other operating systems,
        * this flag is ignored.
        */
      @JSImport("@ionic/utils-fs", "promises.constants.UV_FS_O_FILEMAP")
      @js.native
      val UV_FS_O_FILEMAP: Double = js.native
      
      /** Constant for fs.access(). File can be written by the calling process. */
      @JSImport("@ionic/utils-fs", "promises.constants.W_OK")
      @js.native
      val W_OK: Double = js.native
      
      /** Constant for fs.access(). File can be executed by the calling process. */
      @JSImport("@ionic/utils-fs", "promises.constants.X_OK")
      @js.native
      val X_OK: Double = js.native
    }
    
    /**
      * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it
      * already exists.
      *
      * No guarantees are made about the atomicity of the copy operation. If an
      * error occurs after the destination file has been opened for writing, an attempt
      * will be made to remove the destination.
      *
      * ```js
      * import { copyFile, constants } from 'node:fs/promises';
      *
      * try {
      *   await copyFile('source.txt', 'destination.txt');
      *   console.log('source.txt was copied to destination.txt');
      * } catch {
      *   console.error('The file could not be copied');
      * }
      *
      * // By using COPYFILE_EXCL, the operation will fail if destination.txt exists.
      * try {
      *   await copyFile('source.txt', 'destination.txt', constants.COPYFILE_EXCL);
      *   console.log('source.txt was copied to destination.txt');
      * } catch {
      *   console.error('The file could not be copied');
      * }
      * ```
      * @since v10.0.0
      * @param src source filename to copy
      * @param dest destination filename of the copy operation
      * @param [mode=0] Optional modifiers that specify the behavior of the copy operation. It is possible to create a mask consisting of the bitwise OR of two or more values (e.g.
      * `fs.constants.COPYFILE_EXCL | fs.constants.COPYFILE_FICLONE`)
      * @return Fulfills with `undefined` upon success.
      */
    inline def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def copyFile(src: PathLike, dest: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronously copies the entire directory structure from `src` to `dest`,
      * including subdirectories and files.
      *
      * When copying a directory to another directory, globs are not supported and
      * behavior is similar to `cp dir1/ dir2/`.
      * @since v16.7.0
      * @experimental
      * @param src source path to copy.
      * @param dest destination path to copy to.
      * @return Fulfills with `undefined` upon success.
      */
    inline def cp(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def cp(source: String, destination: String, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def cp(source: String, destination: typings.std.URL): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def cp(source: String, destination: typings.std.URL, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def cp(source: typings.std.URL, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def cp(source: typings.std.URL, destination: String, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def cp(source: typings.std.URL, destination: typings.std.URL): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def cp(source: typings.std.URL, destination: typings.std.URL, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Changes the permissions on a symbolic link.
      *
      * This method is only implemented on macOS.
      * @deprecated Since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Changes the ownership on a symbolic link.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Creates a new link from the `existingPath` to the `newPath`. See the POSIX [`link(2)`](http://man7.org/linux/man-pages/man2/link.2.html) documentation for more detail.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Equivalent to `fsPromises.stat()` unless `path` refers to a symbolic link,
      * in which case the link itself is stat-ed, not the file that it refers to.
      * Refer to the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) document for more detail.
      * @since v10.0.0
      * @return Fulfills with the {fs.Stats} object for the given symbolic link `path`.
      */
    inline def lstat(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
    inline def lstat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[typings.node.nodeColonfsMod.Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
    inline def lstat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
    inline def lstat(path: PathLike, opts: StatOptions): js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats]]
    
    /**
      * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`, with the difference that if the path refers to a
      * symbolic link, then the link is not dereferenced: instead, the timestamps of
      * the symbolic link itself are changed.
      * @since v14.5.0, v12.19.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    inline def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    /**
      * Asynchronously creates a directory.
      *
      * The optional `options` argument can be an integer specifying `mode` (permission
      * and sticky bits), or an object with a `mode` property and a `recursive`property indicating whether parent directories should be created. Calling`fsPromises.mkdir()` when `path` is a directory
      * that exists results in a
      * rejection only when `recursive` is false.
      *
      * ```js
      * import { mkdir } from 'node:fs/promises';
      *
      * try {
      *   const projectFolder = new URL('./test/project/', import.meta.url);
      *   const createDir = await mkdir(projectFolder, { recursive: true });
      *
      *   console.log(`created ${createDir}`);
      * } catch (err) {
      *   console.error(err.message);
      * }
      * ```
      * @since v10.0.0
      * @return Upon success, fulfills with `undefined` if `recursive` is `false`, or the first directory path created if `recursive` is `true`.
      */
    inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
    inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
    inline def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Creates a unique temporary directory. A unique directory name is generated by
      * appending six random characters to the end of the provided `prefix`. Due to
      * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
      * platforms, notably the BSDs, can return more than six random characters, and
      * replace trailing `X` characters in `prefix` with random characters.
      *
      * The optional `options` argument can be a string specifying an encoding, or an
      * object with an `encoding` property specifying the character encoding to use.
      *
      * ```js
      * import { mkdtemp } from 'node:fs/promises';
      * import { join } from 'node:path';
      * import { tmpdir } from 'node:os';
      *
      * try {
      *   await mkdtemp(join(tmpdir(), 'foo-'));
      * } catch (err) {
      *   console.error(err);
      * }
      * ```
      *
      * The `fsPromises.mkdtemp()` method will append the six randomly selected
      * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
      * platform-specific path separator
      * (`require('node:path').sep`).
      * @since v10.0.0
      * @return Fulfills with a string containing the file system path of the newly created temporary directory.
      */
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def mkdtemp(prefix: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def mkdtemp(prefix: String, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /**
      * Opens a `FileHandle`.
      *
      * Refer to the POSIX [`open(2)`](http://man7.org/linux/man-pages/man2/open.2.html) documentation for more detail.
      *
      * Some characters (`< > : " / \ | ? *`) are reserved under Windows as documented
      * by [Naming Files, Paths, and Namespaces](https://docs.microsoft.com/en-us/windows/desktop/FileIO/naming-a-file). Under NTFS, if the filename contains
      * a colon, Node.js will open a file system stream, as described by [this MSDN page](https://docs.microsoft.com/en-us/windows/desktop/FileIO/using-streams).
      * @since v10.0.0
      * @param [flags='r'] See `support of file system `flags``.
      * @param [mode=0o666] Sets the file mode (permission and sticky bits) if the file is created.
      * @return Fulfills with a {FileHandle} object.
      */
    inline def open(path: PathLike): js.Promise[FileHandle] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: String): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: Double): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    inline def open(path: PathLike, flags: Unit, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
    
    /**
      * Asynchronously open a directory for iterative scanning. See the POSIX [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html) documentation for more detail.
      *
      * Creates an `fs.Dir`, which contains all further functions for reading from
      * and cleaning up the directory.
      *
      * The `encoding` option sets the encoding for the `path` while opening the
      * directory and subsequent read operations.
      *
      * Example using async iteration:
      *
      * ```js
      * import { opendir } from 'node:fs/promises';
      *
      * try {
      *   const dir = await opendir('./');
      *   for await (const dirent of dir)
      *     console.log(dirent.name);
      * } catch (err) {
      *   console.error(err);
      * }
      * ```
      *
      * When using the async iterator, the `fs.Dir` object will be automatically
      * closed after the iterator exits.
      * @since v12.12.0
      * @return Fulfills with an {fs.Dir}.
      */
    inline def opendir(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Dir]]
    inline def opendir(path: PathLike, options: OpenDirOptions): js.Promise[typings.node.nodeColonfsMod.Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Dir]]
    
    /**
      * Asynchronously reads the entire contents of a file.
      *
      * If no encoding is specified (using `options.encoding`), the data is returned
      * as a `Buffer` object. Otherwise, the data will be a string.
      *
      * If `options` is a string, then it specifies the encoding.
      *
      * When the `path` is a directory, the behavior of `fsPromises.readFile()` is
      * platform-specific. On macOS, Linux, and Windows, the promise will be rejected
      * with an error. On FreeBSD, a representation of the directory's contents will be
      * returned.
      *
      * An example of reading a `package.json` file located in the same directory of the
      * running code:
      *
      * ```js
      * import { readFile } from 'node:fs/promises';
      * try {
      *   const filePath = new URL('./package.json', import.meta.url);
      *   const contents = await readFile(filePath, { encoding: 'utf8' });
      *   console.log(contents);
      * } catch (err) {
      *   console.error(err.message);
      * }
      * ```
      *
      * It is possible to abort an ongoing `readFile` using an `AbortSignal`. If a
      * request is aborted the promise returned is rejected with an `AbortError`:
      *
      * ```js
      * import { readFile } from 'node:fs/promises';
      *
      * try {
      *   const controller = new AbortController();
      *   const { signal } = controller;
      *   const promise = readFile(fileName, { signal });
      *
      *   // Abort the request before the promise settles.
      *   controller.abort();
      *
      *   await promise;
      * } catch (err) {
      *   // When a request is aborted - err is an AbortError
      *   console.error(err);
      * }
      * ```
      *
      * Aborting an ongoing request does not abort individual operating
      * system requests but rather the internal buffering `fs.readFile` performs.
      *
      * Any specified `FileHandle` has to support reading.
      * @since v10.0.0
      * @param path filename or `FileHandle`
      * @return Fulfills with the contents of the file.
      */
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    inline def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def readFile(path: PathLike, options: ObjectEncodingOptionsAbor): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    inline def readFile(path: PathLike, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readFile(path: PathLike, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readFile(path: FileHandle): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def readFile(path: FileHandle, options: ObjectEncodingOptionsAbor): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
    inline def readFile(path: FileHandle, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def readFile(path: FileHandle, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /**
      * Reads the contents of a directory.
      *
      * The optional `options` argument can be a string specifying an encoding, or an
      * object with an `encoding` property specifying the character encoding to use for
      * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
      * will be passed as `Buffer` objects.
      *
      * If `options.withFileTypes` is set to `true`, the resolved array will contain `fs.Dirent` objects.
      *
      * ```js
      * import { readdir } from 'node:fs/promises';
      *
      * try {
      *   const files = await readdir(path);
      *   for (const file of files)
      *     console.log(file);
      * } catch (err) {
      *   console.error(err);
      * }
      * ```
      * @since v10.0.0
      * @return Fulfills with an array of the names of the files in the directory excluding `'.'` and `'..'`.
      */
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readdir(path: PathLike): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readdir(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
    inline def readdir(path: PathLike, options: ObjectEncodingOptionswith): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
      */
    inline def readdir(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Promise[js.Array[typings.node.nodeColonfsMod.Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.nodeColonfsMod.Dirent]]]
    inline def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
    
    /**
      * Reads the contents of the symbolic link referred to by `path`. See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more detail. The promise is
      * resolved with the`linkString` upon success.
      *
      * The optional `options` argument can be a string specifying an encoding, or an
      * object with an `encoding` property specifying the character encoding to use for
      * the link path returned. If the `encoding` is set to `'buffer'`, the link path
      * returned will be passed as a `Buffer` object.
      * @since v10.0.0
      * @return Fulfills with the `linkString` upon success.
      */
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readlink(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
    inline def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def readlink(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /**
      * Determines the actual location of `path` using the same semantics as the`fs.realpath.native()` function.
      *
      * Only paths that can be converted to UTF8 strings are supported.
      *
      * The optional `options` argument can be a string specifying an encoding, or an
      * object with an `encoding` property specifying the character encoding to use for
      * the path. If the `encoding` is set to `'buffer'`, the path returned will be
      * passed as a `Buffer` object.
      *
      * On Linux, when Node.js is linked against musl libc, the procfs file system must
      * be mounted on `/proc` in order for this function to work. Glibc does not have
      * this restriction.
      * @since v10.0.0
      * @return Fulfills with the resolved path upon success.
      */
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def realpath(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    inline def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def realpath(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /**
      * Renames `oldPath` to `newPath`.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Removes files and directories (modeled on the standard POSIX `rm` utility).
      * @since v14.14.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Removes the directory identified by `path`.
      *
      * Using `fsPromises.rmdir()` on a file (not a directory) results in the
      * promise being rejected with an `ENOENT` error on Windows and an `ENOTDIR`error on POSIX.
      *
      * To get a behavior similar to the `rm -rf` Unix command, use `fsPromises.rm()` with options `{ recursive: true, force: true }`.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * @since v10.0.0
      * @return Fulfills with the {fs.Stats} object for the given `path`.
      */
    inline def stat(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
    inline def stat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[typings.node.nodeColonfsMod.Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
    inline def stat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
    inline def stat(path: PathLike, opts: StatOptions): js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats]]
    
    /**
      * @since v19.6.0, v18.15.0
      * @return Fulfills with the {fs.StatFs} object for the given `path`.
      */
    inline def statfs(path: PathLike): js.Promise[typings.node.nodeColonfsMod.StatsFs] = ^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.StatsFs]]
    inline def statfs(path: PathLike, opts: StatFsOptionsbigintfalseu): js.Promise[typings.node.nodeColonfsMod.StatsFs] = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.StatsFs]]
    inline def statfs(path: PathLike, opts: StatFsOptionsbiginttrue): js.Promise[BigIntStatsFs] = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStatsFs]]
    inline def statfs(path: PathLike, opts: StatFsOptions): js.Promise[typings.node.nodeColonfsMod.StatsFs | BigIntStatsFs] = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.StatsFs | BigIntStatsFs]]
    
    /**
      * Creates a symbolic link.
      *
      * The `type` argument is only used on Windows platforms and can be one of `'dir'`,`'file'`, or `'junction'`. If the `type` argument is not a string, Node.js will
      * autodetect `target` type and use `'file'` or `'dir'`. If the `target` does not
      * exist, `'file'` will be used. Windows junction points require the destination
      * path to be absolute. When using `'junction'`, the `target` argument will
      * automatically be normalized to absolute path.
      * @since v10.0.0
      * @param [type='null']
      * @return Fulfills with `undefined` upon success.
      */
    inline def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Truncates (shortens or extends the length) of the content at `path` to `len`bytes.
      * @since v10.0.0
      * @param [len=0]
      * @return Fulfills with `undefined` upon success.
      */
    inline def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * If `path` refers to a symbolic link, then the link is removed without affecting
      * the file or directory to which that link refers. If the `path` refers to a file
      * path that is not a symbolic link, the file is deleted. See the POSIX [`unlink(2)`](http://man7.org/linux/man-pages/man2/unlink.2.html) documentation for more detail.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Change the file system timestamps of the object referenced by `path`.
      *
      * The `atime` and `mtime` arguments follow these rules:
      *
      * * Values can be either numbers representing Unix epoch time, `Date`s, or a
      * numeric string like `'123456789.0'`.
      * * If the value can not be converted to a number, or is `NaN`, `Infinity`, or`-Infinity`, an `Error` will be thrown.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    inline def utimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
      * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `persistent` is not supplied, the default of `true` is used.
      * If `recursive` is not supplied, the default of `false` is used.
      */
    inline def watch(filename: PathLike): AsyncIterable[FileChangeInfo[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
    inline def watch(filename: PathLike, options: String): AsyncIterable[FileChangeInfo[Buffer | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer | String]]]
    /**
      * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
      *
      * ```js
      * const { watch } = require('node:fs/promises');
      *
      * const ac = new AbortController();
      * const { signal } = ac;
      * setTimeout(() => ac.abort(), 10000);
      *
      * (async () => {
      *   try {
      *     const watcher = watch(__filename, { signal });
      *     for await (const event of watcher)
      *       console.log(event);
      *   } catch (err) {
      *     if (err.name === 'AbortError')
      *       return;
      *     throw err;
      *   }
      * })();
      * ```
      *
      * On most platforms, `'rename'` is emitted whenever a filename appears or
      * disappears in the directory.
      *
      * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
      * @since v15.9.0, v14.18.0
      * @return of objects with the properties:
      */
    inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
    inline def watch(filename: PathLike, options: BufferEncoding): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
    /**
      * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
      * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `persistent` is not supplied, the default of `true` is used.
      * If `recursive` is not supplied, the default of `false` is used.
      */
    inline def watch(filename: PathLike, options: WatchOptions): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
    
    inline def watch_buffer(filename: PathLike, options: buffer): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.`data` can be a string, a buffer, an
      * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
      * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
      *
      * The `encoding` option is ignored if `data` is a buffer.
      *
      * If `options` is a string, then it specifies the encoding.
      *
      * The `mode` option only affects the newly created file. See `fs.open()` for more details.
      *
      * Any specified `FileHandle` has to support writing.
      *
      * It is unsafe to use `fsPromises.writeFile()` multiple times on the same file
      * without waiting for the promise to be settled.
      *
      * Similarly to `fsPromises.readFile` \- `fsPromises.writeFile` is a convenience
      * method that performs multiple `write` calls internally to write the buffer
      * passed to it. For performance sensitive code consider using `fs.createWriteStream()` or `filehandle.createWriteStream()`.
      *
      * It is possible to use an `AbortSignal` to cancel an `fsPromises.writeFile()`.
      * Cancelation is "best effort", and some amount of data is likely still
      * to be written.
      *
      * ```js
      * import { writeFile } from 'node:fs/promises';
      * import { Buffer } from 'node:buffer';
      *
      * try {
      *   const controller = new AbortController();
      *   const { signal } = controller;
      *   const data = new Uint8Array(Buffer.from('Hello Node.js'));
      *   const promise = writeFile('message.txt', data, { signal });
      *
      *   // Abort the request before the promise settles.
      *   controller.abort();
      *
      *   await promise;
      * } catch (err) {
      *   // When a request is aborted - err is an AbortError
      *   console.error(err);
      * }
      * ```
      *
      * Aborting an ongoing request does not abort individual operating
      * system requests but rather the internal buffering `fs.writeFile` performs.
      * @since v10.0.0
      * @param file filename or `FileHandle`
      * @return Fulfills with `undefined` upon success.
      */
    inline def writeFile(file: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(
      file: FileHandle,
      data: AsyncIterable[String | ArrayBufferView],
      options: ObjectEncodingOptionsmode
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("@ionic/utils-fs", "read")
  @js.native
  val read: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.read.__promisify__ */ Any) & Typeofread = js.native
  
  @JSImport("@ionic/utils-fs", "readFile")
  @js.native
  val readFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any) & TypeofreadFile = js.native
  
  inline def readFileSync(path: PathOrFileDescriptor): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def readJSONSync_(file: Path): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def readJSONSync_(file: Path, options: JFReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def readJSON_(file: Path): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def readJSON_(file: Path, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJSON_(file: Path, options: JFReadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def readJSON_(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJson(file: Path): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def readJson(file: Path, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJson(file: Path, options: JFReadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def readJson(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJsonSync(file: Path): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def readJsonSync(file: Path, options: JFReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def readSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: ReadPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@ionic/utils-fs", "readdir")
  @js.native
  val readdir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readdir.__promisify__ */ Any) & Typeofreaddir = js.native
  
  inline def readdirSafe(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSafe")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def readdirSync(path: PathLike): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | String]]
  inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[typings.node.fsMod.Dirent] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.fsMod.Dirent]]
  inline def readdirSync(path: PathLike, options: Recursive): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  inline def readdirp(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdirp(dir: String, param1: ReaddirPOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirp")(dir.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("@ionic/utils-fs", "readlink")
  @js.native
  val readlink: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readlink.__promisify__ */ Any) & Typeofreadlink = js.native
  
  inline def readlinkSync(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readlinkSync(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readlinkSync_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def readlinkSync_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  @JSImport("@ionic/utils-fs", "readv")
  @js.native
  val readv: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readv.__promisify__ */ Any) & Typeofreadv = js.native
  
  inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@ionic/utils-fs", "realpath")
  @js.native
  val realpath: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any) & Typeofrealpath & Native = js.native
  
  object realpathSync {
    
    inline def apply(path: PathLike): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@ionic/utils-fs", "realpathSync")
    @js.native
    val ^ : js.Any = js.native
    
    inline def native(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def native(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def native(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def native_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
    inline def native_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  }
  
  inline def remove(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def remove(dir: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "rename")
  @js.native
  val rename: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ Any) & Typeofrename = js.native
  
  inline def renameSync(oldPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "rm")
  @js.native
  val rm: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rm.__promisify__ */ Any) & Typeofrm = js.native
  
  inline def rmSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def rmSync(path: PathLike, options: RmOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "rmdir")
  @js.native
  val rmdir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rmdir.__promisify__ */ Any) & Typeofrmdir = js.native
  
  inline def rmdirSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def rmdirSync(path: PathLike, options: RmDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "stat")
  @js.native
  val stat: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any) & Typeofstat = js.native
  
  inline def statSafe(p: String): js.Promise[js.UndefOr[typings.fsExtra.mod.Stats]] = ^.asInstanceOf[js.Dynamic].applyDynamic("statSafe")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fsExtra.mod.Stats]]]
  
  @JSImport("@ionic/utils-fs", "statSync")
  @js.native
  val statSync: StatSyncFn = js.native
  
  inline def statfs(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.StatsFs, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def statfs(
    path: PathLike,
    options: Unit,
    callback: js.Function2[
      ErrnoException | Null, 
      BigIntStatsFs | (/* stats */ typings.node.fsMod.StatsFs), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def statfs(
    path: PathLike,
    options: StatFsOptionsbigintfalseu,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.StatsFs, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def statfs(
    path: PathLike,
    options: StatFsOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStatsFs, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def statfs(
    path: PathLike,
    options: StatFsOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* stats */ typings.node.fsMod.StatsFs | BigIntStatsFs, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def statfsSync(path: PathLike): typings.node.fsMod.StatsFs = ^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.StatsFs]
  inline def statfsSync(path: PathLike, options: StatFsOptionsbigintfalseu): typings.node.fsMod.StatsFs = (^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.StatsFs]
  inline def statfsSync(path: PathLike, options: StatFsOptionsbiginttrue): BigIntStatsFs = (^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStatsFs]
  inline def statfsSync(path: PathLike, options: StatFsOptions): typings.node.fsMod.StatsFs | BigIntStatsFs = (^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.StatsFs | BigIntStatsFs]
  
  inline def statfsSync_Union(path: PathLike): typings.node.fsMod.StatsFs | BigIntStatsFs = ^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.StatsFs | BigIntStatsFs]
  
  @JSImport("@ionic/utils-fs", "symlink")
  @js.native
  val symlink: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.symlink.__promisify__ */ Any) & Typeofsymlink = js.native
  
  inline def symlinkSync(target: PathLike, path: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tmpfilepath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpfilepath")().asInstanceOf[String]
  inline def tmpfilepath(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpfilepath")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@ionic/utils-fs", "truncate")
  @js.native
  val truncate: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.truncate.__promisify__ */ Any) & Typeoftruncate = js.native
  
  inline def truncateSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def truncateSync(path: PathLike, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "unlink")
  @js.native
  val unlink: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any) & Typeofunlink = js.native
  
  inline def unlinkSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unwatchFile(filename: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unwatchFile(filename: PathLike, listener: BigIntStatsListener | StatsListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/utils-fs", "utimes")
  @js.native
  val utimes: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.utimes.__promisify__ */ Any) & Typeofutimes = js.native
  
  inline def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walk(p: String): Walker = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(p.asInstanceOf[js.Any]).asInstanceOf[Walker]
  inline def walk(p: String, options: WalkerOptions): Walker = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(p.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Walker]
  
  inline def watch(filename: PathLike): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: String): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: String, listener: WatchListener[String | Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: Null, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: Unit, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: BufferEncoding): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: BufferEncoding, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: WatchOptions): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: PathLike, options: WatchOptions, listener: WatchListener[Buffer | String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  inline def watchFile(filename: PathLike, listener: StatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
  inline def watchFile(filename: PathLike, options: Unit, listener: BigIntStatsListener | StatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
  inline def watchFile(filename: PathLike, options: WatchFileOptionsbigintfal, listener: StatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
  inline def watchFile(filename: PathLike, options: WatchFileOptionsbiginttru, listener: BigIntStatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
  
  inline def watch_buffer(filename: PathLike, options: buffer): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch_buffer(filename: PathLike, options: buffer, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  @JSImport("@ionic/utils-fs", "write")
  @js.native
  val write: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.write.__promisify__ */ Any) & Typeofwrite = js.native
  
  @JSImport("@ionic/utils-fs", "writeFile")
  @js.native
  val writeFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writeFile.__promisify__ */ Any) & TypeofwriteFile = js.native
  
  inline def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJSONSync_(file: Path, obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSONSync_(file: Path, obj: Any, options: JFWriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJSON_(file: Path, obj: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJSON_(file: Path, obj: Any, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSON_(file: Path, obj: Any, options: JFWriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJSON_(file: Path, obj: Any, options: JFWriteOptions, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJson(file: Path, obj: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJson(file: Path, obj: Any, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJson(file: Path, obj: Any, options: JFWriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJson(file: Path, obj: Any, options: JFWriteOptions, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJsonSync(file: Path, obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJsonSync(file: Path, obj: Any, options: JFWriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeStreamToFile(stream: ReadableStream, destination: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStreamToFile")(stream.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def writeSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@ionic/utils-fs", "writev")
  @js.native
  val writev: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writev.__promisify__ */ Any) & Typeofwritev = js.native
  
  inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait DirectoryNode
    extends StObject
       with FileNode {
    
    var children: js.Array[FileNode]
    
    var parent: js.UndefOr[FileNode] = js.undefined
    
    var path: String
    
    var `type`: directory
  }
  object DirectoryNode {
    
    inline def apply(children: js.Array[FileNode], path: String): DirectoryNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directory")
      __obj.asInstanceOf[DirectoryNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryNode] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[FileNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: FileNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setParent(value: FileNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: directory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicUtilsFs.mod.RegularFileNode
    - typings.ionicUtilsFs.mod.DirectoryNode
  */
  trait FileNode extends StObject
  object FileNode {
    
    inline def DirectoryNode(children: js.Array[FileNode], path: String): typings.ionicUtilsFs.mod.DirectoryNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directory")
      __obj.asInstanceOf[typings.ionicUtilsFs.mod.DirectoryNode]
    }
    
    inline def RegularFileNode(parent: FileNode, path: String): typings.ionicUtilsFs.mod.RegularFileNode = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("file")
      __obj.asInstanceOf[typings.ionicUtilsFs.mod.RegularFileNode]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicUtilsFs.ionicUtilsFsStrings.file
    - typings.ionicUtilsFs.ionicUtilsFsStrings.directory
  */
  trait FileType extends StObject
  object FileType {
    
    inline def DIRECTORY: directory = "directory".asInstanceOf[directory]
    
    inline def FILE: file = "file".asInstanceOf[file]
  }
  
  trait GetFileTreeOptions[RE, DE] extends StObject {
    
    /**
      * Called whenever a directory node is added to the tree.
      *
      * Directory nodes can be supplemented by returning a new object from this
      * function.
      */
    val onDirectoryNode: js.UndefOr[js.Function1[/* node */ DirectoryNode, DirectoryNode & DE]] = js.undefined
    
    /**
      * Called whenever an error occurs during the walk process.
      *
      * If excluded, the function will throw an error when first encountered.
      */
    val onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    /**
      * Called whenever a file node is added to the tree.
      *
      * File nodes can be supplemented by returning a new object from this
      * function.
      */
    val onFileNode: js.UndefOr[js.Function1[/* node */ RegularFileNode, RegularFileNode & RE]] = js.undefined
    
    val walkerOptions: js.UndefOr[WalkerOptions] = js.undefined
  }
  object GetFileTreeOptions {
    
    inline def apply[RE, DE](): GetFileTreeOptions[RE, DE] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFileTreeOptions[RE, DE]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetFileTreeOptions[?, ?], RE, DE] (val x: Self & (GetFileTreeOptions[RE, DE])) extends AnyVal {
      
      inline def setOnDirectoryNode(value: /* node */ DirectoryNode => DirectoryNode & DE): Self = StObject.set(x, "onDirectoryNode", js.Any.fromFunction1(value))
      
      inline def setOnDirectoryNodeUndefined: Self = StObject.set(x, "onDirectoryNode", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFileNode(value: /* node */ RegularFileNode => RegularFileNode & RE): Self = StObject.set(x, "onFileNode", js.Any.fromFunction1(value))
      
      inline def setOnFileNodeUndefined: Self = StObject.set(x, "onFileNode", js.undefined)
      
      inline def setWalkerOptions(value: WalkerOptions): Self = StObject.set(x, "walkerOptions", value.asInstanceOf[js.Any])
      
      inline def setWalkerOptionsUndefined: Self = StObject.set(x, "walkerOptions", js.undefined)
    }
  }
  
  trait ReaddirPOptions extends StObject {
    
    /**
      * Filter out items from the walk process from the final result.
      *
      * @return `true` to keep, otherwise the item is filtered out
      */
    val filter: js.UndefOr[js.Function1[/* item */ WalkerItem, Boolean]] = js.undefined
    
    /**
      * Called whenever an error occurs during the walk process.
      *
      * If excluded, the function will throw an error when first encountered.
      */
    val onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    val walkerOptions: js.UndefOr[WalkerOptions] = js.undefined
  }
  object ReaddirPOptions {
    
    inline def apply(): ReaddirPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaddirPOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReaddirPOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: /* item */ WalkerItem => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setWalkerOptions(value: WalkerOptions): Self = StObject.set(x, "walkerOptions", value.asInstanceOf[js.Any])
      
      inline def setWalkerOptionsUndefined: Self = StObject.set(x, "walkerOptions", js.undefined)
    }
  }
  
  trait RegularFileNode
    extends StObject
       with FileNode {
    
    var parent: FileNode
    
    var path: String
    
    var `type`: file
  }
  object RegularFileNode {
    
    inline def apply(parent: FileNode, path: String): RegularFileNode = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("file")
      __obj.asInstanceOf[RegularFileNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegularFileNode] (val x: Self) extends AnyVal {
      
      inline def setParent(value: FileNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait WalkerItem extends StObject {
    
    var path: String
    
    var stats: typings.fsExtra.mod.Stats
  }
  object WalkerItem {
    
    inline def apply(path: String, stats: typings.fsExtra.mod.Stats): WalkerItem = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkerItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkerItem] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStats(value: typings.fsExtra.mod.Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
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
    val pathFilter: js.UndefOr[js.Function1[/* p */ String, Boolean]] = js.undefined
  }
  object WalkerOptions {
    
    inline def apply(): WalkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkerOptions] (val x: Self) extends AnyVal {
      
      inline def setPathFilter(value: /* p */ String => Boolean): Self = StObject.set(x, "pathFilter", js.Any.fromFunction1(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
    }
  }
}
