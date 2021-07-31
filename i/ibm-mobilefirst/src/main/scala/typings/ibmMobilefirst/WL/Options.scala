package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var invocationContext: js.UndefOr[js.Any] = js.undefined
  
  var onFailure: js.UndefOr[js.Function1[/* response */ IResponse, Unit]] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function1[/* response */ IResponse, Unit]] = js.undefined
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationContext(value: js.Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
    
    @scala.inline
    def setOnFailure(value: /* response */ IResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: /* response */ IResponse => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
