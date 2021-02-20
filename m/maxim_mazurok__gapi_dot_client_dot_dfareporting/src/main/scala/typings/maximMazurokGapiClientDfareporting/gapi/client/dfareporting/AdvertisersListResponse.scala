package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertisersListResponse extends StObject {
  
  /** Advertiser collection. */
  var advertisers: js.UndefOr[js.Array[Advertiser]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertisersListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object AdvertisersListResponse {
  
  @scala.inline
  def apply(): AdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertisersListResponse]
  }
  
  @scala.inline
  implicit class AdvertisersListResponseMutableBuilder[Self <: AdvertisersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisers(value: js.Array[Advertiser]): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    @scala.inline
    def setAdvertisersVarargs(value: Advertiser*): Self = StObject.set(x, "advertisers", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
