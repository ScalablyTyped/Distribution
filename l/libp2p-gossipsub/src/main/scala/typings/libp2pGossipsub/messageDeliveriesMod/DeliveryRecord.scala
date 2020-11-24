package typings.libp2pGossipsub.messageDeliveriesMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryRecord extends js.Object {
  
  var firstSeen: Double = js.native
  
  var peers: Set[String] = js.native
  
  var status: DeliveryRecordStatus = js.native
  
  var validated: Double = js.native
}
object DeliveryRecord {
  
  @scala.inline
  def apply(firstSeen: Double, peers: Set[String], status: DeliveryRecordStatus, validated: Double): DeliveryRecord = {
    val __obj = js.Dynamic.literal(firstSeen = firstSeen.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryRecord]
  }
  
  @scala.inline
  implicit class DeliveryRecordOps[Self <: DeliveryRecord] (val x: Self) extends AnyVal {
    
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
    def setFirstSeen(value: Double): Self = this.set("firstSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeers(value: Set[String]): Self = this.set("peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DeliveryRecordStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidated(value: Double): Self = this.set("validated", value.asInstanceOf[js.Any])
  }
}
