package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IceCandidatePair extends js.Object {
  
  var componentID: Double = js.native
  
  var localCandidate: String = js.native
  
  var remoteCandidate: String = js.native
  
  var streamID: String = js.native
}
object IceCandidatePair {
  
  @scala.inline
  def apply(componentID: Double, localCandidate: String, remoteCandidate: String, streamID: String): IceCandidatePair = {
    val __obj = js.Dynamic.literal(componentID = componentID.asInstanceOf[js.Any], localCandidate = localCandidate.asInstanceOf[js.Any], remoteCandidate = remoteCandidate.asInstanceOf[js.Any], streamID = streamID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceCandidatePair]
  }
  
  @scala.inline
  implicit class IceCandidatePairOps[Self <: IceCandidatePair] (val x: Self) extends AnyVal {
    
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
    def setComponentID(value: Double): Self = this.set("componentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCandidate(value: String): Self = this.set("localCandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCandidate(value: String): Self = this.set("remoteCandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamID(value: String): Self = this.set("streamID", value.asInstanceOf[js.Any])
  }
}
