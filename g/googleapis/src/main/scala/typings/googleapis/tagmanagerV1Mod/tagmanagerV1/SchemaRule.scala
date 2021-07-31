package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Rule.
  */
trait SchemaRule extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of conditions that make up this rule (implicit AND between
    * them).
    */
  var condition: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The fingerprint of the GTM Rule as computed at storage time. This value
    * is recomputed whenever the rule is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Rule display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * User notes on how to apply this rule in the container.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * The Rule ID uniquely identifies the GTM Rule.
    */
  var ruleId: js.UndefOr[String] = js.undefined
}
object SchemaRule {
  
  @scala.inline
  def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  @scala.inline
  implicit class SchemaRuleMutableBuilder[Self <: SchemaRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCondition(value: js.Array[SchemaCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setConditionVarargs(value: SchemaCondition*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
  }
}
