package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECommercePlatformLinkInfo extends StObject {
  
  /** The id used by the third party service provider to identify the merchant. */
  var externalAccountId: js.UndefOr[String] = js.undefined
}
object ECommercePlatformLinkInfo {
  
  inline def apply(): ECommercePlatformLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECommercePlatformLinkInfo]
  }
  
  extension [Self <: ECommercePlatformLinkInfo](x: Self) {
    
    inline def setExternalAccountId(value: String): Self = StObject.set(x, "externalAccountId", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdUndefined: Self = StObject.set(x, "externalAccountId", js.undefined)
  }
}
