package typings.httpBasic

import typings.httpBasic.headersMod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<http-basic.http-basic/lib/CachedResponse.CachedResponse, 'headers' | 'requestTimestamp'> */
  @js.native
  trait PickCachedResponseheaders extends StObject {
    
    var headers: Headers = js.native
    
    var requestTimestamp: Double = js.native
  }
  object PickCachedResponseheaders {
    
    @scala.inline
    def apply(headers: Headers, requestTimestamp: Double): PickCachedResponseheaders = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], requestTimestamp = requestTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickCachedResponseheaders]
    }
    
    @scala.inline
    implicit class PickCachedResponseheadersMutableBuilder[Self <: PickCachedResponseheaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimestamp(value: Double): Self = StObject.set(x, "requestTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
