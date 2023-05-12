package typings.lib0.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoding {
  
  @JSImport("lib0", "encoding")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0", "encoding.Encoder")
  @js.native
  open class Encoder ()
    extends typings.lib0.encodingMod.Encoder
  
  @JSImport("lib0", "encoding.IncUintOptRleEncoder")
  @js.native
  open class IncUintOptRleEncoder ()
    extends typings.lib0.encodingMod.IncUintOptRleEncoder
  
  @JSImport("lib0", "encoding.IntDiffEncoder")
  @js.native
  open class IntDiffEncoder protected ()
    extends typings.lib0.encodingMod.IntDiffEncoder {
    /**
      * @param {number} start
      */
    def this(start: Double) = this()
  }
  
  @JSImport("lib0", "encoding.IntDiffOptRleEncoder")
  @js.native
  open class IntDiffOptRleEncoder ()
    extends typings.lib0.encodingMod.IntDiffOptRleEncoder
  
  @JSImport("lib0", "encoding.RleEncoder")
  @js.native
  open class RleEncoder[T] protected ()
    extends typings.lib0.encodingMod.RleEncoder[T] {
    /**
      * @param {function(Encoder, T):void} writer
      */
    def this(writer: js.Function2[/* arg0 */ typings.lib0.encodingMod.Encoder, /* arg1 */ T, Unit]) = this()
  }
  
  @JSImport("lib0", "encoding.RleIntDiffEncoder")
  @js.native
  open class RleIntDiffEncoder protected ()
    extends typings.lib0.encodingMod.RleIntDiffEncoder {
    /**
      * @param {number} start
      */
    def this(start: Double) = this()
  }
  
  @JSImport("lib0", "encoding.StringEncoder")
  @js.native
  open class StringEncoder ()
    extends typings.lib0.encodingMod.StringEncoder
  
  @JSImport("lib0", "encoding.UintOptRleEncoder")
  @js.native
  open class UintOptRleEncoder ()
    extends typings.lib0.encodingMod.UintOptRleEncoder
  
  inline def createEncoder(): typings.lib0.encodingMod.Encoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoder")().asInstanceOf[typings.lib0.encodingMod.Encoder]
  
  inline def hasContent(encoder: typings.lib0.encodingMod.Encoder): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasContent")(encoder.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def length(encoder: typings.lib0.encodingMod.Encoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(encoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def set(encoder: typings.lib0.encodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint16(encoder: typings.lib0.encodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint16")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint32(encoder: typings.lib0.encodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint32")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint8(encoder: typings.lib0.encodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint8")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toUint8Array(encoder: typings.lib0.encodingMod.Encoder): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(encoder.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def verifyLen(encoder: typings.lib0.encodingMod.Encoder, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyLen")(encoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def write(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder, data: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder, data: js.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder, data: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder, data: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typings.lib0.encodingMod.Encoder, data: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeBigInt64(encoder: typings.lib0.encodingMod.Encoder, num: js.BigInt): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBigInt64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def writeBigUint64(encoder: typings.lib0.encodingMod.Encoder, num: js.BigInt): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBigUint64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def writeBinaryEncoder(encoder: typings.lib0.encodingMod.Encoder, append: typings.lib0.encodingMod.Encoder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryEncoder")(encoder.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFloat32(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloat32")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFloat64(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloat64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeOnDataView(encoder: typings.lib0.encodingMod.Encoder, len: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOnDataView")(encoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def writeUint16(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint16")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint32(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint32")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint32BigEndian(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint32BigEndian")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint8(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint8")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint8Array(encoder: typings.lib0.encodingMod.Encoder, uint8Array: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint8Array")(encoder.asInstanceOf[js.Any], uint8Array.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarInt(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarInt")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarString(encoder: typings.lib0.encodingMod.Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarString")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarStringNative(encoder: typings.lib0.encodingMod.Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeVarStringNative")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarStringPolyfill(encoder: typings.lib0.encodingMod.Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeVarStringPolyfill")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarUint(encoder: typings.lib0.encodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarUint")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarUint8Array(encoder: typings.lib0.encodingMod.Encoder, uint8Array: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarUint8Array")(encoder.asInstanceOf[js.Any], uint8Array.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
