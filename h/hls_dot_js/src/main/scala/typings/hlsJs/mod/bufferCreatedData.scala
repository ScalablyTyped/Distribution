package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bufferCreatedData extends StObject {
  
  var tracks: Tracks = js.native
}
object bufferCreatedData {
  
  @scala.inline
  def apply(tracks: Tracks): bufferCreatedData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferCreatedData]
  }
  
  @scala.inline
  implicit class bufferCreatedDataMutableBuilder[Self <: bufferCreatedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: Tracks): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
