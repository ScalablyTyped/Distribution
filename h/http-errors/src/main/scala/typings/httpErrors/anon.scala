package typings.httpErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsHttpError extends StObject {
    
    def isHttpError(error: js.Any): /* is http-errors.http-errors.HttpError */ Boolean
    @JSName("isHttpError")
    var isHttpError_Original: typings.httpErrors.mod.IsHttpError
  }
  object IsHttpError {
    
    inline def apply(isHttpError: /* error */ js.Any => /* is http-errors.http-errors.HttpError */ Boolean): IsHttpError = {
      val __obj = js.Dynamic.literal(isHttpError = js.Any.fromFunction1(isHttpError))
      __obj.asInstanceOf[IsHttpError]
    }
    
    extension [Self <: IsHttpError](x: Self) {
      
      inline def setIsHttpError(value: /* error */ js.Any => /* is http-errors.http-errors.HttpError */ Boolean): Self = StObject.set(x, "isHttpError", js.Any.fromFunction1(value))
    }
  }
}
