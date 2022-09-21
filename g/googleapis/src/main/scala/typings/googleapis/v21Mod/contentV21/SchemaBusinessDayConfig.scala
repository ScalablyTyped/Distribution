package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBusinessDayConfig extends StObject {
  
  /**
    * Regular business days, such as '"monday"'. May not be empty.
    */
  var businessDays: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBusinessDayConfig {
  
  inline def apply(): SchemaBusinessDayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBusinessDayConfig]
  }
  
  extension [Self <: SchemaBusinessDayConfig](x: Self) {
    
    inline def setBusinessDays(value: js.Array[String]): Self = StObject.set(x, "businessDays", value.asInstanceOf[js.Any])
    
    inline def setBusinessDaysNull: Self = StObject.set(x, "businessDays", null)
    
    inline def setBusinessDaysUndefined: Self = StObject.set(x, "businessDays", js.undefined)
    
    inline def setBusinessDaysVarargs(value: String*): Self = StObject.set(x, "businessDays", js.Array(value*))
  }
}
