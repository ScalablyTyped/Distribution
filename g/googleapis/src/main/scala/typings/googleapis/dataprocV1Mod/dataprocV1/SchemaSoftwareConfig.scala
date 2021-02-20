package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the selection and config of software inside the cluster.
  */
@js.native
trait SchemaSoftwareConfig extends StObject {
  
  /**
    * Optional. The version of software inside the cluster. It must be one of
    * the supported Cloud Dataproc Versions, such as &quot;1.2&quot; (including
    * a subminor version, such as &quot;1.2.29&quot;), or the
    * &quot;preview&quot; version. If unspecified, it defaults to the latest
    * version.
    */
  var imageVersion: js.UndefOr[String] = js.native
  
  /**
    * The set of optional components to activate on the cluster.
    */
  var optionalComponents: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The properties to set on daemon config files.Property keys are
    * specified in prefix:property format, for example core:hadoop.tmp.dir. The
    * following are supported prefixes and their mappings: capacity-scheduler:
    * capacity-scheduler.xml core: core-site.xml distcp: distcp-default.xml
    * hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig:
    * pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more
    * information, see Cluster properties.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaSoftwareConfig {
  
  @scala.inline
  def apply(): SchemaSoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareConfig]
  }
  
  @scala.inline
  implicit class SchemaSoftwareConfigMutableBuilder[Self <: SchemaSoftwareConfig] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
