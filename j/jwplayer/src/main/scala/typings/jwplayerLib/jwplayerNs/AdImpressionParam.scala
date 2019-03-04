package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdImpressionParam extends js.Object {
  var adposition: jwplayerLib.jwplayerLibStrings.pre | jwplayerLib.jwplayerLibStrings.mid | jwplayerLib.jwplayerLibStrings.post
  var adsystem: java.lang.String
  var adtitle: java.lang.String
  var clickThroughUrl: java.lang.String
  var client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima
  var creativetype: java.lang.String
  var linear: java.lang.String
  var mediafile: js.Any
  var tag: java.lang.String
  var vastversion: scala.Double
  var wrapper: js.Array[_]
}

object AdImpressionParam {
  @scala.inline
  def apply(
    adposition: jwplayerLib.jwplayerLibStrings.pre | jwplayerLib.jwplayerLibStrings.mid | jwplayerLib.jwplayerLibStrings.post,
    adsystem: java.lang.String,
    adtitle: java.lang.String,
    clickThroughUrl: java.lang.String,
    client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima,
    creativetype: java.lang.String,
    linear: java.lang.String,
    mediafile: js.Any,
    tag: java.lang.String,
    vastversion: scala.Double,
    wrapper: js.Array[_]
  ): AdImpressionParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], adsystem = adsystem, adtitle = adtitle, clickThroughUrl = clickThroughUrl, client = client.asInstanceOf[js.Any], creativetype = creativetype, linear = linear, mediafile = mediafile, tag = tag, vastversion = vastversion, wrapper = wrapper)
  
    __obj.asInstanceOf[AdImpressionParam]
  }
}

