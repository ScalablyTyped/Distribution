package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapiResponseMod {
  
  trait MapiResponse[T] extends StObject {
    
    /**
      * The response body, parsed as JSON.
      */
    var body: T
    
    def hasNextPage(): Boolean
    
    /**
      * The parsed response headers.
      */
    var headers: Any
    
    /**
      * The parsed response links
      */
    var links: Any
    
    def nextPage(): MapiRequest[T] | Null
    
    /**
      * The raw response body.
      */
    var rawBody: String
    
    /**
      * The response's originating MapiRequest.
      */
    var request: MapiRequest[T]
    
    /**
      * The response's status code.
      */
    var statusCode: Double
  }
  object MapiResponse {
    
    inline def apply[T](
      body: T,
      hasNextPage: () => Boolean,
      headers: Any,
      links: Any,
      nextPage: () => MapiRequest[T] | Null,
      rawBody: String,
      request: MapiRequest[T],
      statusCode: Double
    ): MapiResponse[T] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hasNextPage = js.Any.fromFunction0(hasNextPage), headers = headers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), rawBody = rawBody.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapiResponse[T]]
    }
    
    extension [Self <: MapiResponse[?], T](x: Self & MapiResponse[T]) {
      
      inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHasNextPage(value: () => Boolean): Self = StObject.set(x, "hasNextPage", js.Any.fromFunction0(value))
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setNextPage(value: () => MapiRequest[T] | Null): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
      
      inline def setRawBody(value: String): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: MapiRequest[T]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
