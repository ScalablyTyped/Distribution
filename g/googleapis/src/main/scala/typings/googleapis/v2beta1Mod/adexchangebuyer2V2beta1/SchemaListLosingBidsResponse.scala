package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all reasons that bids lost in the auction.
  */
trait SchemaListLosingBidsResponse extends StObject {
  
  /**
    * List of rows, with counts of losing bids aggregated by loss reason (i.e.
    * creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[SchemaCreativeStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListLosingBidsRequest.pageToken field in the subsequent call to the
    * losingBids.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListLosingBidsResponse {
  
  @scala.inline
  def apply(): SchemaListLosingBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLosingBidsResponse]
  }
  
  @scala.inline
  implicit class SchemaListLosingBidsResponseMutableBuilder[Self <: SchemaListLosingBidsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeStatusRows(value: js.Array[SchemaCreativeStatusRow]): Self = StObject.set(x, "creativeStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeStatusRowsUndefined: Self = StObject.set(x, "creativeStatusRows", js.undefined)
    
    @scala.inline
    def setCreativeStatusRowsVarargs(value: SchemaCreativeStatusRow*): Self = StObject.set(x, "creativeStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
