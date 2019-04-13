package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTimestamps extends js.Object {
  var lyrics_updated_at: scala.Double
  var updated_by_human_at: scala.Double
}

object ClientTimestamps {
  @scala.inline
  def apply(lyrics_updated_at: scala.Double, updated_by_human_at: scala.Double): ClientTimestamps = {
    val __obj = js.Dynamic.literal(lyrics_updated_at = lyrics_updated_at, updated_by_human_at = updated_by_human_at)
  
    __obj.asInstanceOf[ClientTimestamps]
  }
}

