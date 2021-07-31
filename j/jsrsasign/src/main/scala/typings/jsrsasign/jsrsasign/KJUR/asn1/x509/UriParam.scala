package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriParam extends StObject {
  
  var uri: String
}
object UriParam {
  
  @scala.inline
  def apply(uri: String): UriParam = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriParam]
  }
  
  @scala.inline
  implicit class UriParamMutableBuilder[Self <: UriParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
