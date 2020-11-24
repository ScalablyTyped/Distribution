package typings.grommet.anon

import typings.grommet.utilsMod.BreakpointBorderSize
import typings.grommet.utilsMod.BreakpointEdgeSize
import typings.grommet.utilsMod.BreakpointSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderSize extends js.Object {
  
  var borderSize: js.UndefOr[BreakpointBorderSize] = js.native
  
  var edgeSize: js.UndefOr[BreakpointEdgeSize] = js.native
  
  var size: js.UndefOr[BreakpointSize] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object BorderSize {
  
  @scala.inline
  def apply(): BorderSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderSize]
  }
  
  @scala.inline
  implicit class BorderSizeOps[Self <: BorderSize] (val x: Self) extends AnyVal {
    
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
    def setBorderSize(value: BreakpointBorderSize): Self = this.set("borderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderSize: Self = this.set("borderSize", js.undefined)
    
    @scala.inline
    def setEdgeSize(value: BreakpointEdgeSize): Self = this.set("edgeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeSize: Self = this.set("edgeSize", js.undefined)
    
    @scala.inline
    def setSize(value: BreakpointSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
