package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceV2TransportConnection extends StObject {
  
  var catalog: js.UndefOr[String] = js.undefined
  
  var cube: js.UndefOr[String] = js.undefined
}
object PivotDataSourceV2TransportConnection {
  
  inline def apply(): PivotDataSourceV2TransportConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDataSourceV2TransportConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotDataSourceV2TransportConnection] (val x: Self) extends AnyVal {
    
    inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
