package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListReleasesResponse extends StObject {
  
  /**
    * If there are additional releases remaining beyond the ones in this
    * response, then supply this token in the next
    * [`list`](../sites.versions.files/list) call to continue with the next set
    * of releases.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of hashes of files that still need to be uploaded, if any exist.
    */
  var releases: js.UndefOr[js.Array[SchemaRelease]] = js.undefined
}
object SchemaListReleasesResponse {
  
  inline def apply(): SchemaListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReleasesResponse]
  }
  
  extension [Self <: SchemaListReleasesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReleases(value: js.Array[SchemaRelease]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    inline def setReleasesUndefined: Self = StObject.set(x, "releases", js.undefined)
    
    inline def setReleasesVarargs(value: SchemaRelease*): Self = StObject.set(x, "releases", js.Array(value :_*))
  }
}
