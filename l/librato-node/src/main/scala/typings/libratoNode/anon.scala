package typings.libratoNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait RequestCountKey extends StObject {
    
    var requestCountKey: js.UndefOr[String] = js.native
    
    var responseTimeKey: js.UndefOr[String] = js.native
    
    var statusCodeKey: js.UndefOr[String] = js.native
  }
  object RequestCountKey {
    
    @scala.inline
    def apply(): RequestCountKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestCountKey]
    }
    
    @scala.inline
    implicit class RequestCountKeyMutableBuilder[Self <: RequestCountKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestCountKey(value: String): Self = StObject.set(x, "requestCountKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCountKeyUndefined: Self = StObject.set(x, "requestCountKey", js.undefined)
      
      @scala.inline
      def setResponseTimeKey(value: String): Self = StObject.set(x, "responseTimeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeKeyUndefined: Self = StObject.set(x, "responseTimeKey", js.undefined)
      
      @scala.inline
      def setStatusCodeKey(value: String): Self = StObject.set(x, "statusCodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeKeyUndefined: Self = StObject.set(x, "statusCodeKey", js.undefined)
    }
  }
}
