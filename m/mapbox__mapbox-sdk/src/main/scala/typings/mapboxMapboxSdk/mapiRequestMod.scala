package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.mapiErrorMod.MapiError
import typings.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import typings.mapboxMapboxSdk.mod.default
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Error
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapiRequestMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb
  */
  trait DirectionsApproach extends StObject
  object DirectionsApproach {
    
    inline def curb: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb = "curb".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.curb]
    
    inline def unrestricted: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted = "unrestricted".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unrestricted]
  }
  
  trait EventEmitter extends StObject {
    
    var downloadProgress: ProgressEvent[EventTarget]
    
    var error: MapiError
    
    var response: MapiResponse
    
    var uploadProgress: ProgressEvent[EventTarget]
  }
  object EventEmitter {
    
    inline def apply(
      downloadProgress: ProgressEvent[EventTarget],
      error: MapiError,
      response: MapiResponse,
      uploadProgress: ProgressEvent[EventTarget]
    ): EventEmitter = {
      val __obj = js.Dynamic.literal(downloadProgress = downloadProgress.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uploadProgress = uploadProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventEmitter]
    }
    
    extension [Self <: EventEmitter](x: Self) {
      
      inline def setDownloadProgress(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "downloadProgress", value.asInstanceOf[js.Any])
      
      inline def setError(value: MapiError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: MapiResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setUploadProgress(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "uploadProgress", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
  */
  trait MapboxProfile extends StObject
  object MapboxProfile {
    
    inline def cycling: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = "cycling".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling]
    
    inline def driving: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = "driving".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving]
    
    inline def walking: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = "walking".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking]
  }
  
  @js.native
  trait MapiRequest extends StObject {
    
    def abort(): Unit = js.native
    
    /**
      * If the request has been aborted (via abort), this property will be true.
      */
    var aborted: Boolean = js.native
    
    /**
      * Data to send with the request. If the request has a body, it will also be sent with the header 'Content-Type: application/json'.
      */
    var body: js.UndefOr[js.Any] = js.native
    
    /**
      * This request's MapiClient.
      */
    var client: default = js.native
    
    def eachPage(callback: PageCallbackFunction): Unit = js.native
    
    /**
      * An event emitter.
      */
    var emitter: EventEmitter = js.native
    
    /**
      * If this request has been sent and received an error in response, the error is available on this property.
      */
    var error: js.UndefOr[MapiError | Error] = js.native
    
    /**
      * A file to send with the request. The browser client accepts Blobs and ArrayBuffers.
      */
    var file: Blob | ArrayBuffer | String = js.native
    
    /**
      * The request's headers.
      */
    var headers: js.Any = js.native
    
    /**
      * The request's HTTP method.
      */
    var method: String = js.native
    
    /**
      * The request's origin.
      */
    var origin: String = js.native
    
    /**
      * A route parameters object, whose values will be interpolated the path.
      */
    var params: js.Any = js.native
    
    /**
      * The request's path, including colon-prefixed route parameters.
      */
    var path: String = js.native
    
    /**
      * A query object, which will be transformed into a URL query string.
      */
    var query: js.Any = js.native
    
    /**
      * If this request has been sent and received a response, the response is available on this property.
      */
    var response: js.UndefOr[MapiResponse] = js.native
    
    def send(): js.Promise[MapiResponse] = js.native
    
    /**
      * If the request has been sent, this property will be true.
      * You cannot send the same request twice, so if you need to create a new request
      * that is the equivalent of an existing one, use clone.
      */
    var sent: Boolean = js.native
    
    def url(): String = js.native
    def url(accessToken: String): String = js.native
  }
  
  trait PageCallbackFunction extends StObject {
    
    var error: MapiError
    
    def next(): Unit
    
    var response: MapiResponse
  }
  object PageCallbackFunction {
    
    inline def apply(error: MapiError, next: () => Unit, response: MapiResponse): PageCallbackFunction = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageCallbackFunction]
    }
    
    extension [Self <: PageCallbackFunction](x: Self) {
      
      inline def setError(value: MapiError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setResponse(value: MapiResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
