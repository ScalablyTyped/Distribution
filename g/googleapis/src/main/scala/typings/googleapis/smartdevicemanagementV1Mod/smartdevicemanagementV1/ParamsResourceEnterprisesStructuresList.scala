package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesStructuresList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional filter to list structures.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Server may return fewer structures than requested. If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token of the page to retrieve.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent enterprise to list structures under. E.g. "enterprises/XYZ".
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesStructuresList {
  
  inline def apply(): ParamsResourceEnterprisesStructuresList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesStructuresList]
  }
  
  extension [Self <: ParamsResourceEnterprisesStructuresList](x: Self) {
    
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
