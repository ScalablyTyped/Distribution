package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOnToolbar extends StObject {
  
  var config: TableOption
  
  var event: String
}
object TableOnToolbar {
  
  inline def apply(config: TableOption, event: String): TableOnToolbar = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOnToolbar]
  }
  
  extension [Self <: TableOnToolbar](x: Self) {
    
    inline def setConfig(value: TableOption): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
