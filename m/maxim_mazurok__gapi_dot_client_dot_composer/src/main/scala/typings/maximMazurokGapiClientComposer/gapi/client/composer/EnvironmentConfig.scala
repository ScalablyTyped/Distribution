package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentConfig extends StObject {
  
  /** Output only. The URI of the Apache Airflow Web UI hosted within this environment (see [Airflow web interface](/composer/docs/how-to/accessing/airflow-web-interface)). */
  var airflowUri: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The Cloud Storage prefix of the DAGs for this environment. Although Cloud Storage objects reside in a flat namespace, a hierarchical file tree can be simulated using
    * "/"-delimited object name prefixes. DAG objects for this environment reside in a simulated directory with the given prefix.
    */
  var dagGcsPrefix: js.UndefOr[String] = js.undefined
  
  /** Output only. The Kubernetes Engine cluster used to run this environment. */
  var gkeCluster: js.UndefOr[String] = js.undefined
  
  /** The configuration used for the Kubernetes Engine cluster. */
  var nodeConfig: js.UndefOr[NodeConfig] = js.undefined
  
  /** The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. */
  var nodeCount: js.UndefOr[Double] = js.undefined
  
  /** The configuration used for the Private IP Cloud Composer environment. */
  var privateEnvironmentConfig: js.UndefOr[PrivateEnvironmentConfig] = js.undefined
  
  /** The configuration settings for software inside the environment. */
  var softwareConfig: js.UndefOr[SoftwareConfig] = js.undefined
}
object EnvironmentConfig {
  
  @scala.inline
  def apply(): EnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentConfig]
  }
  
  @scala.inline
  implicit class EnvironmentConfigMutableBuilder[Self <: EnvironmentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAirflowUri(value: String): Self = StObject.set(x, "airflowUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirflowUriUndefined: Self = StObject.set(x, "airflowUri", js.undefined)
    
    @scala.inline
    def setDagGcsPrefix(value: String): Self = StObject.set(x, "dagGcsPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDagGcsPrefixUndefined: Self = StObject.set(x, "dagGcsPrefix", js.undefined)
    
    @scala.inline
    def setGkeCluster(value: String): Self = StObject.set(x, "gkeCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGkeClusterUndefined: Self = StObject.set(x, "gkeCluster", js.undefined)
    
    @scala.inline
    def setNodeConfig(value: NodeConfig): Self = StObject.set(x, "nodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeConfigUndefined: Self = StObject.set(x, "nodeConfig", js.undefined)
    
    @scala.inline
    def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
    
    @scala.inline
    def setPrivateEnvironmentConfig(value: PrivateEnvironmentConfig): Self = StObject.set(x, "privateEnvironmentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateEnvironmentConfigUndefined: Self = StObject.set(x, "privateEnvironmentConfig", js.undefined)
    
    @scala.inline
    def setSoftwareConfig(value: SoftwareConfig): Self = StObject.set(x, "softwareConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareConfigUndefined: Self = StObject.set(x, "softwareConfig", js.undefined)
  }
}
