package typings.log4js.mod

import typings.log4js.anon.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<log4js.log4js.CallStack> */
trait LoggingEvent extends StObject {
  
  var callStack: js.UndefOr[String] = js.undefined
  
  var categoryName: String
  
  var cluster: js.UndefOr[Worker] = js.undefined
  
  var columnNumber: js.UndefOr[Double] = js.undefined
  
  var context: Any
  
  // level of message
  var data: js.Array[Any]
  
  /**
    * The first Error object in the data if there is one
    */
  var error: js.UndefOr[js.Error] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var functionName: js.UndefOr[String] = js.undefined
  
  // name of category
  var level: Level
  
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  var pid: Double
  
  def serialise(): String
  
  // objects to log
  var startTime: js.Date
}
object LoggingEvent {
  
  inline def apply(
    categoryName: String,
    context: Any,
    data: js.Array[Any],
    level: Level,
    pid: Double,
    serialise: () => String,
    startTime: js.Date
  ): LoggingEvent = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], serialise = js.Any.fromFunction0(serialise), startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggingEvent] (val x: Self) extends AnyVal {
    
    inline def setCallStack(value: String): Self = StObject.set(x, "callStack", value.asInstanceOf[js.Any])
    
    inline def setCallStackUndefined: Self = StObject.set(x, "callStack", js.undefined)
    
    inline def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
    
    inline def setCluster(value: Worker): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setSerialise(value: () => String): Self = StObject.set(x, "serialise", js.Any.fromFunction0(value))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
