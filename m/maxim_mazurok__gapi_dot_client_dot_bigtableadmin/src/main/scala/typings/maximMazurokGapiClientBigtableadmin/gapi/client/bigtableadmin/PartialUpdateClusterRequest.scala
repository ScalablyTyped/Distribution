package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialUpdateClusterRequest extends StObject {
  
  /** Required. The Cluster which contains the partial updates to be applied, subject to the update_mask. */
  var cluster: js.UndefOr[Cluster] = js.undefined
  
  /** Required. The subset of Cluster fields which should be replaced. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object PartialUpdateClusterRequest {
  
  inline def apply(): PartialUpdateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateClusterRequest]
  }
  
  extension [Self <: PartialUpdateClusterRequest](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
