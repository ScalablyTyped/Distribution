package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceMeasureOptions extends StObject {
  
  var axis: js.UndefOr[String] = js.undefined
  
  var values: js.Array[String]
}
object PivotDataSourceMeasureOptions {
  
  @scala.inline
  def apply(values: js.Array[String]): PivotDataSourceMeasureOptions = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDataSourceMeasureOptions]
  }
  
  @scala.inline
  implicit class PivotDataSourceMeasureOptionsMutableBuilder[Self <: PivotDataSourceMeasureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
