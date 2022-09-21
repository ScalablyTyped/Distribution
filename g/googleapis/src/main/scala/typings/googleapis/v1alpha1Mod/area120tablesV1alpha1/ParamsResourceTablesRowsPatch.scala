package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesRowsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the row. Row names have the form `tables/{table\}/rows/{row\}`. The name is ignored when creating a row.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRow] = js.undefined
  
  /**
    * The list of fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Column key to use for values in the row. Defaults to user entered name.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesRowsPatch {
  
  inline def apply(): ParamsResourceTablesRowsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesRowsPatch]
  }
  
  extension [Self <: ParamsResourceTablesRowsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRow): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
