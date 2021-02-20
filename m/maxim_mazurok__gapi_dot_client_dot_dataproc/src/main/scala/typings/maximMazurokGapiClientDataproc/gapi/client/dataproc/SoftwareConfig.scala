package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftwareConfig extends StObject {
  
  /**
    * Optional. The version of software inside the cluster. It must be one of the supported Dataproc Versions
    * (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#supported_dataproc_versions), such as "1.2" (including a subminor version, such as "1.2.29"), or the
    * "preview" version (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#other_versions). If unspecified, it defaults to the latest Debian version.
    */
  var imageVersion: js.UndefOr[String] = js.native
  
  /** Optional. The set of components to activate on the cluster. */
  var optionalComponents: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The properties to set on daemon config files.Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes
    * and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp: distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig:
    * pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SoftwareConfig with TopLevel[js.Any]
  ] = js.native
}
object SoftwareConfig {
  
  @scala.inline
  def apply(): SoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareConfig]
  }
  
  @scala.inline
  implicit class SoftwareConfigMutableBuilder[Self <: SoftwareConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageVersion(value: String): Self = StObject.set(x, "imageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionUndefined: Self = StObject.set(x, "imageVersion", js.undefined)
    
    @scala.inline
    def setOptionalComponents(value: js.Array[String]): Self = StObject.set(x, "optionalComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalComponentsUndefined: Self = StObject.set(x, "optionalComponents", js.undefined)
    
    @scala.inline
    def setOptionalComponentsVarargs(value: String*): Self = StObject.set(x, "optionalComponents", js.Array(value :_*))
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SoftwareConfig with TopLevel[js.Any]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
