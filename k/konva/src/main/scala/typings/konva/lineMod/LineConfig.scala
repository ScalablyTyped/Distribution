package typings.konva.lineMod

import typings.konva.shapeMod.ShapeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineConfig extends ShapeConfig {
  
  var bezier: js.UndefOr[Boolean] = js.native
  
  var closed: js.UndefOr[Boolean] = js.native
  
  var points: js.Array[Double] = js.native
  
  var tension: js.UndefOr[Double] = js.native
}
object LineConfig {
  
  @scala.inline
  def apply(points: js.Array[Double]): LineConfig = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineConfig]
  }
  
  @scala.inline
  implicit class LineConfigOps[Self <: LineConfig] (val x: Self) extends AnyVal {
    
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
    def setPointsVarargs(value: Double*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBezier(value: Boolean): Self = this.set("bezier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBezier: Self = this.set("bezier", js.undefined)
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
  }
}
