package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreLayoutClustersListResponse extends StObject {
  
  /** A store cluster of an enterprise. */
  var cluster: js.UndefOr[js.Array[StoreCluster]] = js.native
}
object StoreLayoutClustersListResponse {
  
  @scala.inline
  def apply(): StoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutClustersListResponse]
  }
  
  @scala.inline
  implicit class StoreLayoutClustersListResponseMutableBuilder[Self <: StoreLayoutClustersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: js.Array[StoreCluster]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setClusterVarargs(value: StoreCluster*): Self = StObject.set(x, "cluster", js.Array(value :_*))
  }
}
