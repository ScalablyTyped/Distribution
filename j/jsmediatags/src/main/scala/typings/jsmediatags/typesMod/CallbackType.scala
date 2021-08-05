package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackType extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  
  def onSuccess(data: TagType): Unit
}
object CallbackType {
  
  inline def apply(onSuccess: TagType => Unit): CallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[CallbackType]
  }
  
  extension [Self <: CallbackType](x: Self) {
    
    inline def setOnError(value: /* error */ jsmediatagsError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: TagType => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
  }
}
