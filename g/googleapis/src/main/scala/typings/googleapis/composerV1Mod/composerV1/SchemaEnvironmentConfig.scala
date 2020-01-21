package typings.googleapis.composerV1Mod.composerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration information for an environment.
  */
@js.native
trait SchemaEnvironmentConfig extends js.Object {
  /**
    * Output only. The URI of the Apache Airflow Web UI hosted within this
    * environment (see [Airflow web
    * interface](/composer/docs/how-to/accessing/airflow-web-interface)).
    */
  var airflowUri: js.UndefOr[String] = js.native
  /**
    * Output only. The Cloud Storage prefix of the DAGs for this environment.
    * Although Cloud Storage objects reside in a flat namespace, a hierarchical
    * file tree can be simulated using &quot;/&quot;-delimited object name
    * prefixes. DAG objects for this environment reside in a simulated
    * directory with the given prefix.
    */
  var dagGcsPrefix: js.UndefOr[String] = js.native
  /**
    * Output only. The Kubernetes Engine cluster used to run this environment.
    */
  var gkeCluster: js.UndefOr[String] = js.native
  /**
    * The configuration used for the Kubernetes Engine cluster.
    */
  var nodeConfig: js.UndefOr[SchemaNodeConfig] = js.native
  /**
    * The number of nodes in the Kubernetes Engine cluster that will be used to
    * run this environment.
    */
  var nodeCount: js.UndefOr[Double] = js.native
  /**
    * The configuration settings for software inside the environment.
    */
  var softwareConfig: js.UndefOr[SchemaSoftwareConfig] = js.native
}

object SchemaEnvironmentConfig {
  @scala.inline
  def apply(
    airflowUri: String = null,
    dagGcsPrefix: String = null,
    gkeCluster: String = null,
    nodeConfig: SchemaNodeConfig = null,
    nodeCount: Int | Double = null,
    softwareConfig: SchemaSoftwareConfig = null
  ): SchemaEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    if (airflowUri != null) __obj.updateDynamic("airflowUri")(airflowUri.asInstanceOf[js.Any])
    if (dagGcsPrefix != null) __obj.updateDynamic("dagGcsPrefix")(dagGcsPrefix.asInstanceOf[js.Any])
    if (gkeCluster != null) __obj.updateDynamic("gkeCluster")(gkeCluster.asInstanceOf[js.Any])
    if (nodeConfig != null) __obj.updateDynamic("nodeConfig")(nodeConfig.asInstanceOf[js.Any])
    if (nodeCount != null) __obj.updateDynamic("nodeCount")(nodeCount.asInstanceOf[js.Any])
    if (softwareConfig != null) __obj.updateDynamic("softwareConfig")(softwareConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvironmentConfig]
  }
}

