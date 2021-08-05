package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Accounts to search
  */
trait SchemaHangoutsChatInfo extends StObject {
  
  /**
    * A set of rooms to search.
    */
  var roomId: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaHangoutsChatInfo {
  
  inline def apply(): SchemaHangoutsChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatInfo]
  }
  
  extension [Self <: SchemaHangoutsChatInfo](x: Self) {
    
    inline def setRoomId(value: js.Array[String]): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
    
    inline def setRoomIdVarargs(value: String*): Self = StObject.set(x, "roomId", js.Array(value :_*))
  }
}
