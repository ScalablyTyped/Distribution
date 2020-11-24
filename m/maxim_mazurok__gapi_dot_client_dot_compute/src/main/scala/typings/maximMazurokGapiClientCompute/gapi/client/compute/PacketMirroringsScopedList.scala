package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringsScopedList extends js.Object {
  
  /** A list of packetMirrorings contained in this scope. */
  var packetMirrorings: js.UndefOr[js.Array[PacketMirroring]] = js.native
  
  /** Informational warning which replaces the list of packetMirrorings when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object PacketMirroringsScopedList {
  
  @scala.inline
  def apply(): PacketMirroringsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringsScopedList]
  }
  
  @scala.inline
  implicit class PacketMirroringsScopedListOps[Self <: PacketMirroringsScopedList] (val x: Self) extends AnyVal {
    
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
    def setPacketMirroringsVarargs(value: PacketMirroring*): Self = this.set("packetMirrorings", js.Array(value :_*))
    
    @scala.inline
    def setPacketMirrorings(value: js.Array[PacketMirroring]): Self = this.set("packetMirrorings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketMirrorings: Self = this.set("packetMirrorings", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
