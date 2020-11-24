package typings.libp2pGossipsub.messageDeliveriesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeliveryRecordStatus extends js.Object
@JSImport("libp2p-gossipsub/src/score/message-deliveries", "DeliveryRecordStatus")
@js.native
object DeliveryRecordStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeliveryRecordStatus with Double] = js.native
  
  /**
    * we were instructed by the validator to ignore the message
    */
  @js.native
  sealed trait ignored extends DeliveryRecordStatus
  /* 3 */ @js.native
  object ignored extends TopLevel[ignored with Double]
  
  /**
    * we know the message is invalid
    */
  @js.native
  sealed trait invalid extends DeliveryRecordStatus
  /* 2 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /**
    * we don't know (yet) if the message is valid
    */
  @js.native
  sealed trait unknown extends DeliveryRecordStatus
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /**
    * we know the message is valid
    */
  @js.native
  sealed trait valid extends DeliveryRecordStatus
  /* 1 */ @js.native
  object valid extends TopLevel[valid with Double]
}
