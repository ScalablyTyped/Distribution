package typings.ipfsUnixfsExporter

import typings.hamtSharding.mod.Bucket
import typings.interfaceStore.mod.Await
import typings.ipfsUnixfs.mod.UnixFS
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.`object`
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.`unixfsColonexporterColonwalkColonhamt-sharded-directory`
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.directory
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.file
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.identity
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.raw
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.unixfsColonexporterColonprogressColonidentity
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.unixfsColonexporterColonprogressColonraw
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.unixfsColonexporterColonprogressColonunixfsColonfile
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.unixfsColonexporterColonprogressColonunixfsColonraw
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.unixfsColonexporterColonwalkColondirectory
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.unixfsColonexporterColonwalkColonfile
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.unixfsColonexporterColonwalkColonraw
import typings.ipldDagPb.mod.PBNode
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressEvent
import typings.progressEvents.mod.ProgressOptions
import typings.std.AbortSignal
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs-exporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exporter(path: String, blockstore: ReadableStorage): js.Promise[UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnixFSEntry]]
  inline def exporter(path: String, blockstore: ReadableStorage, options: ExporterOptions): js.Promise[UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnixFSEntry]]
  inline def exporter(path: CID[Any, Double, Double, Version], blockstore: ReadableStorage): js.Promise[UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnixFSEntry]]
  inline def exporter(path: CID[Any, Double, Double, Version], blockstore: ReadableStorage, options: ExporterOptions): js.Promise[UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnixFSEntry]]
  
  inline def recursive(path: String, blockstore: ReadableStorage): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  inline def recursive(path: String, blockstore: ReadableStorage, options: ExporterOptions): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  inline def recursive(path: CID[Any, Double, Double, Version], blockstore: ReadableStorage): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  inline def recursive(path: CID[Any, Double, Double, Version], blockstore: ReadableStorage, options: ExporterOptions): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  
  inline def walkPath(path: String, blockstore: ReadableStorage): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  inline def walkPath(path: String, blockstore: ReadableStorage, options: ExporterOptions): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  inline def walkPath(path: CID[Any, Double, Double, Version], blockstore: ReadableStorage): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  inline def walkPath(path: CID[Any, Double, Double, Version], blockstore: ReadableStorage, options: ExporterOptions): AsyncGenerator[UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[UnixFSEntry, Unit, Any]]
  
  trait ExportProgress extends StObject {
    
    /**
      * How many bytes of the file have been read
      */
    var bytesRead: js.BigInt
    
    /**
      * The size of the file being read - n.b. this may be
      * larger than `total` if `offset`/`length` has been
      * specified
      */
    var fileSize: js.BigInt
    
    /**
      * How many bytes of the file will be read - n.b. this may be
      * smaller than `fileSize` if `offset`/`length` have been
      * specified
      */
    var totalBytes: js.BigInt
  }
  object ExportProgress {
    
    inline def apply(bytesRead: js.BigInt, fileSize: js.BigInt, totalBytes: js.BigInt): ExportProgress = {
      val __obj = js.Dynamic.literal(bytesRead = bytesRead.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportProgress] (val x: Self) extends AnyVal {
      
      inline def setBytesRead(value: js.BigInt): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
      
      inline def setFileSize(value: js.BigInt): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: js.BigInt): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportWalk extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
  }
  object ExportWalk {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): ExportWalk = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportWalk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportWalk] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Exportable[T] extends StObject {
    
    var cid: CID[Any, Double, Double, Version] = js.native
    
    def content(): AsyncIterable[T] = js.native
    def content(options: ExporterOptions): AsyncIterable[T] = js.native
    
    var depth: Double = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var size: js.BigInt = js.native
    
    var `type`: file | directory | `object` | raw | identity = js.native
  }
  
  trait ExporterOptions
    extends StObject
       with ProgressOptions[ExporterProgressEvents] {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object ExporterOptions {
    
    inline def apply(): ExporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExporterOptions] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type ExporterProgressEvents = ProgressEvent[
    unixfsColonexporterColonprogressColonunixfsColonfile | unixfsColonexporterColonprogressColonunixfsColonraw | unixfsColonexporterColonprogressColonraw | unixfsColonexporterColonprogressColonidentity | unixfsColonexporterColonwalkColonfile | unixfsColonexporterColonwalkColondirectory | `unixfsColonexporterColonwalkColonhamt-sharded-directory` | unixfsColonexporterColonwalkColonraw, 
    ExportProgress | ExportWalk
  ]
  
  @js.native
  trait IdentityNode
    extends StObject
       with Exportable[js.typedarray.Uint8Array]
       with UnixFSEntry {
    
    var node: js.typedarray.Uint8Array = js.native
    
    @JSName("type")
    var type_IdentityNode: identity = js.native
  }
  
  trait NextResult extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    var name: String
    
    var path: String
    
    var toResolve: js.Array[String]
  }
  object NextResult {
    
    inline def apply(cid: CID[Any, Double, Double, Version], name: String, path: String, toResolve: js.Array[String]): NextResult = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], toResolve = toResolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NextResult] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setToResolve(value: js.Array[String]): Self = StObject.set(x, "toResolve", value.asInstanceOf[js.Any])
      
      inline def setToResolveVarargs(value: String*): Self = StObject.set(x, "toResolve", js.Array(value*))
    }
  }
  
  @js.native
  trait ObjectNode
    extends StObject
       with Exportable[Any]
       with UnixFSEntry {
    
    var node: js.typedarray.Uint8Array = js.native
    
    @JSName("type")
    var type_ObjectNode: `object` = js.native
  }
  
  @js.native
  trait RawNode
    extends StObject
       with Exportable[js.typedarray.Uint8Array]
       with UnixFSEntry {
    
    var node: js.typedarray.Uint8Array = js.native
    
    @JSName("type")
    var type_RawNode: raw = js.native
  }
  
  /* Inlined std.Pick<interface-blockstore.interface-blockstore.Blockstore<{}, {}, {}, {}, {}, {}, {}, {}>, 'get'> */
  trait ReadableStorage extends StObject {
    
    def get(key: CID[Any, Double, Double, Version]): Await[js.typedarray.Uint8Array]
    @JSName("get")
    var get_Original: js.Function1[/* key */ CID[Any, Double, Double, Version], Await[js.typedarray.Uint8Array]]
  }
  object ReadableStorage {
    
    inline def apply(get: /* key */ CID[Any, Double, Double, Version] => Await[js.typedarray.Uint8Array]): ReadableStorage = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[ReadableStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadableStorage] (val x: Self) extends AnyVal {
      
      inline def setGet(value: /* key */ CID[Any, Double, Double, Version] => Await[js.typedarray.Uint8Array]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  type Resolve = js.Function7[
    /* cid */ CID[Any, Double, Double, Version], 
    /* name */ String, 
    /* path */ String, 
    /* toResolve */ js.Array[String], 
    /* depth */ Double, 
    /* blockstore */ ReadableStorage, 
    /* options */ ExporterOptions, 
    js.Promise[ResolveResult]
  ]
  
  trait ResolveResult extends StObject {
    
    var entry: UnixFSEntry
    
    var next: js.UndefOr[NextResult] = js.undefined
  }
  object ResolveResult {
    
    inline def apply(entry: UnixFSEntry): ResolveResult = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveResult] (val x: Self) extends AnyVal {
      
      inline def setEntry(value: UnixFSEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setNext(value: NextResult): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  type Resolver = js.Function8[
    /* cid */ CID[Any, Double, Double, Version], 
    /* name */ String, 
    /* path */ String, 
    /* toResolve */ js.Array[String], 
    /* resolve */ Resolve, 
    /* depth */ Double, 
    /* blockstore */ ReadableStorage, 
    /* options */ ExporterOptions, 
    js.Promise[ResolveResult]
  ]
  
  trait ShardTraversalContext extends StObject {
    
    var hamtDepth: Double
    
    var lastBucket: Bucket[Boolean]
    
    var rootBucket: Bucket[Boolean]
  }
  object ShardTraversalContext {
    
    inline def apply(hamtDepth: Double, lastBucket: Bucket[Boolean], rootBucket: Bucket[Boolean]): ShardTraversalContext = {
      val __obj = js.Dynamic.literal(hamtDepth = hamtDepth.asInstanceOf[js.Any], lastBucket = lastBucket.asInstanceOf[js.Any], rootBucket = rootBucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShardTraversalContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShardTraversalContext] (val x: Self) extends AnyVal {
      
      inline def setHamtDepth(value: Double): Self = StObject.set(x, "hamtDepth", value.asInstanceOf[js.Any])
      
      inline def setLastBucket(value: Bucket[Boolean]): Self = StObject.set(x, "lastBucket", value.asInstanceOf[js.Any])
      
      inline def setRootBucket(value: Bucket[Boolean]): Self = StObject.set(x, "rootBucket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnixFSDirectory
    extends StObject
       with Exportable[UnixFSEntry]
       with UnixFSEntry {
    
    var node: PBNode = js.native
    
    @JSName("type")
    var type_UnixFSDirectory: directory = js.native
    
    var unixfs: UnixFS = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsUnixfsExporter.mod.UnixFSFile
    - typings.ipfsUnixfsExporter.mod.UnixFSDirectory
    - typings.ipfsUnixfsExporter.mod.ObjectNode
    - typings.ipfsUnixfsExporter.mod.RawNode
    - typings.ipfsUnixfsExporter.mod.IdentityNode
  */
  trait UnixFSEntry extends StObject
  
  @js.native
  trait UnixFSFile
    extends StObject
       with Exportable[js.typedarray.Uint8Array]
       with UnixFSEntry {
    
    var node: PBNode = js.native
    
    @JSName("type")
    var type_UnixFSFile: file = js.native
    
    var unixfs: UnixFS = js.native
  }
  
  type UnixfsV1Content = UnixfsV1FileContent | UnixfsV1DirectoryContent
  
  type UnixfsV1DirectoryContent = AsyncIterable[UnixFSEntry] | js.Iterable[UnixFSEntry]
  
  type UnixfsV1FileContent = AsyncIterable[js.typedarray.Uint8Array] | js.Iterable[js.typedarray.Uint8Array]
  
  type UnixfsV1Resolver = js.Function7[
    /* cid */ CID[Any, Double, Double, Version], 
    /* node */ PBNode, 
    /* unixfs */ UnixFS, 
    /* path */ String, 
    /* resolve */ Resolve, 
    /* depth */ Double, 
    /* blockstore */ ReadableStorage, 
    js.Function1[/* options */ ExporterOptions, UnixfsV1Content]
  ]
}
