package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomersResponse extends StObject {
  
  /** List of customers related to this reseller partner. */
  var customers: js.UndefOr[js.Array[Company]] = js.native
  
  /** A token to retrieve the next page of results. Omitted if no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total count of items in the list irrespective of pagination. */
  var totalSize: js.UndefOr[Double] = js.native
}
object ListCustomersResponse {
  
  @scala.inline
  def apply(): ListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomersResponse]
  }
  
  @scala.inline
  implicit class ListCustomersResponseMutableBuilder[Self <: ListCustomersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomers(value: js.Array[Company]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    @scala.inline
    def setCustomersVarargs(value: Company*): Self = StObject.set(x, "customers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
