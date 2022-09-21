package typings.mathjs.mod

import typings.mathjs.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitComponent extends StObject {
  
  var power: Double
  
  var prefix: String
  
  var unit: Base
}
object UnitComponent {
  
  inline def apply(power: Double, prefix: String, unit: Base): UnitComponent = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitComponent]
  }
  
  extension [Self <: UnitComponent](x: Self) {
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Base): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
