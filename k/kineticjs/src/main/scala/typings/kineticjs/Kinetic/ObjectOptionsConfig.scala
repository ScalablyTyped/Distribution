package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOptionsConfig extends StObject {
  
  var dragBoundFunc: js.UndefOr[js.Function1[/* pos */ Vector2d, Vector2d]] = js.native
  
  var dragBounds: js.UndefOr[js.Any] = js.native
  
  var dragConstraint: js.UndefOr[String] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var listening: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Vector2d] = js.native
  
  var opacity: js.UndefOr[js.Any] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var rotationDeg: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Vector2d] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object ObjectOptionsConfig {
  
  @scala.inline
  def apply(): ObjectOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptionsConfig]
  }
  
  @scala.inline
  implicit class ObjectOptionsConfigMutableBuilder[Self <: ObjectOptionsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragBoundFunc(value: /* pos */ Vector2d => Vector2d): Self = StObject.set(x, "dragBoundFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragBoundFuncUndefined: Self = StObject.set(x, "dragBoundFunc", js.undefined)
    
    @scala.inline
    def setDragBounds(value: js.Any): Self = StObject.set(x, "dragBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragBoundsUndefined: Self = StObject.set(x, "dragBounds", js.undefined)
    
    @scala.inline
    def setDragConstraint(value: String): Self = StObject.set(x, "dragConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragConstraintUndefined: Self = StObject.set(x, "dragConstraint", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: js.Any): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationDeg(value: Double): Self = StObject.set(x, "rotationDeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationDegUndefined: Self = StObject.set(x, "rotationDeg", js.undefined)
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Vector2d): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
