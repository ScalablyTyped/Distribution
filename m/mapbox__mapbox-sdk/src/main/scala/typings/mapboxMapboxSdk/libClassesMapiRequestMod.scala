package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.libClassesMapiClientMod.default
import typings.mapboxMapboxSdk.libClassesMapiErrorMod.MapiError
import typings.mapboxMapboxSdk.libClassesMapiResponseMod.MapiResponse
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.data
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.form
import typings.node.processMod.global.NodeJS.ReadStream
import typings.std.Blob
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassesMapiRequestMod {
  
  type Coordinates = js.Tuple2[Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb
  */
  trait DirectionsApproach extends StObject
  object DirectionsApproach {
    
    inline def curb: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb = "curb".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb]
    
    inline def unrestricted: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted = "unrestricted".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted]
  }
  
  trait EventEmitter[T] extends StObject {
    
    var downloadProgress: ProgressEvent[EventTarget]
    
    var error: MapiError[T]
    
    var response: MapiResponse[T]
    
    var uploadProgress: ProgressEvent[EventTarget]
  }
  object EventEmitter {
    
    inline def apply[T](
      downloadProgress: ProgressEvent[EventTarget],
      error: MapiError[T],
      response: MapiResponse[T],
      uploadProgress: ProgressEvent[EventTarget]
    ): EventEmitter[T] = {
      val __obj = js.Dynamic.literal(downloadProgress = downloadProgress.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uploadProgress = uploadProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventEmitter[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventEmitter[?], T] (val x: Self & EventEmitter[T]) extends AnyVal {
      
      inline def setDownloadProgress(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "downloadProgress", value.asInstanceOf[js.Any])
      
      inline def setError(value: MapiError[T]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: MapiResponse[T]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setUploadProgress(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "uploadProgress", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
  */
  trait MapboxProfile extends StObject
  object MapboxProfile {
    
    inline def cycling: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = "cycling".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling]
    
    inline def driving: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = "driving".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving]
    
    inline def `driving-traffic`: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic` = "driving-traffic".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`]
    
    inline def walking: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = "walking".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking]
  }
  
  @js.native
  trait MapiRequest[T]
    extends StObject
       with MapiRequestOptions {
    
    def abort(): Unit = js.native
    
    /**
      * If the request has been aborted (via abort), this property will be true.
      */
    var aborted: Boolean = js.native
    
    /**
      * This request's MapiClient.
      */
    var client: default = js.native
    
    def eachPage(callback: PageCallbackFunction[T]): Unit = js.native
    
    /**
      * An event emitter.
      */
    var emitter: EventEmitter[T] = js.native
    
    /**
      * If this request has been sent and received an error in response, the error is available on this property.
      */
    var error: js.UndefOr[MapiError[T] | js.Error] = js.native
    
    /**
      * If this request has been sent and received a response, the response is available on this property.
      */
    var response: js.UndefOr[MapiResponse[T]] = js.native
    
    def send(): js.Promise[MapiResponse[T]] = js.native
    
    /**
      * If the request has been sent, this property will be true.
      * You cannot send the same request twice, so if you need to create a new request
      * that is the equivalent of an existing one, use clone.
      */
    var sent: Boolean = js.native
    
    def url(): String = js.native
    def url(accessToken: String): String = js.native
  }
  
  trait MapiRequestOptions extends StObject {
    
    /**
      * Data to send with the request. If the request has a body, it will also be sent with the header 'Content-Type: application/json'.
      */
    var body: js.UndefOr[Any] = js.undefined
    
    /**
      * The encoding of the response.
      */
    var encoding: String
    
    /**
      * A file to send with the request. The browser client accepts Blobs and ArrayBuffers.
      */
    var file: Blob | js.typedarray.ArrayBuffer | String | ReadStream
    
    /**
      * The request's headers.
      */
    var headers: Any
    
    /**
      * The request's HTTP method.
      */
    var method: String
    
    /**
      * The request's origin.
      */
    var origin: String
    
    /**
      * A route parameters object, whose values will be interpolated the path.
      */
    var params: Any
    
    /**
      * The request's path, including colon-prefixed route parameters.
      */
    var path: String
    
    /**
      * A query object, which will be transformed into a URL query string.
      */
    var query: Any
    
    /**
      * The method to send the `file`. Options are `data` (x-www-form-urlencoded) or `form` (multipart/form-data)
      */
    var sendFileAs: data | form
  }
  object MapiRequestOptions {
    
    inline def apply(
      encoding: String,
      file: Blob | js.typedarray.ArrayBuffer | String | ReadStream,
      headers: Any,
      method: String,
      origin: String,
      params: Any,
      path: String,
      query: Any,
      sendFileAs: data | form
    ): MapiRequestOptions = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], sendFileAs = sendFileAs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapiRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapiRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Blob | js.typedarray.ArrayBuffer | String | ReadStream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSendFileAs(value: data | form): Self = StObject.set(x, "sendFileAs", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageCallbackFunction[T] extends StObject {
    
    var error: MapiError[T]
    
    def next(): Unit
    
    var response: MapiResponse[T]
  }
  object PageCallbackFunction {
    
    inline def apply[T](error: MapiError[T], next: () => Unit, response: MapiResponse[T]): PageCallbackFunction[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageCallbackFunction[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageCallbackFunction[?], T] (val x: Self & PageCallbackFunction[T]) extends AnyVal {
      
      inline def setError(value: MapiError[T]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setResponse(value: MapiResponse[T]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
