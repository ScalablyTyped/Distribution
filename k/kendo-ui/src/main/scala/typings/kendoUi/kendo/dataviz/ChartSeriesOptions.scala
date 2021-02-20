package typings.kendoUi.kendo.dataviz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object ChartSeriesOptions {
  
  @scala.inline
  def apply(): ChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesOptions]
  }
  
  @scala.inline
  implicit class ChartSeriesOptionsMutableBuilder[Self <: ChartSeriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
