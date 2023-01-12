package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSelection extends StObject {
  
  /** Must be a dimension name from the request. */
  var dimensionName: js.UndefOr[String] = js.undefined
  
  /** Order by only when the named dimension is this value. */
  var dimensionValue: js.UndefOr[String] = js.undefined
}
object PivotSelection {
  
  inline def apply(): PivotSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotSelection] (val x: Self) extends AnyVal {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setDimensionValue(value: String): Self = StObject.set(x, "dimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueUndefined: Self = StObject.set(x, "dimensionValue", js.undefined)
  }
}
