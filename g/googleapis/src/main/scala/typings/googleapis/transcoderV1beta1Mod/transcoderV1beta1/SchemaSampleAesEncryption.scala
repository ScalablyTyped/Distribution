package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSampleAesEncryption extends StObject {
  
  /**
    * Required. URI of the key delivery service. This URI is inserted into the M3U8 header.
    */
  var keyUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaSampleAesEncryption {
  
  inline def apply(): SchemaSampleAesEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSampleAesEncryption]
  }
  
  extension [Self <: SchemaSampleAesEncryption](x: Self) {
    
    inline def setKeyUri(value: String): Self = StObject.set(x, "keyUri", value.asInstanceOf[js.Any])
    
    inline def setKeyUriNull: Self = StObject.set(x, "keyUri", null)
    
    inline def setKeyUriUndefined: Self = StObject.set(x, "keyUri", js.undefined)
  }
}
