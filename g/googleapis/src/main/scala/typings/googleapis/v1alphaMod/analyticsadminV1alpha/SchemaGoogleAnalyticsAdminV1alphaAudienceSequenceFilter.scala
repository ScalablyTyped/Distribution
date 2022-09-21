package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilter extends StObject {
  
  /**
    * Required. Immutable. Specifies the scope for this filter.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Defines the time period in which the whole sequence must occur.
    */
  var sequenceMaximumDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. An ordered sequence of steps. A user must complete each step in order to join the sequence filter.
    */
  var sequenceSteps: js.UndefOr[
    js.Array[SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep]
  ] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilter](x: Self) {
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSequenceMaximumDuration(value: String): Self = StObject.set(x, "sequenceMaximumDuration", value.asInstanceOf[js.Any])
    
    inline def setSequenceMaximumDurationNull: Self = StObject.set(x, "sequenceMaximumDuration", null)
    
    inline def setSequenceMaximumDurationUndefined: Self = StObject.set(x, "sequenceMaximumDuration", js.undefined)
    
    inline def setSequenceSteps(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep]): Self = StObject.set(x, "sequenceSteps", value.asInstanceOf[js.Any])
    
    inline def setSequenceStepsUndefined: Self = StObject.set(x, "sequenceSteps", js.undefined)
    
    inline def setSequenceStepsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep*): Self = StObject.set(x, "sequenceSteps", js.Array(value*))
  }
}
