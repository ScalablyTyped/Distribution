package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyControllerHubConfig extends StObject {
  
  /**
    * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables audit functionality altogether.
    */
  var auditIntervalSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need to currently exist on the cluster.
    */
  var exemptableNamespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The install_spec represents the intended state specified by the latest request that mutated install_spec in the feature spec, not the lifecycle state of the feature observed by the Hub feature controller that is reported in the feature state.
    */
  var installSpec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Logs all denies and dry run failures.
    */
  var logDeniesEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Monitoring specifies the configuration of monitoring.
    */
  var monitoring: js.UndefOr[SchemaPolicyControllerMonitoringConfig] = js.undefined
  
  /**
    * Enables the ability to mutate resources using Policy Controller.
    */
  var mutationEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enables the ability to use Constraint Templates that reference to objects other than the object currently being evaluated.
    */
  var referentialRulesEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configures the library templates to install along with Policy Controller.
    */
  var templateLibraryConfig: js.UndefOr[SchemaPolicyControllerTemplateLibraryConfig] = js.undefined
}
object SchemaPolicyControllerHubConfig {
  
  inline def apply(): SchemaPolicyControllerHubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyControllerHubConfig]
  }
  
  extension [Self <: SchemaPolicyControllerHubConfig](x: Self) {
    
    inline def setAuditIntervalSeconds(value: String): Self = StObject.set(x, "auditIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setAuditIntervalSecondsNull: Self = StObject.set(x, "auditIntervalSeconds", null)
    
    inline def setAuditIntervalSecondsUndefined: Self = StObject.set(x, "auditIntervalSeconds", js.undefined)
    
    inline def setExemptableNamespaces(value: js.Array[String]): Self = StObject.set(x, "exemptableNamespaces", value.asInstanceOf[js.Any])
    
    inline def setExemptableNamespacesNull: Self = StObject.set(x, "exemptableNamespaces", null)
    
    inline def setExemptableNamespacesUndefined: Self = StObject.set(x, "exemptableNamespaces", js.undefined)
    
    inline def setExemptableNamespacesVarargs(value: String*): Self = StObject.set(x, "exemptableNamespaces", js.Array(value*))
    
    inline def setInstallSpec(value: String): Self = StObject.set(x, "installSpec", value.asInstanceOf[js.Any])
    
    inline def setInstallSpecNull: Self = StObject.set(x, "installSpec", null)
    
    inline def setInstallSpecUndefined: Self = StObject.set(x, "installSpec", js.undefined)
    
    inline def setLogDeniesEnabled(value: Boolean): Self = StObject.set(x, "logDeniesEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogDeniesEnabledNull: Self = StObject.set(x, "logDeniesEnabled", null)
    
    inline def setLogDeniesEnabledUndefined: Self = StObject.set(x, "logDeniesEnabled", js.undefined)
    
    inline def setMonitoring(value: SchemaPolicyControllerMonitoringConfig): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setMutationEnabled(value: Boolean): Self = StObject.set(x, "mutationEnabled", value.asInstanceOf[js.Any])
    
    inline def setMutationEnabledNull: Self = StObject.set(x, "mutationEnabled", null)
    
    inline def setMutationEnabledUndefined: Self = StObject.set(x, "mutationEnabled", js.undefined)
    
    inline def setReferentialRulesEnabled(value: Boolean): Self = StObject.set(x, "referentialRulesEnabled", value.asInstanceOf[js.Any])
    
    inline def setReferentialRulesEnabledNull: Self = StObject.set(x, "referentialRulesEnabled", null)
    
    inline def setReferentialRulesEnabledUndefined: Self = StObject.set(x, "referentialRulesEnabled", js.undefined)
    
    inline def setTemplateLibraryConfig(value: SchemaPolicyControllerTemplateLibraryConfig): Self = StObject.set(x, "templateLibraryConfig", value.asInstanceOf[js.Any])
    
    inline def setTemplateLibraryConfigUndefined: Self = StObject.set(x, "templateLibraryConfig", js.undefined)
  }
}
