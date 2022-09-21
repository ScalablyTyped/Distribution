package typings.intlifyMessageCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserOptions extends StObject {
  
  var location: js.UndefOr[Boolean] = js.undefined
  
  var onError: js.UndefOr[CompileErrorHandler] = js.undefined
}
object ParserOptions {
  
  inline def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  extension [Self <: ParserOptions](x: Self) {
    
    inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOnError(value: /* error */ CompileError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
