package typings.justifiedLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Computed positional and sizing properties of a box in the layout.
  */
@js.native
trait LayoutBox extends js.Object {
  
  /**
    * Aspect ratio of the box.
    */
  var aspectRatio: Double = js.native
  
  /**
    * Height of the box in a justified layout.
    */
  var height: Double = js.native
  
  /**
    * Distance between the left side of the box and the left boundary of the justified layout.
    */
  var left: Double = js.native
  
  /**
    * Distance between the top side of the box and the top boundary of the justified layout.
    */
  var top: Double = js.native
  
  /**
    * Width of the box in a justified layout.
    */
  var width: Double = js.native
}
object LayoutBox {
  
  @scala.inline
  def apply(aspectRatio: Double, height: Double, left: Double, top: Double, width: Double): LayoutBox = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutBox]
  }
  
  @scala.inline
  implicit class LayoutBoxOps[Self <: LayoutBox] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
