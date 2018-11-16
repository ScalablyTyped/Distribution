package typings
package longLib.longMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("long", JSImport.Namespace)
@js.native
class namespaced protected () extends Long {
  /**
       * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
       */
  def this(low: scala.Double) = this()
  /**
       * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
       */
  def this(low: scala.Double, high: scala.Double) = this()
  /**
       * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
       */
  def this(low: scala.Double, high: scala.Double, unsigned: scala.Boolean) = this()
}

@JSImport("long", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * Maximum unsigned value.
       */
  var MAX_UNSIGNED_VALUE: longLib.longMod.Long = js.native
  /**
       * Maximum signed value.
       */
  var MAX_VALUE: longLib.longMod.Long = js.native
  /**
       * Minimum signed value.
       */
  var MIN_VALUE: longLib.longMod.Long = js.native
  /**
       * Signed negative one.
       */
  var NEG_ONE: longLib.longMod.Long = js.native
  /**
       * Signed one.
       */
  var ONE: longLib.longMod.Long = js.native
  /**
       * Unsigned one.
       */
  var UONE: longLib.longMod.Long = js.native
  /**
       * Unsigned zero.
       */
  var UZERO: longLib.longMod.Long = js.native
  /**
       * Signed zero
       */
  var ZERO: longLib.longMod.Long = js.native
  /**
       * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
       */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): longLib.longMod.Long = js.native
  /**
       * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
       */
  def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Creates a Long from its byte representation.
       */
  def fromBytes(bytes: js.Array[scala.Double]): longLib.longMod.Long = js.native
  /**
       * Creates a Long from its byte representation.
       */
  def fromBytes(bytes: js.Array[scala.Double], unsigned: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Creates a Long from its byte representation.
       */
  def fromBytes(bytes: js.Array[scala.Double], unsigned: scala.Boolean, le: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Creates a Long from its little endian byte representation.
       */
  def fromBytesBE(bytes: js.Array[scala.Double]): longLib.longMod.Long = js.native
  /**
       * Creates a Long from its little endian byte representation.
       */
  def fromBytesBE(bytes: js.Array[scala.Double], unsigned: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Creates a Long from its little endian byte representation.
       */
  def fromBytesLE(bytes: js.Array[scala.Double]): longLib.longMod.Long = js.native
  /**
       * Creates a Long from its little endian byte representation.
       */
  def fromBytesLE(bytes: js.Array[scala.Double], unsigned: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Returns a Long representing the given 32 bit integer value.
       */
  def fromInt(value: scala.Double): longLib.longMod.Long = js.native
  /**
       * Returns a Long representing the given 32 bit integer value.
       */
  def fromInt(value: scala.Double, unsigned: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
       */
  def fromNumber(value: scala.Double): longLib.longMod.Long = js.native
  /**
       * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
       */
  def fromNumber(value: scala.Double, unsigned: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Returns a Long representation of the given string, written using the specified radix.
       */
  def fromString(str: java.lang.String): longLib.longMod.Long = js.native
  /**
       * Returns a Long representation of the given string, written using the specified radix.
       */
  def fromString(str: java.lang.String, unsigned: scala.Boolean): longLib.longMod.Long = js.native
  /**
       * Returns a Long representation of the given string, written using the specified radix.
       */
  def fromString(str: java.lang.String, unsigned: scala.Boolean, radix: scala.Double): longLib.longMod.Long = js.native
  /**
       * Returns a Long representation of the given string, written using the specified radix.
       */
  def fromString(str: java.lang.String, unsigned: scala.Double): longLib.longMod.Long = js.native
  /**
       * Returns a Long representation of the given string, written using the specified radix.
       */
  def fromString(str: java.lang.String, unsigned: scala.Double, radix: scala.Double): longLib.longMod.Long = js.native
  /**
       * Converts the specified value to a Long.
       */
  def fromValue(`val`: java.lang.String): longLib.longMod.Long = js.native
  /**
       * Converts the specified value to a Long.
       */
  def fromValue(`val`: longLib.Anon_High): longLib.longMod.Long = js.native
  /**
       * Converts the specified value to a Long.
       */
  def fromValue(`val`: longLib.longMod.Long): longLib.longMod.Long = js.native
  /**
       * Converts the specified value to a Long.
       */
  def fromValue(`val`: scala.Double): longLib.longMod.Long = js.native
  /**
       * Tests if the specified object is a Long.
       */
  def isLong(obj: js.Any): scala.Boolean = js.native
}

