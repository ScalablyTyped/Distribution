package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyLinkStatus extends StObject {
  
  var linkStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaThirdPartyLinkStatus {
  
  inline def apply(): SchemaThirdPartyLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyLinkStatus]
  }
  
  extension [Self <: SchemaThirdPartyLinkStatus](x: Self) {
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusNull: Self = StObject.set(x, "linkStatus", null)
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
  }
}
