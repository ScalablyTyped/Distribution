package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonitoringConfig extends StObject {
  
  /**
    * Monitoring components configuration
    */
  var componentConfig: js.UndefOr[SchemaMonitoringComponentConfig] = js.undefined
  
  /**
    * Enable Google Cloud Managed Service for Prometheus in the cluster.
    */
  var managedPrometheusConfig: js.UndefOr[SchemaManagedPrometheusConfig] = js.undefined
}
object SchemaMonitoringConfig {
  
  inline def apply(): SchemaMonitoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoringConfig]
  }
  
  extension [Self <: SchemaMonitoringConfig](x: Self) {
    
    inline def setComponentConfig(value: SchemaMonitoringComponentConfig): Self = StObject.set(x, "componentConfig", value.asInstanceOf[js.Any])
    
    inline def setComponentConfigUndefined: Self = StObject.set(x, "componentConfig", js.undefined)
    
    inline def setManagedPrometheusConfig(value: SchemaManagedPrometheusConfig): Self = StObject.set(x, "managedPrometheusConfig", value.asInstanceOf[js.Any])
    
    inline def setManagedPrometheusConfigUndefined: Self = StObject.set(x, "managedPrometheusConfig", js.undefined)
  }
}
