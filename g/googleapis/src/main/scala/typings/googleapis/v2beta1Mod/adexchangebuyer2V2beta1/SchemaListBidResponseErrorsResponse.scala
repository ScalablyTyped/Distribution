package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all reasons that bid responses resulted in an
  * error.
  */
trait SchemaListBidResponseErrorsResponse extends StObject {
  
  /**
    * List of rows, with counts of bid responses aggregated by callout status.
    */
  var calloutStatusRows: js.UndefOr[js.Array[SchemaCalloutStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidResponseErrorsRequest.pageToken field in the subsequent call to
    * the bidResponseErrors.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListBidResponseErrorsResponse {
  
  @scala.inline
  def apply(): SchemaListBidResponseErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidResponseErrorsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBidResponseErrorsResponseMutableBuilder[Self <: SchemaListBidResponseErrorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutStatusRows(value: js.Array[SchemaCalloutStatusRow]): Self = StObject.set(x, "calloutStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutStatusRowsUndefined: Self = StObject.set(x, "calloutStatusRows", js.undefined)
    
    @scala.inline
    def setCalloutStatusRowsVarargs(value: SchemaCalloutStatusRow*): Self = StObject.set(x, "calloutStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
