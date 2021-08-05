package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelAmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  var onError: js.UndefOr[
    js.Function3[/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String, Unit]
  ] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function2[/* knuddelAmount */ KnuddelAmount, /* reason */ String, Unit]] = js.undefined
}
object OnError {
  
  inline def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnError(value: (/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: (/* knuddelAmount */ KnuddelAmount, /* reason */ String) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
