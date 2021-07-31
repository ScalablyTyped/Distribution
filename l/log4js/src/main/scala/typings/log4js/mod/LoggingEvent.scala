package typings.log4js.mod

import typings.log4js.anon.Worker
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingEvent extends StObject {
  
  var categoryName: String
  
  var cluster: js.UndefOr[Worker] = js.undefined
  
  var context: js.Any
  
  // level of message
  var data: js.Array[js.Any]
  
  // name of category
  var level: Level
  
  var pid: Double
  
  // objects to log
  var startTime: Date
}
object LoggingEvent {
  
  @scala.inline
  def apply(
    categoryName: String,
    context: js.Any,
    data: js.Array[js.Any],
    level: Level,
    pid: Double,
    startTime: Date
  ): LoggingEvent = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEvent]
  }
  
  @scala.inline
  implicit class LoggingEventMutableBuilder[Self <: LoggingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCluster(value: Worker): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
