package typings
package ipDashAddressLib.ipDashAddressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip-address", "Address6")
@js.native
class Address6 protected () extends js.Object {
  /**
    * @param address An IPv6 address string
    * @param groups  How many octets to parse (default 8)
    */
  def this(address: java.lang.String) = this()
  def this(address: java.lang.String, groups: scala.Double) = this()
  var address: java.lang.String = js.native
  val groups: scala.Double = js.native
  val subnet: java.lang.String = js.native
  val subnetMask: scala.Double = js.native
  val v4: scala.Boolean = js.native
  var valid: scala.Boolean = js.native
  /** Return the address as a BigInteger */
  def bigInteger(): jsbnLib.jsbnMod.BigInteger = js.native
  /** Return a zero-padded base-2 string representation of the address */
  def binaryZeroPad(): java.lang.String = js.native
  /** Return the canonical form of the address */
  def canonicalForm(): java.lang.String = js.native
  /** Return the correct form of the address */
  def correctForm(): java.lang.String = js.native
  /** Return the decimal form of the address */
  def decimal(): java.lang.String = js.native
  /** The last address in the range given by this address' subnet */
  def endAddress(): Address6 = js.native
  /**
    * Return a v6 6to4 address from a v6 v4inv6 address
    * @deprecated
    */
  def get6to4(): Address6 = js.native
  /** Return the bits in the given range as a BigInteger */
  def getBits(start: scala.Double, end: scala.Double): jsbnLib.jsbnMod.BigInteger = js.native
  /** Return the bits in the given range as a base-16 string */
  def getBitsBase16(start: scala.Double, end: scala.Double): java.lang.String = js.native
  /** Return the bits in the given range as a base-2 string */
  def getBitsBase2(start: scala.Double, end: scala.Double): java.lang.String = js.native
  /** Return the bits that are set past the subnet mask length */
  def getBitsPastSubnet(): java.lang.String = js.native
  /** Return the scope of the address */
  def getScope(): java.lang.String = js.native
  /** Return the type of the address */
  def getType(): IPv6Type = js.native
  /** Return an object containing the 6to4 properties of the address */
  def inspect6to4(): SixToFourProperties = js.native
  /** Return an object containing the Teredo properties of the address */
  def inspectTeredo(): TeredoProperties = js.native
  /** Returns true if the address is a v4-in-v6 address, false otherwise */
  def is4(): scala.Boolean = js.native
  /** Returns true if the address is a 6to4 address, false otherwise */
  def is6to4(): scala.Boolean = js.native
  /** Returns true if the address is in the canonical form, false otherwise */
  def isCanonical(): scala.Boolean = js.native
  /** Returns true if the address is correct, false otherwise */
  def isCorrect(): scala.Boolean = js.native
  /** Returns true if the given address is in the subnet of the current address */
  def isInSubnet(address: Address4): scala.Boolean = js.native
  def isInSubnet(address: Address6): scala.Boolean = js.native
  /** Returns true if the address is a link local address, false otherwise */
  def isLinkLocal(): scala.Boolean = js.native
  /** Returns true if the address is a loopback address, false otherwise */
  def isLoopback(): scala.Boolean = js.native
  /** Returns true if the address is a multicast address, false otherwise */
  def isMulticast(): scala.Boolean = js.native
  /** Returns true if the address is a Teredo address, false otherwise */
  def isTeredo(): scala.Boolean = js.native
  /** Returns true if the address is valid, false otherwise */
  def isValid(): scala.Boolean = js.native
  /** Return the first n bits of the address, defaulting to the subnet mask */
  def mask(): java.lang.String = js.native
  def mask(mask: scala.Double): java.lang.String = js.native
  /** Return the Microsoft UNC transcription of the address */
  def microsoftTranscription(): java.lang.String = js.native
  def parse(address: java.lang.String): js.Array[java.lang.String] = js.native
  def parse4in6(address: java.lang.String): java.lang.String = js.native
  /** Return the number of possible subnets of a given size in the address */
  def possibleSubnets(): java.lang.String = js.native
  def possibleSubnets(size: scala.Double): java.lang.String = js.native
  def regularExpression(): stdLib.RegExp = js.native
  def regularExpression(substring: java.lang.String): stdLib.RegExp = js.native
  def regularExpressionString(): stdLib.RegExp = js.native
  def regularExpressionString(substring: java.lang.String): stdLib.RegExp = js.native
  /** Return the reversed ip6.arpa form of the address */
  def reverseForm(): java.lang.String = js.native
  def reverseForm(options: ipDashAddressLib.Anon_OmitSuffix): java.lang.String = js.native
  /**
    * Return an object containing the 6to4 properties of the address
    * @deprecated
    */
  def six2four(): SixToFourProperties = js.native
  /** The first address in the range given by this address' subnet */
  def startAddress(): Address6 = js.native
  /** Return the last two groups of this address as an IPv4 address string */
  def to4(): java.lang.String = js.native
  /** Return the v4-in-v6 form of the address */
  def to4in6(): java.lang.String = js.native
  /** Return a v6 6to4 address from a v6 v4inv6 address */
  def to6to4(): Address6 = js.native
  /** Return a byte array */
  def toByteArray(): js.Array[scala.Double] = js.native
  /** Return an unsigned byte array */
  def toUnsignedByteArray(): js.Array[scala.Double] = js.native
  /**
    * Return an object containing the Teredo properties of the address
    * @deprecated
    */
  def toredo(): TeredoProperties = js.native
  /**
    * Return the last two groups of this address as an IPv4 address string
    * @deprecated
    */
  def tov4(): java.lang.String = js.native
  /**
    * Return the v4-in-v6 form of the address
    * @deprecated
    */
  def v4inv6(): java.lang.String = js.native
}

@JSImport("ip-address", "Address6")
@js.native
object Address6 extends js.Object {
  var RE_BAD_ADDRESS: stdLib.RegExp = js.native
  var RE_BAD_CHARACTERS: stdLib.RegExp = js.native
  var RE_SUBNET_STRING: stdLib.RegExp = js.native
  var RE_ZONE_STRING: stdLib.RegExp = js.native
  var SCOPES: java.lang.String = js.native
  var TYPES: java.lang.String = js.native
  /** Create an IPv6-mapped address given an IPv4 address */
  def fromAddress4(address4: java.lang.String): ipDashAddressLib.ipDashAddressMod.Address6 = js.native
  /** Return an address from ip6.arpa form */
  def fromArpa(ip6arpa: java.lang.String): ipDashAddressLib.ipDashAddressMod.Address6 = js.native
  /** Convert a BigInteger to a v6 address object */
  def fromBigInteger(bigInteger: jsbnLib.jsbnMod.BigInteger): ipDashAddressLib.ipDashAddressMod.Address6 = js.native
  /** Convert a byte array to an Address6 object */
  def fromByteArray(bytes: js.Array[scala.Double]): ipDashAddressLib.ipDashAddressMod.Address6 = js.native
  /** Convert a URL (with optional port number) to an address object */
  def fromURL(url: java.lang.String): ipDashAddressLib.ipDashAddressMod.Address6 = js.native
  /** Convert an unsigned byte array to an Address6 object */
  def fromUnsignedByteArray(bytes: js.Array[scala.Double]): ipDashAddressLib.ipDashAddressMod.Address6 = js.native
}

