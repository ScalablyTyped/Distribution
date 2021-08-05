package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.connectionMod.Connection
import typings.jsforce.queryMod.Query
import typings.node.streamMod.Stream
import typings.std.Error
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatterMod {
  
  @JSImport("jsforce/api/chatter", "Chatter")
  @js.native
  class Chatter protected () extends StObject {
    def this(conn: Connection) = this()
    
    def batch(): js.Promise[BatchRequestResults] = js.native
    def batch(callback: Callback[BatchRequestResults]): js.Promise[BatchRequestResults] = js.native
    
    def request(params: RequestParams): Request[RequestResult] = js.native
    def request(params: RequestParams, callback: Callback[Request[RequestResult]]): Request[RequestResult] = js.native
    
    def resource(url: String): Resource[RequestResult] = js.native
    def resource(url: String, queryParams: js.Object): Resource[RequestResult] = js.native
  }
  
  @JSImport("jsforce/api/chatter", "Request")
  @js.native
  class Request[T] protected ()
    extends StObject
       with PromiseLike[T] {
    def this(chatter: Chatter, params: RequestParams) = this()
    
    def batchParams(): BatchRequestParams = js.native
    
    def `finally`(): js.Promise[T] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
    
    def promise(): js.Promise[T] = js.native
    
    def stream(): Stream = js.native
    
    def thenCall(): Query[T] = js.native
    def thenCall(callback: js.Function2[/* err */ Error, /* records */ T, Unit]): Query[T] = js.native
  }
  
  @JSImport("jsforce/api/chatter", "RequestResult")
  @js.native
  class RequestResult () extends StObject
  
  @JSImport("jsforce/api/chatter", "Resource")
  @js.native
  class Resource[T] protected () extends Request[T] {
    def this(chatter: Chatter, url: String) = this()
    def this(chatter: Chatter, url: String, queryParams: js.Object) = this()
    
    def create(data: String): Request[T] = js.native
    def create(data: String, callback: Callback[T]): Request[T] = js.native
    def create(data: js.Object): Request[T] = js.native
    def create(data: js.Object, callback: Callback[T]): Request[T] = js.native
    
    def del(): Request[T] = js.native
    def del(callback: Callback[T]): Request[T] = js.native
    
    def delete(): Request[T] = js.native
    def delete(callback: Callback[T]): Request[T] = js.native
    
    def retrieve(): Request[T] = js.native
    def retrieve(callback: Callback[T]): Request[T] = js.native
    
    def update(data: js.Object): Request[T] = js.native
    def update(data: js.Object, callback: Callback[T]): Request[T] = js.native
  }
  
  trait BatchRequestParams
    extends StObject
       with RequestParams {
    
    var richInput: js.UndefOr[String] = js.undefined
  }
  object BatchRequestParams {
    
    inline def apply(method: String, url: String): BatchRequestParams = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchRequestParams]
    }
    
    extension [Self <: BatchRequestParams](x: Self) {
      
      inline def setRichInput(value: String): Self = StObject.set(x, "richInput", value.asInstanceOf[js.Any])
      
      inline def setRichInputUndefined: Self = StObject.set(x, "richInput", js.undefined)
    }
  }
  
  trait BatchRequestResult extends StObject {
    
    var result: RequestResult
    
    var statusCode: String
  }
  object BatchRequestResult {
    
    inline def apply(result: RequestResult, statusCode: String): BatchRequestResult = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchRequestResult]
    }
    
    extension [Self <: BatchRequestResult](x: Self) {
      
      inline def setResult(value: RequestResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchRequestResults extends StObject {
    
    var hasError: Boolean
    
    var results: js.Array[BatchRequestResult]
  }
  object BatchRequestResults {
    
    inline def apply(hasError: Boolean, results: js.Array[BatchRequestResult]): BatchRequestResults = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchRequestResults]
    }
    
    extension [Self <: BatchRequestResults](x: Self) {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[BatchRequestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: BatchRequestResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  trait RequestParams extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var url: String
  }
  object RequestParams {
    
    inline def apply(method: String, url: String): RequestParams = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParams]
    }
    
    extension [Self <: RequestParams](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
