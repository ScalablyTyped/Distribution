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
  
  @scala.inline
  def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  
  @scala.inline
  implicit class FitBoundsOptionsMutableBuilder[Self <: FitBoundsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEaseLinearity(value: Double): Self = StObject.set(x, "easeLinearity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseLinearityUndefined: Self = StObject.set(x, "easeLinearity", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setNoMoveStart(value: Boolean): Self = StObject.set(x, "noMoveStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMoveStartUndefined: Self = StObject.set(x, "noMoveStart", js.undefined)
    
    @scala.inline
    def setPadding(value: PointExpression): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomRight(value: PointExpression): Self = StObject.set(x, "paddingBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomRightUndefined: Self = StObject.set(x, "paddingBottomRight", js.undefined)
    
    @scala.inline
    def setPaddingTopLeft(value: PointExpression): Self = StObject.set(x, "paddingTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopLeftUndefined: Self = StObject.set(x, "paddingTopLeft", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
