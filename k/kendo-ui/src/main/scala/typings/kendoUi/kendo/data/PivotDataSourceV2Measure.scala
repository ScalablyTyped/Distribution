package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceV2Measure extends StObject {
  
  var axis: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[Any] = js.undefined
}
object PivotDataSourceV2Measure {
  
  inline def apply(): PivotDataSourceV2Measure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDataSourceV2Measure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotDataSourceV2Measure] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
