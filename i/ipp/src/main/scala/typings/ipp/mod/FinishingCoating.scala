package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingCoating extends js.Object {
  
  var `coating-sides`: js.UndefOr[FinishingSides] = js.native
  
  var `coating-type`: js.UndefOr[CoatingType] = js.native
}
object FinishingCoating {
  
  @scala.inline
  def apply(): FinishingCoating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingCoating]
  }
  
  @scala.inline
  implicit class FinishingCoatingOps[Self <: FinishingCoating] (val x: Self) extends AnyVal {
    
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
    def `setCoating-sides`(value: FinishingSides): Self = this.set("coating-sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCoating-sides`: Self = this.set("coating-sides", js.undefined)
    
    @scala.inline
    def `setCoating-type`(value: CoatingType): Self = this.set("coating-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCoating-type`: Self = this.set("coating-type", js.undefined)
  }
}
