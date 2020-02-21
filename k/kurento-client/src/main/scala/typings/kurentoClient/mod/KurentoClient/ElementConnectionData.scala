package typings.kurentoClient.mod.KurentoClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementConnectionData extends js.Object {
  var sink: WebRtcEndpoint
  var sinkDescription: String
  var source: WebRtcEndpoint
  var sourceDescription: String
  var `type`: js.Any
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
}

