package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IceCandidatePair extends StObject {
  
  var componentID: Double
  
  var localCandidate: String
  
  var remoteCandidate: String
  
  var streamID: String
}
object IceCandidatePair {
  
  @scala.inline
  def apply(componentID: Double, localCandidate: String, remoteCandidate: String, streamID: String): IceCandidatePair = {
    val __obj = js.Dynamic.literal(componentID = componentID.asInstanceOf[js.Any], localCandidate = localCandidate.asInstanceOf[js.Any], remoteCandidate = remoteCandidate.asInstanceOf[js.Any], streamID = streamID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceCandidatePair]
  }
  
  @scala.inline
  implicit class IceCandidatePairMutableBuilder[Self <: IceCandidatePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentID(value: Double): Self = StObject.set(x, "componentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCandidate(value: String): Self = StObject.set(x, "localCandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCandidate(value: String): Self = StObject.set(x, "remoteCandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamID(value: String): Self = StObject.set(x, "streamID", value.asInstanceOf[js.Any])
  }
}
