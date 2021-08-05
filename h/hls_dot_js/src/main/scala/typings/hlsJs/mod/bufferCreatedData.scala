package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait bufferCreatedData extends StObject {
  
  var tracks: Tracks
}
object bufferCreatedData {
  
  inline def apply(tracks: Tracks): bufferCreatedData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferCreatedData]
  }
  
  extension [Self <: bufferCreatedData](x: Self) {
    
    inline def setTracks(value: Tracks): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
