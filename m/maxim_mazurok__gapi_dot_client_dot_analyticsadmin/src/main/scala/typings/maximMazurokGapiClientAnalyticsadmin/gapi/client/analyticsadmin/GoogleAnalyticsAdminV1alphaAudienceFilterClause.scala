package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceFilterClause extends StObject {
  
  /** Required. Specifies whether this is an include or exclude filter clause. */
  var clauseType: js.UndefOr[String] = js.undefined
  
  /** Filters that must occur in a specific order for the user to be a member of the Audience. */
  var sequenceFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceSequenceFilter] = js.undefined
  
  /** A simple filter that a user must satisfy to be a member of the Audience. */
  var simpleFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceSimpleFilter] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceFilterClause {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceFilterClause]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudienceFilterClause](x: Self) {
    
    inline def setClauseType(value: String): Self = StObject.set(x, "clauseType", value.asInstanceOf[js.Any])
    
    inline def setClauseTypeUndefined: Self = StObject.set(x, "clauseType", js.undefined)
    
    inline def setSequenceFilter(value: GoogleAnalyticsAdminV1alphaAudienceSequenceFilter): Self = StObject.set(x, "sequenceFilter", value.asInstanceOf[js.Any])
    
    inline def setSequenceFilterUndefined: Self = StObject.set(x, "sequenceFilter", js.undefined)
    
    inline def setSimpleFilter(value: GoogleAnalyticsAdminV1alphaAudienceSimpleFilter): Self = StObject.set(x, "simpleFilter", value.asInstanceOf[js.Any])
    
    inline def setSimpleFilterUndefined: Self = StObject.set(x, "simpleFilter", js.undefined)
  }
}
