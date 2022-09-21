package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersDatasourcesList
  extends StObject
     with StandardParameters {
  
  /**
    * The names of data types to include in the list. If not specified, all data sources will be returned.
    */
  var dataTypeName: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List data sources for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersDatasourcesList {
  
  inline def apply(): ParamsResourceUsersDatasourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersDatasourcesList]
  }
  
  extension [Self <: ParamsResourceUsersDatasourcesList](x: Self) {
    
    inline def setDataTypeName(value: js.Array[String]): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNameUndefined: Self = StObject.set(x, "dataTypeName", js.undefined)
    
    inline def setDataTypeNameVarargs(value: String*): Self = StObject.set(x, "dataTypeName", js.Array(value*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
