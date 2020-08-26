package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IceCandidate extends js.Object {
  var candidate: String = js.native
  var sdpMLineIndex: Double = js.native
  var sdpMid: String = js.native
}

object IceCandidate {
  @scala.inline
  def apply(candidate: String, sdpMLineIndex: Double, sdpMid: String): IceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], sdpMLineIndex = sdpMLineIndex.asInstanceOf[js.Any], sdpMid = sdpMid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceCandidate]
  }
  @scala.inline
  implicit class IceCandidateOps[Self <: IceCandidate] (val x: Self) extends AnyVal {
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
    def setCandidate(value: String): Self = this.set("candidate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = this.set("sdpMLineIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdpMid(value: String): Self = this.set("sdpMid", value.asInstanceOf[js.Any])
  }
  
}

