package typings.k6

import typings.k6.anon.Body
import typings.k6.anon.Name
import typings.k6.experimentalBrowserFrameMod.Frame
import typings.k6.experimentalBrowserMod.ResourceTiming
import typings.k6.experimentalBrowserMod.ResourceType
import typings.k6.experimentalBrowserResponseMod.Response
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserRequestMod {
  
  @JSImport("k6/experimental/browser/request", "Request")
  @js.native
  open class Request () extends StObject {
    
    /**
      * An object with HTTP headers associated with the request. All header names are
      * lower-case.
      * @returns The headers object.
      */
    def allHeaders(): Record[String, String] = js.native
    
    /**
      * @returns the Frame that initiated this request
      */
    def frame(): Frame = js.native
    
    /**
      * Retuns the value of the header matching the name. The name is case insensitive.
      * @param name Header name to retrieve value for.
      * @returns The value of the header matching the name.
      */
    def headerValue(name: String): String | Null = js.native
    
    /**
      * An object with HTTP headers associated with the request. All header names are
      * lower-case.
      * @returns An object with HTTP headers associated with the request.
      */
    def headers(): Record[String, String] = js.native
    
    /**
      * An array with all the request HTTP headers. Unlike `Request.allHeaders()`,
      * header names are not lower-cased. Headers with multiple entries, such as
      * `Set-Cookie`, appear in the array multiple times.
      * @returns An array of all the request HTTP headers.
      */
    def headersArray(): js.Array[Name] = js.native
    
    /**
      * @returns a boolean stating whether the request is for a navigation
      */
    def isNavigationRequest(): Boolean = js.native
    
    /**
      * Request's method (GET, POST, etc.)
      * @returns request's method name
      */
    def method(): String = js.native
    
    /**
      * Contains the request's post body, if any.
      * @returns request's post body
      */
    def postData(): String = js.native
    
    /**
      * Request's post body in a binary form, if any.
      * @returns an ArrayBuffer with request's post data
      */
    def postDataBuffer(): js.typedarray.ArrayBuffer | Null = js.native
    
    /**
      * Contains the request's resource type as it was perceived by the rendering engine.
      * ResourceType will be one of the following: `document`, `stylesheet`, `image`,
      * `media`, `font`, `script`, `texttrack`, `xhr`, `fetch`, `eventsource`,
      * `websocket`, `manifest`, `other`.
      * @returns resource type name
      */
    def resourceType(): ResourceType = js.native
    
    /**
      * Returns the matching `Response` object, or `null` if the response was not received
      * due to error.
      * @returns The `Response` object, or `null` if the response was not received due to error.
      */
    def response(): Response | Null = js.native
    
    /**
      * Returns resource size information for given request.
      * @returns Resource size information for given request.
      */
    def size(): Body = js.native
    
    /**
      * Returns resource timing information for given request. Most of the timing values
      * become available upon the response, `responseEnd` becomes available when request
      * finishes.
      * @returns Resource timing information for given request.
      */
    def timing(): ResourceTiming = js.native
    
    /**
      * URL of the request.
      * @returns request URL
      */
    def url(): String = js.native
  }
}
