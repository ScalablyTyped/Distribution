package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AckInfo extends StObject {
  
  /** Output only. Number of meeting devices that have not acked yet. */
  var unackedDeviceCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. IDs of meeting devices (at most ten are provided) that have not acked yet. */
  var unackedDeviceIds: js.UndefOr[js.Array[String]] = js.undefined
}
object AckInfo {
  
  inline def apply(): AckInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AckInfo]
  }
  
  extension [Self <: AckInfo](x: Self) {
    
    inline def setUnackedDeviceCount(value: Double): Self = StObject.set(x, "unackedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnackedDeviceCountUndefined: Self = StObject.set(x, "unackedDeviceCount", js.undefined)
    
    inline def setUnackedDeviceIds(value: js.Array[String]): Self = StObject.set(x, "unackedDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setUnackedDeviceIdsUndefined: Self = StObject.set(x, "unackedDeviceIds", js.undefined)
    
    inline def setUnackedDeviceIdsVarargs(value: String*): Self = StObject.set(x, "unackedDeviceIds", js.Array(value*))
  }
}
