package typings.inkBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomLeft extends js.Object {
  
  var bottomLeft: js.UndefOr[String] = js.native
  
  var bottomRight: js.UndefOr[String] = js.native
  
  var horizontal: js.UndefOr[String] = js.native
  
  var topLeft: js.UndefOr[String] = js.native
  
  var topRight: js.UndefOr[String] = js.native
  
  var vertical: js.UndefOr[String] = js.native
}
object BottomLeft {
  
  @scala.inline
  def apply(): BottomLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomLeft]
  }
  
  @scala.inline
  implicit class BottomLeftOps[Self <: BottomLeft] (val x: Self) extends AnyVal {
    
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
    def setBottomLeft(value: String): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    
    @scala.inline
    def setBottomRight(value: String): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    
    @scala.inline
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setTopLeft(value: String): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    
    @scala.inline
    def setTopRight(value: String): Self = this.set("topRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
    
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
