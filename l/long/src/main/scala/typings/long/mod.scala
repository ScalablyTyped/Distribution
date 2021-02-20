package typings.long

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.long.anon.High
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("long", JSImport.Namespace)
  @js.native
  val ^ : LongConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("long", JSImport.Namespace)
  @js.native
  class Class protected () extends Long {
    /**
      * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
      */
    def this(low: Double) = this()
    def this(low: Double, high: Double) = this()
    def this(low: Double, high: js.UndefOr[scala.Nothing], unsigned: Boolean) = this()
    def this(low: Double, high: Double, unsigned: Boolean) = this()
  }
  
  @js.native
  trait Long extends StObject {
    
    def add(addend: String): Long = js.native
    /**
      * Returns the sum of this and the specified Long.
      */
    def add(addend: Double): Long = js.native
    def add(addend: Long): Long = js.native
    
    def and(other: String): Long = js.native
    def and(other: Double): Long = js.native
    /**
      * Returns the bitwise AND of this Long and the specified.
      */
    def and(other: Long): Long = js.native
    
    def comp(other: String): Double = js.native
    def comp(other: Double): Double = js.native
    /**
      * Compares this Long's value with the specified's.
      */
    def comp(other: Long): Double = js.native
    
    def compare(other: String): Double = js.native
    def compare(other: Double): Double = js.native
    /**
      * Compares this Long's value with the specified's.
      */
    def compare(other: Long): Double = js.native
    
    def div(divisor: String): Long = js.native
    def div(divisor: Double): Long = js.native
    /**
      * Returns this Long divided by the specified.
      */
    def div(divisor: Long): Long = js.native
    
    def divide(divisor: String): Long = js.native
    def divide(divisor: Double): Long = js.native
    /**
      * Returns this Long divided by the specified.
      */
    def divide(divisor: Long): Long = js.native
    
    def eq(other: String): Boolean = js.native
    def eq(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value equals the specified's.
      */
    def eq(other: Long): Boolean = js.native
    
    def equals(other: String): Boolean = js.native
    def equals(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value equals the specified's.
      */
    def equals(other: Long): Boolean = js.native
    
    /**
      * Gets the high 32 bits as a signed integer.
      */
    def getHighBits(): Double = js.native
    
    /**
      * Gets the high 32 bits as an unsigned integer.
      */
    def getHighBitsUnsigned(): Double = js.native
    
    /**
      * Gets the low 32 bits as a signed integer.
      */
    def getLowBits(): Double = js.native
    
    /**
      * Gets the low 32 bits as an unsigned integer.
      */
    def getLowBitsUnsigned(): Double = js.native
    
    /**
      * Gets the number of bits needed to represent the absolute value of this Long.
      */
    def getNumBitsAbs(): Double = js.native
    
    def greaterThan(other: String): Boolean = js.native
    def greaterThan(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is greater than the specified's.
      */
    def greaterThan(other: Long): Boolean = js.native
    
    def greaterThanOrEqual(other: String): Boolean = js.native
    def greaterThanOrEqual(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is greater than or equal the specified's.
      */
    def greaterThanOrEqual(other: Long): Boolean = js.native
    
    def gt(other: String): Boolean = js.native
    def gt(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is greater than the specified's.
      */
    def gt(other: Long): Boolean = js.native
    
    def gte(other: String): Boolean = js.native
    def gte(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is greater than or equal the specified's.
      */
    def gte(other: Long): Boolean = js.native
    
    /**
      * The high 32 bits as a signed value.
      */
    var high: Double = js.native
    
    /**
      * Tests if this Long's value is even.
      */
    def isEven(): Boolean = js.native
    
    /**
      * Tests if this Long's value is negative.
      */
    def isNegative(): Boolean = js.native
    
    /**
      * Tests if this Long's value is odd.
      */
    def isOdd(): Boolean = js.native
    
    /**
      * Tests if this Long's value is positive.
      */
    def isPositive(): Boolean = js.native
    
    /**
      * Tests if this Long's value equals zero.
      */
    def isZero(): Boolean = js.native
    
    def lessThan(other: String): Boolean = js.native
    def lessThan(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is less than the specified's.
      */
    def lessThan(other: Long): Boolean = js.native
    
    def lessThanOrEqual(other: String): Boolean = js.native
    def lessThanOrEqual(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is less than or equal the specified's.
      */
    def lessThanOrEqual(other: Long): Boolean = js.native
    
    /**
      * The low 32 bits as a signed value.
      */
    var low: Double = js.native
    
    def lt(other: String): Boolean = js.native
    def lt(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is less than the specified's.
      */
    def lt(other: Long): Boolean = js.native
    
    def lte(other: String): Boolean = js.native
    def lte(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value is less than or equal the specified's.
      */
    def lte(other: Long): Boolean = js.native
    
    def mod(other: String): Long = js.native
    def mod(other: Double): Long = js.native
    /**
      * Returns this Long modulo the specified.
      */
    def mod(other: Long): Long = js.native
    
    def modulo(other: String): Long = js.native
    def modulo(other: Double): Long = js.native
    /**
      * Returns this Long modulo the specified.
      */
    def modulo(other: Long): Long = js.native
    
    def mul(multiplier: String): Long = js.native
    def mul(multiplier: Double): Long = js.native
    /**
      * Returns the product of this and the specified Long.
      */
    def mul(multiplier: Long): Long = js.native
    
    def multiply(multiplier: String): Long = js.native
    def multiply(multiplier: Double): Long = js.native
    /**
      * Returns the product of this and the specified Long.
      */
    def multiply(multiplier: Long): Long = js.native
    
    /**
      * Negates this Long's value.
      */
    def neg(): Long = js.native
    
    /**
      * Negates this Long's value.
      */
    def negate(): Long = js.native
    
    def neq(other: String): Boolean = js.native
    def neq(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value differs from the specified's.
      */
    def neq(other: Long): Boolean = js.native
    
    /**
      * Returns the bitwise NOT of this Long.
      */
    def not(): Long = js.native
    
    def notEquals(other: String): Boolean = js.native
    def notEquals(other: Double): Boolean = js.native
    /**
      * Tests if this Long's value differs from the specified's.
      */
    def notEquals(other: Long): Boolean = js.native
    
    def or(other: String): Long = js.native
    def or(other: Double): Long = js.native
    /**
      * Returns the bitwise OR of this Long and the specified.
      */
    def or(other: Long): Long = js.native
    
    /**
      * Returns this Long with bits shifted to the left by the given amount.
      */
    def shiftLeft(numBits: Double): Long = js.native
    def shiftLeft(numBits: Long): Long = js.native
    
    /**
      * Returns this Long with bits arithmetically shifted to the right by the given amount.
      */
    def shiftRight(numBits: Double): Long = js.native
    def shiftRight(numBits: Long): Long = js.native
    
    /**
      * Returns this Long with bits logically shifted to the right by the given amount.
      */
    def shiftRightUnsigned(numBits: Double): Long = js.native
    def shiftRightUnsigned(numBits: Long): Long = js.native
    
    /**
      * Returns this Long with bits shifted to the left by the given amount.
      */
    def shl(numBits: Double): Long = js.native
    def shl(numBits: Long): Long = js.native
    
    /**
      * Returns this Long with bits arithmetically shifted to the right by the given amount.
      */
    def shr(numBits: Double): Long = js.native
    def shr(numBits: Long): Long = js.native
    
    /**
      * Returns this Long with bits logically shifted to the right by the given amount.
      */
    def shru(numBits: Double): Long = js.native
    def shru(numBits: Long): Long = js.native
    
    def sub(subtrahend: String): Long = js.native
    /**
      * Returns the difference of this and the specified Long.
      */
    def sub(subtrahend: Double): Long = js.native
    def sub(subtrahend: Long): Long = js.native
    
    def subtract(subtrahend: String): Long = js.native
    /**
      * Returns the difference of this and the specified Long.
      */
    def subtract(subtrahend: Double): Long = js.native
    def subtract(subtrahend: Long): Long = js.native
    
    /**
      * Converts this Long to its byte representation.
      */
    def toBytes(): js.Array[Double] = js.native
    def toBytes(le: Boolean): js.Array[Double] = js.native
    
    /**
      * Converts this Long to its big endian byte representation.
      */
    def toBytesBE(): js.Array[Double] = js.native
    
    /**
      * Converts this Long to its little endian byte representation.
      */
    def toBytesLE(): js.Array[Double] = js.native
    
    /**
      * Converts the Long to a 32 bit integer, assuming it is a 32 bit integer.
      */
    def toInt(): Double = js.native
    
    /**
      * Converts the Long to a the nearest floating-point representation of this value (double, 53 bit mantissa).
      */
    def toNumber(): Double = js.native
    
    /**
      * Converts this Long to signed.
      */
    def toSigned(): Long = js.native
    
    def toString(radix: Double): String = js.native
    
    /**
      * Converts this Long to unsigned.
      */
    def toUnsigned(): Long = js.native
    
    /**
      * Whether unsigned or not.
      */
    var unsigned: Boolean = js.native
    
    def xor(other: String): Long = js.native
    def xor(other: Double): Long = js.native
    /**
      * Returns the bitwise XOR of this Long and the given one.
      */
    def xor(other: Long): Long = js.native
  }
  
  @js.native
  trait LongConstructor
    extends /**
    * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
    */
  Instantiable1[/* low */ Double, Long]
       with Instantiable2[/* low */ Double, /* high */ Double, Long]
       with Instantiable3[/* low */ Double, js.UndefOr[/* high */ Double], /* unsigned */ Boolean, Long] {
    
    /**
      * Maximum unsigned value.
      */
    var MAX_UNSIGNED_VALUE: Long = js.native
    
    /**
      * Maximum signed value.
      */
    var MAX_VALUE: Long = js.native
    
    /**
      * Minimum signed value.
      */
    var MIN_VALUE: Long = js.native
    
    /**
      * Signed negative one.
      */
    var NEG_ONE: Long = js.native
    
    /**
      * Signed one.
      */
    var ONE: Long = js.native
    
    /**
      * Unsigned one.
      */
    var UONE: Long = js.native
    
    /**
      * Unsigned zero.
      */
    var UZERO: Long = js.native
    
    /**
      * Signed zero
      */
    var ZERO: Long = js.native
    
    /**
      * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
      */
    def fromBits(lowBits: Double, highBits: Double): Long = js.native
    def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): Long = js.native
    
    /**
      * Creates a Long from its byte representation.
      */
    def fromBytes(bytes: js.Array[Double]): Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: js.UndefOr[scala.Nothing], le: Boolean): Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): Long = js.native
    
    /**
      * Creates a Long from its little endian byte representation.
      */
    def fromBytesBE(bytes: js.Array[Double]): Long = js.native
    def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
    
    /**
      * Creates a Long from its little endian byte representation.
      */
    def fromBytesLE(bytes: js.Array[Double]): Long = js.native
    def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
    
    /**
      * Returns a Long representing the given 32 bit integer value.
      */
    def fromInt(value: Double): Long = js.native
    def fromInt(value: Double, unsigned: Boolean): Long = js.native
    
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      */
    def fromNumber(value: Double): Long = js.native
    def fromNumber(value: Double, unsigned: Boolean): Long = js.native
    
    /**
      * Returns a Long representation of the given string, written using the specified radix.
      */
    def fromString(str: String): Long = js.native
    def fromString(str: String, unsigned: js.UndefOr[scala.Nothing], radix: Double): Long = js.native
    def fromString(str: String, unsigned: Boolean): Long = js.native
    def fromString(str: String, unsigned: Boolean, radix: Double): Long = js.native
    def fromString(str: String, unsigned: Double): Long = js.native
    def fromString(str: String, unsigned: Double, radix: Double): Long = js.native
    
    def fromValue(`val`: String): Long = js.native
    def fromValue(`val`: Double): Long = js.native
    def fromValue(`val`: High): Long = js.native
    /**
      * Converts the specified value to a Long.
      */
    def fromValue(`val`: Long): Long = js.native
    
    /**
      * Tests if the specified object is a Long.
      */
    def isLong(obj: js.Any): /* is long.long.Long */ Boolean = js.native
  }
  
  type _To = LongConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LongConstructor = ^
}
