package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction_ extends StObject {
  
  var both: EnumValue
  
  var from_ : EnumValue
  
  var in: EnumValue
  
  var out: EnumValue
  
  var to: EnumValue
}
object Direction_ {
  
  inline def apply(both: EnumValue, from_ : EnumValue, in: EnumValue, out: EnumValue, to: EnumValue): Direction_ = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], from_ = from_.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Direction_] (val x: Self) extends AnyVal {
    
    inline def setBoth(value: EnumValue): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setFrom_(value: EnumValue): Self = StObject.set(x, "from_", value.asInstanceOf[js.Any])
    
    inline def setIn(value: EnumValue): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setOut(value: EnumValue): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setTo(value: EnumValue): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
