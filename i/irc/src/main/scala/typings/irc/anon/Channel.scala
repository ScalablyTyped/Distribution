package typings.irc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var channel: Idlength = js.native
  var kicklength: Double = js.native
  var maxlist: js.Array[Double] = js.native
  var maxtargets: js.Array[String] = js.native
  var modes: Double = js.native
  var nicklength: Double = js.native
  var topiclength: Double = js.native
  var usermodes: String = js.native
}

object Channel {
  @scala.inline
  def apply(
    channel: Idlength,
    kicklength: Double,
    maxlist: js.Array[Double],
    maxtargets: js.Array[String],
    modes: Double,
    nicklength: Double,
    topiclength: Double,
    usermodes: String
  ): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], kicklength = kicklength.asInstanceOf[js.Any], maxlist = maxlist.asInstanceOf[js.Any], maxtargets = maxtargets.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], nicklength = nicklength.asInstanceOf[js.Any], topiclength = topiclength.asInstanceOf[js.Any], usermodes = usermodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setChannel(value: Idlength): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setKicklength(value: Double): Self = this.set("kicklength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxlistVarargs(value: Double*): Self = this.set("maxlist", js.Array(value :_*))
    @scala.inline
    def setMaxlist(value: js.Array[Double]): Self = this.set("maxlist", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxtargetsVarargs(value: String*): Self = this.set("maxtargets", js.Array(value :_*))
    @scala.inline
    def setMaxtargets(value: js.Array[String]): Self = this.set("maxtargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setModes(value: Double): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNicklength(value: Double): Self = this.set("nicklength", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopiclength(value: Double): Self = this.set("topiclength", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsermodes(value: String): Self = this.set("usermodes", value.asInstanceOf[js.Any])
  }
  
}

