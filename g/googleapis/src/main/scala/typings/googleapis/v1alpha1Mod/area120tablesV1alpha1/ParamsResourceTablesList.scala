package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Sorting order for the list of tables on createTime/updateTime.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of tables to return. The service may return fewer than this value. If unspecified, at most 20 tables are returned. The maximum value is 100; values above 100 are coerced to 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListTables` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListTables` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesList {
  
  inline def apply(): ParamsResourceTablesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesList]
  }
  
  extension [Self <: ParamsResourceTablesList](x: Self) {
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
