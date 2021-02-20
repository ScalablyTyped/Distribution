package typings.ipAddress

import typings.ipAddress.anon.Address
import typings.ipAddress.anon.Error
import typings.ipAddress.anon.Typeofhelpers
import typings.jsbn.mod.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip-address", "Address4")
  @js.native
  class Address4 protected ()
    extends typings.ipAddress.ipv4Mod.Address4 {
    def this(address: String) = this()
  }
  /* static members */
  object Address4 {
    
    /**
      * Converts a BigInteger to a v4 address object
      * @memberof Address4
      * @static
      * @param {BigInteger} bigInteger - a BigInteger to convert
      * @returns {Address4}
      */
    @JSImport("ip-address", "Address4.fromBigInteger")
    @js.native
    def fromBigInteger(bigInteger: BigInteger): typings.ipAddress.ipv4Mod.Address4 = js.native
    
    /**
      * Converts a hex string to an IPv4 address object
      * @memberof Address4
      * @static
      * @param {string} hex - a hex string to convert
      * @returns {Address4}
      */
    @JSImport("ip-address", "Address4.fromHex")
    @js.native
    def fromHex(hex: String): typings.ipAddress.ipv4Mod.Address4 = js.native
    
    /**
      * Converts an integer into a IPv4 address object
      * @memberof Address4
      * @static
      * @param {integer} integer - a number to convert
      * @returns {Address4}
      */
    @JSImport("ip-address", "Address4.fromInteger")
    @js.native
    def fromInteger(integer: Double): typings.ipAddress.ipv4Mod.Address4 = js.native
    
    @JSImport("ip-address", "Address4.isValid")
    @js.native
    def isValid(address: String): Boolean = js.native
  }
  
  @JSImport("ip-address", "Address6")
  @js.native
  class Address6 protected ()
    extends typings.ipAddress.ipv6Mod.Address6 {
    def this(address: String) = this()
    def this(address: String, optionalGroups: Double) = this()
  }
  /* static members */
  object Address6 {
    
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
    @JSImport("ip-address", "Address6.fromAddress4")
    @js.native
    def fromAddress4(address: String): typings.ipAddress.ipv6Mod.Address6 = js.native
    
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
    @JSImport("ip-address", "Address6.fromArpa")
    @js.native
    def fromArpa(arpaFormAddress: String): typings.ipAddress.ipv6Mod.Address6 = js.native
    
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
    @JSImport("ip-address", "Address6.fromBigInteger")
    @js.native
    def fromBigInteger(bigInteger: BigInteger): typings.ipAddress.ipv6Mod.Address6 = js.native
    
    /**
      * Convert a byte array to an Address6 object
      * @memberof Address6
      * @static
      * @returns {Address6}
      */
    @JSImport("ip-address", "Address6.fromByteArray")
    @js.native
    def fromByteArray(bytes: js.Array[_]): typings.ipAddress.ipv6Mod.Address6 = js.native
    
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
    @JSImport("ip-address", "Address6.fromURL")
    @js.native
    def fromURL(url: String): Address | Error = js.native
    
    /**
      * Convert an unsigned byte array to an Address6 object
      * @memberof Address6
      * @static
      * @returns {Address6}
      */
    @JSImport("ip-address", "Address6.fromUnsignedByteArray")
    @js.native
    def fromUnsignedByteArray(bytes: js.Array[_]): typings.ipAddress.ipv6Mod.Address6 = js.native
    
    @JSImport("ip-address", "Address6.isValid")
    @js.native
    def isValid(address: String): Boolean = js.native
  }
  
  object v6 {
    
    @JSImport("ip-address", "v6")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ip-address", "v6.helpers")
    @js.native
    def helpers: Typeofhelpers = js.native
    @scala.inline
    def helpers_=(x: Typeofhelpers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("helpers")(x.asInstanceOf[js.Any])
  }
}
