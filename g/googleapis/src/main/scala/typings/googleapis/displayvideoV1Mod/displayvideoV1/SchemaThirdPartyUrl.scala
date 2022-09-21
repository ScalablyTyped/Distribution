package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyUrl extends StObject {
  
  /**
    * The type of interaction needs to be tracked by the tracking URL
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tracking URL used to track the interaction. Provide a URL with optional path or query string, beginning with `https:`. For example, https://www.example.com/path
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaThirdPartyUrl {
  
  inline def apply(): SchemaThirdPartyUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyUrl]
  }
  
  extension [Self <: SchemaThirdPartyUrl](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
