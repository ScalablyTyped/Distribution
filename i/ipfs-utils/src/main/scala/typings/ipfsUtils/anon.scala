package typings.ipfsUtils

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
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
    
    var content: js.UndefOr[AsyncIterable[js.typedarray.Uint8Array]] = js.undefined
    
    var path: String
  }
  object Content {
    
    inline def apply(path: String): Content = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
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
}
