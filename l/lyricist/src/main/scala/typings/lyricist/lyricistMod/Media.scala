package typings.lyricist.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  var provider: String
  var start: Double
  var `type`: String
  var url: String
}

object Media {
  @scala.inline
  def apply(provider: String, start: Double, `type`: String, url: String): Media = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

