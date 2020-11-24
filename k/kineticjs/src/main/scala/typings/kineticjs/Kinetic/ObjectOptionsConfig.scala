package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOptionsConfig extends js.Object {
  
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
  implicit class ObjectOptionsConfigOps[Self <: ObjectOptionsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDragBoundFunc(value: /* pos */ Vector2d => Vector2d): Self = this.set("dragBoundFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragBoundFunc: Self = this.set("dragBoundFunc", js.undefined)
    
    @scala.inline
    def setDragBounds(value: js.Any): Self = this.set("dragBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragBounds: Self = this.set("dragBounds", js.undefined)
    
    @scala.inline
    def setDragConstraint(value: String): Self = this.set("dragConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragConstraint: Self = this.set("dragConstraint", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setListening(value: Boolean): Self = this.set("listening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListening: Self = this.set("listening", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffset(value: Vector2d): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: js.Any): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setRotationDeg(value: Double): Self = this.set("rotationDeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationDeg: Self = this.set("rotationDeg", js.undefined)
    
    @scala.inline
    def setScale(value: Vector2d): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
