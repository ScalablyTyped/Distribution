package typings.konva.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimTo extends NodeConfig {
  
  var duration: js.UndefOr[Double] = js.native
  
  var onFinish: js.UndefOr[js.Function] = js.native
  
  var onUpdate: js.UndefOr[js.Function] = js.native
}
object AnimTo {
  
  @scala.inline
  def apply(): AnimTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimTo]
  }
  
  @scala.inline
  implicit class AnimToOps[Self <: AnimTo] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setOnFinish(value: js.Function): Self = this.set("onFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: js.Function): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
}
