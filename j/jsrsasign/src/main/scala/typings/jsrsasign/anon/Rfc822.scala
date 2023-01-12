package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import typings.jsrsasign.jsrsasign._GeneralName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rfc822
  extends StObject
     with GeneralNameParam
     with _GeneralName {
  
  var rfc822: String
}
object Rfc822 {
  
  inline def apply(rfc822: String): Rfc822 = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rfc822]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rfc822] (val x: Self) extends AnyVal {
    
    inline def setRfc822(value: String): Self = StObject.set(x, "rfc822", value.asInstanceOf[js.Any])
  }
}
