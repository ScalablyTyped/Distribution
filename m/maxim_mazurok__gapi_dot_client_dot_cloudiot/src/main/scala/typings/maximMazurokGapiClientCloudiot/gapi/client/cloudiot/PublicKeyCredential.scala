package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredential extends StObject {
  
  /** The format of the key. */
  var format: js.UndefOr[String] = js.undefined
  
  /** The key data. */
  var key: js.UndefOr[String] = js.undefined
}
object PublicKeyCredential {
  
  inline def apply(): PublicKeyCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  extension [Self <: PublicKeyCredential](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
