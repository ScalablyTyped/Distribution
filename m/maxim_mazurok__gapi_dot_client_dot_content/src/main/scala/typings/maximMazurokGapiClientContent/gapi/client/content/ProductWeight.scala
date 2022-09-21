package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductWeight extends StObject {
  
  /** Required. The weight unit. Acceptable values are: - "`g`" - "`kg`" - "`oz`" - "`lb`" */
  var unit: js.UndefOr[String] = js.undefined
  
  /** Required. The weight represented as a number. The weight can have a maximum precision of four decimal places. */
  var value: js.UndefOr[Double] = js.undefined
}
object ProductWeight {
  
  inline def apply(): ProductWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductWeight]
  }
  
  extension [Self <: ProductWeight](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
