package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadCallbackType extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  
  def onSuccess(): Unit
}
object LoadCallbackType {
  
  inline def apply(onSuccess: () => Unit): LoadCallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction0(onSuccess))
    __obj.asInstanceOf[LoadCallbackType]
  }
  
  extension [Self <: LoadCallbackType](x: Self) {
    
    inline def setOnError(value: /* error */ jsmediatagsError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
  }
}
