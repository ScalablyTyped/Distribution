package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRule extends StObject {
  
  /**
    * A boost action.
    */
  var boostAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleBoostAction] = js.undefined
  
  /**
    * Required. The condition that triggers the rule. If the condition is empty, the rule will always apply.
    */
  var condition: js.UndefOr[SchemaGoogleCloudRetailV2betaCondition] = js.undefined
  
  /**
    * Prevents term from being associated with other terms.
    */
  var doNotAssociateAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleDoNotAssociateAction] = js.undefined
  
  /**
    * Filters results.
    */
  var filterAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleFilterAction] = js.undefined
  
  /**
    * Ignores specific terms from query during search.
    */
  var ignoreAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleIgnoreAction] = js.undefined
  
  /**
    * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
    */
  var onewaySynonymsAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleOnewaySynonymsAction] = js.undefined
  
  /**
    * Redirects a shopper to a specific page.
    */
  var redirectAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleRedirectAction] = js.undefined
  
  /**
    * Replaces specific terms in the query.
    */
  var replacementAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleReplacementAction] = js.undefined
  
  /**
    * Treats a set of terms as synonyms of one another.
    */
  var twowaySynonymsAction: js.UndefOr[SchemaGoogleCloudRetailV2betaRuleTwowaySynonymsAction] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRule {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRule]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRule](x: Self) {
    
    inline def setBoostAction(value: SchemaGoogleCloudRetailV2betaRuleBoostAction): Self = StObject.set(x, "boostAction", value.asInstanceOf[js.Any])
    
    inline def setBoostActionUndefined: Self = StObject.set(x, "boostAction", js.undefined)
    
    inline def setCondition(value: SchemaGoogleCloudRetailV2betaCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDoNotAssociateAction(value: SchemaGoogleCloudRetailV2betaRuleDoNotAssociateAction): Self = StObject.set(x, "doNotAssociateAction", value.asInstanceOf[js.Any])
    
    inline def setDoNotAssociateActionUndefined: Self = StObject.set(x, "doNotAssociateAction", js.undefined)
    
    inline def setFilterAction(value: SchemaGoogleCloudRetailV2betaRuleFilterAction): Self = StObject.set(x, "filterAction", value.asInstanceOf[js.Any])
    
    inline def setFilterActionUndefined: Self = StObject.set(x, "filterAction", js.undefined)
    
    inline def setIgnoreAction(value: SchemaGoogleCloudRetailV2betaRuleIgnoreAction): Self = StObject.set(x, "ignoreAction", value.asInstanceOf[js.Any])
    
    inline def setIgnoreActionUndefined: Self = StObject.set(x, "ignoreAction", js.undefined)
    
    inline def setOnewaySynonymsAction(value: SchemaGoogleCloudRetailV2betaRuleOnewaySynonymsAction): Self = StObject.set(x, "onewaySynonymsAction", value.asInstanceOf[js.Any])
    
    inline def setOnewaySynonymsActionUndefined: Self = StObject.set(x, "onewaySynonymsAction", js.undefined)
    
    inline def setRedirectAction(value: SchemaGoogleCloudRetailV2betaRuleRedirectAction): Self = StObject.set(x, "redirectAction", value.asInstanceOf[js.Any])
    
    inline def setRedirectActionUndefined: Self = StObject.set(x, "redirectAction", js.undefined)
    
    inline def setReplacementAction(value: SchemaGoogleCloudRetailV2betaRuleReplacementAction): Self = StObject.set(x, "replacementAction", value.asInstanceOf[js.Any])
    
    inline def setReplacementActionUndefined: Self = StObject.set(x, "replacementAction", js.undefined)
    
    inline def setTwowaySynonymsAction(value: SchemaGoogleCloudRetailV2betaRuleTwowaySynonymsAction): Self = StObject.set(x, "twowaySynonymsAction", value.asInstanceOf[js.Any])
    
    inline def setTwowaySynonymsActionUndefined: Self = StObject.set(x, "twowaySynonymsAction", js.undefined)
  }
}
