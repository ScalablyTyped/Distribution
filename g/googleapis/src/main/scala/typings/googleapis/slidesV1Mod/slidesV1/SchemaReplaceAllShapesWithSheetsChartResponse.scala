package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of replacing shapes with a Google Sheets chart.
  */
trait SchemaReplaceAllShapesWithSheetsChartResponse extends StObject {
  
  /**
    * The number of shapes replaced with charts.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}
object SchemaReplaceAllShapesWithSheetsChartResponse {
  
  @scala.inline
  def apply(): SchemaReplaceAllShapesWithSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithSheetsChartResponse]
  }
  
  @scala.inline
  implicit class SchemaReplaceAllShapesWithSheetsChartResponseMutableBuilder[Self <: SchemaReplaceAllShapesWithSheetsChartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
