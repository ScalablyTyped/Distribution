package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateRowRequest extends StObject {
  
  /**
    * Required. The parent table where this row will be created. Format: tables/{table\}
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The row to create.
    */
  var row: js.UndefOr[SchemaRow] = js.undefined
  
  /**
    * Optional. Column key to use for values in the row. Defaults to user entered name.
    */
  var view: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateRowRequest {
  
  inline def apply(): SchemaCreateRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateRowRequest]
  }
  
  extension [Self <: SchemaCreateRowRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRow(value: SchemaRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
