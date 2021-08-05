package typings.iobroker.anon

import typings.iobroker.objectsMod.global.ioBroker.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var id: String
  
  var value: Object
}
object Value {
  
  inline def apply(id: String, value: Object): Value = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
