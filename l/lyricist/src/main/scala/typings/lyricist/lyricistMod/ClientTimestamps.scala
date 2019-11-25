package typings.lyricist.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTimestamps extends js.Object {
  var lyrics_updated_at: Double
  var updated_by_human_at: Double
}

object ClientTimestamps {
  @scala.inline
  def apply(lyrics_updated_at: Double, updated_by_human_at: Double): ClientTimestamps = {
    val __obj = js.Dynamic.literal(lyrics_updated_at = lyrics_updated_at.asInstanceOf[js.Any], updated_by_human_at = updated_by_human_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientTimestamps]
  }
}

