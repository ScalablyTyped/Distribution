package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response for listing creative and deal associations
  */
trait SchemaListDealAssociationsResponse extends StObject {
  
  /**
    * The list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaCreativeDealAssociation]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListDealAssociationsRequest.page_token field in the subsequent call to
    * &#39;ListDealAssociation&#39; method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDealAssociationsResponse {
  
  inline def apply(): SchemaListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDealAssociationsResponse]
  }
  
  extension [Self <: SchemaListDealAssociationsResponse](x: Self) {
    
    inline def setAssociations(value: js.Array[SchemaCreativeDealAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: SchemaCreativeDealAssociation*): Self = StObject.set(x, "associations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
