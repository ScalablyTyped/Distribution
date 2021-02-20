package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableVersionsResponse extends StObject {
  
  /** Represents a list of versions that are supported. */
  var availableVersions: js.UndefOr[js.Array[Version]] = js.native
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAvailableVersionsResponse {
  
  @scala.inline
  def apply(): ListAvailableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableVersionsResponse]
  }
  
  @scala.inline
  implicit class ListAvailableVersionsResponseMutableBuilder[Self <: ListAvailableVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableVersions(value: js.Array[Version]): Self = StObject.set(x, "availableVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableVersionsUndefined: Self = StObject.set(x, "availableVersions", js.undefined)
    
    @scala.inline
    def setAvailableVersionsVarargs(value: Version*): Self = StObject.set(x, "availableVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
