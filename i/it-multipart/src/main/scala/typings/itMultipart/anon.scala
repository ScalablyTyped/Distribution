package typings.itMultipart

import typings.itMultipart.mod.IncomingHttpHeaders
import typings.node.Buffer
import typings.std.AsyncIterable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: AsyncIterable[Buffer] with (AsyncIterator[Buffer, _, js.UndefOr[scala.Nothing]]) = js.native
    
    var headers: IncomingHttpHeaders = js.native
  }
  object Body {
    
    @scala.inline
    def apply(
      body: AsyncIterable[Buffer] with (AsyncIterator[Buffer, _, js.UndefOr[scala.Nothing]]),
      headers: IncomingHttpHeaders
    ): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: AsyncIterable[Buffer] with (AsyncIterator[Buffer, _, js.UndefOr[scala.Nothing]])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
