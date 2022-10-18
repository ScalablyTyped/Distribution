package typings.lib0

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("lib0/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/encoding", "Encoder")
  @js.native
  open class Encoder () extends StObject {
    
    /**
      * @type {Array<Uint8Array>}
      */
    var bufs: js.Array[js.typedarray.Uint8Array] = js.native
    
    var cbuf: js.typedarray.Uint8Array = js.native
    
    var cpos: Double = js.native
  }
  
  @JSImport("lib0/encoding", "IncUintOptRleEncoder")
  @js.native
  open class IncUintOptRleEncoder () extends StObject {
    
    var count: Double = js.native
    
    var encoder: Encoder = js.native
    
    /**
      * @type {number}
      */
    var s: Double = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {number} v
      */
    def write(v: Double): Unit = js.native
  }
  
  @JSImport("lib0/encoding", "IntDiffEncoder")
  @js.native
  open class IntDiffEncoder protected () extends Encoder {
    /**
      * @param {number} start
      */
    def this(start: Double) = this()
    
    /**
      * Current state
      * @type {number}
      */
    var s: Double = js.native
    
    /**
      * @param {number} v
      */
    def write(v: Double): Unit = js.native
  }
  
  @JSImport("lib0/encoding", "IntDiffOptRleEncoder")
  @js.native
  open class IntDiffOptRleEncoder () extends StObject {
    
    var count: Double = js.native
    
    var diff: Double = js.native
    
    var encoder: Encoder = js.native
    
    /**
      * @type {number}
      */
    var s: Double = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {number} v
      */
    def write(v: Double): Unit = js.native
  }
  
  @JSImport("lib0/encoding", "RleEncoder")
  @js.native
  open class RleEncoder[T] protected () extends Encoder {
    /**
      * @param {function(Encoder, T):void} writer
      */
    def this(writer: js.Function2[/* arg0 */ Encoder, /* arg1 */ T, Unit]) = this()
    
    var count: Double = js.native
    
    /**
      * Current state
      * @type {T|null}
      */
    var s: T | Null = js.native
    
    /**
      * The writer
      */
    def w(arg0: Encoder, arg1: T): Unit = js.native
    
    /**
      * @param {T} v
      */
    def write(v: T): Unit = js.native
  }
  
  @JSImport("lib0/encoding", "RleIntDiffEncoder")
  @js.native
  open class RleIntDiffEncoder protected () extends Encoder {
    /**
      * @param {number} start
      */
    def this(start: Double) = this()
    
    var count: Double = js.native
    
    /**
      * Current state
      * @type {number}
      */
    var s: Double = js.native
    
    /**
      * @param {number} v
      */
    def write(v: Double): Unit = js.native
  }
  
  @JSImport("lib0/encoding", "StringEncoder")
  @js.native
  open class StringEncoder () extends StObject {
    
    var lensE: UintOptRleEncoder = js.native
    
    var s: String = js.native
    
    /**
      * @type {Array<string>}
      */
    var sarr: js.Array[String] = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {string} string
      */
    def write(string: String): Unit = js.native
  }
  
  @JSImport("lib0/encoding", "UintOptRleEncoder")
  @js.native
  open class UintOptRleEncoder () extends StObject {
    
    var count: Double = js.native
    
    var encoder: Encoder = js.native
    
    /**
      * @type {number}
      */
    var s: Double = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {number} v
      */
    def write(v: Double): Unit = js.native
  }
  
  inline def createEncoder(): Encoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoder")().asInstanceOf[Encoder]
  
  inline def length(encoder: Encoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(encoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def set(encoder: Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint16(encoder: Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint16")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint32(encoder: Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint32")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint8(encoder: Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint8")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toUint8Array(encoder: Encoder): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(encoder.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def verifyLen(encoder: Encoder, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyLen")(encoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def write(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeAny(encoder: Encoder): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def writeAny(encoder: Encoder, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: Encoder, data: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: Encoder, data: js.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: Encoder, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: Encoder, data: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: Encoder, data: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: Encoder, data: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeBigInt64(encoder: Encoder, num: js.BigInt): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBigInt64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def writeBigUint64(encoder: Encoder, num: js.BigInt): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBigUint64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def writeBinaryEncoder(encoder: Encoder, append: Encoder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryEncoder")(encoder.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFloat32(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloat32")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFloat64(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloat64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeOnDataView(encoder: Encoder, len: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOnDataView")(encoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def writeUint16(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint16")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint32(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint32")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint32BigEndian(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint32BigEndian")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint8(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint8")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint8Array(encoder: Encoder, uint8Array: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint8Array")(encoder.asInstanceOf[js.Any], uint8Array.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarInt(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarInt")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarString(encoder: Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarString")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarStringNative(encoder: Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeVarStringNative")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarStringPolyfill(encoder: Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeVarStringPolyfill")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarUint(encoder: Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarUint")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarUint8Array(encoder: Encoder, uint8Array: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarUint8Array")(encoder.asInstanceOf[js.Any], uint8Array.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
