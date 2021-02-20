package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policy extends StObject {
  
  /**
    * Optional. Admission policy allowlisting. A matching admission request will always be permitted. This feature is typically used to exclude Google or third-party infrastructure images
    * from Binary Authorization policies.
    */
  var admissionWhitelistPatterns: js.UndefOr[js.Array[AdmissionWhitelistPattern]] = js.native
  
  /**
    * Optional. Per-cluster admission rules. Cluster spec format: `location.clusterId`. There can be at most one admission rule per cluster spec. A `location` is either a compute zone
    * (e.g. us-central1-a) or a region (e.g. us-central1). For `clusterId` syntax restrictions see https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
    */
  var clusterAdmissionRules: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.binaryauthorization.gapi.client.binaryauthorization.AdmissionRule}
    */ typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.Policy with TopLevel[js.Any]
  ] = js.native
  
  /** Required. Default admission rule for a cluster without a per-cluster, per- kubernetes-service-account, or per-istio-service-identity admission rule. */
  var defaultAdmissionRule: js.UndefOr[AdmissionRule] = js.native
  
  /** Optional. A descriptive comment. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional. Controls the evaluation of a Google-maintained global admission policy for common system-level images. Images not covered by the global policy will be subject to the
    * project admission policy. This setting has no effect when specified inside a global admission policy.
    */
  var globalPolicyEvaluationMode: js.UndefOr[String] = js.native
  
  /** Output only. The resource name, in the format `projects/∗/policy`. There is at most one policy per project. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Time when the policy was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object Policy {
  
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmissionWhitelistPatterns(value: js.Array[AdmissionWhitelistPattern]): Self = StObject.set(x, "admissionWhitelistPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdmissionWhitelistPatternsUndefined: Self = StObject.set(x, "admissionWhitelistPatterns", js.undefined)
    
    @scala.inline
    def setAdmissionWhitelistPatternsVarargs(value: AdmissionWhitelistPattern*): Self = StObject.set(x, "admissionWhitelistPatterns", js.Array(value :_*))
    
    @scala.inline
    def setClusterAdmissionRules(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.binaryauthorization.gapi.client.binaryauthorization.AdmissionRule}
      */ typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.Policy with TopLevel[js.Any]
    ): Self = StObject.set(x, "clusterAdmissionRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterAdmissionRulesUndefined: Self = StObject.set(x, "clusterAdmissionRules", js.undefined)
    
    @scala.inline
    def setDefaultAdmissionRule(value: AdmissionRule): Self = StObject.set(x, "defaultAdmissionRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAdmissionRuleUndefined: Self = StObject.set(x, "defaultAdmissionRule", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGlobalPolicyEvaluationMode(value: String): Self = StObject.set(x, "globalPolicyEvaluationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalPolicyEvaluationModeUndefined: Self = StObject.set(x, "globalPolicyEvaluationMode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
