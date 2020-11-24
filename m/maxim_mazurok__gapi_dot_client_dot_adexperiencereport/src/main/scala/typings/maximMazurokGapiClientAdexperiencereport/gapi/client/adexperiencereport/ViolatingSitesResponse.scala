package typings.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolatingSitesResponse extends js.Object {
  
  /** The list of violating sites. */
  var violatingSites: js.UndefOr[js.Array[SiteSummaryResponse]] = js.native
}
object ViolatingSitesResponse {
  
  @scala.inline
  def apply(): ViolatingSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViolatingSitesResponse]
  }
  
  @scala.inline
  implicit class ViolatingSitesResponseOps[Self <: ViolatingSitesResponse] (val x: Self) extends AnyVal {
    
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
    def setViolatingSitesVarargs(value: SiteSummaryResponse*): Self = this.set("violatingSites", js.Array(value :_*))
    
    @scala.inline
    def setViolatingSites(value: js.Array[SiteSummaryResponse]): Self = this.set("violatingSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolatingSites: Self = this.set("violatingSites", js.undefined)
  }
}
