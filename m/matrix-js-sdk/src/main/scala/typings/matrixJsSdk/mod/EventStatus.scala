package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventStatus extends StObject
@JSImport("matrix-js-sdk", "EventStatus")
@js.native
object EventStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventStatus & String] = js.native
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with EventStatus
  /* "cancelled" */ val CANCELLED: typings.matrixJsSdk.mod.EventStatus.CANCELLED & String = js.native
  
  @js.native
  sealed trait ENCRYPTING
    extends StObject
       with EventStatus
  /* "encrypting" */ val ENCRYPTING: typings.matrixJsSdk.mod.EventStatus.ENCRYPTING & String = js.native
  
  @js.native
  sealed trait NOT_SENT
    extends StObject
       with EventStatus
  /* "not_sent" */ val NOT_SENT: typings.matrixJsSdk.mod.EventStatus.NOT_SENT & String = js.native
  
  @js.native
  sealed trait QUEUED
    extends StObject
       with EventStatus
  /* "queued" */ val QUEUED: typings.matrixJsSdk.mod.EventStatus.QUEUED & String = js.native
  
  @js.native
  sealed trait SENDING
    extends StObject
       with EventStatus
  /* "sending" */ val SENDING: typings.matrixJsSdk.mod.EventStatus.SENDING & String = js.native
  
  @js.native
  sealed trait SENT
    extends StObject
       with EventStatus
  /* "sent" */ val SENT: typings.matrixJsSdk.mod.EventStatus.SENT & String = js.native
}
