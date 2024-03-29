package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCondition extends StObject {
  
  /**
    * A condition that checks that a time series continues to receive new data points.
    */
  var conditionAbsent: js.UndefOr[SchemaMetricAbsence] = js.undefined
  
  /**
    * A condition that checks for log messages matching given constraints. If set, no other conditions can be present.
    */
  var conditionMatchedLog: js.UndefOr[SchemaLogMatch] = js.undefined
  
  /**
    * A condition that uses the Monitoring Query Language to define alerts.
    */
  var conditionMonitoringQueryLanguage: js.UndefOr[SchemaMonitoringQueryLanguageCondition] = js.undefined
  
  /**
    * A condition that compares a time series against a threshold.
    */
  var conditionThreshold: js.UndefOr[SchemaMetricThreshold] = js.undefined
  
  /**
    * A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple conditions in the same policy.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID] [CONDITION_ID] is assigned by Cloud Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include the name field in the conditions of the requested alerting policy. Cloud Monitoring creates the condition identifiers and includes them in the new policy.When calling the alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy. Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations, or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaCondition {
  
  inline def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  
  extension [Self <: SchemaCondition](x: Self) {
    
    inline def setConditionAbsent(value: SchemaMetricAbsence): Self = StObject.set(x, "conditionAbsent", value.asInstanceOf[js.Any])
    
    inline def setConditionAbsentUndefined: Self = StObject.set(x, "conditionAbsent", js.undefined)
    
    inline def setConditionMatchedLog(value: SchemaLogMatch): Self = StObject.set(x, "conditionMatchedLog", value.asInstanceOf[js.Any])
    
    inline def setConditionMatchedLogUndefined: Self = StObject.set(x, "conditionMatchedLog", js.undefined)
    
    inline def setConditionMonitoringQueryLanguage(value: SchemaMonitoringQueryLanguageCondition): Self = StObject.set(x, "conditionMonitoringQueryLanguage", value.asInstanceOf[js.Any])
    
    inline def setConditionMonitoringQueryLanguageUndefined: Self = StObject.set(x, "conditionMonitoringQueryLanguage", js.undefined)
    
    inline def setConditionThreshold(value: SchemaMetricThreshold): Self = StObject.set(x, "conditionThreshold", value.asInstanceOf[js.Any])
    
    inline def setConditionThresholdUndefined: Self = StObject.set(x, "conditionThreshold", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
