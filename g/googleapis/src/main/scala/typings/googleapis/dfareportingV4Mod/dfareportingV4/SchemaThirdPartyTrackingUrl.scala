package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyTrackingUrl extends StObject {
  
  /**
    * Third-party URL type for in-stream video and in-stream audio creatives.
    */
  var thirdPartyUrlType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL for the specified third-party URL type.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaThirdPartyTrackingUrl {
  
  inline def apply(): SchemaThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyTrackingUrl]
  }
  
  extension [Self <: SchemaThirdPartyTrackingUrl](x: Self) {
    
    inline def setThirdPartyUrlType(value: String): Self = StObject.set(x, "thirdPartyUrlType", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyUrlTypeNull: Self = StObject.set(x, "thirdPartyUrlType", null)
    
    inline def setThirdPartyUrlTypeUndefined: Self = StObject.set(x, "thirdPartyUrlType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
