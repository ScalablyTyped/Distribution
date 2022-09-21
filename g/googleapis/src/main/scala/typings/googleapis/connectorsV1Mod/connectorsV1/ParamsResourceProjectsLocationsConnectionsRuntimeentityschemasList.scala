package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Filter Format: entity="{entityId\}" Only entity field is supported with literal equality operator. Accepted filter example: entity="Order" Wildcards are not supported in the filter currently.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent resource of RuntimeEntitySchema Format: projects/{project\}/locations/{location\}/connections/{connection\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsRuntimeentityschemasList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
