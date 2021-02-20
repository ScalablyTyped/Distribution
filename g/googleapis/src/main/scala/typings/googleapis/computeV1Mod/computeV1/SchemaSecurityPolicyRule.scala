package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a rule that describes one or more match conditions along with
  * the action to be taken when traffic matches this condition (allow or deny).
  */
@js.native
trait SchemaSecurityPolicyRule extends StObject {
  
  /**
    * The Action to preform when the client connection triggers the rule. Can
    * currently be either &quot;allow&quot; or &quot;deny()&quot; where valid
    * values for status are 403, 404, and 502.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Type of the resource. Always compute#securityPolicyRule for
    * security policy rules
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A match condition that incoming traffic is evaluated against. If it
    * evaluates to true, the corresponding ?action? is enforced.
    */
  var `match`: js.UndefOr[SchemaSecurityPolicyRuleMatcher] = js.native
  
  /**
    * If set to true, the specified action is not enforced.
    */
  var preview: js.UndefOr[Boolean] = js.native
  
  /**
    * An integer indicating the priority of a rule in the list. The priority
    * must be a positive value between 0 and 2147483647. Rules are evaluated
    * from highest to lowest priority where 0 is the highest priority and
    * 2147483647 is the lowest prority.
    */
  var priority: js.UndefOr[Double] = js.native
}
object SchemaSecurityPolicyRule {
  
  @scala.inline
  def apply(): SchemaSecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRule]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyRuleMutableBuilder[Self <: SchemaSecurityPolicyRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMatch(value: SchemaSecurityPolicyRuleMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
