package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaECommercePlatformLinkInfo extends StObject {
  
  /**
    * The id used by the third party service provider to identify the merchant.
    */
  var externalAccountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaECommercePlatformLinkInfo {
  
  inline def apply(): SchemaECommercePlatformLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaECommercePlatformLinkInfo]
  }
  
  extension [Self <: SchemaECommercePlatformLinkInfo](x: Self) {
    
    inline def setExternalAccountId(value: String): Self = StObject.set(x, "externalAccountId", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdNull: Self = StObject.set(x, "externalAccountId", null)
    
    inline def setExternalAccountIdUndefined: Self = StObject.set(x, "externalAccountId", js.undefined)
  }
}
