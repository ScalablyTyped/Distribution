package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreLayoutClustersListResponse extends StObject {
  
  /** A store cluster of an enterprise. */
  var cluster: js.UndefOr[js.Array[StoreCluster]] = js.undefined
}
object StoreLayoutClustersListResponse {
  
  inline def apply(): StoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutClustersListResponse]
  }
  
  extension [Self <: StoreLayoutClustersListResponse](x: Self) {
    
    inline def setCluster(value: js.Array[StoreCluster]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setClusterVarargs(value: StoreCluster*): Self = StObject.set(x, "cluster", js.Array(value :_*))
  }
}
