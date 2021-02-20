package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBuildsResponse extends StObject {
  
  /** Builds will be sorted by `create_time`, descending. */
  var builds: js.UndefOr[js.Array[Build]] = js.native
  
  /** Token to receive the next page of results. This will be absent if the end of the response list has been reached. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListBuildsResponse {
  
  @scala.inline
  def apply(): ListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsResponse]
  }
  
  @scala.inline
  implicit class ListBuildsResponseMutableBuilder[Self <: ListBuildsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuilds(value: js.Array[Build]): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsUndefined: Self = StObject.set(x, "builds", js.undefined)
    
    @scala.inline
    def setBuildsVarargs(value: Build*): Self = StObject.set(x, "builds", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
