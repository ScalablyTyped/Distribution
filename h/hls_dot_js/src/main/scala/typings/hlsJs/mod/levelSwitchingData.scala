package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait levelSwitchingData extends js.Object {
  var attrs: js.Any = js.native
  var audioCodec: String = js.native
  var bitrate: Double = js.native
  var fragmentError: Boolean = js.native
  var height: Double = js.native
  var level: Double = js.native
  var loadError: Double = js.native
  var name: String = js.native
  var unknownCodecs: js.Array[String] = js.native
  var url: js.Array[String] = js.native
  var urlId: Double = js.native
  var videoCodec: String = js.native
  var width: Double = js.native
}

object levelSwitchingData {
  @scala.inline
  def apply(
    attrs: js.Any,
    audioCodec: String,
    bitrate: Double,
    fragmentError: Boolean,
    height: Double,
    level: Double,
    loadError: Double,
    name: String,
    unknownCodecs: js.Array[String],
    url: js.Array[String],
    urlId: Double,
    videoCodec: String,
    width: Double
  ): levelSwitchingData = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], audioCodec = audioCodec.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], fragmentError = fragmentError.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], loadError = loadError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unknownCodecs = unknownCodecs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlId = urlId.asInstanceOf[js.Any], videoCodec = videoCodec.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelSwitchingData]
  }
  @scala.inline
  implicit class levelSwitchingDataOps[Self <: levelSwitchingData] (val x: Self) extends AnyVal {
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
    def setAttrs(value: js.Any): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioCodec(value: String): Self = this.set("audioCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentError(value: Boolean): Self = this.set("fragmentError", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadError(value: Double): Self = this.set("loadError", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknownCodecsVarargs(value: String*): Self = this.set("unknownCodecs", js.Array(value :_*))
    @scala.inline
    def setUnknownCodecs(value: js.Array[String]): Self = this.set("unknownCodecs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlVarargs(value: String*): Self = this.set("url", js.Array(value :_*))
    @scala.inline
    def setUrl(value: js.Array[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlId(value: Double): Self = this.set("urlId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoCodec(value: String): Self = this.set("videoCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

