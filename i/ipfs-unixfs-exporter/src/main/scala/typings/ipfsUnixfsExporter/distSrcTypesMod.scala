package typings.ipfsUnixfsExporter

import typings.hamtSharding.mod.Bucket
import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfs.mod.UnixFS
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.`object`
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.directory
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.file
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.identity
import typings.ipfsUnixfsExporter.ipfsUnixfsExporterStrings.raw
import typings.ipldDagPb.mod.PBNode
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AbortSignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  @js.native
  trait Exportable[T] extends StObject {
    
    var cid: CID[Any, Double, Double, Version] = js.native
    
    def content(): AsyncIterable[T] = js.native
    def content(options: ExporterOptions): AsyncIterable[T] = js.native
    
    var depth: Double = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: file | directory | `object` | raw | identity = js.native
  }
  
  trait ExporterOptions extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ExporterOptions {
    
    inline def apply(): ExporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExporterOptions]
    }
    
    extension [Self <: ExporterOptions](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
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
    
    extension [Self <: NextResult](x: Self) {
      
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
  
  type Resolve = js.Function7[
    /* cid */ CID[Any, Double, Double, Version], 
    /* name */ String, 
    /* path */ String, 
    /* toResolve */ js.Array[String], 
    /* depth */ Double, 
    /* blockstore */ Blockstore, 
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
    
    extension [Self <: ResolveResult](x: Self) {
      
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
    /* blockstore */ Blockstore, 
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
    
    extension [Self <: ShardTraversalContext](x: Self) {
      
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
    - typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSFile
    - typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSDirectory
    - typings.ipfsUnixfsExporter.distSrcTypesMod.ObjectNode
    - typings.ipfsUnixfsExporter.distSrcTypesMod.RawNode
    - typings.ipfsUnixfsExporter.distSrcTypesMod.IdentityNode
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
    /* blockstore */ Blockstore, 
    js.Function1[/* options */ ExporterOptions, UnixfsV1Content]
  ]
}
