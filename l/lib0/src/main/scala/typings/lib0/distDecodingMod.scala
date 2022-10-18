package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecodingMod {
  
  @JSImport("lib0/dist/decoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/dist/decoding", "Decoder")
  @js.native
  open class Decoder protected () extends StObject {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
    
    /**
      * Decoding target.
      *
      * @type {Uint8Array}
      */
    var arr: js.typedarray.Uint8Array = js.native
    
    /**
      * Current decoding position.
      *
      * @type {number}
      */
    var pos: Double = js.native
  }
  
  @JSImport("lib0/dist/decoding", "IncUintOptRleDecoder")
  @js.native
  open class IncUintOptRleDecoder protected () extends Decoder {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
    
    var count: Double = js.native
    
    def read(): Double = js.native
    
    /**
      * @type {number}
      */
    var s: Double = js.native
  }
  
  @JSImport("lib0/dist/decoding", "IntDiffDecoder")
  @js.native
  open class IntDiffDecoder protected () extends Decoder {
    /**
      * @param {Uint8Array} uint8Array
      * @param {number} start
      */
    def this(uint8Array: js.typedarray.Uint8Array, start: Double) = this()
    
    /**
      * @return {number}
      */
    def read(): Double = js.native
    
    /**
      * Current state
      * @type {number}
      */
    var s: Double = js.native
  }
  
  @JSImport("lib0/dist/decoding", "IntDiffOptRleDecoder")
  @js.native
  open class IntDiffOptRleDecoder protected () extends Decoder {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
    
    var count: Double = js.native
    
    var diff: Double = js.native
    
    /**
      * @return {number}
      */
    def read(): Double = js.native
    
    /**
      * @type {number}
      */
    var s: Double = js.native
  }
  
  @JSImport("lib0/dist/decoding", "RleDecoder")
  @js.native
  open class RleDecoder[T] protected () extends Decoder {
    /**
      * @param {Uint8Array} uint8Array
      * @param {function(Decoder):T} reader
      */
    def this(uint8Array: js.typedarray.Uint8Array, reader: js.Function1[/* arg0 */ Decoder, T]) = this()
    
    var count: Double = js.native
    
    def read(): T = js.native
    
    /**
      * The reader
      */
    def reader(arg0: Decoder): T = js.native
    
    /**
      * Current state
      * @type {T|null}
      */
    var s: T | Null = js.native
  }
  
  @JSImport("lib0/dist/decoding", "RleIntDiffDecoder")
  @js.native
  open class RleIntDiffDecoder protected () extends Decoder {
    /**
      * @param {Uint8Array} uint8Array
      * @param {number} start
      */
    def this(uint8Array: js.typedarray.Uint8Array, start: Double) = this()
    
    var count: Double = js.native
    
    /**
      * @return {number}
      */
    def read(): Double = js.native
    
    /**
      * Current state
      * @type {number}
      */
    var s: Double = js.native
  }
  
  @JSImport("lib0/dist/decoding", "StringDecoder")
  @js.native
  open class StringDecoder protected () extends StObject {
    /**
      * @param {Uint8Array} uint8Array
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
    
    var decoder: UintOptRleDecoder = js.native
    
    /**
      * @return {string}
      */
    def read(): String = js.native
    
    /**
      * @type {number}
      */
    var spos: Double = js.native
    
    var str: String = js.native
  }
  
  @JSImport("lib0/dist/decoding", "UintOptRleDecoder")
  @js.native
  open class UintOptRleDecoder protected () extends Decoder {
    /**
      * @param {Uint8Array} uint8Array Binary data to decode
      */
    def this(uint8Array: js.typedarray.Uint8Array) = this()
    
    var count: Double = js.native
    
    def read(): Double = js.native
    
    /**
      * @type {number}
      */
    var s: Double = js.native
  }
  
  inline def clone_(decoder: Decoder): Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(decoder.asInstanceOf[js.Any]).asInstanceOf[Decoder]
  inline def clone_(decoder: Decoder, newPos: Double): Decoder = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(decoder.asInstanceOf[js.Any], newPos.asInstanceOf[js.Any])).asInstanceOf[Decoder]
  
  inline def createDecoder(uint8Array: js.typedarray.Uint8Array): Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoder")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[Decoder]
  
  inline def hasContent(decoder: Decoder): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasContent")(decoder.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def peekUint16(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekUint16")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekUint32(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekUint32")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekUint8(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekUint8")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekVarInt(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekVarInt")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def peekVarString(decoder: Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("peekVarString")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def peekVarUint(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("peekVarUint")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readAny(decoder: Decoder): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readBigInt64(decoder: Decoder): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readBigInt64")(decoder.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readBigUint64(decoder: Decoder): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readBigUint64")(decoder.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readFloat32(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readFloat32")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readFloat64(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readFloat64")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readFromDataView(decoder: Decoder, len: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("readFromDataView")(decoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def readTailAsUint8Array(decoder: Decoder): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("readTailAsUint8Array")(decoder.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readUint16(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint16")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint32(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint32")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint32BigEndian(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint32BigEndian")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint8(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUint8")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readUint8Array(decoder: Decoder, len: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("readUint8Array")(decoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readVarInt(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarInt")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readVarString(decoder: Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarString")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readVarStringNative(decoder: Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_readVarStringNative")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readVarStringPolyfill(decoder: Decoder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_readVarStringPolyfill")(decoder.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readVarUint(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarUint")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def readVarUint8Array(decoder: Decoder): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("readVarUint8Array")(decoder.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def skip8(decoder: Decoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("skip8")(decoder.asInstanceOf[js.Any]).asInstanceOf[Double]
}
