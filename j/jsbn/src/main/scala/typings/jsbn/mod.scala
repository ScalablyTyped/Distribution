package typings.jsbn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsbn", "BigInteger")
  @js.native
  open class BigInteger protected () extends StObject {
    def this(a: String) = this()
    def this(a: js.Array[Double]) = this()
    def this(a: BigInteger) = this()
    def this(a: String, b: Double) = this()
    def this(a: js.Array[Double], b: Double) = this()
    def this(a: Double, c: RandomGenerator) = this()
    def this(a: Double, b: Double, c: RandomGenerator) = this()
    
    // forge specific
    var DB: Double = js.native
    
    var DM: Double = js.native
    
    var DV: Double = js.native
    
    var F1: Double = js.native
    
    var F2: Double = js.native
    
    var FV: Double = js.native
    
    // (public) |this|
    def abs(): BigInteger = js.native
    
    // (public) this + a
    def add(a: BigInteger): BigInteger = js.native
    
    // (protected) r = this + a
    def addTo(a: BigInteger, r: BigInteger): Unit = js.native
    
    // am: Compute w_j += (x*this_i), propagate carries,
    def am(i: Double, x: Double, w: BigInteger, j: Double, c: Double, n: Double): Double = js.native
    
    // (public) this & a
    def and(a: BigInteger): BigInteger = js.native
    
    // (public) this & ~a
    def andNot(a: BigInteger): BigInteger = js.native
    
    // (public) return number of set bits
    def bitCount(): Double = js.native
    
    // (public) return the number of bits in "this"
    def bitLength(): Double = js.native
    
    // (protected) r = this op a (bitwise)
    def bitwiseTo(a: BigInteger, op: js.Function2[/* x */ Double, /* y */ Double, Double], r: BigInteger): Unit = js.native
    
    // (public) return value as byte
    def byteValue(): Double = js.native
    
    // (protected) this op (1<<n)
    def changeBit(n: Double, op: js.Function2[/* x */ Double, /* y */ Double, Double]): BigInteger = js.native
    
    // (protected) return x s.t. r^x < DV
    def chunkSize(r: Double): Double = js.native
    
    // (protected) clamp off excess high words
    def clamp(): Unit = js.native
    
    // (public) this & ~(1<<n)
    def clearBit(n: Double): BigInteger = js.native
    
    // (public) return + if this > a, - if this < a, 0 if equal
    def compareTo(a: BigInteger): Double = js.native
    
    // (protected) copy this to r
    def copyTo(r: BigInteger): Unit = js.native
    
    // (protected) this += n << w words, this >= 0
    def dAddOffset(n: Double, w: Double): Unit = js.native
    
    // Array of 2 items
    // (protected) this *= n, this >= 0, 1 < n < DV
    def dMultiply(n: Double): Unit = js.native
    
    var data: js.Array[Double] = js.native
    
    // (protected) divide this by m, quotient and remainder to q, r (HAC 14.20)
    // r != q, this != m.  q or r may be null.
    def divRemTo(m: BigInteger, q: BigInteger, r: BigInteger): Unit = js.native
    
    // (public) this / a
    def divide(a: BigInteger): BigInteger = js.native
    
    // (public) [this/a,this%a]
    def divideAndRemainder(a: BigInteger): js.Array[BigInteger] = js.native
    
    // (protected) r = this << n*DB
    def dlShiftTo(n: Double, r: BigInteger): Unit = js.native
    
    // (protected) r = this >> n*DB
    def drShiftTo(n: Double, r: BigInteger): Unit = js.native
    
    def equals(a: BigInteger): Boolean = js.native
    
    // (protected) this^e, e < 2^32, doing sqr and mul with "r" (HAC 14.79)
    def exp(e: Double, z: Reduction): BigInteger = js.native
    
    // (public) this ^ (1<<n)
    def flipBit(n: Double): BigInteger = js.native
    
    // (protected) set from integer value x, -DV <= x < DV
    def fromInt(x: Double): Unit = js.native
    
    // (protected) alternate constructor
    def fromNumber(a: Double): Unit = js.native
    def fromNumber(a: Double, b: Double): Unit = js.native
    def fromNumber(a: Double, b: Double, c: Double): Unit = js.native
    def fromNumber(a: Double, b: Unit, c: Double): Unit = js.native
    
    // (protected) convert from radix string
    def fromRadix(s: String, b: Double): Unit = js.native
    
    // (protected) set from string and radix
    def fromString(x: String, b: Double): Unit = js.native
    
    // (public) gcd(this,a) (HAC 14.54)
    def gcd(a: BigInteger): BigInteger = js.native
    
    // (public) returns index of lowest 1-bit (or -1 if none)
    def getLowestSetBit(): Double = js.native
    
    // (public) return value as integer
    def intValue(): Double = js.native
    
    // (protected) return "-1/this % 2^DB"; useful for Mont. reduction
    def invDigit(): Double = js.native
    
    // (protected) true iff this is even
    def isEven(): Boolean = js.native
    
    // (public) test primality with certainty >= 1-.5^t
    def isProbablePrime(t: Double): Boolean = js.native
    
    // (protected) r = this << n
    def lShiftTo(n: Double, r: BigInteger): Unit = js.native
    
    def max(a: BigInteger): BigInteger = js.native
    
    // (protected) true if probably prime (HAC 4.24, Miller-Rabin)
    def millerRabin(t: Double): Boolean = js.native
    
    def min(a: BigInteger): BigInteger = js.native
    
    // (public) this mod a
    def mod(a: BigInteger): BigInteger = js.native
    
    // (protected) this % n, n < 2^26
    def modInt(n: Double): Double = js.native
    
    // (public) 1/this % m (HAC 14.61)
    def modInverse(m: BigInteger): BigInteger = js.native
    
    // (public) this^e % m (HAC 14.85)
    def modPow(e: BigInteger, m: BigInteger): BigInteger = js.native
    
    // (public) this^e % m, 0 <= e < 2^32
    def modPowInt(e: Double, m: BigInteger): BigInteger = js.native
    
    // (public) this * a
    def multiply(a: BigInteger): BigInteger = js.native
    
    // (protected) r = lower n words of "this * a", a.t <= n
    def multiplyLowerTo(a: BigInteger, n: Double, r: BigInteger): Unit = js.native
    
    // (protected) r = this * a, r != this,a (HAC 14.12)
    def multiplyTo(a: BigInteger, r: BigInteger): Unit = js.native
    
    // (protected) r = "this * a" without lower n words, n > 0
    def multiplyUpperTo(a: BigInteger, n: Double, r: BigInteger): Unit = js.native
    
    // (public) -this
    def negate(): BigInteger = js.native
    
    // (public) ~this
    def not(): BigInteger = js.native
    
    // (public) this | a
    def or(a: BigInteger): BigInteger = js.native
    
    // (public) this^e
    def pow(e: Double): BigInteger = js.native
    
    // (protected) r = this >> n
    def rShiftTo(n: Double, r: BigInteger): Unit = js.native
    
    // (public) this % a
    def remainder(a: BigInteger): BigInteger = js.native
    
    var s: Double = js.native
    
    // (protected) this op (1<<n)
    def setBit(n: Double): BigInteger = js.native
    
    // (public) this << n
    def shiftLeft(n: Double): BigInteger = js.native
    
    // (public) this >> n
    def shiftRight(n: Double): BigInteger = js.native
    
    // (public) return value as short (assumes DB>=16)
    def shortValue(): Double = js.native
    
    // (public) 0 if this == 0, 1 if this > 0
    def signum(): Double = js.native
    
    // (public) this^2
    def square(): BigInteger = js.native
    
    // (protected) r = this^2, r != this (HAC 14.16)
    def squareTo(r: BigInteger): Unit = js.native
    
    // (protected) r = this - a
    def subTo(a: BigInteger, r: BigInteger): Unit = js.native
    
    // (public) this - a
    def subtract(a: BigInteger): BigInteger = js.native
    
    var t: Double = js.native
    
    // (public) true iff nth bit is set
    def testBit(n: Double): Boolean = js.native
    
    // (public) convert to bigendian byte array
    def toByteArray(): js.Array[Double] = js.native
    
    // (protected) convert to radix string
    def toRadix(b: Double): String = js.native
    
    def toString(b: Double): String = js.native
    
    // (public) this ^ a
    def xor(a: BigInteger): BigInteger = js.native
  }
  /* static members */
  object BigInteger {
    
    @JSImport("jsbn", "BigInteger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsbn", "BigInteger.ONE")
    @js.native
    def ONE: BigInteger = js.native
    inline def ONE_=(x: BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("jsbn", "BigInteger.ZERO")
    @js.native
    def ZERO: BigInteger = js.native
    inline def ZERO_=(x: BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  }
  
  trait RandomGenerator extends StObject {
    
    def nextBytes(bytes: js.Array[Double]): Unit
  }
  object RandomGenerator {
    
    inline def apply(nextBytes: js.Array[Double] => Unit): RandomGenerator = {
      val __obj = js.Dynamic.literal(nextBytes = js.Any.fromFunction1(nextBytes))
      __obj.asInstanceOf[RandomGenerator]
    }
    
    extension [Self <: RandomGenerator](x: Self) {
      
      inline def setNextBytes(value: js.Array[Double] => Unit): Self = StObject.set(x, "nextBytes", js.Any.fromFunction1(value))
    }
  }
  
  trait Reduction extends StObject {
    
    def convert(x: BigInteger): BigInteger
    
    def mulTo(x: BigInteger, y: BigInteger, r: BigInteger): Unit
    
    def reduce(x: BigInteger): Unit
    
    def revert(x: BigInteger): BigInteger
    
    def sqrTo(x: BigInteger, r: BigInteger): Unit
  }
  object Reduction {
    
    inline def apply(
      convert: BigInteger => BigInteger,
      mulTo: (BigInteger, BigInteger, BigInteger) => Unit,
      reduce: BigInteger => Unit,
      revert: BigInteger => BigInteger,
      sqrTo: (BigInteger, BigInteger) => Unit
    ): Reduction = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), mulTo = js.Any.fromFunction3(mulTo), reduce = js.Any.fromFunction1(reduce), revert = js.Any.fromFunction1(revert), sqrTo = js.Any.fromFunction2(sqrTo))
      __obj.asInstanceOf[Reduction]
    }
    
    extension [Self <: Reduction](x: Self) {
      
      inline def setConvert(value: BigInteger => BigInteger): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
      
      inline def setMulTo(value: (BigInteger, BigInteger, BigInteger) => Unit): Self = StObject.set(x, "mulTo", js.Any.fromFunction3(value))
      
      inline def setReduce(value: BigInteger => Unit): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setRevert(value: BigInteger => BigInteger): Self = StObject.set(x, "revert", js.Any.fromFunction1(value))
      
      inline def setSqrTo(value: (BigInteger, BigInteger) => Unit): Self = StObject.set(x, "sqrTo", js.Any.fromFunction2(value))
    }
  }
}
