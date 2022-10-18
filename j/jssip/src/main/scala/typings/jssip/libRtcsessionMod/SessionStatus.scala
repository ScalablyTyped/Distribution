package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionStatus extends StObject
@JSImport("jssip/lib/RTCSession", "SessionStatus")
@js.native
object SessionStatus extends StObject {
  
  @js.native
  sealed trait STATUS_1XX_RECEIVED
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_ANSWERED
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_CANCELED
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_CONFIRMED
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_INVITE_RECEIVED
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_INVITE_SENT
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_NULL
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_TERMINATED
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_ACK
    extends StObject
       with SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_ANSWER
    extends StObject
       with SessionStatus
}
