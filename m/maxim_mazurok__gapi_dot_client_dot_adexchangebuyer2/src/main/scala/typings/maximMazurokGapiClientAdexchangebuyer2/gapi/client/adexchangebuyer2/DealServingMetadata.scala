package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealServingMetadata extends js.Object {
  
  /** Output only. Tracks which parties (if any) have paused a deal. */
  var dealPauseStatus: js.UndefOr[DealPauseStatus] = js.native
}
object DealServingMetadata {
  
  @scala.inline
  def apply(): DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadata]
  }
  
  @scala.inline
  implicit class DealServingMetadataOps[Self <: DealServingMetadata] (val x: Self) extends AnyVal {
    
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
    def setDealPauseStatus(value: DealPauseStatus): Self = this.set("dealPauseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealPauseStatus: Self = this.set("dealPauseStatus", js.undefined)
  }
}
