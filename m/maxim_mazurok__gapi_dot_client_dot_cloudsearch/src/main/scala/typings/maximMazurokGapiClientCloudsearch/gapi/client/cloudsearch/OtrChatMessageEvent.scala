package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtrChatMessageEvent extends StObject {
  
  var expirationTimestampUsec: js.UndefOr[String] = js.undefined
  
  var kansasRowId: js.UndefOr[String] = js.undefined
  
  var kansasVersionInfo: js.UndefOr[String] = js.undefined
  
  var messageOtrStatus: js.UndefOr[String] = js.undefined
}
object OtrChatMessageEvent {
  
  inline def apply(): OtrChatMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtrChatMessageEvent]
  }
  
  extension [Self <: OtrChatMessageEvent](x: Self) {
    
    inline def setExpirationTimestampUsec(value: String): Self = StObject.set(x, "expirationTimestampUsec", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimestampUsecUndefined: Self = StObject.set(x, "expirationTimestampUsec", js.undefined)
    
    inline def setKansasRowId(value: String): Self = StObject.set(x, "kansasRowId", value.asInstanceOf[js.Any])
    
    inline def setKansasRowIdUndefined: Self = StObject.set(x, "kansasRowId", js.undefined)
    
    inline def setKansasVersionInfo(value: String): Self = StObject.set(x, "kansasVersionInfo", value.asInstanceOf[js.Any])
    
    inline def setKansasVersionInfoUndefined: Self = StObject.set(x, "kansasVersionInfo", js.undefined)
    
    inline def setMessageOtrStatus(value: String): Self = StObject.set(x, "messageOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setMessageOtrStatusUndefined: Self = StObject.set(x, "messageOtrStatus", js.undefined)
  }
}
