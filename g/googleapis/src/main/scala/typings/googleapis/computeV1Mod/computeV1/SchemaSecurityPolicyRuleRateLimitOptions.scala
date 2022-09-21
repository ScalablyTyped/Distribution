package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleRateLimitOptions extends StObject {
  
  /**
    * Can only be specified if the action for the rule is "rate_based_ban". If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
    */
  var banDurationSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also exceed this 'ban_threshold'.
    */
  var banThreshold: js.UndefOr[SchemaSecurityPolicyRuleRateLimitOptionsThreshold] = js.undefined
  
  /**
    * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
    */
  var conformAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field 'enforce_on_key' is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
    */
  var enforceOnKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
    */
  var enforceOnKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are "deny(status)", where valid values for status are 403, 404, 429, and 502, and "redirect" where the redirect parameters come from exceedRedirectOptions below.
    */
  var exceedAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
    */
  var exceedRedirectOptions: js.UndefOr[SchemaSecurityPolicyRuleRedirectOptions] = js.undefined
  
  /**
    * Threshold at which to begin ratelimiting.
    */
  var rateLimitThreshold: js.UndefOr[SchemaSecurityPolicyRuleRateLimitOptionsThreshold] = js.undefined
}
object SchemaSecurityPolicyRuleRateLimitOptions {
  
  inline def apply(): SchemaSecurityPolicyRuleRateLimitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleRateLimitOptions]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleRateLimitOptions](x: Self) {
    
    inline def setBanDurationSec(value: Double): Self = StObject.set(x, "banDurationSec", value.asInstanceOf[js.Any])
    
    inline def setBanDurationSecNull: Self = StObject.set(x, "banDurationSec", null)
    
    inline def setBanDurationSecUndefined: Self = StObject.set(x, "banDurationSec", js.undefined)
    
    inline def setBanThreshold(value: SchemaSecurityPolicyRuleRateLimitOptionsThreshold): Self = StObject.set(x, "banThreshold", value.asInstanceOf[js.Any])
    
    inline def setBanThresholdUndefined: Self = StObject.set(x, "banThreshold", js.undefined)
    
    inline def setConformAction(value: String): Self = StObject.set(x, "conformAction", value.asInstanceOf[js.Any])
    
    inline def setConformActionNull: Self = StObject.set(x, "conformAction", null)
    
    inline def setConformActionUndefined: Self = StObject.set(x, "conformAction", js.undefined)
    
    inline def setEnforceOnKey(value: String): Self = StObject.set(x, "enforceOnKey", value.asInstanceOf[js.Any])
    
    inline def setEnforceOnKeyName(value: String): Self = StObject.set(x, "enforceOnKeyName", value.asInstanceOf[js.Any])
    
    inline def setEnforceOnKeyNameNull: Self = StObject.set(x, "enforceOnKeyName", null)
    
    inline def setEnforceOnKeyNameUndefined: Self = StObject.set(x, "enforceOnKeyName", js.undefined)
    
    inline def setEnforceOnKeyNull: Self = StObject.set(x, "enforceOnKey", null)
    
    inline def setEnforceOnKeyUndefined: Self = StObject.set(x, "enforceOnKey", js.undefined)
    
    inline def setExceedAction(value: String): Self = StObject.set(x, "exceedAction", value.asInstanceOf[js.Any])
    
    inline def setExceedActionNull: Self = StObject.set(x, "exceedAction", null)
    
    inline def setExceedActionUndefined: Self = StObject.set(x, "exceedAction", js.undefined)
    
    inline def setExceedRedirectOptions(value: SchemaSecurityPolicyRuleRedirectOptions): Self = StObject.set(x, "exceedRedirectOptions", value.asInstanceOf[js.Any])
    
    inline def setExceedRedirectOptionsUndefined: Self = StObject.set(x, "exceedRedirectOptions", js.undefined)
    
    inline def setRateLimitThreshold(value: SchemaSecurityPolicyRuleRateLimitOptionsThreshold): Self = StObject.set(x, "rateLimitThreshold", value.asInstanceOf[js.Any])
    
    inline def setRateLimitThresholdUndefined: Self = StObject.set(x, "rateLimitThreshold", js.undefined)
  }
}
