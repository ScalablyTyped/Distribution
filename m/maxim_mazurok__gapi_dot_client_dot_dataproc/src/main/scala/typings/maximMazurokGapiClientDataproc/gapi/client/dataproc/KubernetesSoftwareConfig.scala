package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesSoftwareConfig extends StObject {
  
  /**
    * The components that should be installed in this Dataproc cluster. The key must be a string from the KubernetesComponent enumeration. The value is the version of the software to be
    * installed. At least one entry must be specified.
    */
  var componentVersion: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * The properties to set on daemon config files.Property keys are specified in prefix:property format, for example spark:spark.kubernetes.container.image. The following are supported
    * prefixes and their mappings: spark: spark-defaults.confFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object KubernetesSoftwareConfig {
  
  inline def apply(): KubernetesSoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesSoftwareConfig]
  }
  
  extension [Self <: KubernetesSoftwareConfig](x: Self) {
    
    inline def setComponentVersion(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
