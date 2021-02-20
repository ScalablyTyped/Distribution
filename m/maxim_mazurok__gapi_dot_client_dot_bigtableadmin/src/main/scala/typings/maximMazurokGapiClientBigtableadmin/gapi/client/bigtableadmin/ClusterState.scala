package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterState extends StObject {
  
  /** Output only. The state of replication for the table in this cluster. */
  var replicationState: js.UndefOr[String] = js.native
}
object ClusterState {
  
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  
  @scala.inline
  implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationState(value: String): Self = StObject.set(x, "replicationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationStateUndefined: Self = StObject.set(x, "replicationState", js.undefined)
  }
}
