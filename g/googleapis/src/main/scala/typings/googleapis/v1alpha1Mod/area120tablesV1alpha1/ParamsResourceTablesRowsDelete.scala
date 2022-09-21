package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesRowsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the row to delete. Format: tables/{table\}/rows/{row\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesRowsDelete {
  
  inline def apply(): ParamsResourceTablesRowsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesRowsDelete]
  }
  
  extension [Self <: ParamsResourceTablesRowsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
