package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigInteger extends StObject {
  
  def abs(): BigInteger
  
  def bitLength(): Double
  
  def compareTo(a: BigInteger): Double
  
  def mod(a: BigInteger): BigInteger
  
  def modPowInt(e: Double, m: BigInteger): BigInteger
  
  def negate(): BigInteger
  
  def toString(b: Double): String
}
object BigInteger {
  
  inline def apply(
    abs: () => BigInteger,
    bitLength: () => Double,
    compareTo: BigInteger => Double,
    mod: BigInteger => BigInteger,
    modPowInt: (Double, BigInteger) => BigInteger,
    negate: () => BigInteger,
    toString_ : Double => String
  ): BigInteger = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction0(abs), bitLength = js.Any.fromFunction0(bitLength), compareTo = js.Any.fromFunction1(compareTo), mod = js.Any.fromFunction1(mod), modPowInt = js.Any.fromFunction2(modPowInt), negate = js.Any.fromFunction0(negate))
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[BigInteger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigInteger] (val x: Self) extends AnyVal {
    
    inline def setAbs(value: () => BigInteger): Self = StObject.set(x, "abs", js.Any.fromFunction0(value))
    
    inline def setBitLength(value: () => Double): Self = StObject.set(x, "bitLength", js.Any.fromFunction0(value))
    
    inline def setCompareTo(value: BigInteger => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
    
    inline def setMod(value: BigInteger => BigInteger): Self = StObject.set(x, "mod", js.Any.fromFunction1(value))
    
    inline def setModPowInt(value: (Double, BigInteger) => BigInteger): Self = StObject.set(x, "modPowInt", js.Any.fromFunction2(value))
    
    inline def setNegate(value: () => BigInteger): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
    
    inline def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
