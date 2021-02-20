package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IceCandidate extends StObject {
  
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
  implicit class IceCandidateMutableBuilder[Self <: IceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidate(value: String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMid(value: String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
  }
}
