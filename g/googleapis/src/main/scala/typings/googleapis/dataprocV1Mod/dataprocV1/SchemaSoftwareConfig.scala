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
  def apply(): SchemaSoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareConfig]
  }
  @scala.inline
  implicit class SchemaSoftwareConfigOps[Self <: SchemaSoftwareConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageVersion(value: String): Self = this.set("imageVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageVersion: Self = this.set("imageVersion", js.undefined)
    @scala.inline
    def setOptionalComponentsVarargs(value: String*): Self = this.set("optionalComponents", js.Array(value :_*))
    @scala.inline
    def setOptionalComponents(value: js.Array[String]): Self = this.set("optionalComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalComponents: Self = this.set("optionalComponents", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

