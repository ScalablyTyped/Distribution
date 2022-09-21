package typings.intlifyMessageCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOptions extends StObject {
  
  var onError: js.UndefOr[CompileErrorHandler] = js.undefined
}
object TransformOptions {
  
  inline def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  extension [Self <: TransformOptions](x: Self) {
    
    inline def setOnError(value: /* error */ CompileError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
