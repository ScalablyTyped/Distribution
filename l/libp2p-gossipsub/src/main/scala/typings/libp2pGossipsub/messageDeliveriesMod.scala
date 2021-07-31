package typings.libp2pGossipsub

import typings.std.Set
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDeliveriesMod {
  
  @js.native
  sealed trait DeliveryRecordStatus extends StObject
  @JSImport("libp2p-gossipsub/src/score/message-deliveries", "DeliveryRecordStatus")
  @js.native
  object DeliveryRecordStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeliveryRecordStatus & Double] = js.native
    
    /**
      * we were instructed by the validator to ignore the message
      */
    @js.native
    sealed trait ignored
      extends StObject
         with DeliveryRecordStatus
    /* 3 */ val ignored: typings.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.ignored & Double = js.native
    
    /**
      * we know the message is invalid
      */
    @js.native
    sealed trait invalid
      extends StObject
         with DeliveryRecordStatus
    /* 2 */ val invalid: typings.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.invalid & Double = js.native
    
    /**
      * we don't know (yet) if the message is valid
      */
    @js.native
    sealed trait unknown
      extends StObject
         with DeliveryRecordStatus
    /* 0 */ val unknown: typings.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.unknown & Double = js.native
    
    /**
      * we know the message is valid
      */
    @js.native
    sealed trait valid
      extends StObject
         with DeliveryRecordStatus
    /* 1 */ val valid: typings.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.valid & Double = js.native
  }
  
  @JSImport("libp2p-gossipsub/src/score/message-deliveries", "MessageDeliveries")
  @js.native
  class MessageDeliveries () extends StObject {
    
    def clear(): Unit = js.native
    
    def ensureRecord(msgId: Uint8Array): DeliveryRecord = js.native
    
    def gc(): Unit = js.native
    
    var queue: js.Any = js.native
    
    var records: js.Any = js.native
  }
  
  trait DeliveryRecord extends StObject {
    
    var firstSeen: Double
    
    var peers: Set[String]
    
    var status: DeliveryRecordStatus
    
    var validated: Double
  }
  object DeliveryRecord {
    
    @scala.inline
    def apply(firstSeen: Double, peers: Set[String], status: DeliveryRecordStatus, validated: Double): DeliveryRecord = {
      val __obj = js.Dynamic.literal(firstSeen = firstSeen.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryRecord]
    }
    
    @scala.inline
    implicit class DeliveryRecordMutableBuilder[Self <: DeliveryRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstSeen(value: Double): Self = StObject.set(x, "firstSeen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeers(value: Set[String]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DeliveryRecordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidated(value: Double): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    }
  }
}
