package typings.ipaddrJs

import org.scalablytyped.runtime.StringDictionary
import typings.ipaddrJs.ipaddrJsStrings.ipv4
import typings.ipaddrJs.ipaddrJsStrings.ipv6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipaddr.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipaddr.js", "IPv4")
  @js.native
  open class IPv4 protected ()
    extends StObject
       with IP {
    def this(octets: js.Array[Double]) = this()
    
    def kind(): ipv4 = js.native
    
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double]): Boolean = js.native
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double], bits: Double): Boolean = js.native
    def `match`(what: IPv4): Boolean = js.native
    def `match`(what: IPv4, bits: Double): Boolean = js.native
    def `match`(what: IPv6): Boolean = js.native
    def `match`(what: IPv6, bits: Double): Boolean = js.native
    
    var octets: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def prefixLengthFromSubnetMask(): Double | Null = js.native
    
    def range(): IPv4Range = js.native
    
    def subnetMatch(rangeList: RangeList[IPv4]): String = js.native
    def subnetMatch(rangeList: RangeList[IPv4], defaultName: String): String = js.native
    
    /* CompleteClass */
    override def toByteArray(): js.Array[Double] = js.native
    
    def toIPv4MappedAddress(): IPv6 = js.native
    
    /* CompleteClass */
    override def toNormalizedString(): String = js.native
  }
  /* static members */
  object IPv4 {
    
    @JSImport("ipaddr.js", "IPv4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def broadcastAddressFromCIDR(addr: String): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4]
    
    inline def isIPv4(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValid(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidFourPartDecimal(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFourPartDecimal")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def networkAddressFromCIDR(addr: String): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("networkAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4]
    
    inline def parse(addr: String): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4]
    
    inline def parseCIDR(addr: String): js.Tuple2[IPv4, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[IPv4, Double]]
    
    inline def subnetMaskFromPrefixLength(prefix: Double): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("subnetMaskFromPrefixLength")(prefix.asInstanceOf[js.Any]).asInstanceOf[IPv4]
  }
  
  @JSImport("ipaddr.js", "IPv6")
  @js.native
  open class IPv6 protected ()
    extends StObject
       with IP {
    def this(parts: js.Array[Double]) = this()
    
    def isIPv4MappedAddress(): Boolean = js.native
    
    def kind(): ipv6 = js.native
    
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double]): Boolean = js.native
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double], bits: Double): Boolean = js.native
    def `match`(what: IPv4): Boolean = js.native
    def `match`(what: IPv4, bits: Double): Boolean = js.native
    def `match`(what: IPv6): Boolean = js.native
    def `match`(what: IPv6, bits: Double): Boolean = js.native
    
    var parts: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def prefixLengthFromSubnetMask(): Double | Null = js.native
    
    def range(): IPv6Range = js.native
    
    def subnetMatch(rangeList: RangeList[IPv6]): String = js.native
    def subnetMatch(rangeList: RangeList[IPv6], defaultName: String): String = js.native
    
    /* CompleteClass */
    override def toByteArray(): js.Array[Double] = js.native
    
    def toIPv4Address(): IPv4 = js.native
    
    /* CompleteClass */
    override def toNormalizedString(): String = js.native
    
    def toRFC5952String(): String = js.native
    
    var zoneId: js.UndefOr[String] = js.native
  }
  /* static members */
  object IPv6 {
    
    @JSImport("ipaddr.js", "IPv6")
    @js.native
    val ^ : js.Any = js.native
    
    inline def broadcastAddressFromCIDR(addr: String): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv6]
    
    inline def isIPv6(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValid(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def networkAddressFromCIDR(addr: String): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("networkAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv6]
    
    inline def parse(addr: String): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv6]
    
    inline def parseCIDR(addr: String): js.Tuple2[IPv6, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[IPv6, Double]]
    
    inline def subnetMaskFromPrefixLength(prefix: Double): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("subnetMaskFromPrefixLength")(prefix.asInstanceOf[js.Any]).asInstanceOf[IPv6]
  }
  
  inline def fromByteArray(bytes: js.Array[Double]): IPv4 | IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromByteArray")(bytes.asInstanceOf[js.Any]).asInstanceOf[IPv4 | IPv6]
  
  inline def isValid(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(addr: String): IPv4 | IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4 | IPv6]
  
  inline def parseCIDR(mask: String): js.Tuple2[IPv4 | IPv6, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCIDR")(mask.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[IPv4 | IPv6, Double]]
  
  inline def process(addr: String): IPv4 | IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4 | IPv6]
  
  inline def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4 | IPv6]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4 | IPv6], defaultName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any], defaultName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def subnetMatch(addr: IPv6, rangeList: RangeList[IPv4 | IPv6]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def subnetMatch(addr: IPv6, rangeList: RangeList[IPv4 | IPv6], defaultName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any], defaultName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  // Common methods/properties for IPv4 and IPv6 classes.
  trait IP extends StObject {
    
    def prefixLengthFromSubnetMask(): Double | Null
    
    def toByteArray(): js.Array[Double]
    
    def toNormalizedString(): String
  }
  object IP {
    
    inline def apply(
      prefixLengthFromSubnetMask: () => Double | Null,
      toByteArray: () => js.Array[Double],
      toNormalizedString: () => String
    ): IP = {
      val __obj = js.Dynamic.literal(prefixLengthFromSubnetMask = js.Any.fromFunction0(prefixLengthFromSubnetMask), toByteArray = js.Any.fromFunction0(toByteArray), toNormalizedString = js.Any.fromFunction0(toNormalizedString))
      __obj.asInstanceOf[IP]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IP] (val x: Self) extends AnyVal {
      
      inline def setPrefixLengthFromSubnetMask(value: () => Double | Null): Self = StObject.set(x, "prefixLengthFromSubnetMask", js.Any.fromFunction0(value))
      
      inline def setToByteArray(value: () => js.Array[Double]): Self = StObject.set(x, "toByteArray", js.Any.fromFunction0(value))
      
      inline def setToNormalizedString(value: () => String): Self = StObject.set(x, "toNormalizedString", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipaddrJs.ipaddrJsStrings.broadcast
    - typings.ipaddrJs.ipaddrJsStrings.carrierGradeNat
    - typings.ipaddrJs.ipaddrJsStrings.`private`
    - typings.ipaddrJs.ipaddrJsStrings.unicast
    - typings.ipaddrJs.ipaddrJsStrings.unspecified
    - typings.ipaddrJs.ipaddrJsStrings.multicast
    - typings.ipaddrJs.ipaddrJsStrings.linkLocal
    - typings.ipaddrJs.ipaddrJsStrings.loopback
    - typings.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPv4Range extends StObject
  object IPv4Range {
    
    inline def broadcast: typings.ipaddrJs.ipaddrJsStrings.broadcast = "broadcast".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.broadcast]
    
    inline def carrierGradeNat: typings.ipaddrJs.ipaddrJsStrings.carrierGradeNat = "carrierGradeNat".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.carrierGradeNat]
    
    inline def linkLocal: typings.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    inline def loopback: typings.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.loopback]
    
    inline def multicast: typings.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.multicast]
    
    inline def `private`: typings.ipaddrJs.ipaddrJsStrings.`private` = "private".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.`private`]
    
    inline def reserved: typings.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.reserved]
    
    inline def unicast: typings.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.unicast]
    
    inline def unspecified: typings.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipaddrJs.ipaddrJsStrings.uniqueLocal
    - typings.ipaddrJs.ipaddrJsStrings.ipv4Mapped
    - typings.ipaddrJs.ipaddrJsStrings.rfc6145
    - typings.ipaddrJs.ipaddrJsStrings.rfc6052
    - typings.ipaddrJs.ipaddrJsStrings.`6to4`
    - typings.ipaddrJs.ipaddrJsStrings.teredo
    - typings.ipaddrJs.ipaddrJsStrings.unicast
    - typings.ipaddrJs.ipaddrJsStrings.unspecified
    - typings.ipaddrJs.ipaddrJsStrings.multicast
    - typings.ipaddrJs.ipaddrJsStrings.linkLocal
    - typings.ipaddrJs.ipaddrJsStrings.loopback
    - typings.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPv6Range extends StObject
  object IPv6Range {
    
    inline def `6to4`: typings.ipaddrJs.ipaddrJsStrings.`6to4` = "6to4".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.`6to4`]
    
    inline def ipv4Mapped: typings.ipaddrJs.ipaddrJsStrings.ipv4Mapped = "ipv4Mapped".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.ipv4Mapped]
    
    inline def linkLocal: typings.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    inline def loopback: typings.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.loopback]
    
    inline def multicast: typings.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.multicast]
    
    inline def reserved: typings.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.reserved]
    
    inline def rfc6052: typings.ipaddrJs.ipaddrJsStrings.rfc6052 = "rfc6052".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.rfc6052]
    
    inline def rfc6145: typings.ipaddrJs.ipaddrJsStrings.rfc6145 = "rfc6145".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.rfc6145]
    
    inline def teredo: typings.ipaddrJs.ipaddrJsStrings.teredo = "teredo".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.teredo]
    
    inline def unicast: typings.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.unicast]
    
    inline def uniqueLocal: typings.ipaddrJs.ipaddrJsStrings.uniqueLocal = "uniqueLocal".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.uniqueLocal]
    
    inline def unspecified: typings.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipaddrJs.ipaddrJsStrings.unicast
    - typings.ipaddrJs.ipaddrJsStrings.unspecified
    - typings.ipaddrJs.ipaddrJsStrings.multicast
    - typings.ipaddrJs.ipaddrJsStrings.linkLocal
    - typings.ipaddrJs.ipaddrJsStrings.loopback
    - typings.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPvXRangeDefaults extends StObject
  object IPvXRangeDefaults {
    
    inline def linkLocal: typings.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    inline def loopback: typings.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.loopback]
    
    inline def multicast: typings.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.multicast]
    
    inline def reserved: typings.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.reserved]
    
    inline def unicast: typings.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.unicast]
    
    inline def unspecified: typings.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typings.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  type RangeList[T] = StringDictionary[(js.Tuple2[T, Double]) | (js.Array[js.Tuple2[T, Double]])]
}
