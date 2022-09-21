package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of subscriptions to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The value obtained in the last ListSubscriptionsResponse for continuation.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A valid label query expression.
    */
  var query: js.UndefOr[String] = js.undefined
}
object ParamsResourceSubscriptionsList {
  
  inline def apply(): ParamsResourceSubscriptionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsList]
  }
  
  extension [Self <: ParamsResourceSubscriptionsList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
