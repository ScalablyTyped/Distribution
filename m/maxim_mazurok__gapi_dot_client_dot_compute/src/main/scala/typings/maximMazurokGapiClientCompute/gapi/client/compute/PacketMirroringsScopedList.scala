package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketMirroringsScopedList extends StObject {
  
  /** A list of packetMirrorings contained in this scope. */
  var packetMirrorings: js.UndefOr[js.Array[PacketMirroring]] = js.undefined
  
  /** Informational warning which replaces the list of packetMirrorings when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object PacketMirroringsScopedList {
  
  inline def apply(): PacketMirroringsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringsScopedList]
  }
  
  extension [Self <: PacketMirroringsScopedList](x: Self) {
    
    inline def setPacketMirrorings(value: js.Array[PacketMirroring]): Self = StObject.set(x, "packetMirrorings", value.asInstanceOf[js.Any])
    
    inline def setPacketMirroringsUndefined: Self = StObject.set(x, "packetMirrorings", js.undefined)
    
    inline def setPacketMirroringsVarargs(value: PacketMirroring*): Self = StObject.set(x, "packetMirrorings", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
