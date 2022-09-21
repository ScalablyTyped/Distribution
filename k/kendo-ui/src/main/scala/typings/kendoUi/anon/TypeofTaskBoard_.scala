package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TaskBoard_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaskBoard_ extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TaskBoard_
  
  /* static member */
  var fn: TaskBoard_
}
object TypeofTaskBoard_ {
  
  inline def apply(extend: js.Object => TaskBoard_, fn: TaskBoard_): TypeofTaskBoard_ = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTaskBoard_]
  }
  
  extension [Self <: TypeofTaskBoard_](x: Self) {
    
    inline def setExtend(value: js.Object => TaskBoard_): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TaskBoard_): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
