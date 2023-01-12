package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep extends StObject {
  
  /**
    * Optional. When set, this step must be satisfied within the constraint_duration of the previous step (i.e., t[i] - t[i-1] <= constraint_duration). If not set, there is no duration
    * requirement (the duration is effectively unlimited). It is ignored for the first step.
    */
  var constraintDuration: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. A logical expression of Audience dimension, metric, or event filters in each step. */
  var filterExpression: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceFilterExpression] = js.undefined
  
  /**
    * Optional. If true, the event satisfying this step must be the very next event after the event satisfying the last step. If unset or false, this step indirectly follows the prior
    * step; for example, there may be events between the prior step and this step. It is ignored for the first step.
    */
  var immediatelyFollows: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Immutable. Specifies the scope for this step. */
  var scope: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAudienceSequenceFilterAudienceSequenceStep] (val x: Self) extends AnyVal {
    
    inline def setConstraintDuration(value: String): Self = StObject.set(x, "constraintDuration", value.asInstanceOf[js.Any])
    
    inline def setConstraintDurationUndefined: Self = StObject.set(x, "constraintDuration", js.undefined)
    
    inline def setFilterExpression(value: GoogleAnalyticsAdminV1alphaAudienceFilterExpression): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "filterExpression", js.undefined)
    
    inline def setImmediatelyFollows(value: Boolean): Self = StObject.set(x, "immediatelyFollows", value.asInstanceOf[js.Any])
    
    inline def setImmediatelyFollowsUndefined: Self = StObject.set(x, "immediatelyFollows", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
