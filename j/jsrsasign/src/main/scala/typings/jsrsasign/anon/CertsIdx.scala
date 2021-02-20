package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertsIdx extends StObject {
  
  var certsIdx: Double = js.native
  
  var signerInfos: js.Array[_] = js.native
}
object CertsIdx {
  
  @scala.inline
  def apply(certsIdx: Double, signerInfos: js.Array[_]): CertsIdx = {
    val __obj = js.Dynamic.literal(certsIdx = certsIdx.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertsIdx]
  }
  
  @scala.inline
  implicit class CertsIdxMutableBuilder[Self <: CertsIdx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertsIdx(value: Double): Self = StObject.set(x, "certsIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerInfos(value: js.Array[_]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerInfosVarargs(value: js.Any*): Self = StObject.set(x, "signerInfos", js.Array(value :_*))
  }
}
