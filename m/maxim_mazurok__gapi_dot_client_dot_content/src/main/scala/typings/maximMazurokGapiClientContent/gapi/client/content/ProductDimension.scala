package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductDimension extends StObject {
  
  /** Required. The length units. Acceptable values are: - "`in`" - "`cm`" */
  var unit: js.UndefOr[String] = js.undefined
  
  /** Required. The length value represented as a number. The value can have a maximum precision of four decimal places. */
  var value: js.UndefOr[Double] = js.undefined
}
object ProductDimension {
  
  inline def apply(): ProductDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDimension]
  }
  
  extension [Self <: ProductDimension](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
