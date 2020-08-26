package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementConnectionData extends js.Object {
  var sink: WebRtcEndpoint = js.native
  var sinkDescription: String = js.native
  var source: WebRtcEndpoint = js.native
  var sourceDescription: String = js.native
  var `type`: js.Any = js.native
}

object ElementConnectionData {
  @scala.inline
  def apply(
    sink: WebRtcEndpoint,
    sinkDescription: String,
    source: WebRtcEndpoint,
    sourceDescription: String,
    `type`: js.Any
  ): ElementConnectionData = {
    val __obj = js.Dynamic.literal(sink = sink.asInstanceOf[js.Any], sinkDescription = sinkDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementConnectionData]
  }
  @scala.inline
  implicit class ElementConnectionDataOps[Self <: ElementConnectionData] (val x: Self) extends AnyVal {
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
    def setSink(value: WebRtcEndpoint): Self = this.set("sink", value.asInstanceOf[js.Any])
    @scala.inline
    def setSinkDescription(value: String): Self = this.set("sinkDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: WebRtcEndpoint): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceDescription(value: String): Self = this.set("sourceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

