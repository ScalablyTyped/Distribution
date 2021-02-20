package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ImageVersions in a project and location.
  */
@js.native
trait SchemaListImageVersionsResponse extends StObject {
  
  /**
    * The list of supported ImageVersions in a location.
    */
  var imageVersions: js.UndefOr[js.Array[SchemaImageVersion]] = js.native
  
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListImageVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListImageVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListImageVersionsResponseMutableBuilder[Self <: SchemaListImageVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageVersions(value: js.Array[SchemaImageVersion]): Self = StObject.set(x, "imageVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionsUndefined: Self = StObject.set(x, "imageVersions", js.undefined)
    
    @scala.inline
    def setImageVersionsVarargs(value: SchemaImageVersion*): Self = StObject.set(x, "imageVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
