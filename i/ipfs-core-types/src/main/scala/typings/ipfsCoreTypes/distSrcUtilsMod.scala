package typings.ipfsCoreTypes

import typings.ipfsUnixfs.mod.Mtime
import typings.ipfsUnixfs.mod.MtimeLike
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AbortSignal
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.InstanceType
import typings.std.ReadableStream
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  trait AbortOptions extends StObject {
    
    /**
      * Can be provided to a function that starts a long running task, which will
      * be aborted when signal is triggered.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Can be provided to a function that starts a long running task, which will
      * be aborted after provided timeout (in ms).
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AbortOptions {
    
    inline def apply(): AbortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortOptions] (val x: Self) extends AnyVal {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type Await[T] = T | js.Promise[T]
  
  type AwaitIterable[T] = js.Iterable[T] | AsyncIterable[T]
  
  trait BaseEntry extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var path: String
  }
  object BaseEntry {
    
    inline def apply(path: String): BaseEntry = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseEntry] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseFile extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    var name: String
    
    var path: String
  }
  object BaseFile {
    
    inline def apply(cid: CID[Any, Double, Double, Version], name: String, path: String): BaseFile = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseFile] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrowserImportCandidate extends StObject {
    
    var content: js.UndefOr[Blob] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object BrowserImportCandidate {
    
    inline def apply(): BrowserImportCandidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserImportCandidate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserImportCandidate] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Blob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait BufferStore extends StObject {
    
    def get(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(key: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[Unit] = js.native
    
    var stores: js.Array[Any] = js.native
  }
  
  trait DirectoryEntry
    extends StObject
       with BaseEntry
       with Entry[Any] {
    
    var content: Unit
  }
  object DirectoryEntry {
    
    inline def apply(content: Unit, path: String): DirectoryEntry = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryEntry] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Unit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreTypes.distSrcUtilsMod.FileEntry[Content]
    - typings.ipfsCoreTypes.distSrcUtilsMod.DirectoryEntry
  */
  trait Entry[Content /* <: AsyncIterable[js.typedarray.Uint8Array] | Blob */] extends StObject
  object Entry {
    
    inline def DirectoryEntry(content: Unit, path: String): typings.ipfsCoreTypes.distSrcUtilsMod.DirectoryEntry = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcUtilsMod.DirectoryEntry]
    }
    
    inline def FileEntry[Content /* <: AsyncIterable[js.typedarray.Uint8Array] | Blob */](path: String): typings.ipfsCoreTypes.distSrcUtilsMod.FileEntry[Content] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcUtilsMod.FileEntry[Content]]
    }
  }
  
  trait FileEntry[Content /* <: AsyncIterable[js.typedarray.Uint8Array] | Blob */]
    extends StObject
       with BaseEntry
       with Entry[Content] {
    
    var content: js.UndefOr[Content] = js.undefined
  }
  object FileEntry {
    
    inline def apply[Content /* <: AsyncIterable[js.typedarray.Uint8Array] | Blob */](path: String): FileEntry[Content] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileEntry[Content]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileEntry[?], Content /* <: AsyncIterable[js.typedarray.Uint8Array] | Blob */] (val x: Self & FileEntry[Content]) extends AnyVal {
      
      inline def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type IPFSPath = (CID[Any, Double, Double, Version]) | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreTypes.distSrcUtilsMod.ToFile
    - typings.ipfsCoreTypes.distSrcUtilsMod.ToDirectory
    - typings.ipfsCoreTypes.distSrcUtilsMod.ToContent
  */
  type ImportCandidate = _ImportCandidate | ToContent
  
  type ImportCandidateStream = AwaitIterable[ImportCandidate] | ReadableStream[ImportCandidate]
  
  trait InputFile
    extends StObject
       with BaseFile {
    
    var unixfs: Unit
  }
  object InputFile {
    
    inline def apply(cid: CID[Any, Double, Double, Version], name: String, path: String, unixfs: Unit): InputFile = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], unixfs = unixfs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputFile] (val x: Self) extends AnyVal {
      
      inline def setUnixfs(value: Unit): Self = StObject.set(x, "unixfs", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreloadOptions extends StObject {
    
    var preload: js.UndefOr[Boolean] = js.undefined
  }
  object PreloadOptions {
    
    inline def apply(): PreloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreloadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreloadOptions] (val x: Self) extends AnyVal {
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    }
  }
  
  type ToContent = String | InstanceType[StringConstructor] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | Blob | AwaitIterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array]
  
  trait ToDirectory
    extends StObject
       with ToFileMetadata
       with _ImportCandidate {
    
    var content: Unit
    
    var path: String
  }
  object ToDirectory {
    
    inline def apply(content: Unit, path: String): ToDirectory = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToDirectory] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Unit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToFile
    extends StObject
       with ToFileMetadata
       with _ImportCandidate {
    
    var content: ToContent
    
    var path: js.UndefOr[String] = js.undefined
  }
  object ToFile {
    
    inline def apply(content: ToContent): ToFile = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToFile] (val x: Self) extends AnyVal {
      
      inline def setContent(value: ToContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait ToFileMetadata extends StObject {
    
    var mode: js.UndefOr[ToMode] = js.undefined
    
    var mtime: js.UndefOr[MtimeLike] = js.undefined
  }
  object ToFileMetadata {
    
    inline def apply(): ToFileMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToFileMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToFileMetadata] (val x: Self) extends AnyVal {
      
      inline def setMode(value: ToMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: MtimeLike): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    }
  }
  
  type ToMode = String | Double
  
  trait _ImportCandidate extends StObject
  object _ImportCandidate {
    
    inline def ToDirectory(content: Unit, path: String): typings.ipfsCoreTypes.distSrcUtilsMod.ToDirectory = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcUtilsMod.ToDirectory]
    }
    
    inline def ToFile(content: ToContent): typings.ipfsCoreTypes.distSrcUtilsMod.ToFile = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcUtilsMod.ToFile]
    }
  }
}
