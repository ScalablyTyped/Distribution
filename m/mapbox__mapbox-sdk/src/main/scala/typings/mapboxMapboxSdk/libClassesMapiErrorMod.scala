package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassesMapiErrorMod {
  
  trait MapiError[T] extends StObject {
    
    /**
      * If the server sent a response body, this property exposes that response, parsed as JSON if possible.
      */
    var body: js.UndefOr[T] = js.undefined
    
    /**
      * Whatever message could be derived from the call site and HTTP response.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * The errored request.
      */
    var request: MapiRequest[T]
    
    /**
      * The numeric status code of the HTTP response
      */
    var statusCode: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of error. Usually this is 'HttpError'.
      * If the request was aborted, so the error was not sent from the server, the type will be 'RequestAbortedError'.
      */
    var `type`: String
  }
  object MapiError {
    
    inline def apply[T](request: MapiRequest[T], `type`: String): MapiError[T] = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapiError[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapiError[?], T] (val x: Self & MapiError[T]) extends AnyVal {
      
      inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRequest(value: MapiRequest[T]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
