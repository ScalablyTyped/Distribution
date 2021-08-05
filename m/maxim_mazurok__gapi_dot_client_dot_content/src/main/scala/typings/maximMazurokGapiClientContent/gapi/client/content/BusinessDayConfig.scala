package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessDayConfig extends StObject {
  
  /** Regular business days. May not be empty. */
  var businessDays: js.UndefOr[js.Array[String]] = js.undefined
}
object BusinessDayConfig {
  
  inline def apply(): BusinessDayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessDayConfig]
  }
  
  extension [Self <: BusinessDayConfig](x: Self) {
    
    inline def setBusinessDays(value: js.Array[String]): Self = StObject.set(x, "businessDays", value.asInstanceOf[js.Any])
    
    inline def setBusinessDaysUndefined: Self = StObject.set(x, "businessDays", js.undefined)
    
    inline def setBusinessDaysVarargs(value: String*): Self = StObject.set(x, "businessDays", js.Array(value :_*))
  }
}
