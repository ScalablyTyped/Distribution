package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceFilterClause extends StObject {
  
  /**
    * Required. Specifies whether this is an include or exclude filter clause.
    */
  var clauseType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filters that must occur in a specific order for the user to be a member of the Audience.
    */
  var sequenceFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilter] = js.undefined
  
  /**
    * A simple filter that a user must satisfy to be a member of the Audience.
    */
  var simpleFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceSimpleFilter] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceFilterClause {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterClause]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterClause](x: Self) {
    
    inline def setClauseType(value: String): Self = StObject.set(x, "clauseType", value.asInstanceOf[js.Any])
    
    inline def setClauseTypeNull: Self = StObject.set(x, "clauseType", null)
    
    inline def setClauseTypeUndefined: Self = StObject.set(x, "clauseType", js.undefined)
    
    inline def setSequenceFilter(value: SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilter): Self = StObject.set(x, "sequenceFilter", value.asInstanceOf[js.Any])
    
    inline def setSequenceFilterUndefined: Self = StObject.set(x, "sequenceFilter", js.undefined)
    
    inline def setSimpleFilter(value: SchemaGoogleAnalyticsAdminV1alphaAudienceSimpleFilter): Self = StObject.set(x, "simpleFilter", value.asInstanceOf[js.Any])
    
    inline def setSimpleFilterUndefined: Self = StObject.set(x, "simpleFilter", js.undefined)
  }
}
