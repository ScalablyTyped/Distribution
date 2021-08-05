package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRowRequest extends StObject {
  
  /** Required. The row to update. */
  var row: js.UndefOr[Row] = js.undefined
  
  /** The list of fields to update. */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /** Optional. Column key to use for values in the row. Defaults to user entered name. */
  var view: js.UndefOr[String] = js.undefined
}
object UpdateRowRequest {
  
  inline def apply(): UpdateRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRowRequest]
  }
  
  extension [Self <: UpdateRowRequest](x: Self) {
    
    inline def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
