package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracksListResponse extends StObject {
  
  /** The kind of this response ("androidpublisher#tracksListResponse"). */
  var kind: js.UndefOr[String] = js.native
  
  /** All tracks. */
  var tracks: js.UndefOr[js.Array[Track]] = js.native
}
object TracksListResponse {
  
  @scala.inline
  def apply(): TracksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracksListResponse]
  }
  
  @scala.inline
  implicit class TracksListResponseMutableBuilder[Self <: TracksListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTracks(value: js.Array[Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: Track*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
