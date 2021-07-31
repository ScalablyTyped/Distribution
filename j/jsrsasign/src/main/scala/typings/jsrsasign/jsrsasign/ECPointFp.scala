package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECPointFp extends StObject {
  
  var curve: ECFieldElementFp
  
  var x: ECFieldElementFp
  
  var y: ECFieldElementFp
  
  var z: BigInteger
  
  var zinv: BigInteger | Null
}
object ECPointFp {
  
  @scala.inline
  def apply(curve: ECFieldElementFp, x: ECFieldElementFp, y: ECFieldElementFp, z: BigInteger): ECPointFp = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], zinv = null)
    __obj.asInstanceOf[ECPointFp]
  }
  
  @scala.inline
  implicit class ECPointFpMutableBuilder[Self <: ECPointFp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: ECFieldElementFp): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: ECFieldElementFp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: ECFieldElementFp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: BigInteger): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZinv(value: BigInteger): Self = StObject.set(x, "zinv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZinvNull: Self = StObject.set(x, "zinv", null)
  }
}
