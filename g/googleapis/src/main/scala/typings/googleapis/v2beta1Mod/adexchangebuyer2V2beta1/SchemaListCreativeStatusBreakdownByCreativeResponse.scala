package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all creatives associated with a given filtered
  * bid reason.
  */
trait SchemaListCreativeStatusBreakdownByCreativeResponse extends StObject {
  
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by creative.
    */
  var filteredBidCreativeRows: js.UndefOr[js.Array[SchemaFilteredBidCreativeRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativeStatusBreakdownByCreativeRequest.pageToken field in the
    * subsequent call to the filteredBids.creatives.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCreativeStatusBreakdownByCreativeResponse {
  
  @scala.inline
  def apply(): SchemaListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativeStatusBreakdownByCreativeResponse]
  }
  
  @scala.inline
  implicit class SchemaListCreativeStatusBreakdownByCreativeResponseMutableBuilder[Self <: SchemaListCreativeStatusBreakdownByCreativeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilteredBidCreativeRows(value: js.Array[SchemaFilteredBidCreativeRow]): Self = StObject.set(x, "filteredBidCreativeRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredBidCreativeRowsUndefined: Self = StObject.set(x, "filteredBidCreativeRows", js.undefined)
    
    @scala.inline
    def setFilteredBidCreativeRowsVarargs(value: SchemaFilteredBidCreativeRow*): Self = StObject.set(x, "filteredBidCreativeRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
