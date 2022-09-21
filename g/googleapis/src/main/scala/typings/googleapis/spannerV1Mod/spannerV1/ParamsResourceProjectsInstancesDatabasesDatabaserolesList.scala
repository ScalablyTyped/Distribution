package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesDatabaserolesList
  extends StObject
     with StandardParameters {
  
  /**
    * Number of database roles to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If non-empty, `page_token` should contain a next_page_token from a previous ListDatabaseRolesResponse.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The database whose roles should be listed. Values are of the form `projects//instances//databases/`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesDatabaserolesList {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesDatabaserolesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesDatabaserolesList]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesDatabaserolesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
