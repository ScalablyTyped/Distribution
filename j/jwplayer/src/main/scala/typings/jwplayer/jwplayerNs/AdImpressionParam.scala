package typings.jwplayer.jwplayerNs

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.mid
import typings.jwplayer.jwplayerStrings.post
import typings.jwplayer.jwplayerStrings.pre
import typings.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdImpressionParam extends js.Object {
  var adposition: pre | mid | post
  var adsystem: String
  var adtitle: String
  var clickThroughUrl: String
  var client: vast | googima
  var creativetype: String
  var linear: String
  var mediafile: js.Any
  var tag: String
  var vastversion: Double
  var wrapper: js.Array[_]
}

object AdImpressionParam {
  @scala.inline
  def apply(
    adposition: pre | mid | post,
    adsystem: String,
    adtitle: String,
    clickThroughUrl: String,
    client: vast | googima,
    creativetype: String,
    linear: String,
    mediafile: js.Any,
    tag: String,
    vastversion: Double,
    wrapper: js.Array[_]
  ): AdImpressionParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], adsystem = adsystem, adtitle = adtitle, clickThroughUrl = clickThroughUrl, client = client.asInstanceOf[js.Any], creativetype = creativetype, linear = linear, mediafile = mediafile, tag = tag, vastversion = vastversion, wrapper = wrapper)
  
    __obj.asInstanceOf[AdImpressionParam]
  }
}

