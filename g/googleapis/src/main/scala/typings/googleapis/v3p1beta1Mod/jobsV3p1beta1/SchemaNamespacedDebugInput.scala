package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNamespacedDebugInput extends StObject {
  
  /**
    * Set of experiment names to be absolutely forced. These experiments will be forced without evaluating the conditions.
    */
  var absolutelyForcedExpNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set of experiment tags to be absolutely forced. The experiments with these tags will be forced without evaluating the conditions.
    */
  var absolutelyForcedExpTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set of experiment ids to be absolutely forced. These ids will be forced without evaluating the conditions.
    */
  var absolutelyForcedExps: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Set of experiment names to be conditionally forced. These experiments will be forced only if their conditions and their parent domain's conditions are true.
    */
  var conditionallyForcedExpNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set of experiment tags to be conditionally forced. The experiments with these tags will be forced only if their conditions and their parent domain's conditions are true.
    */
  var conditionallyForcedExpTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set of experiment ids to be conditionally forced. These ids will be forced only if their conditions and their parent domain's conditions are true.
    */
  var conditionallyForcedExps: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * If true, disable automatic enrollment selection (at all diversion points). Automatic enrollment selection means experiment selection process based on the experiment's automatic enrollment condition. This does not disable selection of forced experiments. Setting this filed to false does not change anything in experiment selection process.
    */
  var disableAutomaticEnrollmentSelection: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Set of experiment names to be disabled. If an experiment is disabled, it is never selected nor forced. If an aggregate experiment is disabled, its partitions are disabled together. If an experiment with an enrollment is disabled, the enrollment is disabled together. If a name corresponds to a domain, the domain itself and all descendant experiments and domains are disabled together.
    */
  var disableExpNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set of experiment tags to be disabled. All experiments that are tagged with one or more of these tags are disabled. If an experiment is disabled, it is never selected nor forced. If an aggregate experiment is disabled, its partitions are disabled together. If an experiment with an enrollment is disabled, the enrollment is disabled together.
    */
  var disableExpTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set of experiment ids to be disabled. If an experiment is disabled, it is never selected nor forced. If an aggregate experiment is disabled, its partitions are disabled together. If an experiment with an enrollment is disabled, the enrollment is disabled together. If an ID corresponds to a domain, the domain itself and all descendant experiments and domains are disabled together.
    */
  var disableExps: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * If true, disable manual enrollment selection (at all diversion points). Manual enrollment selection means experiment selection process based on the request's manual enrollment states (a.k.a. opt-in experiments). This does not disable selection of forced experiments. Setting this filed to false does not change anything in experiment selection process.
    */
  var disableManualEnrollmentSelection: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, disable organic experiment selection (at all diversion points). Organic selection means experiment selection process based on traffic allocation and diversion condition evaluation. This does not disable selection of forced experiments. This is useful in cases when it is not known whether experiment selection behavior is responsible for a error or breakage. Disabling organic selection may help to isolate the cause of a given problem. Setting this filed to false does not change anything in experiment selection process.
    */
  var disableOrganicSelection: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Flags to force in a particular experiment state. Map from flag name to flag value.
    */
  var forcedFlags: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Rollouts to force in a particular experiment state. Map from rollout name to rollout value.
    */
  var forcedRollouts: js.UndefOr[StringDictionary[Boolean] | Null] = js.undefined
  
  /**
    * If set to ALL_OFF, organic selection will be disabled; if set to ALL_ON, organic selection will be disabled, and only select launch experiments will receive traffic. See go/mendel-aoao-runtime-design.
    */
  var testingMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaNamespacedDebugInput {
  
  inline def apply(): SchemaNamespacedDebugInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespacedDebugInput]
  }
  
  extension [Self <: SchemaNamespacedDebugInput](x: Self) {
    
    inline def setAbsolutelyForcedExpNames(value: js.Array[String]): Self = StObject.set(x, "absolutelyForcedExpNames", value.asInstanceOf[js.Any])
    
    inline def setAbsolutelyForcedExpNamesNull: Self = StObject.set(x, "absolutelyForcedExpNames", null)
    
    inline def setAbsolutelyForcedExpNamesUndefined: Self = StObject.set(x, "absolutelyForcedExpNames", js.undefined)
    
    inline def setAbsolutelyForcedExpNamesVarargs(value: String*): Self = StObject.set(x, "absolutelyForcedExpNames", js.Array(value*))
    
    inline def setAbsolutelyForcedExpTags(value: js.Array[String]): Self = StObject.set(x, "absolutelyForcedExpTags", value.asInstanceOf[js.Any])
    
    inline def setAbsolutelyForcedExpTagsNull: Self = StObject.set(x, "absolutelyForcedExpTags", null)
    
    inline def setAbsolutelyForcedExpTagsUndefined: Self = StObject.set(x, "absolutelyForcedExpTags", js.undefined)
    
    inline def setAbsolutelyForcedExpTagsVarargs(value: String*): Self = StObject.set(x, "absolutelyForcedExpTags", js.Array(value*))
    
    inline def setAbsolutelyForcedExps(value: js.Array[Double]): Self = StObject.set(x, "absolutelyForcedExps", value.asInstanceOf[js.Any])
    
    inline def setAbsolutelyForcedExpsNull: Self = StObject.set(x, "absolutelyForcedExps", null)
    
    inline def setAbsolutelyForcedExpsUndefined: Self = StObject.set(x, "absolutelyForcedExps", js.undefined)
    
    inline def setAbsolutelyForcedExpsVarargs(value: Double*): Self = StObject.set(x, "absolutelyForcedExps", js.Array(value*))
    
    inline def setConditionallyForcedExpNames(value: js.Array[String]): Self = StObject.set(x, "conditionallyForcedExpNames", value.asInstanceOf[js.Any])
    
    inline def setConditionallyForcedExpNamesNull: Self = StObject.set(x, "conditionallyForcedExpNames", null)
    
    inline def setConditionallyForcedExpNamesUndefined: Self = StObject.set(x, "conditionallyForcedExpNames", js.undefined)
    
    inline def setConditionallyForcedExpNamesVarargs(value: String*): Self = StObject.set(x, "conditionallyForcedExpNames", js.Array(value*))
    
    inline def setConditionallyForcedExpTags(value: js.Array[String]): Self = StObject.set(x, "conditionallyForcedExpTags", value.asInstanceOf[js.Any])
    
    inline def setConditionallyForcedExpTagsNull: Self = StObject.set(x, "conditionallyForcedExpTags", null)
    
    inline def setConditionallyForcedExpTagsUndefined: Self = StObject.set(x, "conditionallyForcedExpTags", js.undefined)
    
    inline def setConditionallyForcedExpTagsVarargs(value: String*): Self = StObject.set(x, "conditionallyForcedExpTags", js.Array(value*))
    
    inline def setConditionallyForcedExps(value: js.Array[Double]): Self = StObject.set(x, "conditionallyForcedExps", value.asInstanceOf[js.Any])
    
    inline def setConditionallyForcedExpsNull: Self = StObject.set(x, "conditionallyForcedExps", null)
    
    inline def setConditionallyForcedExpsUndefined: Self = StObject.set(x, "conditionallyForcedExps", js.undefined)
    
    inline def setConditionallyForcedExpsVarargs(value: Double*): Self = StObject.set(x, "conditionallyForcedExps", js.Array(value*))
    
    inline def setDisableAutomaticEnrollmentSelection(value: Boolean): Self = StObject.set(x, "disableAutomaticEnrollmentSelection", value.asInstanceOf[js.Any])
    
    inline def setDisableAutomaticEnrollmentSelectionNull: Self = StObject.set(x, "disableAutomaticEnrollmentSelection", null)
    
    inline def setDisableAutomaticEnrollmentSelectionUndefined: Self = StObject.set(x, "disableAutomaticEnrollmentSelection", js.undefined)
    
    inline def setDisableExpNames(value: js.Array[String]): Self = StObject.set(x, "disableExpNames", value.asInstanceOf[js.Any])
    
    inline def setDisableExpNamesNull: Self = StObject.set(x, "disableExpNames", null)
    
    inline def setDisableExpNamesUndefined: Self = StObject.set(x, "disableExpNames", js.undefined)
    
    inline def setDisableExpNamesVarargs(value: String*): Self = StObject.set(x, "disableExpNames", js.Array(value*))
    
    inline def setDisableExpTags(value: js.Array[String]): Self = StObject.set(x, "disableExpTags", value.asInstanceOf[js.Any])
    
    inline def setDisableExpTagsNull: Self = StObject.set(x, "disableExpTags", null)
    
    inline def setDisableExpTagsUndefined: Self = StObject.set(x, "disableExpTags", js.undefined)
    
    inline def setDisableExpTagsVarargs(value: String*): Self = StObject.set(x, "disableExpTags", js.Array(value*))
    
    inline def setDisableExps(value: js.Array[Double]): Self = StObject.set(x, "disableExps", value.asInstanceOf[js.Any])
    
    inline def setDisableExpsNull: Self = StObject.set(x, "disableExps", null)
    
    inline def setDisableExpsUndefined: Self = StObject.set(x, "disableExps", js.undefined)
    
    inline def setDisableExpsVarargs(value: Double*): Self = StObject.set(x, "disableExps", js.Array(value*))
    
    inline def setDisableManualEnrollmentSelection(value: Boolean): Self = StObject.set(x, "disableManualEnrollmentSelection", value.asInstanceOf[js.Any])
    
    inline def setDisableManualEnrollmentSelectionNull: Self = StObject.set(x, "disableManualEnrollmentSelection", null)
    
    inline def setDisableManualEnrollmentSelectionUndefined: Self = StObject.set(x, "disableManualEnrollmentSelection", js.undefined)
    
    inline def setDisableOrganicSelection(value: Boolean): Self = StObject.set(x, "disableOrganicSelection", value.asInstanceOf[js.Any])
    
    inline def setDisableOrganicSelectionNull: Self = StObject.set(x, "disableOrganicSelection", null)
    
    inline def setDisableOrganicSelectionUndefined: Self = StObject.set(x, "disableOrganicSelection", js.undefined)
    
    inline def setForcedFlags(value: StringDictionary[String]): Self = StObject.set(x, "forcedFlags", value.asInstanceOf[js.Any])
    
    inline def setForcedFlagsNull: Self = StObject.set(x, "forcedFlags", null)
    
    inline def setForcedFlagsUndefined: Self = StObject.set(x, "forcedFlags", js.undefined)
    
    inline def setForcedRollouts(value: StringDictionary[Boolean]): Self = StObject.set(x, "forcedRollouts", value.asInstanceOf[js.Any])
    
    inline def setForcedRolloutsNull: Self = StObject.set(x, "forcedRollouts", null)
    
    inline def setForcedRolloutsUndefined: Self = StObject.set(x, "forcedRollouts", js.undefined)
    
    inline def setTestingMode(value: String): Self = StObject.set(x, "testingMode", value.asInstanceOf[js.Any])
    
    inline def setTestingModeNull: Self = StObject.set(x, "testingMode", null)
    
    inline def setTestingModeUndefined: Self = StObject.set(x, "testingMode", js.undefined)
  }
}
