package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApkListingsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#apkListingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var listings: js.UndefOr[js.Array[SchemaApkListing]] = js.undefined
}
object SchemaApkListingsListResponse {
  
  @scala.inline
  def apply(): SchemaApkListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkListingsListResponse]
  }
  
  @scala.inline
  implicit class SchemaApkListingsListResponseMutableBuilder[Self <: SchemaApkListingsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setListings(value: js.Array[SchemaApkListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    @scala.inline
    def setListingsVarargs(value: SchemaApkListing*): Self = StObject.set(x, "listings", js.Array(value :_*))
  }
}
