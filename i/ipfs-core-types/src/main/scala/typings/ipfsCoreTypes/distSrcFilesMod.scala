package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcRootMod.AddProgressFn
import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.IPFSPath
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.balanced
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.directory
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.file
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.trickle
import typings.ipfsUnixfs.mod.Mtime
import typings.ipfsUnixfs.mod.MtimeLike
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    def chmod(path: String, mode: String): js.Promise[Unit] = js.native
    def chmod(path: String, mode: String, options: ChmodOptions & OptionExtension): js.Promise[Unit] = js.native
    /**
      * Change mode for files and directories
      *
      * @example
      * ```js
      * // To give a file -rwxrwxrwx permissions
      * await ipfs.files.chmod('/path/to/file.txt', parseInt('0777', 8))
      *
      * // Alternatively
      * await ipfs.files.chmod('/path/to/file.txt', '+rwx')
      *
      * // You can omit the leading `0` too
      * await ipfs.files.chmod('/path/to/file.txt', '777')
      * ```
      */
    def chmod(path: String, mode: Double): js.Promise[Unit] = js.native
    def chmod(path: String, mode: Double, options: ChmodOptions & OptionExtension): js.Promise[Unit] = js.native
    
    def cp(from: js.Array[IPFSPath], to: String): js.Promise[Unit] = js.native
    def cp(from: js.Array[IPFSPath], to: String, options: CpOptions & OptionExtension): js.Promise[Unit] = js.native
    /**
      * Copy files from one location to another
      *
      * - If from has multiple values then to must be a directory.
      * - If from has a single value and to exists and is a directory, from will be copied into to.
      * - If from has a single value and to exists and is a file, from must be a file and the contents of to will be replaced with the contents of from otherwise an error will be returned.
      * - If from is an IPFS path, and an MFS path exists with the same name, the IPFS path will be chosen.
      * - If from is an IPFS path and the content does not exist in your node's repo, only the root node of the source file with be retrieved from the network and linked to from the destination. The remainder of the file will be retrieved on demand.
      *
      * @example
      * ```js
      * // To copy a file
      * await ipfs.files.cp('/src-file', '/dst-file')
      *
      * // To copy a directory
      * await ipfs.files.cp('/src-dir', '/dst-dir')
      *
      * // To copy multiple files to a directory
      * await ipfs.files.cp('/src-file1', '/src-file2', '/dst-dir')
      * ```
      */
    def cp(from: IPFSPath, to: String): js.Promise[Unit] = js.native
    def cp(from: IPFSPath, to: String, options: CpOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Flush a given path's data to the disk
      *
      * @example
      * ```js
      * const cid = await ipfs.files.flush('/')
      * ```
      */
    def flush(ipfsPath: String): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def flush(ipfsPath: String, options: AbortOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    /**
      * List directories in the local mutable namespace
      *
      * @example
      * ```js
      * for await (const file of ipfs.files.ls('/screenshots')) {
      *   console.log(file.name)
      * }
      * // 2018-01-22T18:08:46.775Z.png
      * // 2018-01-22T18:08:49.184Z.png
      * ```
      */
    def ls(ipfsPath: IPFSPath): AsyncIterable[MFSEntry] = js.native
    def ls(ipfsPath: IPFSPath, options: AbortOptions & OptionExtension): AsyncIterable[MFSEntry] = js.native
    
    /**
      * Make a directory in your MFS
      */
    def mkdir(path: String): js.Promise[Unit] = js.native
    def mkdir(path: String, options: MkdirOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Move files from one location to another
      *
      * - If from has multiple values then to must be a directory.
      * - If from has a single value and to exists and is a directory, from will be moved into to.
      * - If from has a single value and to exists and is a file, from must be a file and the contents of to will be replaced with the contents of from otherwise an error will be returned.
      * - If from is an IPFS path, and an MFS path exists with the same name, the IPFS path will be chosen.
      * - If from is an IPFS path and the content does not exist in your node's repo, only the root node of the source file with be retrieved from the network and linked to from the destination. The remainder of the file will be retrieved on demand.
      * - All values of from will be removed after the operation is complete unless they are an IPFS path.
      *
      * @example
      * ```js
      * await ipfs.files.mv('/src-file', '/dst-file')
      *
      * await ipfs.files.mv('/src-dir', '/dst-dir')
      *
      * await ipfs.files.mv('/src-file1', '/src-file2', '/dst-dir')
      * ```
      */
    def mv(from: String, to: String): js.Promise[Unit] = js.native
    def mv(from: String, to: String, options: MvOptions & OptionExtension): js.Promise[Unit] = js.native
    def mv(from: js.Array[String], to: String): js.Promise[Unit] = js.native
    def mv(from: js.Array[String], to: String, options: MvOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Read a file
      *
      * @example
      * ```js
      * const chunks = []
      *
      * for await (const chunk of ipfs.files.read('/hello-world')) {
      *   chunks.push(chunk)
      * }
      *
      * console.log(uint8ArrayConcat(chunks).toString())
      * // Hello, World!
      * ```
      */
    def read(ipfsPath: IPFSPath): AsyncIterable[js.typedarray.Uint8Array] = js.native
    def read(ipfsPath: IPFSPath, options: ReadOptions & OptionExtension): AsyncIterable[js.typedarray.Uint8Array] = js.native
    
    /**
      * Remove a file or directory
      *
      * @example
      * ```js
      * // To remove a file
      * await ipfs.files.rm('/my/beautiful/file.txt')
      *
      * // To remove multiple files
      * await ipfs.files.rm(['/my/beautiful/file.txt', '/my/other/file.txt'])
      *
      * // To remove a directory
      * await ipfs.files.rm('/my/beautiful/directory', { recursive: true })
      * ```
      */
    def rm(ipfsPaths: String): js.Promise[Unit] = js.native
    def rm(ipfsPaths: String, options: RmOptions & OptionExtension): js.Promise[Unit] = js.native
    def rm(ipfsPaths: js.Array[String]): js.Promise[Unit] = js.native
    def rm(ipfsPaths: js.Array[String], options: RmOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Get file or directory statistics
      */
    def stat(ipfsPath: IPFSPath): js.Promise[StatResult] = js.native
    def stat(ipfsPath: IPFSPath, options: StatOptions & OptionExtension): js.Promise[StatResult] = js.native
    
    /**
      * Update the mtime of a file or directory
      *
      * @example
      * ```js
      * // set the mtime to the current time
      * await ipfs.files.touch('/path/to/file.txt')
      *
      * // set the mtime to a specific time
      * await ipfs.files.touch('/path/to/file.txt', {
      *   mtime: new Date('May 23, 2014 14:45:14 -0700')
      * })
      * ```
      */
    def touch(ipfsPath: String): js.Promise[Unit] = js.native
    def touch(ipfsPath: String, options: TouchOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Write to an MFS path
      *
      * @example
      * ```js
      * await ipfs.files.write('/hello-world', new TextEncoder().encode('Hello, world!'))
      * ```
      */
    def write(ipfsPath: String, content: String): js.Promise[Unit] = js.native
    def write(ipfsPath: String, content: String, options: WriteOptions & OptionExtension): js.Promise[Unit] = js.native
    def write(ipfsPath: String, content: js.Iterable[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
    def write(
      ipfsPath: String,
      content: js.Iterable[js.typedarray.Uint8Array],
      options: WriteOptions & OptionExtension
    ): js.Promise[Unit] = js.native
    def write(ipfsPath: String, content: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def write(ipfsPath: String, content: js.typedarray.Uint8Array, options: WriteOptions & OptionExtension): js.Promise[Unit] = js.native
    def write(ipfsPath: String, content: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
    def write(
      ipfsPath: String,
      content: AsyncIterable[js.typedarray.Uint8Array],
      options: WriteOptions & OptionExtension
    ): js.Promise[Unit] = js.native
    def write(ipfsPath: String, content: Blob): js.Promise[Unit] = js.native
    def write(ipfsPath: String, content: Blob, options: WriteOptions & OptionExtension): js.Promise[Unit] = js.native
  }
  
  trait ChmodOptions
    extends StObject
       with MFSOptions
       with AbortOptions {
    
    /**
      * The CID version to use for any updated entries
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * The hash algorithm to use for any updated entries
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * If true mode will be applied to the entire tree under path
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The threshold for splitting any modified folders into HAMT shards
      */
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
  }
  object ChmodOptions {
    
    inline def apply(): ChmodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChmodOptions]
    }
    
    extension [Self <: ChmodOptions](x: Self) {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
    }
  }
  
  trait CpOptions
    extends StObject
       with MFSOptions
       with AbortOptions {
    
    /**
      * The CID version to use for any updated entries
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * The hash algorithm to use for any updated entries
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * The value or node that was fetched during the get operation
      */
    var parents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The threshold for splitting any modified folders into HAMT shards
      */
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
  }
  object CpOptions {
    
    inline def apply(): CpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CpOptions]
    }
    
    extension [Self <: CpOptions](x: Self) {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
    }
  }
  
  trait MFSEntry extends StObject {
    
    /**
      * The CID of the object
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * The UnixFS mode as a Number
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * An object with numeric secs and nsecs properties
      */
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    /**
      * The object's name
      */
    var name: String
    
    /**
      * The size of the file in bytes
      */
    var size: Double
    
    /**
      * The object's type (directory or file)
      */
    var `type`: directory | file
  }
  object MFSEntry {
    
    inline def apply(cid: CID[Any, Double, Double, Version], name: String, size: Double, `type`: directory | file): MFSEntry = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MFSEntry]
    }
    
    extension [Self <: MFSEntry](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: directory | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MFSOptions extends StObject {
    
    /**
      * If true the changes will be immediately flushed to disk
      */
    var flush: js.UndefOr[Boolean] = js.undefined
  }
  object MFSOptions {
    
    inline def apply(): MFSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MFSOptions]
    }
    
    extension [Self <: MFSOptions](x: Self) {
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    }
  }
  
  trait MkdirOptions
    extends StObject
       with MFSOptions
       with AbortOptions {
    
    /**
      * The CID version to use for any updated entries
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * The hash algorithm to use for any updated entries
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * An integer that represents the file mode
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * A Date object, an object with { secs, nsecs } properties where secs is the number of seconds since (positive) or before (negative) the Unix Epoch began and nsecs is the number of nanoseconds since the last full second, or the output of process.hrtime()
      */
    var mtime: js.UndefOr[MtimeLike] = js.undefined
    
    /**
      * If true, create intermediate directories
      */
    var parents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The threshold for splitting any modified folders into HAMT shards
      */
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
  }
  object MkdirOptions {
    
    inline def apply(): MkdirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MkdirOptions]
    }
    
    extension [Self <: MkdirOptions](x: Self) {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: MtimeLike): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
    }
  }
  
  trait MvOptions
    extends StObject
       with MFSOptions
       with AbortOptions {
    
    /**
      * The CID version to use for any updated entries
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * The hash algorithm to use for any updated entries
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * Create intermediate MFS paths if they do not exist
      */
    var parents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The threshold for splitting any modified folders into HAMT shards
      */
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
  }
  object MvOptions {
    
    inline def apply(): MvOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MvOptions]
    }
    
    extension [Self <: MvOptions](x: Self) {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
    }
  }
  
  trait ReadOptions
    extends StObject
       with AbortOptions {
    
    /**
      * An optional max length to read from the file
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * An offset to start reading the file from
      */
    var offset: js.UndefOr[Double] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    extension [Self <: ReadOptions](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait RmOptions
    extends StObject
       with MFSOptions
       with AbortOptions {
    
    /**
      * The CID version to use for any updated entries
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * The hash algorithm to use for any updated entries
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * If true all paths under the specifed path(s) will be removed
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The threshold for splitting any modified folders into HAMT shards
      */
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
  }
  object RmOptions {
    
    inline def apply(): RmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RmOptions]
    }
    
    extension [Self <: RmOptions](x: Self) {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
    }
  }
  
  trait StatOptions
    extends StObject
       with AbortOptions {
    
    /**
      * If true, return only the CID
      */
    var hash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, return only the size
      */
    var size: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, compute the amount of the DAG that is local and if possible the total size
      */
    var withLocal: js.UndefOr[Boolean] = js.undefined
  }
  object StatOptions {
    
    inline def apply(): StatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatOptions]
    }
    
    extension [Self <: StatOptions](x: Self) {
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWithLocal(value: Boolean): Self = StObject.set(x, "withLocal", value.asInstanceOf[js.Any])
      
      inline def setWithLocalUndefined: Self = StObject.set(x, "withLocal", js.undefined)
    }
  }
  
  trait StatResult extends StObject {
    
    /**
      * If type is directory, this is the number of files in the directory. If it is file it is the number of blocks that make up the file
      */
    var blocks: Double
    
    /**
      * A CID instance
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * The size of the DAGNodes making up the file in Bytes
      */
    var cumulativeSize: Double
    
    /**
      * Indicates if the queried dag is fully present locally
      */
    var local: js.UndefOr[Boolean] = js.undefined
    
    /**
      * UnixFS mode if applicable
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * UnixFS mtime if applicable
      */
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    /**
      * The file size in Bytes
      */
    var size: Double
    
    /**
      * Indicates the cumulative size of the data present locally
      */
    var sizeLocal: js.UndefOr[Double] = js.undefined
    
    /**
      * Either directory or file
      */
    var `type`: directory | file
    
    /**
      * Indicates if locality information is present
      */
    var withLocality: Boolean
  }
  object StatResult {
    
    inline def apply(
      blocks: Double,
      cid: CID[Any, Double, Double, Version],
      cumulativeSize: Double,
      size: Double,
      `type`: directory | file,
      withLocality: Boolean
    ): StatResult = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], cumulativeSize = cumulativeSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], withLocality = withLocality.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatResult]
    }
    
    extension [Self <: StatResult](x: Self) {
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCumulativeSize(value: Double): Self = StObject.set(x, "cumulativeSize", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeLocal(value: Double): Self = StObject.set(x, "sizeLocal", value.asInstanceOf[js.Any])
      
      inline def setSizeLocalUndefined: Self = StObject.set(x, "sizeLocal", js.undefined)
      
      inline def setType(value: directory | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWithLocality(value: Boolean): Self = StObject.set(x, "withLocality", value.asInstanceOf[js.Any])
    }
  }
  
  trait TouchOptions
    extends StObject
       with MFSOptions
       with AbortOptions {
    
    /**
      * The CID version to use for any updated entries
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * The hash algorithm to use for any updated entries
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * A Date object, an object with { secs, nsecs } properties where secs is the number of seconds since (positive) or before (negative) the Unix Epoch began and nsecs is the number of nanoseconds since the last full second, or the output of process.hrtime()
      */
    var mtime: js.UndefOr[MtimeLike] = js.undefined
    
    /**
      * The threshold for splitting any modified folders into HAMT shards
      */
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
  }
  object TouchOptions {
    
    inline def apply(): TouchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchOptions]
    }
    
    extension [Self <: TouchOptions](x: Self) {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setMtime(value: MtimeLike): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
    }
  }
  
  trait WriteOptions
    extends StObject
       with MFSOptions
       with AbortOptions {
    
    /**
      * The CID version to use for any updated entries
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * Create the MFS path if it does not exist
      */
    var create: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The hash algorithm to use for any updated entries
      */
    var hashAlg: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally limit how many bytes are written
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * An integer that represents the file mode
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * A Date object, an object with { secs, nsecs } properties where secs is the number of seconds since (positive) or before (negative) the Unix Epoch began and nsecs is the number of nanoseconds since the last full second, or the output of process.hrtime()
      */
    var mtime: js.UndefOr[MtimeLike] = js.undefined
    
    /**
      * An offset within the file to start writing at
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Create intermediate MFS paths if they do not exist
      */
    var parents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback to be notified of write progress
      */
    var progress: js.UndefOr[AddProgressFn] = js.undefined
    
    /**
      * If true, DAG leaves will contain raw file data and not be wrapped in a protobuf
      */
    var rawLeaves: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If writing a file and only a single leaf would be present, store the file data in the root node
      */
    var reduceSingleLeafToSelf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The threshold for splitting any modified folders into HAMT shards
      */
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * What sort of DAG structure to create
      */
    var strategy: js.UndefOr[balanced | trickle] = js.undefined
    
    /**
      * Truncate the file at the MFS path if it would have been larger than the passed content
      */
    var truncate: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    extension [Self <: WriteOptions](x: Self) {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
      
      inline def setHashAlgUndefined: Self = StObject.set(x, "hashAlg", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: MtimeLike): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setProgress(value: (/* bytes */ Double, /* path */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
      
      inline def setRawLeavesUndefined: Self = StObject.set(x, "rawLeaves", js.undefined)
      
      inline def setReduceSingleLeafToSelf(value: Boolean): Self = StObject.set(x, "reduceSingleLeafToSelf", value.asInstanceOf[js.Any])
      
      inline def setReduceSingleLeafToSelfUndefined: Self = StObject.set(x, "reduceSingleLeafToSelf", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
      
      inline def setStrategy(value: balanced | trickle): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
}
