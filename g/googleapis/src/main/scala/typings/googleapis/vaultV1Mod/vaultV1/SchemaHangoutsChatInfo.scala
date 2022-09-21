package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHangoutsChatInfo extends StObject {
  
  /**
    * A list of Chat spaces IDs, as provided by the [Chat API](https://developers.google.com/hangouts/chat).
    */
  var roomId: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaHangoutsChatInfo {
  
  inline def apply(): SchemaHangoutsChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatInfo]
  }
  
  extension [Self <: SchemaHangoutsChatInfo](x: Self) {
    
    inline def setRoomId(value: js.Array[String]): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdNull: Self = StObject.set(x, "roomId", null)
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
    
    inline def setRoomIdVarargs(value: String*): Self = StObject.set(x, "roomId", js.Array(value*))
  }
}
