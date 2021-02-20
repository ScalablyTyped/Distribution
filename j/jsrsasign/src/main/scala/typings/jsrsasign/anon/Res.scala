package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Res extends StObject {
  
  var res: String | ASN1Object = js.native
  
  var tst: String | ASN1Object = js.native
}
object Res {
  
  @scala.inline
  def apply(res: String | ASN1Object, tst: String | ASN1Object): Res = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], tst = tst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
  
  @scala.inline
  implicit class ResMutableBuilder[Self <: Res] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRes(value: String | ASN1Object): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTst(value: String | ASN1Object): Self = StObject.set(x, "tst", value.asInstanceOf[js.Any])
  }
}
