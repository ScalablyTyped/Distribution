package typings.luminoWidgets.dockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which holds the geometry for overlay positioning.
  */
@js.native
trait IOverlayGeometry extends js.Object {
  
  /**
    * The distance between the overlay and parent bottom edges.
    */
  var bottom: Double = js.native
  
  /**
    * The distance between the overlay and parent left edges.
    */
  var left: Double = js.native
  
  /**
    * The distance between the overlay and parent right edges.
    */
  var right: Double = js.native
  
  /**
    * The distance between the overlay and parent top edges.
    */
  var top: Double = js.native
}
object IOverlayGeometry {
  
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): IOverlayGeometry = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayGeometry]
  }
  
  @scala.inline
  implicit class IOverlayGeometryOps[Self <: IOverlayGeometry] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
