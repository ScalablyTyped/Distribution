package typings.ip6addr

import typings.ip6addr.ip6addrStrings.`v4-mapped`
import typings.ip6addr.ip6addrStrings.auto
import typings.ip6addr.ip6addrStrings.ipv4
import typings.ip6addr.ip6addrStrings.ipv6
import typings.ip6addr.ip6addrStrings.v4
import typings.ip6addr.ip6addrStrings.v6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip6addr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(addr1: String, addr2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(addr1.asInstanceOf[js.Any], addr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compare(addr1: String, addr2: Addr): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(addr1.asInstanceOf[js.Any], addr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compare(addr1: Addr, addr2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(addr1.asInstanceOf[js.Any], addr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compare(addr1: Addr, addr2: Addr): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(addr1.asInstanceOf[js.Any], addr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareCIDR(cidr1: String, cidr2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareCIDR")(cidr1.asInstanceOf[js.Any], cidr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareCIDR(cidr1: String, cidr2: CIDR): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareCIDR")(cidr1.asInstanceOf[js.Any], cidr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareCIDR(cidr1: CIDR, cidr2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareCIDR")(cidr1.asInstanceOf[js.Any], cidr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareCIDR(cidr1: CIDR, cidr2: CIDR): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareCIDR")(cidr1.asInstanceOf[js.Any], cidr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createAddrRange(begin: String, end: String): AddrRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddrRange")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AddrRange]
  inline def createAddrRange(begin: String, end: Addr): AddrRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddrRange")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AddrRange]
  inline def createAddrRange(begin: Addr, end: String): AddrRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddrRange")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AddrRange]
  inline def createAddrRange(begin: Addr, end: Addr): AddrRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddrRange")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AddrRange]
  
  inline def createCIDR(addr: String): CIDR = ^.asInstanceOf[js.Dynamic].applyDynamic("createCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[CIDR]
  inline def createCIDR(addr: String, len: Double): CIDR = (^.asInstanceOf[js.Dynamic].applyDynamic("createCIDR")(addr.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[CIDR]
  inline def createCIDR(addr: Addr): CIDR = ^.asInstanceOf[js.Dynamic].applyDynamic("createCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[CIDR]
  inline def createCIDR(addr: Addr, len: Double): CIDR = (^.asInstanceOf[js.Dynamic].applyDynamic("createCIDR")(addr.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[CIDR]
  
  inline def parse(input: String): Addr = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Addr]
  inline def parse(input: Double): Addr = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Addr]
  inline def parse(input: Addr): Addr = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Addr]
  
  @js.native
  trait Addr extends StObject {
    
    def and(input: String): Addr = js.native
    def and(input: Addr): Addr = js.native
    
    def compare(other: String): Double = js.native
    def compare(other: Addr): Double = js.native
    
    def kind(): ipv4 | ipv6 = js.native
    
    def not(): Addr = js.native
    
    def offset(num: Double): Addr | Null = js.native
    
    def or(input: String): Addr = js.native
    def or(input: Addr): Addr = js.native
    
    def toBuffer(): js.typedarray.Uint8Array = js.native
    def toBuffer(buff: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def toLong(): Double = js.native
    
    def toString(opts: ToStringOpts): String = js.native
  }
  
  @js.native
  trait AddrRange extends StObject {
    
    def contains(input: String): Boolean = js.native
    def contains(input: Addr): Boolean = js.native
    
    def first(): Addr = js.native
    
    def last(): Addr = js.native
  }
  
  @js.native
  trait CIDR
    extends StObject
       with AddrRange {
    
    def address(): Addr = js.native
    
    def broadcast(): Addr = js.native
    
    def compare(other: String): Double = js.native
    def compare(other: CIDR): Double = js.native
    
    def prefixLength(): Double = js.native
    def prefixLength(format: auto | v4 | v6): Double = js.native
    
    def toString(opts: ToStringOpts): String = js.native
  }
  
  trait ToStringOpts extends StObject {
    
    var format: js.UndefOr[auto | v4 | `v4-mapped` | v6] = js.undefined
    
    var zeroElide: js.UndefOr[Boolean] = js.undefined
    
    var zeroPad: js.UndefOr[Boolean] = js.undefined
  }
  object ToStringOpts {
    
    inline def apply(): ToStringOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToStringOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToStringOpts] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: auto | v4 | `v4-mapped` | v6): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setZeroElide(value: Boolean): Self = StObject.set(x, "zeroElide", value.asInstanceOf[js.Any])
      
      inline def setZeroElideUndefined: Self = StObject.set(x, "zeroElide", js.undefined)
      
      inline def setZeroPad(value: Boolean): Self = StObject.set(x, "zeroPad", value.asInstanceOf[js.Any])
      
      inline def setZeroPadUndefined: Self = StObject.set(x, "zeroPad", js.undefined)
    }
  }
}
