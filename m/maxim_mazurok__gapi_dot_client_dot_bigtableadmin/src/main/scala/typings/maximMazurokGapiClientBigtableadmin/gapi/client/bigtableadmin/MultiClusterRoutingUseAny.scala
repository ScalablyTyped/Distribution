package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiClusterRoutingUseAny extends StObject {
  
  /** The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all clusters are eligible. */
  var clusterIds: js.UndefOr[js.Array[String]] = js.undefined
}
object MultiClusterRoutingUseAny {
  
  inline def apply(): MultiClusterRoutingUseAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiClusterRoutingUseAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiClusterRoutingUseAny] (val x: Self) extends AnyVal {
    
    inline def setClusterIds(value: js.Array[String]): Self = StObject.set(x, "clusterIds", value.asInstanceOf[js.Any])
    
    inline def setClusterIdsUndefined: Self = StObject.set(x, "clusterIds", js.undefined)
    
    inline def setClusterIdsVarargs(value: String*): Self = StObject.set(x, "clusterIds", js.Array(value*))
  }
}
