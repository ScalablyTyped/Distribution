package typings.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientTimestamps extends StObject {
  
  var lyrics_updated_at: Double
  
  var updated_by_human_at: Double
}
object ClientTimestamps {
  
  @scala.inline
  def apply(lyrics_updated_at: Double, updated_by_human_at: Double): ClientTimestamps = {
    val __obj = js.Dynamic.literal(lyrics_updated_at = lyrics_updated_at.asInstanceOf[js.Any], updated_by_human_at = updated_by_human_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientTimestamps]
  }
  
  @scala.inline
  implicit class ClientTimestampsMutableBuilder[Self <: ClientTimestamps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLyrics_updated_at(value: Double): Self = StObject.set(x, "lyrics_updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_by_human_at(value: Double): Self = StObject.set(x, "updated_by_human_at", value.asInstanceOf[js.Any])
  }
}
