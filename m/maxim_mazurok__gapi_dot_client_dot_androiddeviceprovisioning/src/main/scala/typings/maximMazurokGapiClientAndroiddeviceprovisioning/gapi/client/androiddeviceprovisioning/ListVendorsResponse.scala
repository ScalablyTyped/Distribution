package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVendorsResponse extends js.Object {
  
  /** A token to retrieve the next page of results. Omitted if no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total count of items in the list irrespective of pagination. */
  var totalSize: js.UndefOr[Double] = js.native
  
  /** List of vendors of the reseller partner. Fields `name`, `companyId` and `companyName` are populated to the Company object. */
  var vendors: js.UndefOr[js.Array[Company]] = js.native
}
object ListVendorsResponse {
  
  @scala.inline
  def apply(): ListVendorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVendorsResponse]
  }
  
  @scala.inline
  implicit class ListVendorsResponseOps[Self <: ListVendorsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
    
    @scala.inline
    def setVendorsVarargs(value: Company*): Self = this.set("vendors", js.Array(value :_*))
    
    @scala.inline
    def setVendors(value: js.Array[Company]): Self = this.set("vendors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendors: Self = this.set("vendors", js.undefined)
  }
}
