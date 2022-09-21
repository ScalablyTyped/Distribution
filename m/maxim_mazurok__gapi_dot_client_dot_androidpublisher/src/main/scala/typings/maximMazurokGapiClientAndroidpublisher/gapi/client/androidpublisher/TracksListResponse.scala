package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracksListResponse extends StObject {
  
  /** The kind of this response ("androidpublisher#tracksListResponse"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** All tracks. */
  var tracks: js.UndefOr[js.Array[Track]] = js.undefined
}
object TracksListResponse {
  
  inline def apply(): TracksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracksListResponse]
  }
  
  extension [Self <: TracksListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTracks(value: js.Array[Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: Track*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
