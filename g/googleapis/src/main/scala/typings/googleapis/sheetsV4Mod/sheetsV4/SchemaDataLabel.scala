package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataLabel extends StObject {
  
  /**
    * Data to use for custom labels. Only used if type is set to CUSTOM. This data must be the same length as the series or other element this data label is applied to. In addition, if the series is split into multiple source ranges, this source data must come from the next column in the source data. For example, if the series is B2:B4,E6:E8 then this data must come from C2:C4,F6:F8.
    */
  var customLabelData: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * The placement of the data label relative to the labeled data.
    */
  var placement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text format used for the data label. The link field is not supported.
    */
  var textFormat: js.UndefOr[SchemaTextFormat] = js.undefined
  
  /**
    * The type of the data label.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataLabel {
  
  inline def apply(): SchemaDataLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataLabel]
  }
  
  extension [Self <: SchemaDataLabel](x: Self) {
    
    inline def setCustomLabelData(value: SchemaChartData): Self = StObject.set(x, "customLabelData", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelDataUndefined: Self = StObject.set(x, "customLabelData", js.undefined)
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementNull: Self = StObject.set(x, "placement", null)
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setTextFormat(value: SchemaTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
