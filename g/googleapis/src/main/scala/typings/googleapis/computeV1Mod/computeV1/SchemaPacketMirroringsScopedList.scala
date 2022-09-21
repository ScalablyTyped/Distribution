package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketMirroringsScopedList extends StObject {
  
  /**
    * A list of packetMirrorings contained in this scope.
    */
  var packetMirrorings: js.UndefOr[js.Array[SchemaPacketMirroring]] = js.undefined
  
  /**
    * Informational warning which replaces the list of packetMirrorings when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaPacketMirroringsScopedList {
  
  inline def apply(): SchemaPacketMirroringsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketMirroringsScopedList]
  }
  
  extension [Self <: SchemaPacketMirroringsScopedList](x: Self) {
    
    inline def setPacketMirrorings(value: js.Array[SchemaPacketMirroring]): Self = StObject.set(x, "packetMirrorings", value.asInstanceOf[js.Any])
    
    inline def setPacketMirroringsUndefined: Self = StObject.set(x, "packetMirrorings", js.undefined)
    
    inline def setPacketMirroringsVarargs(value: SchemaPacketMirroring*): Self = StObject.set(x, "packetMirrorings", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
