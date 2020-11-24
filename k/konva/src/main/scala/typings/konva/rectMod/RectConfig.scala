package typings.konva.rectMod

import typings.konva.shapeMod.ShapeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectConfig extends ShapeConfig {
  
  var cornerRadius: js.UndefOr[Double | js.Array[Double]] = js.native
}
object RectConfig {
  
  @scala.inline
  def apply(): RectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectConfig]
  }
  
  @scala.inline
  implicit class RectConfigOps[Self <: RectConfig] (val x: Self) extends AnyVal {
    
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
    def setCornerRadiusVarargs(value: Double*): Self = this.set("cornerRadius", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadius(value: Double | js.Array[Double]): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
  }
}
