package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSheetsChartProperties extends StObject {
  
  /**
    * The properties of the embedded chart image.
    */
  var chartImageProperties: js.UndefOr[SchemaImageProperties] = js.undefined
}
object SchemaSheetsChartProperties {
  
  inline def apply(): SchemaSheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChartProperties]
  }
  
  extension [Self <: SchemaSheetsChartProperties](x: Self) {
    
    inline def setChartImageProperties(value: SchemaImageProperties): Self = StObject.set(x, "chartImageProperties", value.asInstanceOf[js.Any])
    
    inline def setChartImagePropertiesUndefined: Self = StObject.set(x, "chartImageProperties", js.undefined)
  }
}
