package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Jscad Script export options.
  */
trait IJscadScriptOptions
  extends StObject
     with IJscadCsgOptions {
  
  /**
    * Optional override of function name, default is "main".
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional number of spaces to indent.
    */
  var indent: js.UndefOr[Double] = js.undefined
}
object IJscadScriptOptions {
  
  inline def apply(): IJscadScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJscadScriptOptions]
  }
  
  extension [Self <: IJscadScriptOptions](x: Self) {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
  }
}
