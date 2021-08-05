package typings.ip6addr

import typings.ip6addr.ip6addrStrings.`v4-mapped`
import typings.ip6addr.ip6addrStrings.auto
import typings.ip6addr.ip6addrStrings.ipv4
import typings.ip6addr.ip6addrStrings.ipv6
import typings.ip6addr.ip6addrStrings.v4
import typings.ip6addr.ip6addrStrings.v6
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip6addr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(addr1: String, addr2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(addr1.asInstanceOf[js.Any], addr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareCIDR(cidr1: String, cidr2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareCIDR")(cidr1.asInstanceOf[js.Any], cidr2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createAddrRange(begin: String, end: String): AddrRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddrRange")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AddrRange]
  
  inline def createCIDR(addr: String): CIDR = ^.asInstanceOf[js.Dynamic].applyDynamic("createCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[CIDR]
  inline def createCIDR(addr: String, len: Double): CIDR = (^.asInstanceOf[js.Dynamic].applyDynamic("createCIDR")(addr.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[CIDR]
  
  inline def parse(input: String): Addr = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Addr]
  
  @js.native
  trait Addr extends StObject {
    
    def compare(other: Addr): Double = js.native
    
    def kind(): ipv4 | ipv6 = js.native
    
    def offset(num: Double): Addr | Null = js.native
    
    def toBuffer(): Uint8Array = js.native
    def toBuffer(buff: Uint8Array): Uint8Array = js.native
    
    def toLong(): Double = js.native
    
    def toString(opts: ToStringOpts): String = js.native
  }
  
  trait AddrRange extends StObject {
    
    def contains(input: String): Boolean
    
    def first(): Addr
    
    def last(): Addr
  }
  object AddrRange {
    
    inline def apply(contains: String => Boolean, first: () => Addr, last: () => Addr): AddrRange = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last))
      __obj.asInstanceOf[AddrRange]
    }
    
    extension [Self <: AddrRange](x: Self) {
      
      inline def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => Addr): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => Addr): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CIDR extends StObject {
    
    def address(): Addr = js.native
    
    def broadcast(): Addr = js.native
    
    def compare(other: CIDR): Double = js.native
    
    def contains(input: String): Boolean = js.native
    
    def first(): Addr = js.native
    
    def last(): Addr = js.native
    
    def prefixLength(): Double = js.native
    
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
    
    extension [Self <: ToStringOpts](x: Self) {
      
      inline def setFormat(value: auto | v4 | `v4-mapped` | v6): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setZeroElide(value: Boolean): Self = StObject.set(x, "zeroElide", value.asInstanceOf[js.Any])
      
      inline def setZeroElideUndefined: Self = StObject.set(x, "zeroElide", js.undefined)
      
      inline def setZeroPad(value: Boolean): Self = StObject.set(x, "zeroPad", value.asInstanceOf[js.Any])
      
      inline def setZeroPadUndefined: Self = StObject.set(x, "zeroPad", js.undefined)
    }
  }
}
