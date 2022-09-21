package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScriptStackTraceElement extends StObject {
  
  /**
    * The name of the function that failed.
    */
  var function: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The line number where the script failed.
    */
  var lineNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaScriptStackTraceElement {
  
  inline def apply(): SchemaScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptStackTraceElement]
  }
  
  extension [Self <: SchemaScriptStackTraceElement](x: Self) {
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionNull: Self = StObject.set(x, "function", null)
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
  }
}
