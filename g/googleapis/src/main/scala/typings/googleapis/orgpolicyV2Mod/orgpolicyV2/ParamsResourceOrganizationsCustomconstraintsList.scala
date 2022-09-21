package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsCustomconstraintsList
  extends StObject
     with StandardParameters {
  
  /**
    * Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token used to retrieve the next page. This is currently unsupported and will be ignored. The server may at any point start using this field.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The target Cloud resource that parents the set of custom constraints that will be returned from this call. Must be in one of the following forms: * `organizations/{organization_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsCustomconstraintsList {
  
  inline def apply(): ParamsResourceOrganizationsCustomconstraintsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsCustomconstraintsList]
  }
  
  extension [Self <: ParamsResourceOrganizationsCustomconstraintsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
