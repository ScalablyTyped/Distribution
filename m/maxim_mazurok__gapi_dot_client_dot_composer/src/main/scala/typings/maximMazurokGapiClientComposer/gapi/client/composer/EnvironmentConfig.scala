package typings.maximMazurokGapiClientComposer.gapi.client.composer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentConfig extends js.Object {
  
  /** Output only. The URI of the Apache Airflow Web UI hosted within this environment (see [Airflow web interface](/composer/docs/how-to/accessing/airflow-web-interface)). */
  var airflowUri: js.UndefOr[String] = js.native
  
  /**
    * Output only. The Cloud Storage prefix of the DAGs for this environment. Although Cloud Storage objects reside in a flat namespace, a hierarchical file tree can be simulated using
    * "/"-delimited object name prefixes. DAG objects for this environment reside in a simulated directory with the given prefix.
    */
  var dagGcsPrefix: js.UndefOr[String] = js.native
  
  /** Output only. The Kubernetes Engine cluster used to run this environment. */
  var gkeCluster: js.UndefOr[String] = js.native
  
  /** The configuration used for the Kubernetes Engine cluster. */
  var nodeConfig: js.UndefOr[NodeConfig] = js.native
  
  /** The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. */
  var nodeCount: js.UndefOr[Double] = js.native
  
  /** The configuration used for the Private IP Cloud Composer environment. */
  var privateEnvironmentConfig: js.UndefOr[PrivateEnvironmentConfig] = js.native
  
  /** The configuration settings for software inside the environment. */
  var softwareConfig: js.UndefOr[SoftwareConfig] = js.native
}
object EnvironmentConfig {
  
  @scala.inline
  def apply(): EnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentConfig]
  }
  
  @scala.inline
  implicit class EnvironmentConfigOps[Self <: EnvironmentConfig] (val x: Self) extends AnyVal {
    
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
    def setAirflowUri(value: String): Self = this.set("airflowUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAirflowUri: Self = this.set("airflowUri", js.undefined)
    
    @scala.inline
    def setDagGcsPrefix(value: String): Self = this.set("dagGcsPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDagGcsPrefix: Self = this.set("dagGcsPrefix", js.undefined)
    
    @scala.inline
    def setGkeCluster(value: String): Self = this.set("gkeCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGkeCluster: Self = this.set("gkeCluster", js.undefined)
    
    @scala.inline
    def setNodeConfig(value: NodeConfig): Self = this.set("nodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeConfig: Self = this.set("nodeConfig", js.undefined)
    
    @scala.inline
    def setNodeCount(value: Double): Self = this.set("nodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeCount: Self = this.set("nodeCount", js.undefined)
    
    @scala.inline
    def setPrivateEnvironmentConfig(value: PrivateEnvironmentConfig): Self = this.set("privateEnvironmentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateEnvironmentConfig: Self = this.set("privateEnvironmentConfig", js.undefined)
    
    @scala.inline
    def setSoftwareConfig(value: SoftwareConfig): Self = this.set("softwareConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareConfig: Self = this.set("softwareConfig", js.undefined)
  }
}
