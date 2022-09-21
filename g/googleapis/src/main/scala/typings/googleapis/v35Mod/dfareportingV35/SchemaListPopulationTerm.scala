package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPopulationTerm extends StObject {
  
  /**
    * Will be true if the term should check if the user is in the list and false if the term should check if the user is not in the list. This field is only relevant when type is set to LIST_MEMBERSHIP_TERM. False by default.
    */
  var contains: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to negate the comparison result of this term during rule evaluation. This field is only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var negation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Comparison operator of this term. This field is only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var operator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the list in question. This field is only relevant when type is set to LIST_MEMBERSHIP_TERM.
    */
  var remarketingListId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List population term type determines the applicable fields in this object. If left unset or set to CUSTOM_VARIABLE_TERM, then variableName, variableFriendlyName, operator, value, and negation are applicable. If set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are applicable. If set to REFERRER_TERM then operator, value, and negation are applicable.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Literal to compare the variable to. This field is only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var value: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Friendly name of this term's variable. This is a read-only, auto-generated field. This field is only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM.
    */
  var variableFriendlyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the variable (U1, U2, etc.) being compared in this term. This field is only relevant when type is set to null, CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var variableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaListPopulationTerm {
  
  inline def apply(): SchemaListPopulationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationTerm]
  }
  
  extension [Self <: SchemaListPopulationTerm](x: Self) {
    
    inline def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsNull: Self = StObject.set(x, "contains", null)
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setNegation(value: Boolean): Self = StObject.set(x, "negation", value.asInstanceOf[js.Any])
    
    inline def setNegationNull: Self = StObject.set(x, "negation", null)
    
    inline def setNegationUndefined: Self = StObject.set(x, "negation", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setRemarketingListId(value: String): Self = StObject.set(x, "remarketingListId", value.asInstanceOf[js.Any])
    
    inline def setRemarketingListIdNull: Self = StObject.set(x, "remarketingListId", null)
    
    inline def setRemarketingListIdUndefined: Self = StObject.set(x, "remarketingListId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariableFriendlyName(value: String): Self = StObject.set(x, "variableFriendlyName", value.asInstanceOf[js.Any])
    
    inline def setVariableFriendlyNameNull: Self = StObject.set(x, "variableFriendlyName", null)
    
    inline def setVariableFriendlyNameUndefined: Self = StObject.set(x, "variableFriendlyName", js.undefined)
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    inline def setVariableNameNull: Self = StObject.set(x, "variableName", null)
    
    inline def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
