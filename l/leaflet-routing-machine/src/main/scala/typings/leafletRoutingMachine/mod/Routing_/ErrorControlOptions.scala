package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorControlOptions extends StObject {
  
  var formatMessage: js.UndefOr[js.Function1[/* error */ IError, String]] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
}
object ErrorControlOptions {
  
  inline def apply(): ErrorControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorControlOptions]
  }
  
  extension [Self <: ErrorControlOptions](x: Self) {
    
    inline def setFormatMessage(value: /* error */ IError => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
