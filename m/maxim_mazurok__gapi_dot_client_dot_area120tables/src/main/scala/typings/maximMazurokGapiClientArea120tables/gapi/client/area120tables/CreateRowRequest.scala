package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRowRequest extends StObject {
  
  /** Required. The parent table where this row will be created. Format: tables/{table} */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Required. The row to create. */
  var row: js.UndefOr[Row] = js.undefined
  
  /** Optional. Column key to use for values in the row. Defaults to user entered name. */
  var view: js.UndefOr[String] = js.undefined
}
object CreateRowRequest {
  
  inline def apply(): CreateRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRowRequest]
  }
  
  extension [Self <: CreateRowRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
