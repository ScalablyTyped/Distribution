package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreenInfo extends StObject {
  
  /** The resource URLs of the [managed instance groups] (/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with blue pool. */
  var blueInstanceGroupUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Time to start deleting blue pool to complete blue-green upgrade, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var bluePoolDeletionStartTime: js.UndefOr[String] = js.undefined
  
  /** The resource URLs of the [managed instance groups] (/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with green pool. */
  var greenInstanceGroupUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Version of green pool. */
  var greenPoolVersion: js.UndefOr[String] = js.undefined
  
  /** Current blue-green upgrade phase. */
  var phase: js.UndefOr[String] = js.undefined
}
object BlueGreenInfo {
  
  inline def apply(): BlueGreenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueGreenInfo]
  }
  
  extension [Self <: BlueGreenInfo](x: Self) {
    
    inline def setBlueInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "blueInstanceGroupUrls", value.asInstanceOf[js.Any])
    
    inline def setBlueInstanceGroupUrlsUndefined: Self = StObject.set(x, "blueInstanceGroupUrls", js.undefined)
    
    inline def setBlueInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "blueInstanceGroupUrls", js.Array(value*))
    
    inline def setBluePoolDeletionStartTime(value: String): Self = StObject.set(x, "bluePoolDeletionStartTime", value.asInstanceOf[js.Any])
    
    inline def setBluePoolDeletionStartTimeUndefined: Self = StObject.set(x, "bluePoolDeletionStartTime", js.undefined)
    
    inline def setGreenInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "greenInstanceGroupUrls", value.asInstanceOf[js.Any])
    
    inline def setGreenInstanceGroupUrlsUndefined: Self = StObject.set(x, "greenInstanceGroupUrls", js.undefined)
    
    inline def setGreenInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "greenInstanceGroupUrls", js.Array(value*))
    
    inline def setGreenPoolVersion(value: String): Self = StObject.set(x, "greenPoolVersion", value.asInstanceOf[js.Any])
    
    inline def setGreenPoolVersionUndefined: Self = StObject.set(x, "greenPoolVersion", js.undefined)
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
  }
}
