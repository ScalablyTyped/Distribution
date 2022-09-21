package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessFilterExpression extends StObject {
  
  /** A primitive filter. In the same FilterExpression, all of the filter's field names need to be either all dimensions or all metrics. */
  var accessFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessFilter] = js.undefined
  
  /** Each of the FilterExpressions in the and_group has an AND relationship. */
  var andGroup: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessFilterExpressionList] = js.undefined
  
  /** The FilterExpression is NOT of not_expression. */
  var notExpression: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessFilterExpression] = js.undefined
  
  /** Each of the FilterExpressions in the or_group has an OR relationship. */
  var orGroup: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessFilterExpressionList] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessFilterExpression {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessFilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessFilterExpression]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessFilterExpression](x: Self) {
    
    inline def setAccessFilter(value: GoogleAnalyticsAdminV1alphaAccessFilter): Self = StObject.set(x, "accessFilter", value.asInstanceOf[js.Any])
    
    inline def setAccessFilterUndefined: Self = StObject.set(x, "accessFilter", js.undefined)
    
    inline def setAndGroup(value: GoogleAnalyticsAdminV1alphaAccessFilterExpressionList): Self = StObject.set(x, "andGroup", value.asInstanceOf[js.Any])
    
    inline def setAndGroupUndefined: Self = StObject.set(x, "andGroup", js.undefined)
    
    inline def setNotExpression(value: GoogleAnalyticsAdminV1alphaAccessFilterExpression): Self = StObject.set(x, "notExpression", value.asInstanceOf[js.Any])
    
    inline def setNotExpressionUndefined: Self = StObject.set(x, "notExpression", js.undefined)
    
    inline def setOrGroup(value: GoogleAnalyticsAdminV1alphaAccessFilterExpressionList): Self = StObject.set(x, "orGroup", value.asInstanceOf[js.Any])
    
    inline def setOrGroupUndefined: Self = StObject.set(x, "orGroup", js.undefined)
  }
}
