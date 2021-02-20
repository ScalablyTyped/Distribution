package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Digalg extends StObject {
  
  var digalg: String = js.native
  
  var obj: SignerInfo = js.native
  
  var sattrs: String = js.native
  
  var si: String = js.native
  
  var sigalg: String = js.native
  
  var sigval: String = js.native
  
  var version: String = js.native
}
object Digalg {
  
  @scala.inline
  def apply(
    digalg: String,
    obj: SignerInfo,
    sattrs: String,
    si: String,
    sigalg: String,
    sigval: String,
    version: String
  ): Digalg = {
    val __obj = js.Dynamic.literal(digalg = digalg.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], sattrs = sattrs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sigval = sigval.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digalg]
  }
  
  @scala.inline
  implicit class DigalgMutableBuilder[Self <: Digalg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigalg(value: String): Self = StObject.set(x, "digalg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: SignerInfo): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSattrs(value: String): Self = StObject.set(x, "sattrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSi(value: String): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigval(value: String): Self = StObject.set(x, "sigval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
