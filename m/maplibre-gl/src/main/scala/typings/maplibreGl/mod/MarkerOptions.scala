package typings.maplibreGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions extends StObject {
  
  var anchor: js.UndefOr[PositionAnchor] = js.undefined
  
  var clickTolerance: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var element: js.UndefOr[HTMLElement] = js.undefined
  
  var offset: js.UndefOr[PointLike] = js.undefined
  
  var pitchAlignment: js.UndefOr[String] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var rotationAlignment: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object MarkerOptions {
  
  inline def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  extension [Self <: MarkerOptions](x: Self) {
    
    inline def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    inline def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOffset(value: PointLike): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPitchAlignment(value: String): Self = StObject.set(x, "pitchAlignment", value.asInstanceOf[js.Any])
    
    inline def setPitchAlignmentUndefined: Self = StObject.set(x, "pitchAlignment", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationAlignment(value: String): Self = StObject.set(x, "rotationAlignment", value.asInstanceOf[js.Any])
    
    inline def setRotationAlignmentUndefined: Self = StObject.set(x, "rotationAlignment", js.undefined)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
