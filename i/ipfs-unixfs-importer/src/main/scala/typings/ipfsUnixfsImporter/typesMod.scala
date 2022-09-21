package typings.ipfsUnixfsImporter

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfs.mod.Mtime
import typings.ipfsUnixfs.mod.UnixFS
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.balanced
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.file
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.flat
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.raw
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.trickle
import typings.std.AbortSignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type BufferImporter = js.Function3[
    /* file */ File, 
    /* blockstore */ Blockstore, 
    /* options */ ImporterOptions, 
    AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
  ]
  
  type ChunkValidator = js.Function2[
    /* source */ AsyncIterable[js.typedarray.Uint8Array], 
    /* options */ ImporterOptions, 
    AsyncIterable[js.typedarray.Uint8Array]
  ]
  
  type Chunker = js.Function2[
    /* source */ AsyncIterable[js.typedarray.Uint8Array], 
    /* options */ ImporterOptions, 
    AsyncIterable[js.typedarray.Uint8Array]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.fixed
    - typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.rabin
  */
  trait ChunkerType extends StObject
  object ChunkerType {
    
    inline def fixed: typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.fixed = "fixed".asInstanceOf[typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.fixed]
    
    inline def rabin: typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.rabin = "rabin".asInstanceOf[typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.rabin]
  }
  
  type DAGBuilder = js.Function3[
    /* source */ AsyncIterable[ImportCandidate] | js.Iterable[ImportCandidate], 
    /* blockstore */ Blockstore, 
    /* options */ ImporterOptions, 
    AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
  ]
  
  trait Directory extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Directory {
    
    inline def apply(): Directory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Directory]
    }
    
    extension [Self <: Directory](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait File extends StObject {
    
    var content: AsyncIterable[js.typedarray.Uint8Array]
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object File {
    
    inline def apply(content: AsyncIterable[js.typedarray.Uint8Array]): File = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type FileDAGBuilder = js.Function3[
    /* source */ AsyncIterable[InProgressImportResult] | js.Iterable[InProgressImportResult], 
    /* reducer */ Reducer, 
    /* options */ ImporterOptions, 
    js.Promise[InProgressImportResult]
  ]
  
  type HamtHashFn = js.Function1[/* value */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]
  
  trait ImportCandidate extends StObject {
    
    var content: js.UndefOr[
        AsyncIterable[js.typedarray.Uint8Array] | js.Iterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array
      ] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object ImportCandidate {
    
    inline def apply(): ImportCandidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportCandidate]
    }
    
    extension [Self <: ImportCandidate](x: Self) {
      
      inline def setContent(
        value: AsyncIterable[js.typedarray.Uint8Array] | js.Iterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait ImportResult extends StObject {
    
    var cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    
    var path: js.UndefOr[String] = js.undefined
    
    var size: Double
    
    var unixfs: js.UndefOr[UnixFS] = js.undefined
  }
  object ImportResult {
    
    inline def apply(
      cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
      size: Double
    ): ImportResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportResult]
    }
    
    extension [Self <: ImportResult](x: Self) {
      
      inline def setCid(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUnixfs(value: UnixFS): Self = StObject.set(x, "unixfs", value.asInstanceOf[js.Any])
      
      inline def setUnixfsUndefined: Self = StObject.set(x, "unixfs", js.undefined)
    }
  }
  
  trait ImporterOptions extends StObject {
    
    var avgChunkSize: Double
    
    var blockWriteConcurrency: Double
    
    var bufferImporter: js.UndefOr[BufferImporter] = js.undefined
    
    var chunkValidator: js.UndefOr[ChunkValidator] = js.undefined
    
    var chunker: ChunkerType | Chunker
    
    var cidVersion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any
    
    var dagBuilder: js.UndefOr[DAGBuilder] = js.undefined
    
    var fileImportConcurrency: Double
    
    var hamtBucketBits: Double
    
    var hamtHashCode: Double
    
    def hamtHashFn(value: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
    @JSName("hamtHashFn")
    var hamtHashFn_Original: HamtHashFn
    
    var hasher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
    
    var hidden: Boolean
    
    var layerRepeat: Double
    
    var leafType: file | raw
    
    var maxChildrenPerNode: Double
    
    var maxChunkSize: Double
    
    var minChunkSize: Double
    
    var onlyHash: Boolean
    
    var polynomial: Double
    
    def progress(chunkSize: Double): Unit
    def progress(chunkSize: Double, path: String): Unit
    @JSName("progress")
    var progress_Original: ProgressHandler
    
    var rawLeaves: Boolean
    
    var recursive: Boolean
    
    var reduceSingleLeafToSelf: Boolean
    
    var shardSplitThreshold: Double
    
    var strategy: balanced | flat | trickle
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var treeBuilder: js.UndefOr[TreeBuilder] = js.undefined
    
    var window: Double
    
    var wrapWithDirectory: Boolean
  }
  object ImporterOptions {
    
    inline def apply(
      avgChunkSize: Double,
      blockWriteConcurrency: Double,
      chunker: ChunkerType | Chunker,
      cidVersion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any,
      fileImportConcurrency: Double,
      hamtBucketBits: Double,
      hamtHashCode: Double,
      hamtHashFn: /* value */ js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array],
      hasher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any,
      hidden: Boolean,
      layerRepeat: Double,
      leafType: file | raw,
      maxChildrenPerNode: Double,
      maxChunkSize: Double,
      minChunkSize: Double,
      onlyHash: Boolean,
      polynomial: Double,
      progress: (/* chunkSize */ Double, /* path */ js.UndefOr[String]) => Unit,
      rawLeaves: Boolean,
      recursive: Boolean,
      reduceSingleLeafToSelf: Boolean,
      shardSplitThreshold: Double,
      strategy: balanced | flat | trickle,
      window: Double,
      wrapWithDirectory: Boolean
    ): ImporterOptions = {
      val __obj = js.Dynamic.literal(avgChunkSize = avgChunkSize.asInstanceOf[js.Any], blockWriteConcurrency = blockWriteConcurrency.asInstanceOf[js.Any], chunker = chunker.asInstanceOf[js.Any], cidVersion = cidVersion.asInstanceOf[js.Any], fileImportConcurrency = fileImportConcurrency.asInstanceOf[js.Any], hamtBucketBits = hamtBucketBits.asInstanceOf[js.Any], hamtHashCode = hamtHashCode.asInstanceOf[js.Any], hamtHashFn = js.Any.fromFunction1(hamtHashFn), hasher = hasher.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], layerRepeat = layerRepeat.asInstanceOf[js.Any], leafType = leafType.asInstanceOf[js.Any], maxChildrenPerNode = maxChildrenPerNode.asInstanceOf[js.Any], maxChunkSize = maxChunkSize.asInstanceOf[js.Any], minChunkSize = minChunkSize.asInstanceOf[js.Any], onlyHash = onlyHash.asInstanceOf[js.Any], polynomial = polynomial.asInstanceOf[js.Any], progress = js.Any.fromFunction2(progress), rawLeaves = rawLeaves.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], reduceSingleLeafToSelf = reduceSingleLeafToSelf.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any], wrapWithDirectory = wrapWithDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImporterOptions]
    }
    
    extension [Self <: ImporterOptions](x: Self) {
      
      inline def setAvgChunkSize(value: Double): Self = StObject.set(x, "avgChunkSize", value.asInstanceOf[js.Any])
      
      inline def setBlockWriteConcurrency(value: Double): Self = StObject.set(x, "blockWriteConcurrency", value.asInstanceOf[js.Any])
      
      inline def setBufferImporter(
        value: (/* file */ File, /* blockstore */ Blockstore, /* options */ ImporterOptions) => AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
      ): Self = StObject.set(x, "bufferImporter", js.Any.fromFunction3(value))
      
      inline def setBufferImporterUndefined: Self = StObject.set(x, "bufferImporter", js.undefined)
      
      inline def setChunkValidator(
        value: (/* source */ AsyncIterable[js.typedarray.Uint8Array], /* options */ ImporterOptions) => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunkValidator", js.Any.fromFunction2(value))
      
      inline def setChunkValidatorUndefined: Self = StObject.set(x, "chunkValidator", js.undefined)
      
      inline def setChunker(value: ChunkerType | Chunker): Self = StObject.set(x, "chunker", value.asInstanceOf[js.Any])
      
      inline def setChunkerFunction2(
        value: (/* source */ AsyncIterable[js.typedarray.Uint8Array], /* options */ ImporterOptions) => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunker", js.Any.fromFunction2(value))
      
      inline def setCidVersion(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any
      ): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setDagBuilder(
        value: (/* source */ AsyncIterable[ImportCandidate] | js.Iterable[ImportCandidate], /* blockstore */ Blockstore, /* options */ ImporterOptions) => AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
      ): Self = StObject.set(x, "dagBuilder", js.Any.fromFunction3(value))
      
      inline def setDagBuilderUndefined: Self = StObject.set(x, "dagBuilder", js.undefined)
      
      inline def setFileImportConcurrency(value: Double): Self = StObject.set(x, "fileImportConcurrency", value.asInstanceOf[js.Any])
      
      inline def setHamtBucketBits(value: Double): Self = StObject.set(x, "hamtBucketBits", value.asInstanceOf[js.Any])
      
      inline def setHamtHashCode(value: Double): Self = StObject.set(x, "hamtHashCode", value.asInstanceOf[js.Any])
      
      inline def setHamtHashFn(value: /* value */ js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "hamtHashFn", js.Any.fromFunction1(value))
      
      inline def setHasher(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLayerRepeat(value: Double): Self = StObject.set(x, "layerRepeat", value.asInstanceOf[js.Any])
      
      inline def setLeafType(value: file | raw): Self = StObject.set(x, "leafType", value.asInstanceOf[js.Any])
      
      inline def setMaxChildrenPerNode(value: Double): Self = StObject.set(x, "maxChildrenPerNode", value.asInstanceOf[js.Any])
      
      inline def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
      
      inline def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
      
      inline def setOnlyHash(value: Boolean): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
      
      inline def setPolynomial(value: Double): Self = StObject.set(x, "polynomial", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: (/* chunkSize */ Double, /* path */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setReduceSingleLeafToSelf(value: Boolean): Self = StObject.set(x, "reduceSingleLeafToSelf", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: balanced | flat | trickle): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTreeBuilder(
        value: (/* source */ AsyncIterable[InProgressImportResult], /* blockstore */ Blockstore, /* options */ ImporterOptions) => AsyncIterable[ImportResult]
      ): Self = StObject.set(x, "treeBuilder", js.Any.fromFunction3(value))
      
      inline def setTreeBuilderUndefined: Self = StObject.set(x, "treeBuilder", js.undefined)
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWrapWithDirectory(value: Boolean): Self = StObject.set(x, "wrapWithDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  trait InProgressImportResult
    extends StObject
       with ImportResult {
    
    var single: js.UndefOr[Boolean] = js.undefined
  }
  object InProgressImportResult {
    
    inline def apply(
      cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
      size: Double
    ): InProgressImportResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProgressImportResult]
    }
    
    extension [Self <: InProgressImportResult](x: Self) {
      
      inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
  
  trait PersistOptions extends StObject {
    
    var cidVersion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any
    
    var codec: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ] = js.undefined
    
    var hasher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
    
    var onlyHash: Boolean
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object PersistOptions {
    
    inline def apply(
      cidVersion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any,
      hasher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any,
      onlyHash: Boolean
    ): PersistOptions = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], hasher = hasher.asInstanceOf[js.Any], onlyHash = onlyHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistOptions]
    }
    
    extension [Self <: PersistOptions](x: Self) {
      
      inline def setCidVersion(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any
      ): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCodec(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
      
      inline def setHasher(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
      
      inline def setOnlyHash(value: Boolean): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type ProgressHandler = js.Function2[/* chunkSize */ Double, /* path */ js.UndefOr[String], Unit]
  
  type Reducer = js.Function1[/* leaves */ js.Array[InProgressImportResult], js.Promise[InProgressImportResult]]
  
  type TreeBuilder = js.Function3[
    /* source */ AsyncIterable[InProgressImportResult], 
    /* blockstore */ Blockstore, 
    /* options */ ImporterOptions, 
    AsyncIterable[ImportResult]
  ]
  
  trait TrickleDagNode extends StObject {
    
    var children: js.Array[InProgressImportResult]
    
    var cid: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ] = js.undefined
    
    var data: js.UndefOr[js.Array[InProgressImportResult]] = js.undefined
    
    var depth: Double
    
    var maxChildren: Double
    
    var maxDepth: Double
    
    var parent: js.UndefOr[TrickleDagNode] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var unixfs: js.UndefOr[UnixFS] = js.undefined
  }
  object TrickleDagNode {
    
    inline def apply(children: js.Array[InProgressImportResult], depth: Double, maxChildren: Double, maxDepth: Double): TrickleDagNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], maxChildren = maxChildren.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrickleDagNode]
    }
    
    extension [Self <: TrickleDagNode](x: Self) {
      
      inline def setChildren(value: js.Array[InProgressImportResult]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: InProgressImportResult*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCid(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setData(value: js.Array[InProgressImportResult]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: InProgressImportResult*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setMaxChildren(value: Double): Self = StObject.set(x, "maxChildren", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setParent(value: TrickleDagNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUnixfs(value: UnixFS): Self = StObject.set(x, "unixfs", value.asInstanceOf[js.Any])
      
      inline def setUnixfsUndefined: Self = StObject.set(x, "unixfs", js.undefined)
    }
  }
  
  type UnixFSV1DagBuilder[T] = js.Function3[
    /* item */ T, 
    /* blockstore */ Blockstore, 
    /* options */ ImporterOptions, 
    js.Promise[InProgressImportResult]
  ]
  
  trait UserImporterOptions extends StObject {
    
    var avgChunkSize: js.UndefOr[Double] = js.undefined
    
    var blockWriteConcurrency: js.UndefOr[Double] = js.undefined
    
    var bufferImporter: js.UndefOr[BufferImporter] = js.undefined
    
    var chunkValidator: js.UndefOr[ChunkValidator] = js.undefined
    
    var chunker: js.UndefOr[ChunkerType | Chunker] = js.undefined
    
    var cidVersion: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any
      ] = js.undefined
    
    var dagBuilder: js.UndefOr[DAGBuilder] = js.undefined
    
    var fileImportConcurrency: js.UndefOr[Double] = js.undefined
    
    var hamtBucketBits: js.UndefOr[Double] = js.undefined
    
    var hamtHashCode: js.UndefOr[Double] = js.undefined
    
    var hamtHashFn: js.UndefOr[HamtHashFn] = js.undefined
    
    var hasher: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var layerRepeat: js.UndefOr[Double] = js.undefined
    
    var leafType: js.UndefOr[file | raw] = js.undefined
    
    var maxChildrenPerNode: js.UndefOr[Double] = js.undefined
    
    var maxChunkSize: js.UndefOr[Double] = js.undefined
    
    var minChunkSize: js.UndefOr[Double] = js.undefined
    
    var onlyHash: js.UndefOr[Boolean] = js.undefined
    
    var polynomial: js.UndefOr[Double] = js.undefined
    
    var progress: js.UndefOr[ProgressHandler] = js.undefined
    
    var rawLeaves: js.UndefOr[Boolean] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var reduceSingleLeafToSelf: js.UndefOr[Boolean] = js.undefined
    
    var shardSplitThreshold: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[balanced | flat | trickle] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var treeBuilder: js.UndefOr[TreeBuilder] = js.undefined
    
    var window: js.UndefOr[Double] = js.undefined
    
    var wrapWithDirectory: js.UndefOr[Boolean] = js.undefined
  }
  object UserImporterOptions {
    
    inline def apply(): UserImporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserImporterOptions]
    }
    
    extension [Self <: UserImporterOptions](x: Self) {
      
      inline def setAvgChunkSize(value: Double): Self = StObject.set(x, "avgChunkSize", value.asInstanceOf[js.Any])
      
      inline def setAvgChunkSizeUndefined: Self = StObject.set(x, "avgChunkSize", js.undefined)
      
      inline def setBlockWriteConcurrency(value: Double): Self = StObject.set(x, "blockWriteConcurrency", value.asInstanceOf[js.Any])
      
      inline def setBlockWriteConcurrencyUndefined: Self = StObject.set(x, "blockWriteConcurrency", js.undefined)
      
      inline def setBufferImporter(
        value: (/* file */ File, /* blockstore */ Blockstore, /* options */ ImporterOptions) => AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
      ): Self = StObject.set(x, "bufferImporter", js.Any.fromFunction3(value))
      
      inline def setBufferImporterUndefined: Self = StObject.set(x, "bufferImporter", js.undefined)
      
      inline def setChunkValidator(
        value: (/* source */ AsyncIterable[js.typedarray.Uint8Array], /* options */ ImporterOptions) => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunkValidator", js.Any.fromFunction2(value))
      
      inline def setChunkValidatorUndefined: Self = StObject.set(x, "chunkValidator", js.undefined)
      
      inline def setChunker(value: ChunkerType | Chunker): Self = StObject.set(x, "chunker", value.asInstanceOf[js.Any])
      
      inline def setChunkerFunction2(
        value: (/* source */ AsyncIterable[js.typedarray.Uint8Array], /* options */ ImporterOptions) => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunker", js.Any.fromFunction2(value))
      
      inline def setChunkerUndefined: Self = StObject.set(x, "chunker", js.undefined)
      
      inline def setCidVersion(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CIDVersion */ Any
      ): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setCidVersionUndefined: Self = StObject.set(x, "cidVersion", js.undefined)
      
      inline def setDagBuilder(
        value: (/* source */ AsyncIterable[ImportCandidate] | js.Iterable[ImportCandidate], /* blockstore */ Blockstore, /* options */ ImporterOptions) => AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
      ): Self = StObject.set(x, "dagBuilder", js.Any.fromFunction3(value))
      
      inline def setDagBuilderUndefined: Self = StObject.set(x, "dagBuilder", js.undefined)
      
      inline def setFileImportConcurrency(value: Double): Self = StObject.set(x, "fileImportConcurrency", value.asInstanceOf[js.Any])
      
      inline def setFileImportConcurrencyUndefined: Self = StObject.set(x, "fileImportConcurrency", js.undefined)
      
      inline def setHamtBucketBits(value: Double): Self = StObject.set(x, "hamtBucketBits", value.asInstanceOf[js.Any])
      
      inline def setHamtBucketBitsUndefined: Self = StObject.set(x, "hamtBucketBits", js.undefined)
      
      inline def setHamtHashCode(value: Double): Self = StObject.set(x, "hamtHashCode", value.asInstanceOf[js.Any])
      
      inline def setHamtHashCodeUndefined: Self = StObject.set(x, "hamtHashCode", js.undefined)
      
      inline def setHamtHashFn(value: /* value */ js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "hamtHashFn", js.Any.fromFunction1(value))
      
      inline def setHamtHashFnUndefined: Self = StObject.set(x, "hamtHashFn", js.undefined)
      
      inline def setHasher(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
      
      inline def setHasherUndefined: Self = StObject.set(x, "hasher", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setLayerRepeat(value: Double): Self = StObject.set(x, "layerRepeat", value.asInstanceOf[js.Any])
      
      inline def setLayerRepeatUndefined: Self = StObject.set(x, "layerRepeat", js.undefined)
      
      inline def setLeafType(value: file | raw): Self = StObject.set(x, "leafType", value.asInstanceOf[js.Any])
      
      inline def setLeafTypeUndefined: Self = StObject.set(x, "leafType", js.undefined)
      
      inline def setMaxChildrenPerNode(value: Double): Self = StObject.set(x, "maxChildrenPerNode", value.asInstanceOf[js.Any])
      
      inline def setMaxChildrenPerNodeUndefined: Self = StObject.set(x, "maxChildrenPerNode", js.undefined)
      
      inline def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
      
      inline def setMaxChunkSizeUndefined: Self = StObject.set(x, "maxChunkSize", js.undefined)
      
      inline def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
      
      inline def setMinChunkSizeUndefined: Self = StObject.set(x, "minChunkSize", js.undefined)
      
      inline def setOnlyHash(value: Boolean): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
      
      inline def setOnlyHashUndefined: Self = StObject.set(x, "onlyHash", js.undefined)
      
      inline def setPolynomial(value: Double): Self = StObject.set(x, "polynomial", value.asInstanceOf[js.Any])
      
      inline def setPolynomialUndefined: Self = StObject.set(x, "polynomial", js.undefined)
      
      inline def setProgress(value: (/* chunkSize */ Double, /* path */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
      
      inline def setRawLeavesUndefined: Self = StObject.set(x, "rawLeaves", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setReduceSingleLeafToSelf(value: Boolean): Self = StObject.set(x, "reduceSingleLeafToSelf", value.asInstanceOf[js.Any])
      
      inline def setReduceSingleLeafToSelfUndefined: Self = StObject.set(x, "reduceSingleLeafToSelf", js.undefined)
      
      inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
      
      inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
      
      inline def setStrategy(value: balanced | flat | trickle): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTreeBuilder(
        value: (/* source */ AsyncIterable[InProgressImportResult], /* blockstore */ Blockstore, /* options */ ImporterOptions) => AsyncIterable[ImportResult]
      ): Self = StObject.set(x, "treeBuilder", js.Any.fromFunction3(value))
      
      inline def setTreeBuilderUndefined: Self = StObject.set(x, "treeBuilder", js.undefined)
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
      
      inline def setWrapWithDirectory(value: Boolean): Self = StObject.set(x, "wrapWithDirectory", value.asInstanceOf[js.Any])
      
      inline def setWrapWithDirectoryUndefined: Self = StObject.set(x, "wrapWithDirectory", js.undefined)
    }
  }
}
