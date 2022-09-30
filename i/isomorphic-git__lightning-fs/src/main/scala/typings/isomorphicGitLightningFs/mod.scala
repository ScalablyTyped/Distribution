package typings.isomorphicGitLightningFs

import typings.isomorphicGitLightningFs.isomorphicGitLightningFsInts.`1`
import typings.isomorphicGitLightningFs.isomorphicGitLightningFsStrings.dir
import typings.isomorphicGitLightningFs.isomorphicGitLightningFsStrings.file
import typings.isomorphicGitLightningFs.isomorphicGitLightningFsStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * You can procrastinate initializing the FS object until later. And, if you're really adventurous, you can re-initialize it with a different name to switch between IndexedDb databases.
    */
  @JSImport("@isomorphic-git/lightning-fs", JSImport.Namespace)
  @js.native
  /**
    * First, create or open a "filesystem".
    * @param name This is used to determine the IndexedDb store name.
    * @param options The "filesystem" configuration.
    */
  open class ^ ()
    extends StObject
       with FS {
    def this(name: String) = this()
    def this(name: String, options: Options) = this()
    def this(name: Unit, options: Options) = this()
  }
  
  @JSImport("@isomorphic-git/lightning-fs", "PromisifiedFS")
  @js.native
  open class PromisifiedFS () extends StObject {
    
    /**
      * Create or change the stat data for a file backed by HTTP. Size is fetched with a HEAD request.
      * Useful when using an HTTP backend without urlauto set, as then files will only be readable if they have stat data.
      * Note that stat data is made automatically from the file /.superblock.txt if found on the server. /.superblock.txt
      * can be generated or updated with the included -
      * [standalone script](https://github.com/isomorphic-git/lightning-fs/blob/main/src/superblocktxt.js).
      * @param filepath
      * @param options
      */
    def backFile(filepath: String): js.Promise[Unit] = js.native
    def backFile(filepath: String, options: BackFileOptions): js.Promise[Unit] = js.native
    
    /**
      * @param filepath
      * @returns The size of a file or directory in bytes.
      */
    def du(filepath: String): js.Promise[Double] = js.native
    
    /**
      *
      * @param name This is used to determine the IndexedDb store name.
      * @param options The "filesystem" configuration.
      */
    def init(name: String): Unit = js.native
    def init(name: String, options: Options): Unit = js.native
    
    /**
      * Like fs.stat except that paths to symlinks return the symlink stats not the file stats of the symlink's target.
      * @param filepath
      * @param options
      */
    def lstat(filepath: String, options: Unit): js.Promise[Stats] = js.native
    
    /**
      * Make directory
      * @param filepath
      * @param options
      */
    def mkdir(filepath: String): js.Promise[Unit] = js.native
    def mkdir(filepath: String, options: MKDirOptions): js.Promise[Unit] = js.native
    
    def readFile(filepath: String): js.Promise[js.typedarray.Uint8Array | String] = js.native
    def readFile(filepath: String, options: String): js.Promise[js.typedarray.Uint8Array | String] = js.native
    def readFile(filepath: String, options: ReadFileOptions): js.Promise[js.typedarray.Uint8Array | String] = js.native
    
    /**
      * Read directory
      *
      * The Promise return value is an Array of strings. NOTE: To save time, it is NOT SORTED.
      * (Fun fact: Node.js' readdir output is not guaranteed to be sorted either. I learned that the hard way.)
      * @param filepath
      * @param options
      * @returns The file list.
      */
    def readdir(filepath: String, options: Unit): js.Promise[js.Array[String]] = js.native
    
    /**
      * Read the target of a symlink.
      * @param filepath
      * @param options
      * @returns The link string.
      */
    def readlink(filepath: String, options: Unit): js.Promise[String] = js.native
    
    /**
      * Rename a file or directory
      * @param oldFilepath
      * @param newFilepath
      */
    def rename(oldFilepath: String, newFilepath: String): js.Promise[Unit] = js.native
    
    /**
      * Remove directory
      * @param filepath
      * @param options
      */
    def rmdir(filepath: String, options: Unit): js.Promise[Unit] = js.native
    
    /**
      * The result is a Stat object similar to the one used by Node but with fewer and slightly different properties and methods.
      * @param filepath
      * @param options
      */
    def stat(filepath: String, options: Unit): js.Promise[Stats] = js.native
    
    /**
      * Create a symlink at filepath that points to target.
      * @param target
      * @param filepath
      */
    def symlink(target: String, filepath: String): js.Promise[Unit] = js.native
    
    /**
      * Delete a file
      * @param filepath
      * @param options
      */
    def unlink(filepath: String, options: Unit): js.Promise[Unit] = js.native
    
    def writeFile(filepath: String, data: String): js.Promise[Unit] = js.native
    def writeFile(filepath: String, data: String, options: String): js.Promise[Unit] = js.native
    def writeFile(filepath: String, data: String, options: WriteFileOptions): js.Promise[Unit] = js.native
    def writeFile(filepath: String, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def writeFile(filepath: String, data: js.typedarray.Uint8Array, options: String): js.Promise[Unit] = js.native
    def writeFile(filepath: String, data: js.typedarray.Uint8Array, options: WriteFileOptions): js.Promise[Unit] = js.native
  }
  
  trait BackFileOptions extends StObject {
    
    /**
      * Posix mode permissions
      * @default 0o666
      */
    var mode: Double
  }
  object BackFileOptions {
    
    inline def apply(mode: Double): BackFileOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackFileOptions]
    }
    
    extension [Self <: BackFileOptions](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * You can procrastinate initializing the FS object until later. And, if you're really adventurous, you can re-initialize it with a different name to switch between IndexedDb databases.
    */
  @js.native
  trait FS extends StObject {
    
    def backFile(filepath: String, options: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    /**
      * Create or change the stat data for a file backed by HTTP. Size is fetched with a HEAD request.
      * Useful when using an HTTP backend without urlauto set, as then files will only be readable if
      * they have stat data. Note that stat data is made automatically from the file /.superblock.txt
      * if found on the server. /.superblock.txt can be generated or updated with the included -
      * [standalone script](https://github.com/isomorphic-git/lightning-fs/blob/main/src/superblocktxt.js).
      * @param filepath
      * @param options
      * @param cb
      */
    def backFile(filepath: String, options: BackFileOptions, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * Returns the size of a file or directory in bytes.
      * @param filepath
      * @param cb
      */
    def du(filepath: String, cb: js.Function2[/* err */ js.Error, /* size */ Double, Unit]): Unit = js.native
    
    /**
      *
      * @param name This is used to determine the IndexedDb store name.
      * @param options The "filesystem" configuration.
      */
    def init(name: String): Unit = js.native
    def init(name: String, options: Options): Unit = js.native
    
    /**
      * Like fs.stat except that paths to symlinks return the symlink stats not the file stats of the symlink's target.
      * @param filepath
      * @param options
      * @param cb
      */
    def lstat(filepath: String, options: Unit, cb: js.Function2[/* err */ js.Error, /* stats */ Stats, Unit]): Unit = js.native
    
    def mkdir(filepath: String, options: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    /**
      * Make directory
      * @param filepath
      * @param options
      * @param cb
      */
    def mkdir(filepath: String, options: MKDirOptions, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    val promises: PromisifiedFS = js.native
    
    def readFile(
      filepath: String,
      options: String,
      cb: js.Function2[/* err */ js.Error, /* data */ js.typedarray.Uint8Array | String, Unit]
    ): Unit = js.native
    def readFile(
      filepath: String,
      options: Unit,
      cb: js.Function2[/* err */ js.Error, /* data */ js.typedarray.Uint8Array | String, Unit]
    ): Unit = js.native
    def readFile(
      filepath: String,
      options: ReadFileOptions,
      cb: js.Function2[/* err */ js.Error, /* data */ js.typedarray.Uint8Array | String, Unit]
    ): Unit = js.native
    
    /**
      * Read directory
      *
      * The callback return value is an Array of strings. NOTE: To save time, it is NOT SORTED. (Fun fact: Node.js' readdir output is not guaranteed to be sorted either. I learned that the hard way.)
      * @param filepath
      * @param options
      * @param cb
      */
    def readdir(
      filepath: String,
      options: Unit,
      cb: js.Function2[/* err */ js.Error, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    
    /**
      * Read the target of a symlink.
      * @param filepath
      * @param options
      * @param cb
      */
    def readlink(
      filepath: String,
      options: Unit,
      cb: js.Function2[/* err */ js.Error, /* linkString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Rename a file or directory
      * @param oldFilepath
      * @param newFilepath
      * @param cb
      */
    def rename(oldFilepath: String, newFilepath: String, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * Remove directory
      * @param filepath
      * @param options
      * @param cb
      */
    def rmdir(filepath: String, options: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * The result is a Stat object similar to the one used by Node but with fewer and slightly different properties and methods.
      * @param filepath
      * @param options
      * @param cb
      */
    def stat(filepath: String, options: Unit, cb: js.Function2[/* err */ js.Error, /* stats */ Stats, Unit]): Unit = js.native
    
    /**
      * Create a symlink at filepath that points to target.
      * @param target
      * @param filepath
      * @param cb
      */
    def symlink(target: String, filepath: String, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * Delete a file
      * @param filepath
      * @param options
      * @param cb
      */
    def unlink(filepath: String, options: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def writeFile(filepath: String, data: String, options: String, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def writeFile(filepath: String, data: String, options: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def writeFile(
      filepath: String,
      data: String,
      options: WriteFileOptions,
      cb: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
    def writeFile(
      filepath: String,
      data: js.typedarray.Uint8Array,
      options: String,
      cb: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
    def writeFile(
      filepath: String,
      data: js.typedarray.Uint8Array,
      options: Unit,
      cb: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
    def writeFile(
      filepath: String,
      data: js.typedarray.Uint8Array,
      options: WriteFileOptions,
      cb: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
  }
  
  trait MKDirOptions extends StObject {
    
    /**
      * Posix mode permissions
      * @default 0o777
      */
    var mode: Double
  }
  object MKDirOptions {
    
    inline def apply(mode: Double): MKDirOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MKDirOptions]
    }
    
    extension [Self <: MKDirOptions](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * If true, avoids mutex contention during initialization
      * @default false
      */
    var defer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize the database name
      */
    var fileDbName: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the store name
      */
    var fileStoreName: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the database name for the lock mutex
      */
    var lockDbName: js.UndefOr[String] = js.undefined
    
    /**
      * Customize the store name for the lock mutex
      */
    var lockStoreName: js.UndefOr[String] = js.undefined
    
    /**
      * Let readFile requests fall back to an HTTP request to this base URL
      * @default false
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Fall back to HTTP for every read of a missing file, even if unbacked
      * @default false
      */
    var urlauto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Delete the database and start with an empty filesystem
      * @default false
      */
    var wipe: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setFileDbName(value: String): Self = StObject.set(x, "fileDbName", value.asInstanceOf[js.Any])
      
      inline def setFileDbNameUndefined: Self = StObject.set(x, "fileDbName", js.undefined)
      
      inline def setFileStoreName(value: String): Self = StObject.set(x, "fileStoreName", value.asInstanceOf[js.Any])
      
      inline def setFileStoreNameUndefined: Self = StObject.set(x, "fileStoreName", js.undefined)
      
      inline def setLockDbName(value: String): Self = StObject.set(x, "lockDbName", value.asInstanceOf[js.Any])
      
      inline def setLockDbNameUndefined: Self = StObject.set(x, "lockDbName", js.undefined)
      
      inline def setLockStoreName(value: String): Self = StObject.set(x, "lockStoreName", value.asInstanceOf[js.Any])
      
      inline def setLockStoreNameUndefined: Self = StObject.set(x, "lockStoreName", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrlauto(value: Boolean): Self = StObject.set(x, "urlauto", value.asInstanceOf[js.Any])
      
      inline def setUrlautoUndefined: Self = StObject.set(x, "urlauto", js.undefined)
      
      inline def setWipe(value: Boolean): Self = StObject.set(x, "wipe", value.asInstanceOf[js.Any])
      
      inline def setWipeUndefined: Self = StObject.set(x, "wipe", js.undefined)
    }
  }
  
  trait ReadFileOptions extends StObject {
    
    var encoding: js.UndefOr[utf8] = js.undefined
  }
  object ReadFileOptions {
    
    inline def apply(): ReadFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadFileOptions]
    }
    
    extension [Self <: ReadFileOptions](x: Self) {
      
      inline def setEncoding(value: utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait Stats extends StObject {
    
    var ctimeMs: Any
    
    var dev: `1`
    
    var gid: `1`
    
    var ino: Any
    
    def isDirectory(): Boolean
    
    def isFile(): Boolean
    
    def isSymbolicLink(): Boolean
    
    var mode: Any
    
    var mtimeMs: Any
    
    var size: Double
    
    var `type`: file | dir
    
    var uid: `1`
  }
  object Stats {
    
    inline def apply(
      ctimeMs: Any,
      ino: Any,
      isDirectory: () => Boolean,
      isFile: () => Boolean,
      isSymbolicLink: () => Boolean,
      mode: Any,
      mtimeMs: Any,
      size: Double,
      `type`: file | dir
    ): Stats = {
      val __obj = js.Dynamic.literal(ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = 1, gid = 1, ino = ino.asInstanceOf[js.Any], isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = 1)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setCtimeMs(value: Any): Self = StObject.set(x, "ctimeMs", value.asInstanceOf[js.Any])
      
      inline def setDev(value: `1`): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setGid(value: `1`): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setIno(value: Any): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      inline def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
      
      inline def setMode(value: Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtimeMs(value: Any): Self = StObject.set(x, "mtimeMs", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: file | dir): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUid(value: `1`): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WriteFileOptions extends StObject {
    
    var encoding: js.UndefOr[utf8] = js.undefined
    
    /**
      * Posix mode permissions
      * @default 0o777
      */
    var mode: Double
  }
  object WriteFileOptions {
    
    inline def apply(mode: Double): WriteFileOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteFileOptions]
    }
    
    extension [Self <: WriteFileOptions](x: Self) {
      
      inline def setEncoding(value: utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
