package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallStack extends StObject {
  
  /**
    * The stack string after the skipped lines
    */
  var callStack: String
  
  var columnNumber: Double
  
  var fileName: String
  
  var functionName: String
  
  var lineNumber: Double
}
object CallStack {
  
  inline def apply(
    callStack: String,
    columnNumber: Double,
    fileName: String,
    functionName: String,
    lineNumber: Double
  ): CallStack = {
    val __obj = js.Dynamic.literal(callStack = callStack.asInstanceOf[js.Any], columnNumber = columnNumber.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallStack] (val x: Self) extends AnyVal {
    
    inline def setCallStack(value: String): Self = StObject.set(x, "callStack", value.asInstanceOf[js.Any])
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
  }
}
