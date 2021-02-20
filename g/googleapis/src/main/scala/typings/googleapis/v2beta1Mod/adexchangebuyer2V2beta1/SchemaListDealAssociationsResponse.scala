package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response for listing creative and deal associations
  */
@js.native
trait SchemaListDealAssociationsResponse extends StObject {
  
  /**
    * The list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaCreativeDealAssociation]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListDealAssociationsRequest.page_token field in the subsequent call to
    * &#39;ListDealAssociation&#39; method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListDealAssociationsResponse {
  
  @scala.inline
  def apply(): SchemaListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDealAssociationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDealAssociationsResponseMutableBuilder[Self <: SchemaListDealAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: js.Array[SchemaCreativeDealAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: SchemaCreativeDealAssociation*): Self = StObject.set(x, "associations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
