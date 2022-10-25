package typings.itMultipart

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-multipart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(request: IncomingMessage): AsyncGenerator[Part, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(request.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[Part, Unit, Unit]]
  
  trait Part extends StObject {
    
    var body: AsyncIterable[js.typedarray.Uint8Array]
    
    var headers: IncomingHttpHeaders
  }
  object Part {
    
    inline def apply(body: AsyncIterable[js.typedarray.Uint8Array], headers: IncomingHttpHeaders): Part = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Part]
    }
    
    extension [Self <: Part](x: Self) {
      
      inline def setBody(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
