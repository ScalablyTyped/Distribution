package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRule extends StObject {
  
  /**
    * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional, additional actions that are performed on headers.
    */
  var headerAction: js.UndefOr[SchemaSecurityPolicyRuleHttpHeaderAction] = js.undefined
  
  /**
    * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
    */
  var `match`: js.UndefOr[SchemaSecurityPolicyRuleMatcher] = js.undefined
  
  /**
    * If set to true, the specified action is not enforced.
    */
  var preview: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
    */
  var rateLimitOptions: js.UndefOr[SchemaSecurityPolicyRuleRateLimitOptions] = js.undefined
  
  /**
    * Parameters defining the redirect action. Cannot be specified for any other actions.
    */
  var redirectOptions: js.UndefOr[SchemaSecurityPolicyRuleRedirectOptions] = js.undefined
}
object SchemaSecurityPolicyRule {
  
  inline def apply(): SchemaSecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRule]
  }
  
  extension [Self <: SchemaSecurityPolicyRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeaderAction(value: SchemaSecurityPolicyRuleHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatch(value: SchemaSecurityPolicyRuleMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewNull: Self = StObject.set(x, "preview", null)
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRateLimitOptions(value: SchemaSecurityPolicyRuleRateLimitOptions): Self = StObject.set(x, "rateLimitOptions", value.asInstanceOf[js.Any])
    
    inline def setRateLimitOptionsUndefined: Self = StObject.set(x, "rateLimitOptions", js.undefined)
    
    inline def setRedirectOptions(value: SchemaSecurityPolicyRuleRedirectOptions): Self = StObject.set(x, "redirectOptions", value.asInstanceOf[js.Any])
    
    inline def setRedirectOptionsUndefined: Self = StObject.set(x, "redirectOptions", js.undefined)
  }
}
