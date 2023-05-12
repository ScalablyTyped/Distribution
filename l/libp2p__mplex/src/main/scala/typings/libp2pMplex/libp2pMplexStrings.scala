package typings.libp2pMplex

import typings.libp2pMplex.distSrcMessageTypesMod.INITIATOR_NAME
import typings.libp2pMplex.distSrcMessageTypesMod.NAME
import typings.libp2pMplex.distSrcMessageTypesMod.RECEIVER_NAME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pMplexStrings {
  
  @js.native
  sealed trait `0` extends StObject
  inline def `0`: `0` = "0".asInstanceOf[`0`]
  
  @js.native
  sealed trait `1` extends StObject
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2` extends StObject
  inline def `2`: `2` = "2".asInstanceOf[`2`]
  
  @js.native
  sealed trait `3` extends StObject
  inline def `3`: `3` = "3".asInstanceOf[`3`]
  
  @js.native
  sealed trait `4` extends StObject
  inline def `4`: `4` = "4".asInstanceOf[`4`]
  
  @js.native
  sealed trait `5` extends StObject
  inline def `5`: `5` = "5".asInstanceOf[`5`]
  
  @js.native
  sealed trait `6` extends StObject
  inline def `6`: `6` = "6".asInstanceOf[`6`]
  
  @js.native
  sealed trait CLOSE
    extends StObject
       with INITIATOR_NAME
       with RECEIVER_NAME
  inline def CLOSE: CLOSE = "CLOSE".asInstanceOf[CLOSE]
  
  @js.native
  sealed trait CLOSE_INITIATOR
    extends StObject
       with NAME
  inline def CLOSE_INITIATOR: CLOSE_INITIATOR = "CLOSE_INITIATOR".asInstanceOf[CLOSE_INITIATOR]
  
  @js.native
  sealed trait CLOSE_RECEIVER
    extends StObject
       with NAME
  inline def CLOSE_RECEIVER: CLOSE_RECEIVER = "CLOSE_RECEIVER".asInstanceOf[CLOSE_RECEIVER]
  
  @js.native
  sealed trait MESSAGE
    extends StObject
       with INITIATOR_NAME
       with RECEIVER_NAME
  inline def MESSAGE: MESSAGE = "MESSAGE".asInstanceOf[MESSAGE]
  
  @js.native
  sealed trait MESSAGE_INITIATOR
    extends StObject
       with NAME
  inline def MESSAGE_INITIATOR: MESSAGE_INITIATOR = "MESSAGE_INITIATOR".asInstanceOf[MESSAGE_INITIATOR]
  
  @js.native
  sealed trait MESSAGE_RECEIVER
    extends StObject
       with NAME
  inline def MESSAGE_RECEIVER: MESSAGE_RECEIVER = "MESSAGE_RECEIVER".asInstanceOf[MESSAGE_RECEIVER]
  
  @js.native
  sealed trait NEW_STREAM
    extends StObject
       with INITIATOR_NAME
       with NAME
  inline def NEW_STREAM: NEW_STREAM = "NEW_STREAM".asInstanceOf[NEW_STREAM]
  
  @js.native
  sealed trait RESET
    extends StObject
       with INITIATOR_NAME
       with RECEIVER_NAME
  inline def RESET: RESET = "RESET".asInstanceOf[RESET]
  
  @js.native
  sealed trait RESET_INITIATOR
    extends StObject
       with NAME
  inline def RESET_INITIATOR: RESET_INITIATOR = "RESET_INITIATOR".asInstanceOf[RESET_INITIATOR]
  
  @js.native
  sealed trait RESET_RECEIVER
    extends StObject
       with NAME
  inline def RESET_RECEIVER: RESET_RECEIVER = "RESET_RECEIVER".asInstanceOf[RESET_RECEIVER]
  
  @js.native
  sealed trait initiator extends StObject
  inline def initiator: initiator = "initiator".asInstanceOf[initiator]
  
  @js.native
  sealed trait receiver extends StObject
  inline def receiver: receiver = "receiver".asInstanceOf[receiver]
}
