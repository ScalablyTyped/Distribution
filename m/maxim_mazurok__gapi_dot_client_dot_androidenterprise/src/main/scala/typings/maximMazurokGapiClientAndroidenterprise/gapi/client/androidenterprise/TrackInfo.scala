package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackInfo extends StObject {
  
  /** A modifiable name for a track. This is the visible name in the play developer console. */
  var trackAlias: js.UndefOr[String] = js.undefined
  
  /** Unmodifiable, unique track identifier. This identifier is the releaseTrackId in the url of the play developer console page that displays the track information. */
  var trackId: js.UndefOr[String] = js.undefined
}
object TrackInfo {
  
  inline def apply(): TrackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackInfo]
  }
  
  extension [Self <: TrackInfo](x: Self) {
    
    inline def setTrackAlias(value: String): Self = StObject.set(x, "trackAlias", value.asInstanceOf[js.Any])
    
    inline def setTrackAliasUndefined: Self = StObject.set(x, "trackAlias", js.undefined)
    
    inline def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    inline def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
  }
}
