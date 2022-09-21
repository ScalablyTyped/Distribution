package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesStructuresRoomsList
  extends StObject
     with StandardParameters {
  
  /**
    * Requested page size. Server may return fewer rooms than requested. If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token of the page to retrieve.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource name of the rooms requested. For example: "enterprises/XYZ/structures/ABC".
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesStructuresRoomsList {
  
  inline def apply(): ParamsResourceEnterprisesStructuresRoomsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesStructuresRoomsList]
  }
  
  extension [Self <: ParamsResourceEnterprisesStructuresRoomsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
