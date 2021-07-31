package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for FirebaseRulesService.ListReleases.
  */
trait SchemaListReleasesResponse extends StObject {
  
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of `Release` instances.
    */
  var releases: js.UndefOr[js.Array[SchemaRelease]] = js.undefined
}
object SchemaListReleasesResponse {
  
  @scala.inline
  def apply(): SchemaListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReleasesResponse]
  }
  
  @scala.inline
  implicit class SchemaListReleasesResponseMutableBuilder[Self <: SchemaListReleasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReleases(value: js.Array[SchemaRelease]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasesUndefined: Self = StObject.set(x, "releases", js.undefined)
    
    @scala.inline
    def setReleasesVarargs(value: SchemaRelease*): Self = StObject.set(x, "releases", js.Array(value :_*))
  }
}
