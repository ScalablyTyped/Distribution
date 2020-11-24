package typings.jointjs.mod.layout.DirectedGraph

import typings.jointjs.jointjsStrings.c_
import typings.jointjs.jointjsStrings.l_
import typings.jointjs.jointjsStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var labeloffset: js.UndefOr[Double] = js.native
  
  var labelpos: js.UndefOr[l_ | c_ | r] = js.native
  
  var minLen: js.UndefOr[Double] = js.native
  
  var weight: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Edge {
  
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLabeloffset(value: Double): Self = this.set("labeloffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabeloffset: Self = this.set("labeloffset", js.undefined)
    
    @scala.inline
    def setLabelpos(value: l_ | c_ | r): Self = this.set("labelpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelpos: Self = this.set("labelpos", js.undefined)
    
    @scala.inline
    def setMinLen(value: Double): Self = this.set("minLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLen: Self = this.set("minLen", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
