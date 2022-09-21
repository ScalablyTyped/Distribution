package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.FileManager_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFileManager_ extends StObject {
  
  /* static member */
  def extend(proto: js.Object): FileManager_
  
  /* static member */
  var fn: FileManager_
}
object TypeofFileManager_ {
  
  inline def apply(extend: js.Object => FileManager_, fn: FileManager_): TypeofFileManager_ = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFileManager_]
  }
  
  extension [Self <: TypeofFileManager_](x: Self) {
    
    inline def setExtend(value: js.Object => FileManager_): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: FileManager_): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
