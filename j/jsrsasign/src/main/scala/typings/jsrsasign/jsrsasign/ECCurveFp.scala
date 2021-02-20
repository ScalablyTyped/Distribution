package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECCurveFp extends StObject {
  
  var a: ECFieldElementFp = js.native
  
  var b: ECFieldElementFp = js.native
  
  def decodePointHex(): ECPointFp | Null = js.native
  
  def equals(): Boolean = js.native
  
  def fromBigInteger(): ECFieldElementFp = js.native
  
  def getA(): ECFieldElementFp = js.native
  
  def getB(): ECFieldElementFp = js.native
  
  def getInfinity(): ECPointFp = js.native
  
  def getQ(): BigInteger = js.native
  
  var infinity: ECPointFp = js.native
  
  var q: BigInteger = js.native
}
object ECCurveFp {
  
  @scala.inline
  def apply(
    a: ECFieldElementFp,
    b: ECFieldElementFp,
    decodePointHex: () => ECPointFp | Null,
    equals_ : () => Boolean,
    fromBigInteger: () => ECFieldElementFp,
    getA: () => ECFieldElementFp,
    getB: () => ECFieldElementFp,
    getInfinity: () => ECPointFp,
    getQ: () => BigInteger,
    infinity: ECPointFp,
    q: BigInteger
  ): ECCurveFp = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], decodePointHex = js.Any.fromFunction0(decodePointHex), fromBigInteger = js.Any.fromFunction0(fromBigInteger), getA = js.Any.fromFunction0(getA), getB = js.Any.fromFunction0(getB), getInfinity = js.Any.fromFunction0(getInfinity), getQ = js.Any.fromFunction0(getQ), infinity = infinity.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction0(equals_))
    __obj.asInstanceOf[ECCurveFp]
  }
  
  @scala.inline
  implicit class ECCurveFpMutableBuilder[Self <: ECCurveFp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: ECFieldElementFp): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: ECFieldElementFp): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodePointHex(value: () => ECPointFp | Null): Self = StObject.set(x, "decodePointHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals_(value: () => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFromBigInteger(value: () => ECFieldElementFp): Self = StObject.set(x, "fromBigInteger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetA(value: () => ECFieldElementFp): Self = StObject.set(x, "getA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetB(value: () => ECFieldElementFp): Self = StObject.set(x, "getB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInfinity(value: () => ECPointFp): Self = StObject.set(x, "getInfinity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQ(value: () => BigInteger): Self = StObject.set(x, "getQ", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInfinity(value: ECPointFp): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: BigInteger): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
