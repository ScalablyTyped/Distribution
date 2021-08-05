package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartParallelAxesTitleOptions extends StObject {
  
  var reserveSpace: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Alignment of the text, can be `"left"`, `"right"` or
    * `"center"`. Default alignment depends on the title.align:
    *
    * Horizontal axes:
    *
    * - for `align` = `"low"`, `textAlign` is set to `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"`, `textAlign` is set to `right`
    *
    * Vertical axes:
    *
    * - for `align` = `"low"` and `opposite` = `true`, `textAlign` is set to
    * `right`
    *
    * - for `align` = `"low"` and `opposite` = `false`, `textAlign` is set to
    * `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"` and `opposite` = `true` `textAlign` is set to
    * `left`
    *
    * - for `align` = `"high"` and `opposite` = `false` `textAlign` is set to
    * `right`
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
}
object ChartParallelAxesTitleOptions {
  
  inline def apply(): ChartParallelAxesTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesTitleOptions]
  }
  
  extension [Self <: ChartParallelAxesTitleOptions](x: Self) {
    
    inline def setReserveSpace(value: Boolean): Self = StObject.set(x, "reserveSpace", value.asInstanceOf[js.Any])
    
    inline def setReserveSpaceUndefined: Self = StObject.set(x, "reserveSpace", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: AlignValue): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
