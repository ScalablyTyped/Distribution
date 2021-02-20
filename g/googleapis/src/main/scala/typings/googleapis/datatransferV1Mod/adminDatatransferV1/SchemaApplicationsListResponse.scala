package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for a collection of Applications.
  */
@js.native
trait SchemaApplicationsListResponse extends StObject {
  
  /**
    * List of applications that support data transfer and are also installed
    * for the customer.
    */
  var applications: js.UndefOr[js.Array[SchemaApplication]] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as a collection of Applications.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Continuation token which will be used to specify next page in list API.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaApplicationsListResponse {
  
  @scala.inline
  def apply(): SchemaApplicationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationsListResponse]
  }
  
  @scala.inline
  implicit class SchemaApplicationsListResponseMutableBuilder[Self <: SchemaApplicationsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: js.Array[SchemaApplication]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: SchemaApplication*): Self = StObject.set(x, "applications", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
