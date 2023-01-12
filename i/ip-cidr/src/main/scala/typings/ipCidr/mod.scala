package typings.ipCidr

import typings.ipAddress.mod.Address4
import typings.ipAddress.mod.Address6
import typings.ipCidr.anon.End
import typings.ipCidr.ipCidrStrings.addressObject
import typings.ipCidr.ipCidrStrings.bigInteger
import typings.jsbn.mod.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip-cidr", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IPCIDR {
    def this(cidr: String) = this()
  }
  @JSImport("ip-cidr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAddress(address: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("createAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Address]
  
  inline def formatIP[T](address: Address): T = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIP")(address.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def formatIP[T](address: Address, options: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIP")(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isValidAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidCIDR(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCIDR")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Address = Address4 | Address6
  
  trait ChunkInfo extends StObject {
    
    var from: BigInteger
    
    var length: BigInteger
    
    var limit: BigInteger
    
    var to: BigInteger
  }
  object ChunkInfo {
    
    inline def apply(from: BigInteger, length: BigInteger, limit: BigInteger, to: BigInteger): ChunkInfo = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChunkInfo] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: BigInteger): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setLength(value: BigInteger): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: BigInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setTo(value: BigInteger): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatOptions extends StObject {
    
    var from: js.UndefOr[String | Double | BigInteger] = js.undefined
    
    var limit: js.UndefOr[Double | BigInteger] = js.undefined
    
    var to: js.UndefOr[String | Double | BigInteger] = js.undefined
    
    var `type`: js.UndefOr[bigInteger | addressObject] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String | Double | BigInteger): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double | BigInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setTo(value: String | Double | BigInteger): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: bigInteger | addressObject): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type FormatResult = BigInteger | Address | String
  
  @js.native
  trait IPCIDR extends StObject {
    
    var address: Address = js.native
    
    var addressEnd: Address = js.native
    
    var addressStart: Address = js.native
    
    var cidr: String = js.native
    
    def contains(address: String): Boolean = js.native
    def contains(address: Address): Boolean = js.native
    def contains(address: BigInteger): Boolean = js.native
    
    def end[T](): T = js.native
    def end[T](options: FormatOptions): T = js.native
    
    def getChunkInfo(length: Double, options: FormatOptions): ChunkInfo = js.native
    
    def loop[T, R](fn: js.Function1[/* ip */ T, js.Promise[R]], options: FormatOptions): js.Array[js.Promise[R]] = js.native
    def loop[T, R](fn: js.Function1[/* ip */ T, js.Promise[R]], options: FormatOptions, results: ChunkInfo): js.Array[js.Promise[R]] = js.native
    
    var size: BigInteger = js.native
    
    def start[T](): T = js.native
    def start[T](options: FormatOptions): T = js.native
    
    def toArray(): js.Array[String] = js.native
    
    def toObject(): End = js.native
    
    def toRange[T](): js.Tuple2[T, T] = js.native
    def toRange[T](options: FormatOptions): js.Tuple2[T, T] = js.native
  }
}
