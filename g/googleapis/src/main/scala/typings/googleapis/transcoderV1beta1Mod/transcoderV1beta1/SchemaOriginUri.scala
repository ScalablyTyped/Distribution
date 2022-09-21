package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOriginUri extends StObject {
  
  /**
    * Dash manifest URI. If multiple Dash manifests are created, only the first one is listed.
    */
  var dash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HLS manifest URI per https://tools.ietf.org/html/rfc8216#section-4.3.4. If multiple HLS manifests are created, only the first one is listed.
    */
  var hls: js.UndefOr[String | Null] = js.undefined
}
object SchemaOriginUri {
  
  inline def apply(): SchemaOriginUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOriginUri]
  }
  
  extension [Self <: SchemaOriginUri](x: Self) {
    
    inline def setDash(value: String): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashNull: Self = StObject.set(x, "dash", null)
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setHls(value: String): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setHlsNull: Self = StObject.set(x, "hls", null)
    
    inline def setHlsUndefined: Self = StObject.set(x, "hls", js.undefined)
  }
}
