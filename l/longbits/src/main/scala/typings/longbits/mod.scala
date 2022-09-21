package typings.longbits

import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("longbits", "LongBits")
  @js.native
  open class LongBits () extends StObject {
    def this(hi: Double) = this()
    def this(hi: Double, lo: Double) = this()
    def this(hi: Unit, lo: Double) = this()
    
    var hi: Double = js.native
    
    var lo: Double = js.native
    
    /**
      * Returns these hi/lo bits as a BigInt
      */
    def toBigInt(): js.BigInt = js.native
    def toBigInt(unsigned: Boolean): js.BigInt = js.native
    
    def toBytes(buf: js.typedarray.Uint8Array): Unit = js.native
    def toBytes(buf: js.typedarray.Uint8Array, offset: Double): Unit = js.native
    /**
      * Encode a LongBits object as a varint byte array
      */
    def toBytes(buf: Uint8ArrayList): Unit = js.native
    def toBytes(buf: Uint8ArrayList, offset: Double): Unit = js.native
    
    /**
      * Returns these hi/lo bits as a Number - this may overflow, toBigInt
      * should be preferred
      */
    def toNumber(): Double = js.native
    def toNumber(unsigned: Boolean): Double = js.native
    
    /**
      * ZigZag decode a LongBits object
      */
    def zzDecode(): LongBits = js.native
    
    /**
      * ZigZag encode a LongBits object
      */
    def zzEncode(): LongBits = js.native
  }
  /* static members */
  object LongBits {
    
    @JSImport("longbits", "LongBits")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a LongBits object from a BigInt
      */
    inline def fromBigInt(value: js.BigInt): LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[LongBits]
    
    inline def fromBytes(buf: js.typedarray.Uint8Array): LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[LongBits]
    inline def fromBytes(buf: js.typedarray.Uint8Array, offset: Double): LongBits = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LongBits]
    /**
      * Parse a LongBits object from a varint byte array
      */
    inline def fromBytes(buf: Uint8ArrayList): LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[LongBits]
    inline def fromBytes(buf: Uint8ArrayList, offset: Double): LongBits = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LongBits]
    
    /**
      * Parse a LongBits object from a Number
      */
    inline def fromNumber(value: Double): LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[LongBits]
  }
}
