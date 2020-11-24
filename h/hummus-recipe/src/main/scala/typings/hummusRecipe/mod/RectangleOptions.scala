package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectangleOptions extends js.Object {
  
  var color: js.UndefOr[String | js.Array[Double]] = js.native
  
  var dash: js.UndefOr[js.Array[Double]] = js.native
  
  var fill: js.UndefOr[String | js.Array[Double]] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var rotationOrigin: js.UndefOr[js.Array[Double]] = js.native
  
  var stroke: js.UndefOr[String | js.Array[Double]] = js.native
}
object RectangleOptions {
  
  @scala.inline
  def apply(): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectangleOptions]
  }
  
  @scala.inline
  implicit class RectangleOptionsOps[Self <: RectangleOptions] (val x: Self) extends AnyVal {
    
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
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: String | js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDashVarargs(value: Double*): Self = this.set("dash", js.Array(value :_*))
    
    @scala.inline
    def setDash(value: js.Array[Double]): Self = this.set("dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: Double*): Self = this.set("fill", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: String | js.Array[Double]): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setRotationOriginVarargs(value: Double*): Self = this.set("rotationOrigin", js.Array(value :_*))
    
    @scala.inline
    def setRotationOrigin(value: js.Array[Double]): Self = this.set("rotationOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationOrigin: Self = this.set("rotationOrigin", js.undefined)
    
    @scala.inline
    def setStrokeVarargs(value: Double*): Self = this.set("stroke", js.Array(value :_*))
    
    @scala.inline
    def setStroke(value: String | js.Array[Double]): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
