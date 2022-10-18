package typings.ipfsHttpClient.anon

import typings.ipfsHttpClient.distSrcPubsubSubscribeMod.ErrorHandlerFn
import typings.ipfsHttpClient.distSrcPubsubSubscribeMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  var onError: js.UndefOr[ErrorHandlerFn] = js.undefined
}
object OnError {
  
  inline def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnError(value: (/* err */ js.Error, /* fatal */ Boolean, /* msg */ js.UndefOr[Message]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
