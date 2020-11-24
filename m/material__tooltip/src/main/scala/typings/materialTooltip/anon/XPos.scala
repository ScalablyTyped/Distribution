package typings.materialTooltip.anon

import typings.materialTooltip.constantsMod.XPosition
import typings.materialTooltip.constantsMod.YPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPos extends js.Object {
  
  var xPos: js.UndefOr[XPosition] = js.native
  
  var yPos: js.UndefOr[YPosition] = js.native
}
object XPos {
  
  @scala.inline
  def apply(): XPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XPos]
  }
  
  @scala.inline
  implicit class XPosOps[Self <: XPos] (val x: Self) extends AnyVal {
    
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
    def setXPos(value: XPosition): Self = this.set("xPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPos: Self = this.set("xPos", js.undefined)
    
    @scala.inline
    def setYPos(value: YPosition): Self = this.set("yPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPos: Self = this.set("yPos", js.undefined)
  }
}
