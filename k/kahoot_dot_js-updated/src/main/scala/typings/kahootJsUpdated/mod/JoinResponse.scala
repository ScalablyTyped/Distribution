package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinResponse extends StObject {
  
  /** JavaScript code to evaluate and reply back to Kahoot with */
  var challenge: String
  
  var collaborations: Boolean
  
  var liveGameId: String
  
  var namerator: Boolean
  
  var participantId: Boolean
  
  var smartPractice: Boolean
  
  var twoFactorAuth: Boolean
}
object JoinResponse {
  
  inline def apply(
    challenge: String,
    collaborations: Boolean,
    liveGameId: String,
    namerator: Boolean,
    participantId: Boolean,
    smartPractice: Boolean,
    twoFactorAuth: Boolean
  ): JoinResponse = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], collaborations = collaborations.asInstanceOf[js.Any], liveGameId = liveGameId.asInstanceOf[js.Any], namerator = namerator.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], smartPractice = smartPractice.asInstanceOf[js.Any], twoFactorAuth = twoFactorAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinResponse] (val x: Self) extends AnyVal {
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setCollaborations(value: Boolean): Self = StObject.set(x, "collaborations", value.asInstanceOf[js.Any])
    
    inline def setLiveGameId(value: String): Self = StObject.set(x, "liveGameId", value.asInstanceOf[js.Any])
    
    inline def setNamerator(value: Boolean): Self = StObject.set(x, "namerator", value.asInstanceOf[js.Any])
    
    inline def setParticipantId(value: Boolean): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setSmartPractice(value: Boolean): Self = StObject.set(x, "smartPractice", value.asInstanceOf[js.Any])
    
    inline def setTwoFactorAuth(value: Boolean): Self = StObject.set(x, "twoFactorAuth", value.asInstanceOf[js.Any])
  }
}
