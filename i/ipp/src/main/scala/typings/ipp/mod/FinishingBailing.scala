package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingBailing extends js.Object {
  
  var `baling-type`: js.UndefOr[BalingType] = js.native
  
  var `baling-when`: js.UndefOr[BalingWhen] = js.native
}
object FinishingBailing {
  
  @scala.inline
  def apply(): FinishingBailing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingBailing]
  }
  
  @scala.inline
  implicit class FinishingBailingOps[Self <: FinishingBailing] (val x: Self) extends AnyVal {
    
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
    def `setBaling-type`(value: BalingType): Self = this.set("baling-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBaling-type`: Self = this.set("baling-type", js.undefined)
    
    @scala.inline
    def `setBaling-when`(value: BalingWhen): Self = this.set("baling-when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBaling-when`: Self = this.set("baling-when", js.undefined)
  }
}
