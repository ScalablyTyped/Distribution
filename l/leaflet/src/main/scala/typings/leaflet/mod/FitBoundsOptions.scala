package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ trait FitBoundsOptions
  extends StObject
     with ZoomOptions {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easeLinearity: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[PointExpression] = js.undefined
  
  var paddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  
  var paddingTopLeft: js.UndefOr[PointExpression] = js.undefined
}
object FitBoundsOptions {
  
  inline def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  
  extension [Self <: FitBoundsOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEaseLinearity(value: Double): Self = StObject.set(x, "easeLinearity", value.asInstanceOf[js.Any])
    
    inline def setEaseLinearityUndefined: Self = StObject.set(x, "easeLinearity", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setNoMoveStart(value: Boolean): Self = StObject.set(x, "noMoveStart", value.asInstanceOf[js.Any])
    
    inline def setNoMoveStartUndefined: Self = StObject.set(x, "noMoveStart", js.undefined)
    
    inline def setPadding(value: PointExpression): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomRight(value: PointExpression): Self = StObject.set(x, "paddingBottomRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomRightUndefined: Self = StObject.set(x, "paddingBottomRight", js.undefined)
    
    inline def setPaddingTopLeft(value: PointExpression): Self = StObject.set(x, "paddingTopLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopLeftUndefined: Self = StObject.set(x, "paddingTopLeft", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
