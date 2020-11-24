package typings.konva.arrowMod

import typings.konva.lineMod.LineConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowConfig extends LineConfig {
  
  var pointerAtBeginning: js.UndefOr[Boolean] = js.native
  
  var pointerLength: js.UndefOr[Double] = js.native
  
  var pointerWidth: js.UndefOr[Double] = js.native
}
object ArrowConfig {
  
  @scala.inline
  def apply(points: js.Array[Double]): ArrowConfig = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowConfig]
  }
  
  @scala.inline
  implicit class ArrowConfigOps[Self <: ArrowConfig] (val x: Self) extends AnyVal {
    
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
    def setPointerAtBeginning(value: Boolean): Self = this.set("pointerAtBeginning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerAtBeginning: Self = this.set("pointerAtBeginning", js.undefined)
    
    @scala.inline
    def setPointerLength(value: Double): Self = this.set("pointerLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerLength: Self = this.set("pointerLength", js.undefined)
    
    @scala.inline
    def setPointerWidth(value: Double): Self = this.set("pointerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerWidth: Self = this.set("pointerWidth", js.undefined)
  }
}
