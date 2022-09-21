package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChartOptions extends StObject {
  
  /**
    * The chart mode.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaChartOptions {
  
  inline def apply(): SchemaChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartOptions]
  }
  
  extension [Self <: SchemaChartOptions](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
