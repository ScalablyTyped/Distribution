package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editurl extends StObject {
  
  var edit_url: js.UndefOr[String] = js.undefined
  
  var expires_at: Double
  
  var sign_url: String
}
object Editurl {
  
  inline def apply(expires_at: Double, sign_url: String): Editurl = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], sign_url = sign_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editurl]
  }
  
  extension [Self <: Editurl](x: Self) {
    
    inline def setEdit_url(value: String): Self = StObject.set(x, "edit_url", value.asInstanceOf[js.Any])
    
    inline def setEdit_urlUndefined: Self = StObject.set(x, "edit_url", js.undefined)
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setSign_url(value: String): Self = StObject.set(x, "sign_url", value.asInstanceOf[js.Any])
  }
}
