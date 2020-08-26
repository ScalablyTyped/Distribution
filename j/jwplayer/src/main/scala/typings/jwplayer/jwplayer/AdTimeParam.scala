package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdTimeParam extends js.Object {
  var client: vast | googima = js.native
  var creativetype: String = js.native
  var duration: Double = js.native
  var position: Double = js.native
  var sequence: Double = js.native
  var tag: String = js.native
}

object AdTimeParam {
  @scala.inline
  def apply(
    client: vast | googima,
    creativetype: String,
    duration: Double,
    position: Double,
    sequence: Double,
    tag: String
  ): AdTimeParam = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdTimeParam]
  }
  @scala.inline
  implicit class AdTimeParamOps[Self <: AdTimeParam] (val x: Self) extends AnyVal {
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
    def setClient(value: vast | googima): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreativetype(value: String): Self = this.set("creativetype", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

