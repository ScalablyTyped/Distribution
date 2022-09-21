package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceV2Transport extends StObject {
  
  var connection: js.UndefOr[PivotDataSourceV2TransportConnection] = js.undefined
  
  var discover: js.UndefOr[Any | String | js.Function] = js.undefined
}
object PivotDataSourceV2Transport {
  
  inline def apply(): PivotDataSourceV2Transport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDataSourceV2Transport]
  }
  
  extension [Self <: PivotDataSourceV2Transport](x: Self) {
    
    inline def setConnection(value: PivotDataSourceV2TransportConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDiscover(value: Any | String | js.Function): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    inline def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
  }
}
