package typings.jestTypes.circusMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalErrorHandlers extends StObject {
  
  var uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]]
  
  var unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[js.Any], Unit]]
}
object GlobalErrorHandlers {
  
  inline def apply(
    uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]],
    unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[js.Any], Unit]]
  ): GlobalErrorHandlers = {
    val __obj = js.Dynamic.literal(uncaughtException = uncaughtException.asInstanceOf[js.Any], unhandledRejection = unhandledRejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalErrorHandlers]
  }
  
  extension [Self <: GlobalErrorHandlers](x: Self) {
    
    inline def setUncaughtException(value: js.Array[js.Function1[/* exception */ Exception, Unit]]): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
    
    inline def setUncaughtExceptionVarargs(value: (js.Function1[/* exception */ Exception, Unit])*): Self = StObject.set(x, "uncaughtException", js.Array(value :_*))
    
    inline def setUnhandledRejection(value: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[js.Any], Unit]]): Self = StObject.set(x, "unhandledRejection", value.asInstanceOf[js.Any])
    
    inline def setUnhandledRejectionVarargs(value: (js.Function2[/* exception */ Exception, /* promise */ js.Promise[js.Any], Unit])*): Self = StObject.set(x, "unhandledRejection", js.Array(value :_*))
  }
}
