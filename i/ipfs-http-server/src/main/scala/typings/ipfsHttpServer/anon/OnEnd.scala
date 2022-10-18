package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnd extends StObject {
  
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
}
object OnEnd {
  
  inline def apply(): OnEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnd]
  }
  
  extension [Self <: OnEnd](x: Self) {
    
    inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
