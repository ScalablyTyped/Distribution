package typings
package longLib.longMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("long", JSImport.Namespace)
@js.native
class ^ protected () extends Long {
  /**
    * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
    */
  def this(low: scala.Double) = this()
  def this(low: scala.Double, high: scala.Double) = this()
  def this(low: scala.Double, high: scala.Double, unsigned: scala.Boolean) = this()
}

@JSImport("long", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def fromBits(lowBits: scala.Double, highBits: scala.Double): Long = js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: scala.Boolean): Long = js.native
  /**
    * Creates a Long from its byte representation.
    */
  def fromBytes(bytes: js.Array[scala.Double]): Long = js.native
  def fromBytes(bytes: js.Array[scala.Double], unsigned: scala.Boolean): Long = js.native
  def fromBytes(bytes: js.Array[scala.Double], unsigned: scala.Boolean, le: scala.Boolean): Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesBE(bytes: js.Array[scala.Double]): Long = js.native
  def fromBytesBE(bytes: js.Array[scala.Double], unsigned: scala.Boolean): Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesLE(bytes: js.Array[scala.Double]): Long = js.native
  def fromBytesLE(bytes: js.Array[scala.Double], unsigned: scala.Boolean): Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value.
    */
  def fromInt(value: scala.Double): Long = js.native
  def fromInt(value: scala.Double, unsigned: scala.Boolean): Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    */
  def fromNumber(value: scala.Double): Long = js.native
  def fromNumber(value: scala.Double, unsigned: scala.Boolean): Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    */
  def fromString(str: java.lang.String): Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean): Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean, radix: scala.Double): Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Double): Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Double, radix: scala.Double): Long = js.native
  def fromValue(`val`: java.lang.String): Long = js.native
  def fromValue(`val`: longLib.Anon_High): Long = js.native
  /**
    * Converts the specified value to a Long.
    */
  def fromValue(`val`: Long): Long = js.native
  def fromValue(`val`: scala.Double): Long = js.native
  /**
    * Tests if the specified object is a Long.
    */
  def isLong(obj: js.Any): scala.Boolean = js.native
}

