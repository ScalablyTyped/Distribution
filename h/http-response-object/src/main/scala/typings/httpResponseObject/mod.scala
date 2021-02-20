package typings.httpResponseObject

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A response from a web request
    */
  @JSImport("http-response-object", JSImport.Namespace)
  @js.native
  class ^[TBody] protected () extends Response[TBody] {
    def this(statusCode: Double, headers: IncomingHttpHeaders, body: TBody, url: String) = this()
  }
  
  /**
    * A response from a web request
    */
  @js.native
  trait Response[TBody] extends StObject {
    
    val body: TBody = js.native
    
    def getBody(): TBody = js.native
    def getBody(encoding: String): String = js.native
    
    val headers: IncomingHttpHeaders = js.native
    
    def isError(): Boolean = js.native
    
    val statusCode: Double = js.native
    
    val url: String = js.native
  }
}
