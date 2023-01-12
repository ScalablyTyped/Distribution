package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitPrefix extends StObject {
  
  var name: String
  
  var scientific: Boolean
  
  var value: Double
}
object UnitPrefix {
  
  inline def apply(name: String, scientific: Boolean, value: Double): UnitPrefix = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scientific = scientific.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitPrefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnitPrefix] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScientific(value: Boolean): Self = StObject.set(x, "scientific", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
