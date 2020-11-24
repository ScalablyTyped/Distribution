package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends js.Object {
  
  var cssClass: String = js.native
  
  var elementId: String = js.native
  
  var id: String = js.native
  
  var locked: Boolean = js.native
  
  var offsets: js.Tuple2[Double, Double] = js.native
  
  var orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint] = js.native
  
  var `type`: AnchorId = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Anchor {
  
  @scala.inline
  def apply(
    cssClass: String,
    elementId: String,
    id: String,
    locked: Boolean,
    offsets: js.Tuple2[Double, Double],
    orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint],
    `type`: AnchorId,
    x: Double,
    y: Double
  ): Anchor = {
    val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
    
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
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementId(value: String): Self = this.set("elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsets(value: js.Tuple2[Double, Double]): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint]): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AnchorId): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
