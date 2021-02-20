package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response with the list of the versions for the specified script project.
  */
@js.native
trait SchemaListVersionsResponse extends StObject {
  
  /**
    * The token use to fetch the next page of records. if not exist in the
    * response, that means no more versions to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[SchemaVersion]] = js.native
}
object SchemaListVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListVersionsResponseMutableBuilder[Self <: SchemaListVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[SchemaVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SchemaVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
