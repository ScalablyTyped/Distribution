package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertiserinvoicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Advertiser ID of this invoice.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Month for which invoices are needed in the format YYYYMM. Required field
    */
  var issueMonth: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertiserinvoicesList {
  
  inline def apply(): ParamsResourceAdvertiserinvoicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertiserinvoicesList]
  }
  
  extension [Self <: ParamsResourceAdvertiserinvoicesList](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setIssueMonth(value: String): Self = StObject.set(x, "issueMonth", value.asInstanceOf[js.Any])
    
    inline def setIssueMonthUndefined: Self = StObject.set(x, "issueMonth", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
