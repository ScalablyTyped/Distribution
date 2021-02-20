package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapiErrorMod {
  
  @js.native
  trait MapiError extends StObject {
    
    /**
      * If the server sent a response body, this property exposes that response, parsed as JSON if possible.
      */
    var body: js.UndefOr[js.Any] = js.native
    
    /**
      * Whatever message could be derived from the call site and HTTP response.
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * The errored request.
      */
    var request: MapiRequest = js.native
    
    /**
      * The numeric status code of the HTTP response
      */
    var statusCode: js.UndefOr[Double] = js.native
    
    /**
      * The type of error. Usually this is 'HttpError'.
      * If the request was aborted, so the error was not sent from the server, the type will be 'RequestAbortedError'.
      */
    var `type`: String = js.native
  }
  object MapiError {
    
    @scala.inline
    def apply(request: MapiRequest, `type`: String): MapiError = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapiError]
    }
    
    @scala.inline
    implicit class MapiErrorMutableBuilder[Self <: MapiError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setRequest(value: MapiRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
