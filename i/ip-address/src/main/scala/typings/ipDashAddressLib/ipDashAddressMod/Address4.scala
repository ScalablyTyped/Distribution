package typings
package ipDashAddressLib.ipDashAddressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip-address", "Address4")
@js.native
class Address4 protected () extends js.Object {
  def this(address: java.lang.String) = this()
  var address: java.lang.String = js.native
  var addressMinusSuffix: java.lang.String = js.native
  val groups: scala.Double = js.native
  var parsedAddress: js.Array[java.lang.String] = js.native
  val subnet: java.lang.String = js.native
  val subnetMask: scala.Double = js.native
  val v4: scala.Boolean = js.native
  var valid: scala.Boolean = js.native
  /** Returns the address as a BigInteger */
  def bigInteger(): jsbnLib.jsbnMod.BigInteger = js.native
  /** Returns a zero-padded base-2 string representation of the address */
  def binaryZeroPad(): java.lang.String = js.native
  /** Returns the correct form of an address */
  def correctForm(): java.lang.String = js.native
  /**
     * The last address in the range given by this address' subnet, often
     * referred to as the Broadcast
     */
  def endAddress(): Address4 = js.native
  /**
     * The last host address in the range given by this address's subnet ie
     * the last address prior to the Broadcast Address
     */
  def endAddressExclusive(): Address4 = js.native
  /** Returns the bits in the given range as a base-2 string */
  def getBitsBase2(start: scala.Double, end: scala.Double): java.lang.String = js.native
  /** Returns true if the address is correct, false otherwise */
  def isCorrect(): scala.Boolean = js.native
  /** Returns true if the given address is in the subnet of the current address */
  def isInSubnet(address: Address4): scala.Boolean = js.native
  /** Returns true if the given address is in the subnet of the current address */
  def isInSubnet(address: Address6): scala.Boolean = js.native
  /** Return true if the address is valid */
  def isValid(): scala.Boolean = js.native
  /** Returns the first n bits of the address, defaulting to the subnet mask */
  def mask(): java.lang.String = js.native
  /** Returns the first n bits of the address, defaulting to the subnet mask */
  def mask(mask: java.lang.String): java.lang.String = js.native
  /** Parses a v4 address */
  def parse(address: java.lang.String): js.Array[java.lang.String] = js.native
  /**
     * The first address in the range given by this address' subnet, often
     * referred to as the Network Address.
     */
  def startAddress(): Address4 = js.native
  /**
     * The first host address in the range given by this address's subnet ie
     * the first address after the Network Address
     */
  def startAddressExclusive(): Address4 = js.native
  /** Converts an IPv4 address object to an array of bytes */
  def toArray(): js.Array[scala.Double] = js.native
  /** Converts an IPv4 address object to an IPv6 address group */
  def toGroup6(): java.lang.String = js.native
  /** Converts an IPv4 address object to a hex string */
  def toHex(): java.lang.String = js.native
  /**
     * Converts an IPv4 address object to an IPv6 address group
     * @deprecated
     */
  def toV6Group(): java.lang.String = js.native
}

@JSImport("ip-address", "Address4")
@js.native
object Address4 extends js.Object {
  /** Converts a BigInteger to a v4 address object */
  def fromBigInteger(bigInteger: jsbnLib.jsbnMod.BigInteger): ipDashAddressLib.ipDashAddressMod.Address4 = js.native
  /** Converts a hex string to an IPv4 address object */
  def fromHex(hex: java.lang.String): ipDashAddressLib.ipDashAddressMod.Address4 = js.native
  /** Converts an integer into a IPv4 address object */
  def fromInteger(integer: scala.Double): ipDashAddressLib.ipDashAddressMod.Address4 = js.native
}

