package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTracksListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#tracksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var tracks: js.UndefOr[js.Array[SchemaTrack]] = js.undefined
}
object SchemaTracksListResponse {
  
  inline def apply(): SchemaTracksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTracksListResponse]
  }
  
  extension [Self <: SchemaTracksListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTracks(value: js.Array[SchemaTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: SchemaTrack*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
