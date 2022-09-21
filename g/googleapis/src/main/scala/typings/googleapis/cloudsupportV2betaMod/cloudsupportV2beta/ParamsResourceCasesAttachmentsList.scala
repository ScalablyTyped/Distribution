package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCasesAttachmentsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of attachments fetched with each request. If not provided, the default is 10. The maximum page size that will be returned is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying the page of results to return. If unspecified, the first page is retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of Case object for which attachments should be listed.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCasesAttachmentsList {
  
  inline def apply(): ParamsResourceCasesAttachmentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCasesAttachmentsList]
  }
  
  extension [Self <: ParamsResourceCasesAttachmentsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
