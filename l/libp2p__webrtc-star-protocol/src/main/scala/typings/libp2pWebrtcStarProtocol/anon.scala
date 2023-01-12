package typings.libp2pWebrtcStarProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Candidate extends StObject {
    
    var candidate: String
    
    var sdpMLineIndex: js.UndefOr[Double] = js.undefined
    
    var sdpMid: js.UndefOr[String] = js.undefined
  }
  object Candidate {
    
    inline def apply(candidate: String): Candidate = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Candidate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Candidate] (val x: Self) extends AnyVal {
      
      inline def setCandidate(value: String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      inline def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
      
      inline def setSdpMLineIndexUndefined: Self = StObject.set(x, "sdpMLineIndex", js.undefined)
      
      inline def setSdpMid(value: String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
      
      inline def setSdpMidUndefined: Self = StObject.set(x, "sdpMid", js.undefined)
    }
  }
}
