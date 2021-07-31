package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapiResponseMod {
  
  trait MapiResponse extends StObject {
    
    /**
      * The response body, parsed as JSON.
      */
    var body: js.Any
    
    def hasNextPage(): Boolean
    
    /**
      * The parsed response headers.
      */
    var headers: js.Any
    
    /**
      * The parsed response links
      */
    var links: js.Any
    
    def nextPage(): MapiRequest
    
    /**
      * The raw response body.
      */
    var rawBody: String
    
    /**
      * The response's originating MapiRequest.
      */
    var request: MapiRequest
    
    /**
      * The response's status code.
      */
    var statusCode: Double
  }
  object MapiResponse {
    
    @scala.inline
    def apply(
      body: js.Any,
      hasNextPage: () => Boolean,
      headers: js.Any,
      links: js.Any,
      nextPage: () => MapiRequest,
      rawBody: String,
      request: MapiRequest,
      statusCode: Double
    ): MapiResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hasNextPage = js.Any.fromFunction0(hasNextPage), headers = headers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), rawBody = rawBody.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapiResponse]
    }
    
    @scala.inline
    implicit class MapiResponseMutableBuilder[Self <: MapiResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNextPage(value: () => Boolean): Self = StObject.set(x, "hasNextPage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: js.Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPage(value: () => MapiRequest): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRawBody(value: String): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: MapiRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
