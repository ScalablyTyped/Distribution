package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all details associated with a given filtered
  * bid reason.
  */
trait SchemaListCreativeStatusBreakdownByDetailResponse extends StObject {
  
  /**
    * The type of detail that the detail IDs represent.
    */
  var detailType: js.UndefOr[String] = js.undefined
  
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by detail.
    */
  var filteredBidDetailRows: js.UndefOr[js.Array[SchemaFilteredBidDetailRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativeStatusBreakdownByDetailRequest.pageToken field in the
    * subsequent call to the filteredBids.details.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCreativeStatusBreakdownByDetailResponse {
  
  @scala.inline
  def apply(): SchemaListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativeStatusBreakdownByDetailResponse]
  }
  
  @scala.inline
  implicit class SchemaListCreativeStatusBreakdownByDetailResponseMutableBuilder[Self <: SchemaListCreativeStatusBreakdownByDetailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailType(value: String): Self = StObject.set(x, "detailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailTypeUndefined: Self = StObject.set(x, "detailType", js.undefined)
    
    @scala.inline
    def setFilteredBidDetailRows(value: js.Array[SchemaFilteredBidDetailRow]): Self = StObject.set(x, "filteredBidDetailRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredBidDetailRowsUndefined: Self = StObject.set(x, "filteredBidDetailRows", js.undefined)
    
    @scala.inline
    def setFilteredBidDetailRowsVarargs(value: SchemaFilteredBidDetailRow*): Self = StObject.set(x, "filteredBidDetailRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
