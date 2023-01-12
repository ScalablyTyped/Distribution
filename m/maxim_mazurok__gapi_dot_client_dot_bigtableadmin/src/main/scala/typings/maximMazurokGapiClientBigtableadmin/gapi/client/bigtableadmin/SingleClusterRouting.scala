package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleClusterRouting extends StObject {
  
  /**
    * Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are allowed by this app profile. It is unsafe to send these requests to the same table/row/column in multiple
    * clusters.
    */
  var allowTransactionalWrites: js.UndefOr[Boolean] = js.undefined
  
  /** The cluster to which read/write requests should be routed. */
  var clusterId: js.UndefOr[String] = js.undefined
}
object SingleClusterRouting {
  
  inline def apply(): SingleClusterRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleClusterRouting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleClusterRouting] (val x: Self) extends AnyVal {
    
    inline def setAllowTransactionalWrites(value: Boolean): Self = StObject.set(x, "allowTransactionalWrites", value.asInstanceOf[js.Any])
    
    inline def setAllowTransactionalWritesUndefined: Self = StObject.set(x, "allowTransactionalWrites", js.undefined)
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
  }
}
