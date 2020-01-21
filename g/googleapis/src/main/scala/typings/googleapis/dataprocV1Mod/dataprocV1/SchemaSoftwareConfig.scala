package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the selection and config of software inside the cluster.
  */
@js.native
trait SchemaSoftwareConfig extends js.Object {
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
  def apply(
    imageVersion: String = null,
    optionalComponents: js.Array[String] = null,
    properties: StringDictionary[String] = null
  ): SchemaSoftwareConfig = {
    val __obj = js.Dynamic.literal()
    if (imageVersion != null) __obj.updateDynamic("imageVersion")(imageVersion.asInstanceOf[js.Any])
    if (optionalComponents != null) __obj.updateDynamic("optionalComponents")(optionalComponents.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSoftwareConfig]
  }
}

