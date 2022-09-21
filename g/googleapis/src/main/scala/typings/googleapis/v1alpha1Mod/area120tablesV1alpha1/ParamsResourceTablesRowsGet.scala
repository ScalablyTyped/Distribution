package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesRowsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the row to retrieve. Format: tables/{table\}/rows/{row\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Column key to use for values in the row. Defaults to user entered name.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesRowsGet {
  
  inline def apply(): ParamsResourceTablesRowsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesRowsGet]
  }
  
  extension [Self <: ParamsResourceTablesRowsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
