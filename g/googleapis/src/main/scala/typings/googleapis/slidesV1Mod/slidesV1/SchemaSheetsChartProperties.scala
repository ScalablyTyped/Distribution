package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the SheetsChart.
  */
@js.native
trait SchemaSheetsChartProperties extends StObject {
  
  /**
    * The properties of the embedded chart image.
    */
  var chartImageProperties: js.UndefOr[SchemaImageProperties] = js.native
}
object SchemaSheetsChartProperties {
  
  @scala.inline
  def apply(): SchemaSheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChartProperties]
  }
  
  @scala.inline
  implicit class SchemaSheetsChartPropertiesMutableBuilder[Self <: SchemaSheetsChartProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartImageProperties(value: SchemaImageProperties): Self = StObject.set(x, "chartImageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartImagePropertiesUndefined: Self = StObject.set(x, "chartImageProperties", js.undefined)
  }
}
