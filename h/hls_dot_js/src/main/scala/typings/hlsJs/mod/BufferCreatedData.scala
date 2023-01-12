package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferCreatedData extends StObject {
  
  var tracks: TrackSet
}
object BufferCreatedData {
  
  inline def apply(tracks: TrackSet): BufferCreatedData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferCreatedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferCreatedData] (val x: Self) extends AnyVal {
    
    inline def setTracks(value: TrackSet): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
