package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertsIdx extends StObject {
  
  var certsIdx: Double
  
  var signerInfos: js.Array[js.Any]
}
object CertsIdx {
  
  inline def apply(certsIdx: Double, signerInfos: js.Array[js.Any]): CertsIdx = {
    val __obj = js.Dynamic.literal(certsIdx = certsIdx.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertsIdx]
  }
  
  extension [Self <: CertsIdx](x: Self) {
    
    inline def setCertsIdx(value: Double): Self = StObject.set(x, "certsIdx", value.asInstanceOf[js.Any])
    
    inline def setSignerInfos(value: js.Array[js.Any]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    inline def setSignerInfosVarargs(value: js.Any*): Self = StObject.set(x, "signerInfos", js.Array(value :_*))
  }
}
