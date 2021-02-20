package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the ListVersions method.
  */
@js.native
trait SchemaGoogleCloudMlV1ListVersionsResponse extends StObject {
  
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Version]] = js.native
}
object SchemaGoogleCloudMlV1ListVersionsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ListVersionsResponseMutableBuilder[Self <: SchemaGoogleCloudMlV1ListVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[SchemaGoogleCloudMlV1Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SchemaGoogleCloudMlV1Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
