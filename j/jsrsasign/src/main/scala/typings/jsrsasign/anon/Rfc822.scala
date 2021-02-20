package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rfc822 extends GeneralNameParam {
  
  var rfc822: String = js.native
}
object Rfc822 {
  
  @scala.inline
  def apply(rfc822: String): Rfc822 = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rfc822]
  }
  
  @scala.inline
  implicit class Rfc822MutableBuilder[Self <: Rfc822] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRfc822(value: String): Self = StObject.set(x, "rfc822", value.asInstanceOf[js.Any])
  }
}
