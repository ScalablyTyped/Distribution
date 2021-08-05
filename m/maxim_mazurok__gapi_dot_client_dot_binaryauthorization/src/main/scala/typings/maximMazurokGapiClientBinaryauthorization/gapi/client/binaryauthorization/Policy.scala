package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /**
    * Optional. Admission policy allowlisting. A matching admission request will always be permitted. This feature is typically used to exclude Google or third-party infrastructure images
    * from Binary Authorization policies.
    */
  var admissionWhitelistPatterns: js.UndefOr[js.Array[AdmissionWhitelistPattern]] = js.undefined
  
  /**
    * Optional. Per-cluster admission rules. Cluster spec format: `location.clusterId`. There can be at most one admission rule per cluster spec. A `location` is either a compute zone
    * (e.g. us-central1-a) or a region (e.g. us-central1). For `clusterId` syntax restrictions see https://cloud.google.com/container-engine/reference/rest/v1/projects.zones.clusters.
    */
  var clusterAdmissionRules: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.binaryauthorization.gapi.client.binaryauthorization.AdmissionRule}
    */ typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.Policy & TopLevel[js.Any]
  ] = js.undefined
  
  /** Required. Default admission rule for a cluster without a per-cluster, per- kubernetes-service-account, or per-istio-service-identity admission rule. */
  var defaultAdmissionRule: js.UndefOr[AdmissionRule] = js.undefined
  
  /** Optional. A descriptive comment. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Controls the evaluation of a Google-maintained global admission policy for common system-level images. Images not covered by the global policy will be subject to the
    * project admission policy. This setting has no effect when specified inside a global admission policy.
    */
  var globalPolicyEvaluationMode: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name, in the format `projects/∗/policy`. There is at most one policy per project. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when the policy was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setAdmissionWhitelistPatterns(value: js.Array[AdmissionWhitelistPattern]): Self = StObject.set(x, "admissionWhitelistPatterns", value.asInstanceOf[js.Any])
    
    inline def setAdmissionWhitelistPatternsUndefined: Self = StObject.set(x, "admissionWhitelistPatterns", js.undefined)
    
    inline def setAdmissionWhitelistPatternsVarargs(value: AdmissionWhitelistPattern*): Self = StObject.set(x, "admissionWhitelistPatterns", js.Array(value :_*))
    
    inline def setClusterAdmissionRules(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.binaryauthorization.gapi.client.binaryauthorization.AdmissionRule}
      */ typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.Policy & TopLevel[js.Any]
    ): Self = StObject.set(x, "clusterAdmissionRules", value.asInstanceOf[js.Any])
    
    inline def setClusterAdmissionRulesUndefined: Self = StObject.set(x, "clusterAdmissionRules", js.undefined)
    
    inline def setDefaultAdmissionRule(value: AdmissionRule): Self = StObject.set(x, "defaultAdmissionRule", value.asInstanceOf[js.Any])
    
    inline def setDefaultAdmissionRuleUndefined: Self = StObject.set(x, "defaultAdmissionRule", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGlobalPolicyEvaluationMode(value: String): Self = StObject.set(x, "globalPolicyEvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setGlobalPolicyEvaluationModeUndefined: Self = StObject.set(x, "globalPolicyEvaluationMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
