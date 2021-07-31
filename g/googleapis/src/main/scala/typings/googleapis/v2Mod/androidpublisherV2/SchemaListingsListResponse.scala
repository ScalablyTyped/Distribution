package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListingsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#listingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var listings: js.UndefOr[js.Array[SchemaListing]] = js.undefined
}
object SchemaListingsListResponse {
  
  @scala.inline
  def apply(): SchemaListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListingsListResponse]
  }
  
  @scala.inline
  implicit class SchemaListingsListResponseMutableBuilder[Self <: SchemaListingsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setListings(value: js.Array[SchemaListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    @scala.inline
    def setListingsVarargs(value: SchemaListing*): Self = StObject.set(x, "listings", js.Array(value :_*))
  }
}
