package typings.ipfsUtils

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.bufferMod.global.Buffer
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.FormData
import typings.std.ReadableStream
import typings.std.Record
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.ResponseInit
import typings.std.URL
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: js.UndefOr[AsyncIterable[Buffer]] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.MtimeLike */ Any
      ] = js.undefined
    
    var path: String
  }
  object Content {
    
    inline def apply(path: String): Content = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: AsyncIterable[Buffer]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.MtimeLike */ Any
      ): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default extends StObject {
    
    def default(input: RequestInfo): js.Promise[Response]
    def default(input: RequestInfo, init: RequestInit): js.Promise[Response]
    def default(input: URL): js.Promise[Response]
    def default(input: URL, init: RequestInit): js.Promise[Response]
    
    var Headers: Instantiable
    
    var Request: InstantiableAny
    
    var Response: Error
    
    @JSName("default")
    var default_Original: FnCall
  }
  object Default {
    
    inline def apply(Headers: Instantiable, Request: InstantiableAny, Response: Error, default: FnCall): Default = {
      val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: FnCall): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Instantiable): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: InstantiableAny): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Error): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error
    extends StObject
       with Instantiable0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any
        ]
       with Instantiable1[
          (/* body */ js.typedarray.ArrayBuffer) | (/* body */ js.typedarray.ArrayBufferView) | (/* body */ Blob) | (/* body */ FormData) | (/* body */ ReadableStream[js.typedarray.Uint8Array]) | (/* body */ String) | (/* body */ URLSearchParams), 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any
        ]
       with Instantiable2[
          (/* body */ js.typedarray.ArrayBuffer) | (/* body */ js.typedarray.ArrayBufferView) | (/* body */ Blob) | (/* body */ FormData) | (/* body */ Null) | (/* body */ ReadableStream[js.typedarray.Uint8Array]) | (/* body */ String) | (/* body */ URLSearchParams) | (/* body */ Unit), 
          /* init */ ResponseInit, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any
        ] {
    
    def error(): Any = js.native
    
    def redirect(url: String): Any = js.native
    def redirect(url: String, status: Double): Any = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  trait FollowSymlinks extends StObject {
    
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.MtimeLike */ Any
      ] = js.undefined
    
    var preserveMode: js.UndefOr[Boolean] = js.undefined
    
    var preserveMtime: js.UndefOr[Boolean] = js.undefined
  }
  object FollowSymlinks {
    
    inline def apply(): FollowSymlinks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FollowSymlinks]
    }
    
    extension [Self <: FollowSymlinks](x: Self) {
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.MtimeLike */ Any
      ): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPreserveMode(value: Boolean): Self = StObject.set(x, "preserveMode", value.asInstanceOf[js.Any])
      
      inline def setPreserveModeUndefined: Self = StObject.set(x, "preserveMode", js.undefined)
      
      inline def setPreserveMtime(value: Boolean): Self = StObject.set(x, "preserveMtime", value.asInstanceOf[js.Any])
      
      inline def setPreserveMtimeUndefined: Self = StObject.set(x, "preserveMtime", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var default: Any
    
    var Headers: Any
    
    var Request: Any
    
    var Response: Any
  }
  object Headers {
    
    inline def apply(Headers: Any, Request: Any, Response: Any, default: Any): Headers = {
      val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Any): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
        ]
       with Instantiable1[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ /* init */ Any) | (/* init */ js.Array[js.Array[String]]) | (/* init */ Record[String, String]), 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
        ]
  
  @js.native
  trait InstantiableAny
    extends StObject
       with Instantiable1[
          /* input */ RequestInfo, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request */ Any
        ]
       with Instantiable2[
          /* input */ RequestInfo, 
          /* init */ RequestInit, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request */ Any
        ]
  
  trait Path extends StObject {
    
    var content: js.UndefOr[AsyncIterable[js.typedarray.Uint8Array]] = js.undefined
    
    var path: String
  }
  object Path {
    
    inline def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
