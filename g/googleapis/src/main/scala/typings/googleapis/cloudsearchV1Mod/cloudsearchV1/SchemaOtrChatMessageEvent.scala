package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOtrChatMessageEvent extends StObject {
  
  var expirationTimestampUsec: js.UndefOr[String | Null] = js.undefined
  
  var kansasRowId: js.UndefOr[String | Null] = js.undefined
  
  var kansasVersionInfo: js.UndefOr[String | Null] = js.undefined
  
  var messageOtrStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaOtrChatMessageEvent {
  
  inline def apply(): SchemaOtrChatMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOtrChatMessageEvent]
  }
  
  extension [Self <: SchemaOtrChatMessageEvent](x: Self) {
    
    inline def setExpirationTimestampUsec(value: String): Self = StObject.set(x, "expirationTimestampUsec", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimestampUsecNull: Self = StObject.set(x, "expirationTimestampUsec", null)
    
    inline def setExpirationTimestampUsecUndefined: Self = StObject.set(x, "expirationTimestampUsec", js.undefined)
    
    inline def setKansasRowId(value: String): Self = StObject.set(x, "kansasRowId", value.asInstanceOf[js.Any])
    
    inline def setKansasRowIdNull: Self = StObject.set(x, "kansasRowId", null)
    
    inline def setKansasRowIdUndefined: Self = StObject.set(x, "kansasRowId", js.undefined)
    
    inline def setKansasVersionInfo(value: String): Self = StObject.set(x, "kansasVersionInfo", value.asInstanceOf[js.Any])
    
    inline def setKansasVersionInfoNull: Self = StObject.set(x, "kansasVersionInfo", null)
    
    inline def setKansasVersionInfoUndefined: Self = StObject.set(x, "kansasVersionInfo", js.undefined)
    
    inline def setMessageOtrStatus(value: String): Self = StObject.set(x, "messageOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setMessageOtrStatusNull: Self = StObject.set(x, "messageOtrStatus", null)
    
    inline def setMessageOtrStatusUndefined: Self = StObject.set(x, "messageOtrStatus", js.undefined)
  }
}
