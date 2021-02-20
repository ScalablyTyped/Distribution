package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVendorsResponse extends StObject {
  
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
  implicit class ListVendorsResponseMutableBuilder[Self <: ListVendorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    @scala.inline
    def setVendors(value: js.Array[Company]): Self = StObject.set(x, "vendors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorsUndefined: Self = StObject.set(x, "vendors", js.undefined)
    
    @scala.inline
    def setVendorsVarargs(value: Company*): Self = StObject.set(x, "vendors", js.Array(value :_*))
  }
}
