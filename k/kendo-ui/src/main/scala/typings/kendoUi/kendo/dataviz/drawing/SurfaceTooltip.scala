package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceTooltip extends StObject {
  
  var animation: js.UndefOr[Boolean | SurfaceTooltipAnimation] = js.undefined
  
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
}
object SurfaceTooltip {
  
  inline def apply(): SurfaceTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurfaceTooltip] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Boolean | SurfaceTooltipAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppendTo(value: String | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
  }
}
