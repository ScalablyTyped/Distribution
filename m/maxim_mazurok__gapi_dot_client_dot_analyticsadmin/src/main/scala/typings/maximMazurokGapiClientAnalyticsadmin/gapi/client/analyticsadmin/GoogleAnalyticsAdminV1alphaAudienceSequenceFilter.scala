package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceSequenceFilter extends StObject {
  
  /** Required. Immutable. Specifies the scope for this filter. */
  var scope: js.UndefOr[String] = js.undefined
  
  /** Optional. Defines the time period in which the whole sequence must occur. */
  var sequenceMaximumDuration: js.UndefOr[String] = js.undefined
  
  /** Required. An ordered sequence of steps. A user must complete each step in order to join the sequence filter. */
  var sequenceSteps: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceSequenceFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceSequenceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceSequenceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAudienceSequenceFilter] (val x: Self) extends AnyVal {
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSequenceMaximumDuration(value: String): Self = StObject.set(x, "sequenceMaximumDuration", value.asInstanceOf[js.Any])
    
    inline def setSequenceMaximumDurationUndefined: Self = StObject.set(x, "sequenceMaximumDuration", js.undefined)
    
    inline def setSequenceSteps(value: js.Array[GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep]): Self = StObject.set(x, "sequenceSteps", value.asInstanceOf[js.Any])
    
    inline def setSequenceStepsUndefined: Self = StObject.set(x, "sequenceSteps", js.undefined)
    
    inline def setSequenceStepsVarargs(value: GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep*): Self = StObject.set(x, "sequenceSteps", js.Array(value*))
  }
}
