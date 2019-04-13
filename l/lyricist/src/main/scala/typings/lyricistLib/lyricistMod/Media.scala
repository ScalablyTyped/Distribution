package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  var provider: java.lang.String
  var start: scala.Double
  var `type`: java.lang.String
  var url: java.lang.String
}

object Media {
  @scala.inline
  def apply(provider: java.lang.String, start: scala.Double, `type`: java.lang.String, url: java.lang.String): Media = {
    val __obj = js.Dynamic.literal(provider = provider, start = start, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Media]
  }
}

