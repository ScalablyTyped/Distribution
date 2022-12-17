package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accum extends StObject {
  
  var accum: String
  
  var issued: js.UndefOr[js.Array[Double]] = js.undefined
  
  var prevAccum: String
  
  var revoked: js.UndefOr[js.Array[Double]] = js.undefined
}
object Accum {
  
  inline def apply(accum: String, prevAccum: String): Accum = {
    val __obj = js.Dynamic.literal(accum = accum.asInstanceOf[js.Any], prevAccum = prevAccum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accum]
  }
  
  extension [Self <: Accum](x: Self) {
    
    inline def setAccum(value: String): Self = StObject.set(x, "accum", value.asInstanceOf[js.Any])
    
    inline def setIssued(value: js.Array[Double]): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setIssuedVarargs(value: Double*): Self = StObject.set(x, "issued", js.Array(value*))
    
    inline def setPrevAccum(value: String): Self = StObject.set(x, "prevAccum", value.asInstanceOf[js.Any])
    
    inline def setRevoked(value: js.Array[Double]): Self = StObject.set(x, "revoked", value.asInstanceOf[js.Any])
    
    inline def setRevokedUndefined: Self = StObject.set(x, "revoked", js.undefined)
    
    inline def setRevokedVarargs(value: Double*): Self = StObject.set(x, "revoked", js.Array(value*))
  }
}
