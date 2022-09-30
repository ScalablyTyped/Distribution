package typings.lifeomicAxiosFetch

import org.scalablytyped.runtime.StringDictionary
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.delete_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.get_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.head_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.link_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.options_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.patch_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.post_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.purge_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.put_
import typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.unlink_
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axiosTypesMod {
  
  trait AxiosInstance extends StObject {
    
    def request[T](config: AxiosRequestConfig): AxiosPromise[T]
  }
  object AxiosInstance {
    
    inline def apply(request: AxiosRequestConfig => AxiosPromise[Any]): AxiosInstance = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[AxiosInstance]
    }
    
    extension [Self <: AxiosInstance](x: Self) {
      
      inline def setRequest(value: AxiosRequestConfig => AxiosPromise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait AxiosPromise[T]
    extends StObject
       with Promise[AxiosResponse[T]]
  
  trait AxiosRequestConfig
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var method: js.UndefOr[Method] = js.undefined
    
    var responseType: js.UndefOr[ResponseType] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object AxiosRequestConfig {
    
    inline def apply(): AxiosRequestConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxiosRequestConfig]
    }
    
    extension [Self <: AxiosRequestConfig](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait AxiosResponse[T] extends StObject {
    
    var config: AxiosRequestConfig
    
    var data: T
    
    var headers: Any
    
    var request: js.UndefOr[Any] = js.undefined
    
    var status: Double
    
    var statusText: String
  }
  object AxiosResponse {
    
    inline def apply[T](config: AxiosRequestConfig, data: T, headers: Any, status: Double, statusText: String): AxiosResponse[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosResponse[T]]
    }
    
    extension [Self <: AxiosResponse[?], T](x: Self & AxiosResponse[T]) {
      
      inline def setConfig(value: AxiosRequestConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.get_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.GET
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.delete_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.DELETE
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.head_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.HEAD
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.options_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.OPTIONS
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.post_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.POST
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.put_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PUT
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.patch_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PATCH
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.purge_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PURGE
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.link_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.LINK
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.unlink_
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.UNLINK
  */
  trait Method extends StObject
  object Method {
    
    inline def DELETE: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.DELETE = "DELETE".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.DELETE]
    
    inline def GET: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.GET = "GET".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.GET]
    
    inline def HEAD: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.HEAD = "HEAD".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.HEAD]
    
    inline def LINK: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.LINK = "LINK".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.LINK]
    
    inline def OPTIONS: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.OPTIONS]
    
    inline def PATCH: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PATCH = "PATCH".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PATCH]
    
    inline def POST: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.POST = "POST".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.POST]
    
    inline def PURGE: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PURGE = "PURGE".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PURGE]
    
    inline def PUT: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PUT = "PUT".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PUT]
    
    inline def UNLINK: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.UNLINK = "UNLINK".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.UNLINK]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def head: head_ = "head".asInstanceOf[head_]
    
    inline def link: link_ = "link".asInstanceOf[link_]
    
    inline def options: options_ = "options".asInstanceOf[options_]
    
    inline def patch: patch_ = "patch".asInstanceOf[patch_]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def purge: purge_ = "purge".asInstanceOf[purge_]
    
    inline def put: put_ = "put".asInstanceOf[put_]
    
    inline def unlink: unlink_ = "unlink".asInstanceOf[unlink_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.arraybuffer
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.blob
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.document
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.json
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.text
    - typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.stream
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def arraybuffer: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.arraybuffer = "arraybuffer".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.arraybuffer]
    
    inline def blob: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.blob = "blob".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.blob]
    
    inline def document: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.document = "document".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.document]
    
    inline def json: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.json = "json".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.json]
    
    inline def stream: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.stream = "stream".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.stream]
    
    inline def text: typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.text = "text".asInstanceOf[typings.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.text]
  }
}
