package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReporttypesList
  extends StObject
     with StandardParameters {
  
  /**
    * If set to true, also system-managed report types will be returned; otherwise only the report types that can be used to create new reporting jobs will be returned.
    */
  var includeSystemManaged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of ListReportTypesResponse.next_page_token returned in response to the previous call to the `ListReportTypes` method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceReporttypesList {
  
  inline def apply(): ParamsResourceReporttypesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReporttypesList]
  }
  
  extension [Self <: ParamsResourceReporttypesList](x: Self) {
    
    inline def setIncludeSystemManaged(value: Boolean): Self = StObject.set(x, "includeSystemManaged", value.asInstanceOf[js.Any])
    
    inline def setIncludeSystemManagedUndefined: Self = StObject.set(x, "includeSystemManaged", js.undefined)
    
    inline def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
