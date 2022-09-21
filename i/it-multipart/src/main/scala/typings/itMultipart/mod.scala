package typings.itMultipart

import typings.node.bufferMod.global.Buffer
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {import('http').IncomingMessage} IncomingMessage
    * @typedef {import('http').IncomingHttpHeaders} IncomingHttpHeaders
    * @typedef {Object} Part
    * @property {IncomingHttpHeaders} headers
    * @property {AsyncIterable<Buffer>} body
    */
  /**
    * Streaming multipart HTTP message parser
    *
    * @param {IncomingMessage} request
    * @returns {AsyncIterable<Part>}
    */
  inline def apply(request: IncomingMessage): AsyncIterable[Part] = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[Part]]
  
  @JSImport("it-multipart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IncomingHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  type IncomingMessage = typings.node.httpMod.IncomingMessage
  
  trait Part extends StObject {
    
    var body: AsyncIterable[Buffer]
    
    var headers: IncomingHttpHeaders
  }
  object Part {
    
    inline def apply(body: AsyncIterable[Buffer], headers: IncomingHttpHeaders): Part = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Part]
    }
    
    extension [Self <: Part](x: Self) {
      
      inline def setBody(value: AsyncIterable[Buffer]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
