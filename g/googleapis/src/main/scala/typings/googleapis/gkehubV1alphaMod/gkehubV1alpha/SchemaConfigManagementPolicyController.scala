package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementPolicyController extends StObject {
  
  /**
    * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables audit functionality altogether.
    */
  var auditIntervalSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need to currently exist on the cluster.
    */
  var exemptableNamespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Logs all denies and dry run failures.
    */
  var logDeniesEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Monitoring specifies the configuration of monitoring.
    */
  var monitoring: js.UndefOr[SchemaConfigManagementPolicyControllerMonitoring] = js.undefined
  
  /**
    * Enable or disable mutation in policy controller. If true, mutation CRDs, webhook and controller deployment will be deployed to the cluster.
    */
  var mutationEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enables the ability to use Constraint Templates that reference to objects other than the object currently being evaluated.
    */
  var referentialRulesEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Installs the default template library along with Policy Controller.
    */
  var templateLibraryInstalled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigManagementPolicyController {
  
  inline def apply(): SchemaConfigManagementPolicyController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementPolicyController]
  }
  
  extension [Self <: SchemaConfigManagementPolicyController](x: Self) {
    
    inline def setAuditIntervalSeconds(value: String): Self = StObject.set(x, "auditIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setAuditIntervalSecondsNull: Self = StObject.set(x, "auditIntervalSeconds", null)
    
    inline def setAuditIntervalSecondsUndefined: Self = StObject.set(x, "auditIntervalSeconds", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExemptableNamespaces(value: js.Array[String]): Self = StObject.set(x, "exemptableNamespaces", value.asInstanceOf[js.Any])
    
    inline def setExemptableNamespacesNull: Self = StObject.set(x, "exemptableNamespaces", null)
    
    inline def setExemptableNamespacesUndefined: Self = StObject.set(x, "exemptableNamespaces", js.undefined)
    
    inline def setExemptableNamespacesVarargs(value: String*): Self = StObject.set(x, "exemptableNamespaces", js.Array(value*))
    
    inline def setLogDeniesEnabled(value: Boolean): Self = StObject.set(x, "logDeniesEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogDeniesEnabledNull: Self = StObject.set(x, "logDeniesEnabled", null)
    
    inline def setLogDeniesEnabledUndefined: Self = StObject.set(x, "logDeniesEnabled", js.undefined)
    
    inline def setMonitoring(value: SchemaConfigManagementPolicyControllerMonitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setMutationEnabled(value: Boolean): Self = StObject.set(x, "mutationEnabled", value.asInstanceOf[js.Any])
    
    inline def setMutationEnabledNull: Self = StObject.set(x, "mutationEnabled", null)
    
    inline def setMutationEnabledUndefined: Self = StObject.set(x, "mutationEnabled", js.undefined)
    
    inline def setReferentialRulesEnabled(value: Boolean): Self = StObject.set(x, "referentialRulesEnabled", value.asInstanceOf[js.Any])
    
    inline def setReferentialRulesEnabledNull: Self = StObject.set(x, "referentialRulesEnabled", null)
    
    inline def setReferentialRulesEnabledUndefined: Self = StObject.set(x, "referentialRulesEnabled", js.undefined)
    
    inline def setTemplateLibraryInstalled(value: Boolean): Self = StObject.set(x, "templateLibraryInstalled", value.asInstanceOf[js.Any])
    
    inline def setTemplateLibraryInstalledNull: Self = StObject.set(x, "templateLibraryInstalled", null)
    
    inline def setTemplateLibraryInstalledUndefined: Self = StObject.set(x, "templateLibraryInstalled", js.undefined)
  }
}
