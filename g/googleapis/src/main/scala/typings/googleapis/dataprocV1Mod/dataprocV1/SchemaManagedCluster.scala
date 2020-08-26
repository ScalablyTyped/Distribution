package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cluster that is managed by the workflow.
  */
@js.native
trait SchemaManagedCluster extends js.Object {
  /**
    * Required. The cluster name prefix. A unique cluster name will be formed
    * by appending a random suffix.The name must contain only lower-case
    * letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter.
    * Cannot begin or end with hyphen. Must consist of between 2 and 35
    * characters.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Required. The cluster configuration.
    */
  var config: js.UndefOr[SchemaClusterConfig] = js.native
  /**
    * Optional. The labels to associate with this cluster.Label keys must be
    * between 1 and 63 characters long, and must conform to the following PCRE
    * regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and
    * 63 characters long, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be
    * associated with a given cluster.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaManagedCluster {
  @scala.inline
  def apply(): SchemaManagedCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedCluster]
  }
  @scala.inline
  implicit class SchemaManagedClusterOps[Self <: SchemaManagedCluster] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    @scala.inline
    def setConfig(value: SchemaClusterConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
  
}

