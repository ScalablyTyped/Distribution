package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advertiser List Response
  */
@js.native
trait SchemaAdvertisersListResponse extends StObject {
  
  /**
    * Advertiser collection.
    */
  var advertisers: js.UndefOr[js.Array[SchemaAdvertiser]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertisersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaAdvertisersListResponse {
  
  @scala.inline
  def apply(): SchemaAdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertisersListResponse]
  }
  
  @scala.inline
  implicit class SchemaAdvertisersListResponseMutableBuilder[Self <: SchemaAdvertisersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisers(value: js.Array[SchemaAdvertiser]): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    @scala.inline
    def setAdvertisersVarargs(value: SchemaAdvertiser*): Self = StObject.set(x, "advertisers", js.Array(value :_*))
    
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
