package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfo extends StObject {
  
  /**
    * Information about data freshness for every supported aggregation period. This field has set semantics, keyed by the `aggregation_period` field.
    */
  var freshnesses: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfoFreshness]] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfo {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfo]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfo](x: Self) {
    
    inline def setFreshnesses(value: js.Array[SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfoFreshness]): Self = StObject.set(x, "freshnesses", value.asInstanceOf[js.Any])
    
    inline def setFreshnessesUndefined: Self = StObject.set(x, "freshnesses", js.undefined)
    
    inline def setFreshnessesVarargs(value: SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfoFreshness*): Self = StObject.set(x, "freshnesses", js.Array(value*))
  }
}
