package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression extends StObject {
  
  /**
    * A primitive filter. In the same FilterExpression, all of the filter's field names need to be either all dimensions or all metrics.
    */
  var accessFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessFilter] = js.undefined
  
  /**
    * Each of the FilterExpressions in the and_group has an AND relationship.
    */
  var andGroup: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList] = js.undefined
  
  /**
    * The FilterExpression is NOT of not_expression.
    */
  var notExpression: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression] = js.undefined
  
  /**
    * Each of the FilterExpressions in the or_group has an OR relationship.
    */
  var orGroup: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression](x: Self) {
    
    inline def setAccessFilter(value: SchemaGoogleAnalyticsAdminV1alphaAccessFilter): Self = StObject.set(x, "accessFilter", value.asInstanceOf[js.Any])
    
    inline def setAccessFilterUndefined: Self = StObject.set(x, "accessFilter", js.undefined)
    
    inline def setAndGroup(value: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList): Self = StObject.set(x, "andGroup", value.asInstanceOf[js.Any])
    
    inline def setAndGroupUndefined: Self = StObject.set(x, "andGroup", js.undefined)
    
    inline def setNotExpression(value: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression): Self = StObject.set(x, "notExpression", value.asInstanceOf[js.Any])
    
    inline def setNotExpressionUndefined: Self = StObject.set(x, "notExpression", js.undefined)
    
    inline def setOrGroup(value: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList): Self = StObject.set(x, "orGroup", value.asInstanceOf[js.Any])
    
    inline def setOrGroupUndefined: Self = StObject.set(x, "orGroup", js.undefined)
  }
}
