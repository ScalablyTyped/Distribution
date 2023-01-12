package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncResponses extends StObject {
  
  var asyncResponses: js.UndefOr[Boolean] = js.undefined
  
  var asyncTimeout: js.UndefOr[Double] = js.undefined
}
object AsyncResponses {
  
  inline def apply(): AsyncResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncResponses] (val x: Self) extends AnyVal {
    
    inline def setAsyncResponses(value: Boolean): Self = StObject.set(x, "asyncResponses", value.asInstanceOf[js.Any])
    
    inline def setAsyncResponsesUndefined: Self = StObject.set(x, "asyncResponses", js.undefined)
    
    inline def setAsyncTimeout(value: Double): Self = StObject.set(x, "asyncTimeout", value.asInstanceOf[js.Any])
    
    inline def setAsyncTimeoutUndefined: Self = StObject.set(x, "asyncTimeout", js.undefined)
  }
}
