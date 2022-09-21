package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareConfig extends StObject {
  
  /**
    * Optional. The version of software inside the cluster. It must be one of the supported Dataproc Versions (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#supported_dataproc_versions), such as "1.2" (including a subminor version, such as "1.2.29"), or the "preview" version (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#other_versions). If unspecified, it defaults to the latest Debian version.
    */
  var imageVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of optional components to activate on the cluster.
    */
  var optionalComponents: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The properties to set on daemon config files.Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp: distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig: pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaSoftwareConfig {
  
  inline def apply(): SchemaSoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareConfig]
  }
  
  extension [Self <: SchemaSoftwareConfig](x: Self) {
    
    inline def setImageVersion(value: String): Self = StObject.set(x, "imageVersion", value.asInstanceOf[js.Any])
    
    inline def setImageVersionNull: Self = StObject.set(x, "imageVersion", null)
    
    inline def setImageVersionUndefined: Self = StObject.set(x, "imageVersion", js.undefined)
    
    inline def setOptionalComponents(value: js.Array[String]): Self = StObject.set(x, "optionalComponents", value.asInstanceOf[js.Any])
    
    inline def setOptionalComponentsNull: Self = StObject.set(x, "optionalComponents", null)
    
    inline def setOptionalComponentsUndefined: Self = StObject.set(x, "optionalComponents", js.undefined)
    
    inline def setOptionalComponentsVarargs(value: String*): Self = StObject.set(x, "optionalComponents", js.Array(value*))
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
