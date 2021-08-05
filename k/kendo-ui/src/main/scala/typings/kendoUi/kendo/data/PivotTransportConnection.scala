package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTransportConnection extends StObject {
  
  var catalog: js.UndefOr[String] = js.undefined
  
  var cube: js.UndefOr[String] = js.undefined
}
object PivotTransportConnection {
  
  inline def apply(): PivotTransportConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransportConnection]
  }
  
  extension [Self <: PivotTransportConnection](x: Self) {
    
    inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
