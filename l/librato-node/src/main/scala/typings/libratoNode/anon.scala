package typings.libratoNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RequestCountKey extends StObject {
    
    var requestCountKey: js.UndefOr[String] = js.undefined
    
    var responseTimeKey: js.UndefOr[String] = js.undefined
    
    var statusCodeKey: js.UndefOr[String] = js.undefined
  }
  object RequestCountKey {
    
    inline def apply(): RequestCountKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestCountKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestCountKey] (val x: Self) extends AnyVal {
      
      inline def setRequestCountKey(value: String): Self = StObject.set(x, "requestCountKey", value.asInstanceOf[js.Any])
      
      inline def setRequestCountKeyUndefined: Self = StObject.set(x, "requestCountKey", js.undefined)
      
      inline def setResponseTimeKey(value: String): Self = StObject.set(x, "responseTimeKey", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeKeyUndefined: Self = StObject.set(x, "responseTimeKey", js.undefined)
      
      inline def setStatusCodeKey(value: String): Self = StObject.set(x, "statusCodeKey", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeKeyUndefined: Self = StObject.set(x, "statusCodeKey", js.undefined)
    }
  }
}
