package typings.jsCaptcha.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillStyle extends js.Object {
  
  var fillStyle: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var textAlign: js.UndefOr[String] = js.native
  
  var textBaseline: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object FillStyle {
  
  @scala.inline
  def apply(): FillStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillStyle]
  }
  
  @scala.inline
  implicit class FillStyleOps[Self <: FillStyle] (val x: Self) extends AnyVal {
    
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
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextBaseline(value: String): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBaseline: Self = this.set("textBaseline", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
