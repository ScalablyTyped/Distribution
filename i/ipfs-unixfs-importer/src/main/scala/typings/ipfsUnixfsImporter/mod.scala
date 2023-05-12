package typings.ipfsUnixfsImporter

import typings.interfaceStore.mod.Await
import typings.interfaceStore.mod.AwaitIterable
import typings.ipfsUnixfs.mod.Mtime
import typings.ipfsUnixfs.mod.UnixFS
import typings.ipfsUnixfsImporter.distSrcChunkerMod.Chunker
import typings.ipfsUnixfsImporter.distSrcDagBuilderBufferImporterMod.BufferImportProgressEvents
import typings.ipfsUnixfsImporter.distSrcDagBuilderFileMod.ReducerProgressEvents
import typings.ipfsUnixfsImporter.distSrcDagBuilderMod.DAGBuilder
import typings.ipfsUnixfsImporter.distSrcDagBuilderMod.DagBuilderProgressEvents
import typings.ipfsUnixfsImporter.distSrcDagBuilderMod.ImporterSourceStream
import typings.ipfsUnixfsImporter.distSrcDagBuilderValidateChunksMod.ChunkValidator
import typings.ipfsUnixfsImporter.distSrcLayoutMod.FileLayout
import typings.ipfsUnixfsImporter.distSrcLayoutMod.Reducer
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterBooleans.`true`
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.file
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.raw
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressOptions
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs-importer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importByteStream(bufs: ByteStream, blockstore: WritableStorage): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importByteStream")(bufs.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  inline def importByteStream(bufs: ByteStream, blockstore: WritableStorage, options: ImporterOptions): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importByteStream")(bufs.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  
  inline def importBytes(buf: ImportContent, blockstore: WritableStorage): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importBytes")(buf.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  inline def importBytes(buf: ImportContent, blockstore: WritableStorage, options: ImporterOptions): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importBytes")(buf.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  
  inline def importDirectory(content: DirectoryCandidate, blockstore: WritableStorage): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importDirectory")(content.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  inline def importDirectory(content: DirectoryCandidate, blockstore: WritableStorage, options: ImporterOptions): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importDirectory")(content.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  
  inline def importFile(content: FileCandidate, blockstore: WritableStorage): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importFile")(content.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  inline def importFile(content: FileCandidate, blockstore: WritableStorage, options: ImporterOptions): js.Promise[ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("importFile")(content.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImportResult]]
  
  inline def importer(source: ImportCandidateStream, blockstore: WritableStorage): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: ImportCandidateStream, blockstore: WritableStorage, options: ImporterOptions): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  
  type BufferImporter = js.Function2[
    /* file */ File, 
    /* blockstore */ WritableStorage, 
    AsyncIterable[js.Function0[js.Promise[BufferImporterResult]]]
  ]
  
  trait BufferImporterResult
    extends StObject
       with ImportResult {
    
    var block: js.typedarray.Uint8Array
  }
  object BufferImporterResult {
    
    inline def apply(block: js.typedarray.Uint8Array, cid: CID[Any, Double, Double, Version], size: js.BigInt): BufferImporterResult = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferImporterResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferImporterResult] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: js.typedarray.Uint8Array): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    }
  }
  
  type ByteStream = AwaitIterable[js.typedarray.Uint8Array]
  
  trait Directory extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var originalPath: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Directory {
    
    inline def apply(): Directory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Directory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait DirectoryCandidate
    extends StObject
       with ImportCandidate {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var path: String
  }
  object DirectoryCandidate {
    
    inline def apply(path: String): DirectoryCandidate = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryCandidate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryCandidate] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var content: AsyncIterable[js.typedarray.Uint8Array]
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var originalPath: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object File {
    
    inline def apply(content: AsyncIterable[js.typedarray.Uint8Array]): File = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait FileCandidate
    extends StObject
       with ImportCandidate {
    
    var content: ImportContent
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object FileCandidate {
    
    inline def apply(content: ImportContent): FileCandidate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileCandidate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileCandidate] (val x: Self) extends AnyVal {
      
      inline def setContent(value: ImportContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type HamtHashFn = js.Function1[/* value */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsUnixfsImporter.mod.FileCandidate
    - typings.ipfsUnixfsImporter.mod.DirectoryCandidate
  */
  trait ImportCandidate extends StObject
  object ImportCandidate {
    
    inline def DirectoryCandidate(path: String): typings.ipfsUnixfsImporter.mod.DirectoryCandidate = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsUnixfsImporter.mod.DirectoryCandidate]
    }
    
    inline def FileCandidate(content: ImportContent): typings.ipfsUnixfsImporter.mod.FileCandidate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsUnixfsImporter.mod.FileCandidate]
    }
  }
  
  type ImportCandidateStream = (AsyncIterable[FileCandidate | DirectoryCandidate]) | (js.Iterable[FileCandidate | DirectoryCandidate])
  
  type ImportContent = ByteStream | js.typedarray.Uint8Array
  
  trait ImportResult extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    var path: js.UndefOr[String] = js.undefined
    
    var size: js.BigInt
    
    var unixfs: js.UndefOr[UnixFS] = js.undefined
  }
  object ImportResult {
    
    inline def apply(cid: CID[Any, Double, Double, Version], size: js.BigInt): ImportResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportResult] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSize(value: js.BigInt): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUnixfs(value: UnixFS): Self = StObject.set(x, "unixfs", value.asInstanceOf[js.Any])
      
      inline def setUnixfsUndefined: Self = StObject.set(x, "unixfs", js.undefined)
    }
  }
  
  trait ImporterOptions
    extends StObject
       with ProgressOptions[ImporterProgressEvents] {
    
    /**
      * How many blocks to hash and write to the block store concurrently. For small
      * numbers of large files this should be high (e.g. 50). Default: 50
      */
    var blockWriteConcurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * This option can be used to override the importer internals.
      *
      * This function should read `Buffer`s from `source` and persist them using `blockstore.put`
      * or similar
      * `entry` is the `{ path, content }` entry, where `entry.content` is an async
      * generator that yields Buffers
      * It should yield functions that return a Promise that resolves to an object with
      * the properties `{ cid, unixfs, size }` where `cid` is a [CID], `unixfs` is a [UnixFS] entry and `size` is a `Number` that represents the serialized size of the [IPLD] node that holds the buffer data.
      * Values will be pulled from this generator in parallel - the amount of
      * parallelisation is controlled by the `blockWriteConcurrency` option (default: 10)
      */
    var bufferImporter: js.UndefOr[BufferImporter] = js.undefined
    
    /**
      * This option can be used to override the importer internals.
      *
      * This function takes input from the `content` field of imported entries.
      * It should transform them into `Buffer`s, throwing an error if it cannot.
      * It should yield `Buffer` objects constructed from the `source` or throw an
      * `Error`
      */
    var chunkValidator: js.UndefOr[ChunkValidator] = js.undefined
    
    /**
      * The chunking strategy. See [./src/chunker/index.ts](./src/chunker/index.ts)
      * for available chunkers. Default: fixedSize
      */
    var chunker: js.UndefOr[Chunker] = js.undefined
    
    /**
      * the CID version to use when storing the data. Default: 1
      */
    var cidVersion: js.UndefOr[Version] = js.undefined
    
    /**
      * This option can be used to override the importer internals.
      *
      * This function should read `{ path, content }` entries from `source` and turn them
      * into DAGs
      * It should yield a `function` that returns a `Promise` that resolves to
      * `{ cid, path, unixfs, node }` where `cid` is a `CID`, `path` is a string, `unixfs`
      * is a UnixFS entry and `node` is a `DAGNode`.
      * Values will be pulled from this generator in parallel - the amount of parallelisation
      * is controlled by the `fileImportConcurrency` option (default: 50)
      */
    var dagBuilder: js.UndefOr[DAGBuilder] = js.undefined
    
    /**
      * How many files to import concurrently. For large numbers of small files this
      * should be high (e.g. 50). Default: 10
      */
    var fileImportConcurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * How the DAG that represents files are created. See
      * [./src/layout/index.ts](./src/layout/index.ts) for available layouts. Default: balanced
      */
    var layout: js.UndefOr[FileLayout] = js.undefined
    
    /**
      * What type of UnixFS node leaves should be - can be `'file'` or `'raw'`
      * (ignored when `rawLeaves` is `true`).
      *
      * This option exists to simulate kubo's trickle dag which uses a combination
      * of `'raw'` UnixFS leaves and `reduceSingleLeafToSelf: false`.
      *
      * For modern code the `rawLeaves: true` option should be used instead so leaves
      * are plain Uint8Arrays without a UnixFS/Protobuf wrapper.
      */
    var leafType: js.UndefOr[file | raw] = js.undefined
    
    /**
      * When a file would span multiple DAGNodes, if this is true the leaf nodes
      * will not be wrapped in `UnixFS` protobufs and will instead contain the
      * raw file bytes. Default: true
      */
    var rawLeaves: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the file being imported is small enough to fit into one DAGNodes, store
      * the file data in the root node along with the UnixFS metadata instead of
      * in a leaf node which would then require additional I/O to load. Default: true
      */
    var reduceSingleLeafToSelf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the serialized node is larger than this it might be converted to a HAMT
      * sharded directory. Default: 256KiB
      */
    var shardSplitThresholdBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * This option can be used to override the importer internals.
      *
      * This function should read `{ cid, path, unixfs, node }` entries from `source` and
      * place them in a directory structure
      * It should yield an object with the properties `{ cid, path, unixfs, size }` where
      * `cid` is a `CID`, `path` is a string, `unixfs` is a UnixFS entry and `size` is a `Number`.
      */
    var treeBuilder: js.UndefOr[TreeBuilder] = js.undefined
    
    /**
      * If true, all imported files and folders will be contained in a directory that
      * will correspond to the CID of the final entry yielded. Default: false
      */
    var wrapWithDirectory: js.UndefOr[Boolean] = js.undefined
  }
  object ImporterOptions {
    
    inline def apply(): ImporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImporterOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockWriteConcurrency(value: Double): Self = StObject.set(x, "blockWriteConcurrency", value.asInstanceOf[js.Any])
      
      inline def setBlockWriteConcurrencyUndefined: Self = StObject.set(x, "blockWriteConcurrency", js.undefined)
      
      inline def setBufferImporter(
        value: (/* file */ File, /* blockstore */ WritableStorage) => AsyncIterable[js.Function0[js.Promise[BufferImporterResult]]]
      ): Self = StObject.set(x, "bufferImporter", js.Any.fromFunction2(value))
      
      inline def setBufferImporterUndefined: Self = StObject.set(x, "bufferImporter", js.undefined)
      
      inline def setChunkValidator(
        value: /* source */ AsyncIterable[js.typedarray.Uint8Array] => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunkValidator", js.Any.fromFunction1(value))
      
      inline def setChunkValidatorUndefined: Self = StObject.set(x, "chunkValidator", js.undefined)
      
      inline def setChunker(
        value: /* source */ AsyncIterable[js.typedarray.Uint8Array] => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunker", js.Any.fromFunction1(value))
      
      inline def setChunkerUndefined: Self = StObject.set(x, "chunker", js.undefined)
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setDagBuilder(
        value: (/* source */ ImporterSourceStream, /* blockstore */ WritableStorage) => AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
      ): Self = StObject.set(x, "dagBuilder", js.Any.fromFunction2(value))
      
      inline def setDagBuilderUndefined: Self = StObject.set(x, "dagBuilder", js.undefined)
      
      inline def setFileImportConcurrency(value: Double): Self = StObject.set(x, "fileImportConcurrency", value.asInstanceOf[js.Any])
      
      inline def setFileImportConcurrencyUndefined: Self = StObject.set(x, "fileImportConcurrency", js.undefined)
      
      inline def setLayout(
        value: (/* source */ AsyncIterable[InProgressImportResult] | js.Iterable[InProgressImportResult], /* reducer */ Reducer) => js.Promise[InProgressImportResult]
      ): Self = StObject.set(x, "layout", js.Any.fromFunction2(value))
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLeafType(value: file | raw): Self = StObject.set(x, "leafType", value.asInstanceOf[js.Any])
      
      inline def setLeafTypeUndefined: Self = StObject.set(x, "leafType", js.undefined)
      
      inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
      
      inline def setRawLeavesUndefined: Self = StObject.set(x, "rawLeaves", js.undefined)
      
      inline def setReduceSingleLeafToSelf(value: Boolean): Self = StObject.set(x, "reduceSingleLeafToSelf", value.asInstanceOf[js.Any])
      
      inline def setReduceSingleLeafToSelfUndefined: Self = StObject.set(x, "reduceSingleLeafToSelf", js.undefined)
      
      inline def setShardSplitThresholdBytes(value: Double): Self = StObject.set(x, "shardSplitThresholdBytes", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdBytesUndefined: Self = StObject.set(x, "shardSplitThresholdBytes", js.undefined)
      
      inline def setTreeBuilder(
        value: (/* source */ AsyncIterable[InProgressImportResult], /* blockstore */ WritableStorage) => AsyncIterable[ImportResult]
      ): Self = StObject.set(x, "treeBuilder", js.Any.fromFunction2(value))
      
      inline def setTreeBuilderUndefined: Self = StObject.set(x, "treeBuilder", js.undefined)
      
      inline def setWrapWithDirectory(value: Boolean): Self = StObject.set(x, "wrapWithDirectory", value.asInstanceOf[js.Any])
      
      inline def setWrapWithDirectoryUndefined: Self = StObject.set(x, "wrapWithDirectory", js.undefined)
    }
  }
  
  type ImporterProgressEvents = BufferImportProgressEvents | DagBuilderProgressEvents | ReducerProgressEvents
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsUnixfsImporter.mod.SingleBlockImportResult
    - typings.ipfsUnixfsImporter.mod.MultipleBlockImportResult
  */
  trait InProgressImportResult extends StObject
  object InProgressImportResult {
    
    inline def MultipleBlockImportResult(cid: CID[Any, Double, Double, Version], size: js.BigInt): typings.ipfsUnixfsImporter.mod.MultipleBlockImportResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsUnixfsImporter.mod.MultipleBlockImportResult]
    }
    
    inline def SingleBlockImportResult(block: js.typedarray.Uint8Array, cid: CID[Any, Double, Double, Version], size: js.BigInt): typings.ipfsUnixfsImporter.mod.SingleBlockImportResult = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], single = true, size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsUnixfsImporter.mod.SingleBlockImportResult]
    }
  }
  
  trait MultipleBlockImportResult
    extends StObject
       with ImportResult
       with InProgressImportResult {
    
    var originalPath: js.UndefOr[String] = js.undefined
  }
  object MultipleBlockImportResult {
    
    inline def apply(cid: CID[Any, Double, Double, Version], size: js.BigInt): MultipleBlockImportResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleBlockImportResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipleBlockImportResult] (val x: Self) extends AnyVal {
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
    }
  }
  
  trait SingleBlockImportResult
    extends StObject
       with ImportResult
       with InProgressImportResult {
    
    var block: js.typedarray.Uint8Array
    
    var originalPath: js.UndefOr[String] = js.undefined
    
    var single: `true`
  }
  object SingleBlockImportResult {
    
    inline def apply(block: js.typedarray.Uint8Array, cid: CID[Any, Double, Double, Version], size: js.BigInt): SingleBlockImportResult = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], single = true, size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleBlockImportResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleBlockImportResult] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: js.typedarray.Uint8Array): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
      
      inline def setSingle(value: `true`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeBuilder = js.Function2[
    /* source */ AsyncIterable[InProgressImportResult], 
    /* blockstore */ WritableStorage, 
    AsyncIterable[ImportResult]
  ]
  
  /* Inlined std.Pick<interface-blockstore.interface-blockstore.Blockstore<{}, {}, {}, {}, {}, {}, {}, {}>, 'put'> */
  trait WritableStorage extends StObject {
    
    def put(key: CID[Any, Double, Double, Version], `val`: js.typedarray.Uint8Array): Await[CID[Any, Double, Double, Version]]
    @JSName("put")
    var put_Original: js.Function2[
        /* key */ CID[Any, Double, Double, Version], 
        /* val */ js.typedarray.Uint8Array, 
        Await[CID[Any, Double, Double, Version]]
      ]
  }
  object WritableStorage {
    
    inline def apply(
      put: (/* key */ CID[Any, Double, Double, Version], /* val */ js.typedarray.Uint8Array) => Await[CID[Any, Double, Double, Version]]
    ): WritableStorage = {
      val __obj = js.Dynamic.literal(put = js.Any.fromFunction2(put))
      __obj.asInstanceOf[WritableStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WritableStorage] (val x: Self) extends AnyVal {
      
      inline def setPut(
        value: (/* key */ CID[Any, Double, Double, Version], /* val */ js.typedarray.Uint8Array) => Await[CID[Any, Double, Double, Version]]
      ): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
    }
  }
}
