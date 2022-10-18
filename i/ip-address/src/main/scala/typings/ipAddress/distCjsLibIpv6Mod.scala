package typings.ipAddress

import typings.ipAddress.anon.Address
import typings.ipAddress.anon.ClassName
import typings.ipAddress.anon.Error
import typings.ipAddress.anon.GroupIndividual
import typings.ipAddress.distCjsLibCommonMod.ReverseFormOptions
import typings.ipAddress.distCjsLibIpv4Mod.Address4
import typings.jsbn.mod.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsLibIpv6Mod {
  
  @JSImport("ip-address/dist/cjs/lib/ipv6", "Address6")
  @js.native
  open class Address6 protected () extends StObject {
    def this(address: String) = this()
    def this(address: String, optionalGroups: Double) = this()
    
    /**
      * Helper function getting end address.
      * @memberof Address6
      * @instance
      * @returns {BigInteger}
      */
    def _endAddress(): BigInteger = js.native
    
    /**
      * Helper function getting start address.
      * @memberof Address6
      * @instance
      * @returns {BigInteger}
      */
    def _startAddress(): BigInteger = js.native
    
    var address: String = js.native
    
    var address4: js.UndefOr[Address4] = js.native
    
    var addressMinusSuffix: String = js.native
    
    /**
      * Return the address as a BigInteger
      * @memberof Address6
      * @instance
      * @returns {BigInteger}
      */
    def bigInteger(): BigInteger = js.native
    
    /**
      * Return a zero-padded base-2 string representation of the address
      * @memberof Address6
      * @instance
      * @returns {String}
      * @example
      * var address = new Address6('2001:4860:4001:803::1011');
      * address.binaryZeroPad();
      * // '0010000000000001010010000110000001000000000000010000100000000011
      * //  0000000000000000000000000000000000000000000000000001000000010001'
      */
    def binaryZeroPad(): String = js.native
    
    /**
      * Return the canonical form of the address
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def canonicalForm(): String = js.native
    
    /**
      * Return the correct form of the address
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def correctForm(): String = js.native
    
    /**
      * Return the decimal form of the address
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def decimal(): String = js.native
    
    var elidedGroups: js.UndefOr[Double] = js.native
    
    var elisionBegin: js.UndefOr[Double] = js.native
    
    var elisionEnd: js.UndefOr[Double] = js.native
    
    /**
      * The last address in the range given by this address' subnet
      * Often referred to as the Broadcast
      * @memberof Address6
      * @instance
      * @returns {Address6}
      */
    def endAddress(): Address6 = js.native
    
    /**
      * The last host address in the range given by this address's subnet ie
      * the last address prior to the Broadcast Address
      * @memberof Address6
      * @instance
      * @returns {Address6}
      */
    def endAddressExclusive(): Address6 = js.native
    
    /**
      * Return the bits in the given range as a BigInteger
      * @memberof Address6
      * @instance
      * @returns {BigInteger}
      */
    def getBits(start: Double, end: Double): BigInteger = js.native
    
    /**
      * Return the bits in the given range as a base-16 string
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def getBitsBase16(start: Double, end: Double): String = js.native
    
    /**
      * Return the bits in the given range as a base-2 string
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def getBitsBase2(start: Double, end: Double): String = js.native
    
    /**
      * Return the bits that are set past the subnet mask length
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def getBitsPastSubnet(): String = js.native
    
    /**
      * Return the scope of the address
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def getScope(): String = js.native
    
    /**
      * Return the type of the address
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def getType(): String = js.native
    
    /**
      * Groups an address
      * @returns {String}
      */
    def group(): String = js.native
    
    var groups: Double = js.native
    
    /**
      * @returns {String} the address in link form with a default port of 80
      */
    def href(): String = js.native
    def href(optionalPort: String): String = js.native
    def href(optionalPort: Double): String = js.native
    
    /**
      * Return an object containing the 6to4 properties of the address
      * @memberof Address6
      * @instance
      * @returns {Object}
      */
    def inspect6to4(): SixToFourProperties = js.native
    
    /**
      * Return an object containing the Teredo properties of the address
      * @memberof Address6
      * @instance
      * @returns {Object}
      */
    def inspectTeredo(): TeredoProperties = js.native
    
    /**
      * Returns true if the address is a v4-in-v6 address, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def is4(): Boolean = js.native
    
    /**
      * Returns true if the address is a 6to4 address, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def is6to4(): Boolean = js.native
    
    /**
      * Returns true if the address is in the canonical form, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def isCanonical(): Boolean = js.native
    
    /**
      * Returns true if the address is correct, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def isCorrect(): Boolean = js.native
    
    def isInSubnet(address: this.type): Boolean = js.native
    /**
      * Returns true if the given address is in the subnet of the current address
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def isInSubnet(address: Address4): Boolean = js.native
    /**
      * Returns true if the given address is in the subnet of the current address
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    @JSName("isInSubnet")
    var isInSubnet_Original: js.ThisFunction1[/* this */ Address4 | this.type, /* address */ Address4 | this.type, Boolean] = js.native
    
    /**
      * Returns true if the address is a link local address, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def isLinkLocal(): Boolean = js.native
    
    /**
      * Returns true if the address is a loopback address, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def isLoopback(): Boolean = js.native
    
    /**
      * Returns true if the address is a multicast address, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def isMulticast(): Boolean = js.native
    
    /**
      * Returns true if the address is a Teredo address, false otherwise
      * @memberof Address6
      * @instance
      * @returns {boolean}
      */
    def isTeredo(): Boolean = js.native
    
    /**
      * @returns {String} a link suitable for conveying the address via a URL hash
      */
    def link(): String = js.native
    def link(options: ClassName): String = js.native
    
    /**
      * Return the first n bits of the address, defaulting to the subnet mask
      * @memberof Address6
      * @instance
      * @param {number} [mask=subnet] - the number of bits to mask
      * @returns {String} the first n bits of the address as a string
      */
    def mask(): String = js.native
    def mask(mask: Double): String = js.native
    
    /**
      * Return the Microsoft UNC transcription of the address
      * @memberof Address6
      * @instance
      * @returns {String} the Microsoft UNC transcription of the address
      */
    def microsoftTranscription(): String = js.native
    
    def parse(address: String): js.Array[String] = js.native
    
    def parse4in6(address: String): String = js.native
    
    var parsedAddress: js.Array[String] = js.native
    
    var parsedAddress4: js.UndefOr[String] = js.native
    
    var parsedSubnet: String = js.native
    
    /**
      * Return the number of possible subnets of a given size in the address
      * @memberof Address6
      * @instance
      * @param {number} [size=128] - the subnet size
      * @returns {String}
      */
    def possibleSubnets(): String = js.native
    def possibleSubnets(subnetSize: Double): String = js.native
    
    /**
      * Generate a regular expression that can be used to find or validate all
      * variations of this address.
      * @memberof Address6
      * @instance
      * @param {boolean} substringSearch
      * @returns {RegExp}
      */
    def regularExpression(): js.RegExp = js.native
    def regularExpression(substringSearch: Boolean): js.RegExp = js.native
    
    /**
      * Generate a regular expression string that can be used to find or validate
      * all variations of this address
      * @memberof Address6
      * @instance
      * @param {boolean} substringSearch
      * @returns {string}
      */
    def regularExpressionString(): String = js.native
    def regularExpressionString(substringSearch: Boolean): String = js.native
    
    /**
      * Return the reversed ip6.arpa form of the address
      * @memberof Address6
      * @param {Object} options
      * @param {boolean} options.omitSuffix - omit the "ip6.arpa" suffix
      * @instance
      * @returns {String}
      */
    def reverseForm(): String = js.native
    def reverseForm(options: ReverseFormOptions): String = js.native
    
    /**
      * The first address in the range given by this address' subnet
      * Often referred to as the Network Address.
      * @memberof Address6
      * @instance
      * @returns {Address6}
      */
    def startAddress(): Address6 = js.native
    
    /**
      * The first host address in the range given by this address's subnet ie
      * the first address after the Network Address
      * @memberof Address6
      * @instance
      * @returns {Address6}
      */
    def startAddressExclusive(): Address6 = js.native
    
    var subnet: String = js.native
    
    var subnetMask: Double = js.native
    
    /**
      * Return the last two groups of this address as an IPv4 address string
      * @memberof Address6
      * @instance
      * @returns {Address4}
      * @example
      * var address = new Address6('2001:4860:4001::1825:bf11');
      * address.to4().correctForm(); // '24.37.191.17'
      */
    def to4(): Address4 = js.native
    
    /**
      * Return the v4-in-v6 form of the address
      * @memberof Address6
      * @instance
      * @returns {String}
      */
    def to4in6(): String = js.native
    
    /**
      * Return a v6 6to4 address from a v6 v4inv6 address
      * @memberof Address6
      * @instance
      * @returns {Address6}
      */
    def to6to4(): Address6 | Null = js.native
    
    /**
      * Return a byte array
      * @memberof Address6
      * @instance
      * @returns {Array}
      */
    def toByteArray(): js.Array[Double] = js.native
    
    /**
      * Return an unsigned byte array
      * @memberof Address6
      * @instance
      * @returns {Array}
      */
    def toUnsignedByteArray(): js.Array[Double] = js.native
    
    var v4: Boolean = js.native
    
    var zone: String = js.native
  }
  /* static members */
  object Address6 {
    
    @JSImport("ip-address/dist/cjs/lib/ipv6", "Address6")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an IPv6-mapped address given an IPv4 address
      * @memberof Address6
      * @static
      * @param {string} address - An IPv4 address string
      * @returns {Address6}
      * @example
      * var address = Address6.fromAddress4('192.168.0.1');
      * address.correctForm(); // '::ffff:c0a8:1'
      * address.to4in6(); // '::ffff:192.168.0.1'
      */
    inline def fromAddress4(address: String): Address6 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress4")(address.asInstanceOf[js.Any]).asInstanceOf[Address6]
    
    /**
      * Return an address from ip6.arpa form
      * @memberof Address6
      * @static
      * @param {string} arpaFormAddress - an 'ip6.arpa' form address
      * @returns {Adress6}
      * @example
      * var address = Address6.fromArpa(e.f.f.f.3.c.2.6.f.f.f.e.6.6.8.e.1.0.6.7.9.4.e.c.0.0.0.0.1.0.0.2.ip6.arpa.)
      * address.correctForm(); // '2001:0:ce49:7601:e866:efff:62c3:fffe'
      */
    inline def fromArpa(arpaFormAddress: String): Address6 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArpa")(arpaFormAddress.asInstanceOf[js.Any]).asInstanceOf[Address6]
    
    /**
      * Convert a BigInteger to a v6 address object
      * @memberof Address6
      * @static
      * @param {BigInteger} bigInteger - a BigInteger to convert
      * @returns {Address6}
      * @example
      * var bigInteger = new BigInteger('1000000000000');
      * var address = Address6.fromBigInteger(bigInteger);
      * address.correctForm(); // '::e8:d4a5:1000'
      */
    inline def fromBigInteger(bigInteger: BigInteger): Address6 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInteger")(bigInteger.asInstanceOf[js.Any]).asInstanceOf[Address6]
    
    /**
      * Convert a byte array to an Address6 object
      * @memberof Address6
      * @static
      * @returns {Address6}
      */
    inline def fromByteArray(bytes: js.Array[Any]): Address6 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromByteArray")(bytes.asInstanceOf[js.Any]).asInstanceOf[Address6]
    
    /**
      * Convert a URL (with optional port number) to an address object
      * @memberof Address6
      * @static
      * @param {string} url - a URL with optional port number
      * @example
      * var addressAndPort = Address6.fromURL('http://[ffff::]:8080/foo/');
      * addressAndPort.address.correctForm(); // 'ffff::'
      * addressAndPort.port; // 8080
      */
    inline def fromURL(url: String): Address | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[Address | Error]
    
    /**
      * Convert an unsigned byte array to an Address6 object
      * @memberof Address6
      * @static
      * @returns {Address6}
      */
    inline def fromUnsignedByteArray(bytes: js.Array[Any]): Address6 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnsignedByteArray")(bytes.asInstanceOf[js.Any]).asInstanceOf[Address6]
    
    inline def isValid(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait SixToFourProperties extends StObject {
    
    var gateway: String
    
    var prefix: String
  }
  object SixToFourProperties {
    
    inline def apply(gateway: String, prefix: String): SixToFourProperties = {
      val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[SixToFourProperties]
    }
    
    extension [Self <: SixToFourProperties](x: Self) {
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait TeredoProperties extends StObject {
    
    var client4: String
    
    var coneNat: Boolean
    
    var flags: String
    
    var microsoft: GroupIndividual
    
    var prefix: String
    
    var server4: String
    
    var udpPort: String
  }
  object TeredoProperties {
    
    inline def apply(
      client4: String,
      coneNat: Boolean,
      flags: String,
      microsoft: GroupIndividual,
      prefix: String,
      server4: String,
      udpPort: String
    ): TeredoProperties = {
      val __obj = js.Dynamic.literal(client4 = client4.asInstanceOf[js.Any], coneNat = coneNat.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], microsoft = microsoft.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], server4 = server4.asInstanceOf[js.Any], udpPort = udpPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeredoProperties]
    }
    
    extension [Self <: TeredoProperties](x: Self) {
      
      inline def setClient4(value: String): Self = StObject.set(x, "client4", value.asInstanceOf[js.Any])
      
      inline def setConeNat(value: Boolean): Self = StObject.set(x, "coneNat", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setMicrosoft(value: GroupIndividual): Self = StObject.set(x, "microsoft", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setServer4(value: String): Self = StObject.set(x, "server4", value.asInstanceOf[js.Any])
      
      inline def setUdpPort(value: String): Self = StObject.set(x, "udpPort", value.asInstanceOf[js.Any])
    }
  }
}
