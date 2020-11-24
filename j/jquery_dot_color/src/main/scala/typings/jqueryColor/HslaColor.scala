package typings.jqueryColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HslaColor extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var hue: js.UndefOr[Double] = js.native
  
  var lightness: js.UndefOr[Double] = js.native
  
  var saturation: js.UndefOr[Double] = js.native
}
object HslaColor {
  
  @scala.inline
  def apply(): HslaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HslaColor]
  }
  
  @scala.inline
  implicit class HslaColorOps[Self <: HslaColor] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setHue(value: Double): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setLightness(value: Double): Self = this.set("lightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightness: Self = this.set("lightness", js.undefined)
    
    @scala.inline
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
  }
}
