package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationMessageEventContent
  extends StObject
     with MessageEventContent {
  
  /**
    * A geo URI of the location.
    */
  var geo_uri: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the location.
    */
  var info: js.UndefOr[ThumbnailedFileInfo] = js.undefined
}
object LocationMessageEventContent {
  
  inline def apply(body: String, msgtype: MessageType): LocationMessageEventContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationMessageEventContent]
  }
  
  extension [Self <: LocationMessageEventContent](x: Self) {
    
    inline def setGeo_uri(value: String): Self = StObject.set(x, "geo_uri", value.asInstanceOf[js.Any])
    
    inline def setGeo_uriUndefined: Self = StObject.set(x, "geo_uri", js.undefined)
    
    inline def setInfo(value: ThumbnailedFileInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
  }
}
