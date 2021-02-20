package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncResponses extends StObject {
  
  var asyncResponses: js.UndefOr[Boolean] = js.native
  
  var asyncTimeout: js.UndefOr[Double] = js.native
}
object AsyncResponses {
  
  @scala.inline
  def apply(): AsyncResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncResponses]
  }
  
  @scala.inline
  implicit class AsyncResponsesMutableBuilder[Self <: AsyncResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncResponses(value: Boolean): Self = StObject.set(x, "asyncResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncResponsesUndefined: Self = StObject.set(x, "asyncResponses", js.undefined)
    
    @scala.inline
    def setAsyncTimeout(value: Double): Self = StObject.set(x, "asyncTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncTimeoutUndefined: Self = StObject.set(x, "asyncTimeout", js.undefined)
  }
}
