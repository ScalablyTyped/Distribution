package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialUpdateClusterMetadata extends StObject {
  
  /** The time at which the operation failed or was completed successfully. */
  var finishTime: js.UndefOr[String] = js.undefined
  
  /** The original request for PartialUpdateCluster. */
  var originalRequest: js.UndefOr[PartialUpdateClusterRequest] = js.undefined
  
  /** The time at which the original request was received. */
  var requestTime: js.UndefOr[String] = js.undefined
}
object PartialUpdateClusterMetadata {
  
  inline def apply(): PartialUpdateClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateClusterMetadata]
  }
  
  extension [Self <: PartialUpdateClusterMetadata](x: Self) {
    
    inline def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    inline def setOriginalRequest(value: PartialUpdateClusterRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
