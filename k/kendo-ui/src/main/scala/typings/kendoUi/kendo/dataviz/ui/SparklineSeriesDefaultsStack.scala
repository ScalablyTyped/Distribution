package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesDefaultsStack extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SparklineSeriesDefaultsStack {
  
  inline def apply(): SparklineSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesDefaultsStack]
  }
  
  extension [Self <: SparklineSeriesDefaultsStack](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
