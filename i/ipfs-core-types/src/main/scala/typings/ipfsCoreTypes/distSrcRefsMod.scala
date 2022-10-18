package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.IPFSPath
import typings.ipfsCoreTypes.distSrcUtilsMod.PreloadOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRefsMod {
  
  trait API[OptionExtension] extends StObject {
    
    /**
      * List blocks stored in the local block store
      */
    def local(): AsyncIterable[RefsResult]
    def local(options: AbortOptions & OptionExtension): AsyncIterable[RefsResult]
    /**
      * List blocks stored in the local block store
      */
    @JSName("local")
    var local_Original: Local[OptionExtension]
    
    def refs(ipfsPath: js.Array[IPFSPath]): AsyncIterable[RefsResult]
    def refs(ipfsPath: js.Array[IPFSPath], options: RefsOptions & OptionExtension): AsyncIterable[RefsResult]
    /**
      * Get links (references) from an object
      */
    def refs(ipfsPath: IPFSPath): AsyncIterable[RefsResult]
    def refs(ipfsPath: IPFSPath, options: RefsOptions & OptionExtension): AsyncIterable[RefsResult]
    /**
      * Get links (references) from an object
      */
    @JSName("refs")
    var refs_Original: Refs[OptionExtension]
  }
  object API {
    
    inline def apply[OptionExtension](
      local: /* options */ js.UndefOr[AbortOptions & OptionExtension] => AsyncIterable[RefsResult],
      refs: (/* ipfsPath */ IPFSPath | js.Array[IPFSPath], /* options */ js.UndefOr[RefsOptions & OptionExtension]) => AsyncIterable[RefsResult]
    ): API[OptionExtension] = {
      val __obj = js.Dynamic.literal(local = js.Any.fromFunction1(local), refs = js.Any.fromFunction2(refs))
      __obj.asInstanceOf[API[OptionExtension]]
    }
    
    extension [Self <: API[?], OptionExtension](x: Self & API[OptionExtension]) {
      
      inline def setLocal(value: /* options */ js.UndefOr[AbortOptions & OptionExtension] => AsyncIterable[RefsResult]): Self = StObject.set(x, "local", js.Any.fromFunction1(value))
      
      inline def setRefs(
        value: (/* ipfsPath */ IPFSPath | js.Array[IPFSPath], /* options */ js.UndefOr[RefsOptions & OptionExtension]) => AsyncIterable[RefsResult]
      ): Self = StObject.set(x, "refs", js.Any.fromFunction2(value))
    }
  }
  
  type Local[OptionExtension] = js.Function1[
    /* options */ js.UndefOr[AbortOptions & OptionExtension], 
    AsyncIterable[RefsResult]
  ]
  
  type Refs[OptionExtension] = js.Function2[
    /* ipfsPath */ IPFSPath | js.Array[IPFSPath], 
    /* options */ js.UndefOr[RefsOptions & OptionExtension], 
    AsyncIterable[RefsResult]
  ]
  
  trait RefsOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    var edges: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object RefsOptions {
    
    inline def apply(): RefsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefsOptions]
    }
    
    extension [Self <: RefsOptions](x: Self) {
      
      inline def setEdges(value: Boolean): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  trait RefsResult extends StObject {
    
    var err: js.UndefOr[js.Error] = js.undefined
    
    var ref: String
  }
  object RefsResult {
    
    inline def apply(ref: String): RefsResult = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefsResult]
    }
    
    extension [Self <: RefsResult](x: Self) {
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
