package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dn extends GeneralNameParam {
  
  var dn: String = js.native
}
object Dn {
  
  @scala.inline
  def apply(dn: String): Dn = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dn]
  }
  
  @scala.inline
  implicit class DnMutableBuilder[Self <: Dn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDn(value: String): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
  }
}
