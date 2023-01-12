package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuildsResponse extends StObject {
  
  /** Builds will be sorted by `create_time`, descending. */
  var builds: js.UndefOr[js.Array[Build]] = js.undefined
  
  /** Token to receive the next page of results. This will be absent if the end of the response list has been reached. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBuildsResponse {
  
  inline def apply(): ListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBuildsResponse] (val x: Self) extends AnyVal {
    
    inline def setBuilds(value: js.Array[Build]): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    inline def setBuildsUndefined: Self = StObject.set(x, "builds", js.undefined)
    
    inline def setBuildsVarargs(value: Build*): Self = StObject.set(x, "builds", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
