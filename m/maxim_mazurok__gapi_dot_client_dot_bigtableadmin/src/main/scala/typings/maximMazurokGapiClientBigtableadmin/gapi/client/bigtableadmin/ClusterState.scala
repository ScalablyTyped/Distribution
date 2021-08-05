package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterState extends StObject {
  
  /** Output only. The state of replication for the table in this cluster. */
  var replicationState: js.UndefOr[String] = js.undefined
}
object ClusterState {
  
  inline def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  
  extension [Self <: ClusterState](x: Self) {
    
    inline def setReplicationState(value: String): Self = StObject.set(x, "replicationState", value.asInstanceOf[js.Any])
    
    inline def setReplicationStateUndefined: Self = StObject.set(x, "replicationState", js.undefined)
  }
}
