package typings.kurentoClient.mod.KurentoClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IceCandidate extends js.Object {
  var candidate: String
  var sdpMLineIndex: Double
  var sdpMid: String
}

object IceCandidate {
  @scala.inline
  def apply(candidate: String, sdpMLineIndex: Double, sdpMid: String): IceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], sdpMLineIndex = sdpMLineIndex.asInstanceOf[js.Any], sdpMid = sdpMid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceCandidate]
  }
}

