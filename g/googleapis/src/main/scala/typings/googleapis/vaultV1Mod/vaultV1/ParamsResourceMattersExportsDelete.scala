package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersExportsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The export ID.
    */
  var exportId: js.UndefOr[String] = js.undefined
  
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersExportsDelete {
  
  inline def apply(): ParamsResourceMattersExportsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersExportsDelete]
  }
  
  extension [Self <: ParamsResourceMattersExportsDelete](x: Self) {
    
    inline def setExportId(value: String): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
  }
}
