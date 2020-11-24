package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.maximMazurokGapiClientAdexchangebuyer.anon.ArcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeDealIds extends js.Object {
  
  /** A list of external deal ids and ARC approval status. */
  var dealStatuses: js.UndefOr[js.Array[ArcStatus]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object CreativeDealIds {
  
  @scala.inline
  def apply(): CreativeDealIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDealIds]
  }
  
  @scala.inline
  implicit class CreativeDealIdsOps[Self <: CreativeDealIds] (val x: Self) extends AnyVal {
    
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
    def setDealStatusesVarargs(value: ArcStatus*): Self = this.set("dealStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDealStatuses(value: js.Array[ArcStatus]): Self = this.set("dealStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealStatuses: Self = this.set("dealStatuses", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
