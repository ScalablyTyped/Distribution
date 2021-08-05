package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Styles for a waterfall chart column.
  */
trait SchemaWaterfallChartColumnStyle extends StObject {
  
  /**
    * The color of the column.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The label of the column&#39;s legend.
    */
  var label: js.UndefOr[String] = js.undefined
}
object SchemaWaterfallChartColumnStyle {
  
  inline def apply(): SchemaWaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartColumnStyle]
  }
  
  extension [Self <: SchemaWaterfallChartColumnStyle](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
