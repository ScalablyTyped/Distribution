package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stack trace through the script that shows where the execution failed.
  */
@js.native
trait SchemaScriptStackTraceElement extends StObject {
  
  /**
    * The name of the function that failed.
    */
  var function: js.UndefOr[String] = js.native
  
  /**
    * The line number where the script failed.
    */
  var lineNumber: js.UndefOr[Double] = js.native
}
object SchemaScriptStackTraceElement {
  
  @scala.inline
  def apply(): SchemaScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptStackTraceElement]
  }
  
  @scala.inline
  implicit class SchemaScriptStackTraceElementMutableBuilder[Self <: SchemaScriptStackTraceElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
  }
}
