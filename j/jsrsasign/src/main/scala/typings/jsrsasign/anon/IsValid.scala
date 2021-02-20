package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsValid extends StObject {
  
  var isValid: Boolean = js.native
  
  var parse: CertsIdx = js.native
  
  var signerInfos: js.Array[_] = js.native
}
object IsValid {
  
  @scala.inline
  def apply(isValid: Boolean, parse: CertsIdx, signerInfos: js.Array[_]): IsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsValid]
  }
  
  @scala.inline
  implicit class IsValidMutableBuilder[Self <: IsValid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: CertsIdx): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerInfos(value: js.Array[_]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerInfosVarargs(value: js.Any*): Self = StObject.set(x, "signerInfos", js.Array(value :_*))
  }
}
