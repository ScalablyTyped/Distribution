package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOptionsConfig extends StObject {
  
  var dragBoundFunc: js.UndefOr[js.Function1[/* pos */ Vector2d, Vector2d]] = js.undefined
  
  var dragBounds: js.UndefOr[js.Any] = js.undefined
  
  var dragConstraint: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var listening: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Vector2d] = js.undefined
  
  var opacity: js.UndefOr[js.Any] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var rotationDeg: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Vector2d] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object ObjectOptionsConfig {
  
  inline def apply(): ObjectOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptionsConfig]
  }
  
  extension [Self <: ObjectOptionsConfig](x: Self) {
    
    inline def setDragBoundFunc(value: /* pos */ Vector2d => Vector2d): Self = StObject.set(x, "dragBoundFunc", js.Any.fromFunction1(value))
    
    inline def setDragBoundFuncUndefined: Self = StObject.set(x, "dragBoundFunc", js.undefined)
    
    inline def setDragBounds(value: js.Any): Self = StObject.set(x, "dragBounds", value.asInstanceOf[js.Any])
    
    inline def setDragBoundsUndefined: Self = StObject.set(x, "dragBounds", js.undefined)
    
    inline def setDragConstraint(value: String): Self = StObject.set(x, "dragConstraint", value.asInstanceOf[js.Any])
    
    inline def setDragConstraintUndefined: Self = StObject.set(x, "dragConstraint", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
    
    inline def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOpacity(value: js.Any): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationDeg(value: Double): Self = StObject.set(x, "rotationDeg", value.asInstanceOf[js.Any])
    
    inline def setRotationDegUndefined: Self = StObject.set(x, "rotationDeg", js.undefined)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Vector2d): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
