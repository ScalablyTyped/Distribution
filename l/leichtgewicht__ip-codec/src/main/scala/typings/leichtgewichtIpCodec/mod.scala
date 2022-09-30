package typings.leichtgewichtIpCodec

import typings.leichtgewichtIpCodec.leichtgewichtIpCodecInts.`16`
import typings.leichtgewichtIpCodec.leichtgewichtIpCodecInts.`1`
import typings.leichtgewichtIpCodec.leichtgewichtIpCodecInts.`2`
import typings.leichtgewichtIpCodec.leichtgewichtIpCodecInts.`4`
import typings.leichtgewichtIpCodec.leichtgewichtIpCodecStrings.ip
import typings.leichtgewichtIpCodec.leichtgewichtIpCodecStrings.ipv4
import typings.leichtgewichtIpCodec.leichtgewichtIpCodecStrings.ipv6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@leichtgewicht/ip-codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(ip: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(ip: js.typedarray.Uint8Array, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(ip.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(ip: js.typedarray.Uint8Array, offset: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(ip.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(ip: js.typedarray.Uint8Array, offset: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(ip.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(ip: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ip.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: TIn): TIn = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ip.asInstanceOf[js.Any], buff.asInstanceOf[js.Any])).asInstanceOf[TIn]
  inline def encode[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: TIn, offset: Double): TIn = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ip.asInstanceOf[js.Any], buff.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TIn]
  inline def encode[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: js.Function1[/* size */ Double, TIn]): TIn = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ip.asInstanceOf[js.Any], buff.asInstanceOf[js.Any])).asInstanceOf[TIn]
  inline def encode[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: js.Function1[/* size */ Double, TIn], offset: Double): TIn = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ip.asInstanceOf[js.Any], buff.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TIn]
  
  inline def familyOf(ip: String): `1` | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("familyOf")(ip.asInstanceOf[js.Any]).asInstanceOf[`1` | `2`]
  
  @JSImport("@leichtgewicht/ip-codec", "name")
  @js.native
  val name: ip = js.native
  
  inline def sizeOf(ip: String): `4` | `16` = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeOf")(ip.asInstanceOf[js.Any]).asInstanceOf[`4` | `16`]
  
  @JSImport("@leichtgewicht/ip-codec", "v4")
  @js.native
  val v4: Codec[ipv4, `4`] = js.native
  
  @JSImport("@leichtgewicht/ip-codec", "v6")
  @js.native
  val v6: Codec[ipv6, `16`] = js.native
  
  trait Codec[TName /* <: String */, TSize /* <: Double */] extends StObject {
    
    def decode(ip: js.typedarray.Uint8Array): String
    def decode(ip: js.typedarray.Uint8Array, offset: Double): String
    @JSName("decode")
    var decode_Original: Decoder
    
    def encode(ip: String): js.typedarray.Uint8Array
    def encode[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: TIn): TIn
    def encode[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: TIn, offset: Double): TIn
    @JSName("encode")
    var encode_Original: Encoder
    
    def isFormat(ip: String): Boolean
    
    var name: TName
    
    var size: TSize
  }
  object Codec {
    
    inline def apply[TName /* <: String */, TSize /* <: Double */](
      decode: (/* ip */ js.typedarray.Uint8Array, /* offset */ js.UndefOr[Double]) => String,
      encode: Encoder,
      isFormat: String => Boolean,
      name: TName,
      size: TSize
    ): Codec[TName, TSize] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = encode.asInstanceOf[js.Any], isFormat = js.Any.fromFunction1(isFormat), name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codec[TName, TSize]]
    }
    
    extension [Self <: Codec[?, ?], TName /* <: String */, TSize /* <: Double */](x: Self & (Codec[TName, TSize])) {
      
      inline def setDecode(value: (/* ip */ js.typedarray.Uint8Array, /* offset */ js.UndefOr[Double]) => String): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setEncode(value: Encoder): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setIsFormat(value: String => Boolean): Self = StObject.set(x, "isFormat", js.Any.fromFunction1(value))
      
      inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: TSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type Decoder = js.Function2[/* ip */ js.typedarray.Uint8Array, /* offset */ js.UndefOr[Double], String]
  
  @js.native
  trait Encoder extends StObject {
    
    def apply(ip: String): js.typedarray.Uint8Array = js.native
    def apply[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: TIn): TIn = js.native
    def apply[TIn /* <: js.typedarray.Uint8Array */](ip: String, buff: TIn, offset: Double): TIn = js.native
  }
}
