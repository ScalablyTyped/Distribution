package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /** Configuration for this cluster. */
  var clusterConfig: js.UndefOr[ClusterConfig] = js.undefined
  
  /** Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden. */
  var defaultStorageType: js.UndefOr[String] = js.undefined
  
  /** Immutable. The encryption configuration for CMEK-protected clusters. */
  var encryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  
  /**
    * Immutable. The location where this cluster's nodes and storage reside. For best performance, clients should be located as close as possible to this cluster. Currently only zones are
    * supported, so values should be of the form `projects/{project}/locations/{zone}`.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** The unique name of the cluster. Values are of the form `projects/{project}/instances/{instance}/clusters/a-z*`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The number of nodes allocated to this cluster. More nodes enable higher throughput and more consistent performance. */
  var serveNodes: js.UndefOr[Double] = js.undefined
  
  /** Output only. The current state of the cluster. */
  var state: js.UndefOr[String] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setClusterConfig(value: ClusterConfig): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
    
    inline def setDefaultStorageType(value: String): Self = StObject.set(x, "defaultStorageType", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageTypeUndefined: Self = StObject.set(x, "defaultStorageType", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServeNodes(value: Double): Self = StObject.set(x, "serveNodes", value.asInstanceOf[js.Any])
    
    inline def setServeNodesUndefined: Self = StObject.set(x, "serveNodes", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
