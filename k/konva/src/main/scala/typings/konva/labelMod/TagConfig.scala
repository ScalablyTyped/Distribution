package typings.konva.labelMod

import typings.konva.shapeMod.ShapeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagConfig extends ShapeConfig {
  
  var cornerRadius: js.UndefOr[Double] = js.native
  
  var pointerDirection: js.UndefOr[String] = js.native
  
  var pointerHeight: js.UndefOr[Double] = js.native
  
  var pointerWidth: js.UndefOr[Double] = js.native
}
object TagConfig {
  
  @scala.inline
  def apply(): TagConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagConfig]
  }
  
  @scala.inline
  implicit class TagConfigOps[Self <: TagConfig] (val x: Self) extends AnyVal {
    
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
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setPointerDirection(value: String): Self = this.set("pointerDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerDirection: Self = this.set("pointerDirection", js.undefined)
    
    @scala.inline
    def setPointerHeight(value: Double): Self = this.set("pointerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerHeight: Self = this.set("pointerHeight", js.undefined)
    
    @scala.inline
    def setPointerWidth(value: Double): Self = this.set("pointerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerWidth: Self = this.set("pointerWidth", js.undefined)
  }
}
