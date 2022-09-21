package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ListCatalogsResponse extends StObject {
  
  /**
    * All the customer's Catalogs.
    */
  var catalogs: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2Catalog]] = js.undefined
  
  /**
    * A token that can be sent as ListCatalogsRequest.page_token to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2ListCatalogsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2ListCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ListCatalogsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ListCatalogsResponse](x: Self) {
    
    inline def setCatalogs(value: js.Array[SchemaGoogleCloudRetailV2Catalog]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    inline def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    inline def setCatalogsVarargs(value: SchemaGoogleCloudRetailV2Catalog*): Self = StObject.set(x, "catalogs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
