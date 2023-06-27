package typings.k6

import typings.k6.anon.Body
import typings.k6.anon.IpAddress
import typings.k6.anon.Name
import typings.k6.experimentalBrowserFrameMod.Frame
import typings.k6.experimentalBrowserMod.SecurityDetailsObject
import typings.k6.experimentalBrowserRequestMod.Request
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserResponseMod {
  
  @JSImport("k6/experimental/browser/response", "Response")
  @js.native
  open class Response () extends StObject {
    
    /**
      * An object with HTTP headers associated with the response. All header names are
      * lower-case.
      * @returns The headers object.
      */
    def allHeaders(): Record[String, String] = js.native
    
    /**
      * Returns the response body.
      * @returns A buffer with response body.
      */
    def body(): js.typedarray.ArrayBuffer = js.native
    
    /**
      * @returns the Frame that initiated this response
      */
    def frame(): Frame = js.native
    
    /**
      * Returns the value of the header matching the name. The name is case insensitive.
      * If multiple headers have the same name (except `Set-Cookie`), they are returned
      * as a list separated by ``,``. For `Set-Cookie`, the `\n` separator is used. If
      * no headers are found, `null` is returned.
      * @param name Header name to retrieve value for.
      * @returns The header value for the given name.
      */
    def headerValue(name: String): String | Null = js.native
    
    /**
      * Returns all values of the headers matching the name, for example `set-cookie`.
      * The name is case insensitive.
      * @param name Header name to retrieve values for.
      * @returns An array of header values for the given name.
      */
    def headerValues(name: String): js.Array[String] = js.native
    
    /**
      * An object with HTTP headers associated with the response. All header names are
      * lower-case.
      * @returns The headers object.
      */
    def headers(): Record[String, String] = js.native
    
    /**
      * An array with all the request HTTP response headers. Unlike `Response.headers()`, header
      * names are not lower-cased. Headers with multiple entries, such as `Set-Cookie`,
      * appear in the array multiple times.
      * @returns An array of all the request HTTP headers.
      */
    def headersArray(): js.Array[Name] = js.native
    
    /**
      * Returns the JSON representation of response body. Throws if response body is not
      * parsable via `JSON.parse`.
      * @returns JSON representation of response body.
      */
    def json(): Any = js.native
    
    /**
      * Contains a boolean stating whether the response was successful (status in the
      * range 200-299) or not.
      * @returns a boolean stating whether the response was successful
      */
    def ok(): Boolean = js.native
    
    /**
      * The request that was used to produce the response.
      * @returns the matching `Request` object
      */
    def request(): Request = js.native
    
    /**
      * Security details associated with this response.
      * @returns A matching `SecurityDetailsObject`
      */
    def securityDetails(): SecurityDetailsObject | Null = js.native
    
    /**
      * Returns the IP address and port of the server for this response.
      * @returns The IP address and port of the server
      */
    def serverAddr(): IpAddress | Null = js.native
    
    /**
      * The size of the response body and the headers.
      * @returns The size of the response body and the headers.
      */
    def size(): Body = js.native
    
    /**
      * Contains the status code of the response (e.g., 200 for a success).
      * @returns the status code of the response
      */
    def status(): Double = js.native
    
    /**
      * Contains the status text of the response (e.g. usually an "OK" for a success).
      * @returns the status text of the response
      */
    def statusText(): String = js.native
    
    /**
      * Contains the URL of the response.
      * @returns the URL of the response
      */
    def url(): String = js.native
  }
}
