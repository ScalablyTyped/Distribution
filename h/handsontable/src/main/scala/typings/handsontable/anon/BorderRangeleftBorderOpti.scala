package typings.handsontable.anon

import typings.handsontable.pluginsCustomBordersCustomBordersMod.BorderOptions
import typings.handsontable.pluginsCustomBordersCustomBordersMod.DetailedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined handsontable.handsontable/plugins/customBorders/customBorders.BorderRange & {  left :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined,   right :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined,   top :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined,   bottom :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined} */
trait BorderRangeleftBorderOpti
  extends StObject
     with DetailedSettings {
  
  var bottom: js.UndefOr[BorderOptions | String] = js.undefined
  
  var left: js.UndefOr[BorderOptions | String] = js.undefined
  
  var range: From
  
  var right: js.UndefOr[BorderOptions | String] = js.undefined
  
  var top: js.UndefOr[BorderOptions | String] = js.undefined
}
object BorderRangeleftBorderOpti {
  
  inline def apply(range: From): BorderRangeleftBorderOpti = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRangeleftBorderOpti]
  }
  
  extension [Self <: BorderRangeleftBorderOpti](x: Self) {
    
    inline def setBottom(value: BorderOptions | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: BorderOptions | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRange(value: From): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRight(value: BorderOptions | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: BorderOptions | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
