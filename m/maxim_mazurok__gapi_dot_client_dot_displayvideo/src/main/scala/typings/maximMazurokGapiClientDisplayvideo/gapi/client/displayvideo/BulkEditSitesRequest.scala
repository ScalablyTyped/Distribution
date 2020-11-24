package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditSitesRequest extends js.Object {
  
  /** The ID of the advertiser that owns the parent channel. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** The sites to create in batch, specified as a list of Sites. */
  var createdSites: js.UndefOr[js.Array[Site]] = js.native
  
  /** The sites to delete in batch, specified as a list of site url_or_app_ids. */
  var deletedSites: js.UndefOr[js.Array[String]] = js.native
  
  /** The ID of the partner that owns the parent channel. */
  var partnerId: js.UndefOr[String] = js.native
}
object BulkEditSitesRequest {
  
  @scala.inline
  def apply(): BulkEditSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditSitesRequest]
  }
  
  @scala.inline
  implicit class BulkEditSitesRequestOps[Self <: BulkEditSitesRequest] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setCreatedSitesVarargs(value: Site*): Self = this.set("createdSites", js.Array(value :_*))
    
    @scala.inline
    def setCreatedSites(value: js.Array[Site]): Self = this.set("createdSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedSites: Self = this.set("createdSites", js.undefined)
    
    @scala.inline
    def setDeletedSitesVarargs(value: String*): Self = this.set("deletedSites", js.Array(value :_*))
    
    @scala.inline
    def setDeletedSites(value: js.Array[String]): Self = this.set("deletedSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedSites: Self = this.set("deletedSites", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
  }
}
