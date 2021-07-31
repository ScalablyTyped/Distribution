package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /** Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden. */
  var defaultStorageType: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The location where this cluster's nodes and storage reside. For best performance, clients should be located as close as possible to this cluster. Currently only zones are
    * supported, so values should be of the form `projects/{project}/locations/{zone}`.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** The unique name of the cluster. Values are of the form `projects/{project}/instances/{instance}/clusters/a-z*`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The number of nodes allocated to this cluster. More nodes enable higher throughput and more consistent performance. */
  var serveNodes: js.UndefOr[Double] = js.undefined
  
  /** Output only. The current state of the cluster. */
  var state: js.UndefOr[String] = js.undefined
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterMutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultStorageType(value: String): Self = StObject.set(x, "defaultStorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStorageTypeUndefined: Self = StObject.set(x, "defaultStorageType", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServeNodes(value: Double): Self = StObject.set(x, "serveNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServeNodesUndefined: Self = StObject.set(x, "serveNodes", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
