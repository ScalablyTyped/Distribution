package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var invocationContext: js.UndefOr[Any] = js.undefined
  
  var onFailure: js.UndefOr[js.Function1[/* response */ IResponse, Unit]] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function1[/* response */ IResponse, Unit]] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setInvocationContext(value: Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
    
    inline def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
    
    inline def setOnFailure(value: /* response */ IResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(value: /* response */ IResponse => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
