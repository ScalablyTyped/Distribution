package typings.lib0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoding {
  
  @JSImport("lib0", "decoding")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0", "decoding.Decoder")
  @js.native
  open class Decoder protected ()
    extends typings.lib0.decodingMod.Decoder {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("lib0", "decoding.IncUintOptRleDecoder")
  @js.native
  open class IncUintOptRleDecoder protected ()
    extends typings.lib0.decodingMod.IncUintOptRleDecoder {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("lib0", "decoding.IntDiffDecoder")
  @js.native
  open class IntDiffDecoder protected ()
    extends typings.lib0.decodingMod.IntDiffDecoder {
    /**
      * @param {Uint8Array} uint8Array
      * @param {number} start
      */
    def this(uint8Array: js.typedarray.Uint8Array, start: Double) = this()
  }
  
  @JSImport("lib0", "decoding.IntDiffOptRleDecoder")
  @js.native
  open class IntDiffOptRleDecoder protected ()
    extends typings.lib0.decodingMod.IntDiffOptRleDecoder {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("lib0", "decoding.RleDecoder")
  @js.native
  open class RleDecoder[T] protected ()
    extends typings.lib0.decodingMod.RleDecoder[T] {
    /**
      * @param {Uint8Array} uint8Array
      * @param {function(Decoder):T} reader
      */
    def this(
      uint8Array: js.typedarray.Uint8Array,
      reader: js.Function1[/* arg0 */ typings.lib0.decodingMod.Decoder, T]
    ) = this()
  }
  
  @JSImport("lib0", "decoding.RleIntDiffDecoder")
  @js.native
  open class RleIntDiffDecoder protected ()
    extends typings.lib0.decodingMod.RleIntDiffDecoder {
    /**
      * @param {Uint8Array} uint8Array
      * @param {number} start
      */
    def this(uint8Array: js.typedarray.Uint8Array, start: Double) = this()
  }
  
  @JSImport("lib0", "decoding.StringDecoder")
  @js.native
  open class StringDecoder protected ()
    extends typings.lib0.decodingMod.StringDecoder {
    /**
      * @param {Uint8Array} uint8Array
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("lib0", "decoding.UintOptRleDecoder")
  @js.native
  open class UintOptRleDecoder protected ()
    extends typings.lib0.decodingMod.UintOptRleDecoder {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
  }
  
  inline def clone_(decoder: typings.lib0.decodingMod.Decoder): typings.lib0.decodingMod.Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.lib0.decodingMod.Decoder]
  inline def clone_(decoder: typings.lib0.decodingMod.Decoder, newPos: Double): typings.lib0.decodingMod.Decoder = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(decoder.asInstanceOf[js.Any], newPos.asInstanceOf[js.Any])).asInstanceOf[typings.lib0.decodingMod.Decoder]
  
  inline def createDecoder(uint8Array: js.typedarray.Uint8Array): typings.lib0.decodingMod.Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoder")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[typings.lib0.decodingMod.Decoder]
  
  inline def hasContent(decoder: typings.lib0.decodingMod.Decoder): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasContent")(decoder.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def peekUint16(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekUint16")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekUint32(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekUint32")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekUint8(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekUint8")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekVarInt(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekVarInt")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekVarString(decoder: typings.lib0.decodingMod.Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("peekVarString")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def peekVarUint(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekVarUint")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readAny(decoder: typings.lib0.decodingMod.Decoder): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readBigInt64(decoder: typings.lib0.decodingMod.Decoder): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readBigInt64")(decoder.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readBigUint64(decoder: typings.lib0.decodingMod.Decoder): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readBigUint64")(decoder.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readFloat32(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readFloat32")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readFloat64(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readFloat64")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readFromDataView(decoder: typings.lib0.decodingMod.Decoder, len: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("readFromDataView")(decoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def readTailAsUint8Array(decoder: typings.lib0.decodingMod.Decoder): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("readTailAsUint8Array")(decoder.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readUint16(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint16")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint32(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint32")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint32BigEndian(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint32BigEndian")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint8(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint8")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint8Array(decoder: typings.lib0.decodingMod.Decoder, len: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("readUint8Array")(decoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readVarInt(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarInt")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readVarString(decoder: typings.lib0.decodingMod.Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarString")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readVarStringNative(decoder: typings.lib0.decodingMod.Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_readVarStringNative")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readVarStringPolyfill(decoder: typings.lib0.decodingMod.Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_readVarStringPolyfill")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readVarUint(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarUint")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readVarUint8Array(decoder: typings.lib0.decodingMod.Decoder): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarUint8Array")(decoder.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def skip8(decoder: typings.lib0.decodingMod.Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("skip8")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
}
