package typings.jointjs.mod.dia.Link

import typings.jointjs.anon.X
import typings.jointjs.mod.dia.LinkView.LabelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelPosition extends js.Object {
  
  var angle: js.UndefOr[Double] = js.native
  
  var args: js.UndefOr[LabelOptions] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
   // optional for default labels
  var offset: js.UndefOr[Double | X] = js.native
}
object LabelPosition {
  
  @scala.inline
  def apply(): LabelPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelPosition]
  }
  
  @scala.inline
  implicit class LabelPositionOps[Self <: LabelPosition] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setArgs(value: LabelOptions): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | X): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
