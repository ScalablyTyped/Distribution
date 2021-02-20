package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListReleasesResponse extends StObject {
  
  /**
    * If there are additional releases remaining beyond the ones in this
    * response, then supply this token in the next
    * [`list`](../sites.versions.files/list) call to continue with the next set
    * of releases.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of hashes of files that still need to be uploaded, if any exist.
    */
  var releases: js.UndefOr[js.Array[SchemaRelease]] = js.native
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
