package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingBinding extends js.Object {
  
  var `binding-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
  
  var `binding-type`: js.UndefOr[BindingType] = js.native
}
object FinishingBinding {
  
  @scala.inline
  def apply(): FinishingBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingBinding]
  }
  
  @scala.inline
  implicit class FinishingBindingOps[Self <: FinishingBinding] (val x: Self) extends AnyVal {
    
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
    def `setBinding-reference-edge`(value: ReferenceEdge): Self = this.set("binding-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBinding-reference-edge`: Self = this.set("binding-reference-edge", js.undefined)
    
    @scala.inline
    def `setBinding-type`(value: BindingType): Self = this.set("binding-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBinding-type`: Self = this.set("binding-type", js.undefined)
  }
}
