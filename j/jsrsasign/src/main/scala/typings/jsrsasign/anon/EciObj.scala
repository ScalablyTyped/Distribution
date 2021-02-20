package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.EncapsulatedContentInfo
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EciObj extends StObject {
  
  var eciObj: EncapsulatedContentInfo = js.native
  
  var hashAlg: String = js.native
  
  var sdobj: SignedData = js.native
}
object EciObj {
  
  @scala.inline
  def apply(eciObj: EncapsulatedContentInfo, hashAlg: String, sdobj: SignedData): EciObj = {
    val __obj = js.Dynamic.literal(eciObj = eciObj.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sdobj = sdobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[EciObj]
  }
  
  @scala.inline
  implicit class EciObjMutableBuilder[Self <: EciObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEciObj(value: EncapsulatedContentInfo): Self = StObject.set(x, "eciObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdobj(value: SignedData): Self = StObject.set(x, "sdobj", value.asInstanceOf[js.Any])
  }
}
