package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the table to retrieve. Format: tables/{table\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesGet {
  
  inline def apply(): ParamsResourceTablesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesGet]
  }
  
  extension [Self <: ParamsResourceTablesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
