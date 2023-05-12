package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotColumnrangeBorderRadiusOptions extends StObject {
  
  var where: js.UndefOr[String] = js.undefined
}
object PlotColumnrangeBorderRadiusOptions {
  
  inline def apply(): PlotColumnrangeBorderRadiusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotColumnrangeBorderRadiusOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotColumnrangeBorderRadiusOptions] (val x: Self) extends AnyVal {
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
