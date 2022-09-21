package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeleteRowsRequest extends StObject {
  
  /**
    * Required. The names of the rows to delete. All rows must belong to the parent table or else the entire batch will fail. A maximum of 500 rows can be deleted in a batch. Format: tables/{table\}/rows/{row\}
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchDeleteRowsRequest {
  
  inline def apply(): SchemaBatchDeleteRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteRowsRequest]
  }
  
  extension [Self <: SchemaBatchDeleteRowsRequest](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
