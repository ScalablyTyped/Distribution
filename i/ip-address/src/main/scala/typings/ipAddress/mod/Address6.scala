package typings.ipAddress.mod

import typings.ipAddress.AnonOmitSuffix
import typings.jsbn.mod.BigInteger
import typings.std.RegExp
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
  def this(address: String) = this()
  def this(address: String, groups: Double) = this()
  var address: String = js.native
  val groups: Double = js.native
  val subnet: String = js.native
  val subnetMask: Double = js.native
  val v4: Boolean = js.native
  var valid: Boolean = js.native
  /** Return the address as a BigInteger */
  def bigInteger(): BigInteger = js.native
  /** Return a zero-padded base-2 string representation of the address */
  def binaryZeroPad(): String = js.native
  /** Return the canonical form of the address */
  def canonicalForm(): String = js.native
  /** Return the correct form of the address */
  def correctForm(): String = js.native
  /** Return the decimal form of the address */
  def decimal(): String = js.native
  /** The last address in the range given by this address' subnet */
  def endAddress(): Address6 = js.native
  /**
    * Return a v6 6to4 address from a v6 v4inv6 address
    * @deprecated
    */
  def get6to4(): Address6 = js.native
  /** Return the bits in the given range as a BigInteger */
  def getBits(start: Double, end: Double): BigInteger = js.native
  /** Return the bits in the given range as a base-16 string */
  def getBitsBase16(start: Double, end: Double): String = js.native
  /** Return the bits in the given range as a base-2 string */
  def getBitsBase2(start: Double, end: Double): String = js.native
  /** Return the bits that are set past the subnet mask length */
  def getBitsPastSubnet(): String = js.native
  /** Return the scope of the address */
  def getScope(): String = js.native
  /** Return the type of the address */
  def getType(): IPv6Type = js.native
  /** Return an object containing the 6to4 properties of the address */
  def inspect6to4(): SixToFourProperties = js.native
  /** Return an object containing the Teredo properties of the address */
  def inspectTeredo(): TeredoProperties = js.native
  /** Returns true if the address is a v4-in-v6 address, false otherwise */
  def is4(): Boolean = js.native
  /** Returns true if the address is a 6to4 address, false otherwise */
  def is6to4(): Boolean = js.native
  /** Returns true if the address is in the canonical form, false otherwise */
  def isCanonical(): Boolean = js.native
  /** Returns true if the address is correct, false otherwise */
  def isCorrect(): Boolean = js.native
  /** Returns true if the given address is in the subnet of the current address */
  def isInSubnet(address: Address4): Boolean = js.native
  def isInSubnet(address: Address6): Boolean = js.native
  /** Returns true if the address is a link local address, false otherwise */
  def isLinkLocal(): Boolean = js.native
  /** Returns true if the address is a loopback address, false otherwise */
  def isLoopback(): Boolean = js.native
  /** Returns true if the address is a multicast address, false otherwise */
  def isMulticast(): Boolean = js.native
  /** Returns true if the address is a Teredo address, false otherwise */
  def isTeredo(): Boolean = js.native
  /** Returns true if the address is valid, false otherwise */
  def isValid(): Boolean = js.native
  /** Return the first n bits of the address, defaulting to the subnet mask */
  def mask(): String = js.native
  def mask(mask: Double): String = js.native
  /** Return the Microsoft UNC transcription of the address */
  def microsoftTranscription(): String = js.native
  def parse(address: String): js.Array[String] = js.native
  def parse4in6(address: String): String = js.native
  /** Return the number of possible subnets of a given size in the address */
  def possibleSubnets(): String = js.native
  def possibleSubnets(size: Double): String = js.native
  def regularExpression(): RegExp = js.native
  def regularExpression(substring: String): RegExp = js.native
  def regularExpressionString(): RegExp = js.native
  def regularExpressionString(substring: String): RegExp = js.native
  /** Return the reversed ip6.arpa form of the address */
  def reverseForm(): String = js.native
  def reverseForm(options: AnonOmitSuffix): String = js.native
  /**
    * Return an object containing the 6to4 properties of the address
    * @deprecated
    */
  def six2four(): SixToFourProperties = js.native
  /** The first address in the range given by this address' subnet */
  def startAddress(): Address6 = js.native
  /** Return the last two groups of this address as an IPv4 address string */
  def to4(): String = js.native
  /** Return the v4-in-v6 form of the address */
  def to4in6(): String = js.native
  /** Return a v6 6to4 address from a v6 v4inv6 address */
  def to6to4(): Address6 = js.native
  /** Return a byte array */
  def toByteArray(): js.Array[Double] = js.native
  /** Return an unsigned byte array */
  def toUnsignedByteArray(): js.Array[Double] = js.native
  /**
    * Return an object containing the Teredo properties of the address
    * @deprecated
    */
  def toredo(): TeredoProperties = js.native
  /**
    * Return the last two groups of this address as an IPv4 address string
    * @deprecated
    */
  def tov4(): String = js.native
  /**
    * Return the v4-in-v6 form of the address
    * @deprecated
    */
  def v4inv6(): String = js.native
}

/* static members */
@JSImport("ip-address", "Address6")
@js.native
object Address6 extends js.Object {
  var RE_BAD_ADDRESS: RegExp = js.native
  var RE_BAD_CHARACTERS: RegExp = js.native
  var RE_SUBNET_STRING: RegExp = js.native
  var RE_ZONE_STRING: RegExp = js.native
  var SCOPES: String = js.native
  var TYPES: String = js.native
  /** Create an IPv6-mapped address given an IPv4 address */
  def fromAddress4(address4: String): Address6 = js.native
  /** Return an address from ip6.arpa form */
  def fromArpa(ip6arpa: String): Address6 = js.native
  /** Convert a BigInteger to a v6 address object */
  def fromBigInteger(bigInteger: BigInteger): Address6 = js.native
  /** Convert a byte array to an Address6 object */
  def fromByteArray(bytes: js.Array[Double]): Address6 = js.native
  /** Convert a URL (with optional port number) to an address object */
  def fromURL(url: String): Address6 = js.native
  /** Convert an unsigned byte array to an Address6 object */
  def fromUnsignedByteArray(bytes: js.Array[Double]): Address6 = js.native
}

