package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceApplicationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return. Default is 100.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceApplicationsList {
  
  inline def apply(): ParamsResourceApplicationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationsList]
  }
  
  extension [Self <: ParamsResourceApplicationsList](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
