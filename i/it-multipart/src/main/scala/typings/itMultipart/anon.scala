package typings.itMultipart

import typings.itMultipart.mod.IncomingHttpHeaders
import typings.node.Buffer
import typings.std.AsyncIterable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: AsyncIterable[Buffer] & (AsyncIterator[Buffer, js.Any, Unit])
    
    var headers: IncomingHttpHeaders
  }
  object Body {
    
    inline def apply(body: AsyncIterable[Buffer] & (AsyncIterator[Buffer, js.Any, Unit]), headers: IncomingHttpHeaders): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: AsyncIterable[Buffer] & (AsyncIterator[Buffer, js.Any, Unit])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
