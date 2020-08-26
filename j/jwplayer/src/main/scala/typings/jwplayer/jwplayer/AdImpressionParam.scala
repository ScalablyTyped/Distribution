package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.mid
import typings.jwplayer.jwplayerStrings.post
import typings.jwplayer.jwplayerStrings.pre
import typings.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdImpressionParam extends js.Object {
  var adposition: pre | mid | post = js.native
  var adsystem: String = js.native
  var adtitle: String = js.native
  var clickThroughUrl: String = js.native
  var client: vast | googima = js.native
  var creativetype: String = js.native
  var linear: String = js.native
  var mediafile: js.Any = js.native
  var tag: String = js.native
  var vastversion: Double = js.native
  var wrapper: js.Array[_] = js.native
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
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], adsystem = adsystem.asInstanceOf[js.Any], adtitle = adtitle.asInstanceOf[js.Any], clickThroughUrl = clickThroughUrl.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], mediafile = mediafile.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], vastversion = vastversion.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdImpressionParam]
  }
  @scala.inline
  implicit class AdImpressionParamOps[Self <: AdImpressionParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdposition(value: pre | mid | post): Self = this.set("adposition", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdsystem(value: String): Self = this.set("adsystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdtitle(value: String): Self = this.set("adtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickThroughUrl(value: String): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: vast | googima): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreativetype(value: String): Self = this.set("creativetype", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinear(value: String): Self = this.set("linear", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediafile(value: js.Any): Self = this.set("mediafile", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setVastversion(value: Double): Self = this.set("vastversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapperVarargs(value: js.Any*): Self = this.set("wrapper", js.Array(value :_*))
    @scala.inline
    def setWrapper(value: js.Array[_]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

