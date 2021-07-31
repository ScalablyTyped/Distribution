package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remarketing List Population Rule Term.
  */
trait SchemaListPopulationTerm extends StObject {
  
  /**
    * Will be true if the term should check if the user is in the list and
    * false if the term should check if the user is not in the list. This field
    * is only relevant when type is set to LIST_MEMBERSHIP_TERM. False by
    * default.
    */
  var contains: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to negate the comparison result of this term during rule
    * evaluation. This field is only relevant when type is left unset or set to
    * CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var negation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Comparison operator of this term. This field is only relevant when type
    * is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the list in question. This field is only relevant when type is set
    * to LIST_MEMBERSHIP_TERM.
    */
  var remarketingListId: js.UndefOr[String] = js.undefined
  
  /**
    * List population term type determines the applicable fields in this
    * object. If left unset or set to CUSTOM_VARIABLE_TERM, then variableName,
    * variableFriendlyName, operator, value, and negation are applicable. If
    * set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are
    * applicable. If set to REFERRER_TERM then operator, value, and negation
    * are applicable.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Literal to compare the variable to. This field is only relevant when type
    * is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Friendly name of this term&#39;s variable. This is a read-only,
    * auto-generated field. This field is only relevant when type is left unset
    * or set to CUSTOM_VARIABLE_TERM.
    */
  var variableFriendlyName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the variable (U1, U2, etc.) being compared in this term. This
    * field is only relevant when type is set to null, CUSTOM_VARIABLE_TERM or
    * REFERRER_TERM.
    */
  var variableName: js.UndefOr[String] = js.undefined
}
object SchemaListPopulationTerm {
  
  @scala.inline
  def apply(): SchemaListPopulationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationTerm]
  }
  
  @scala.inline
  implicit class SchemaListPopulationTermMutableBuilder[Self <: SchemaListPopulationTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setNegation(value: Boolean): Self = StObject.set(x, "negation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegationUndefined: Self = StObject.set(x, "negation", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setRemarketingListId(value: String): Self = StObject.set(x, "remarketingListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingListIdUndefined: Self = StObject.set(x, "remarketingListId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVariableFriendlyName(value: String): Self = StObject.set(x, "variableFriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableFriendlyNameUndefined: Self = StObject.set(x, "variableFriendlyName", js.undefined)
    
    @scala.inline
    def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
