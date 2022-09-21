package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reqauth extends StObject {
  
  var reqauth: js.UndefOr[Boolean] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object Reqauth {
  
  inline def apply(): Reqauth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reqauth]
  }
  
  extension [Self <: Reqauth](x: Self) {
    
    inline def setReqauth(value: Boolean): Self = StObject.set(x, "reqauth", value.asInstanceOf[js.Any])
    
    inline def setReqauthUndefined: Self = StObject.set(x, "reqauth", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
