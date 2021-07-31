package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSurveysListResponse extends StObject {
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  /**
    * Unique request ID used for logging and debugging. Please include in any
    * error reporting or troubleshooting requests.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * An individual survey resource.
    */
  var resources: js.UndefOr[js.Array[SchemaSurvey]] = js.undefined
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
}
object SchemaSurveysListResponse {
  
  @scala.inline
  def apply(): SchemaSurveysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveysListResponse]
  }
  
  @scala.inline
  implicit class SchemaSurveysListResponseMutableBuilder[Self <: SchemaSurveysListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaSurvey]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaSurvey*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
