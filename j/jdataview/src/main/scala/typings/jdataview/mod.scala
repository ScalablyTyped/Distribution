package typings.jdataview

import org.scalablytyped.runtime.NumberDictionary
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jdataview", JSImport.Namespace)
  @js.native
  class ^ protected () extends jDataView {
    def this(buffer: String) = this()
    def this(buffer: Bytes) = this()
    def this(byteCount: Double) = this()
    def this(buffer: String, offset: Double) = this()
    def this(buffer: Bytes, offset: Double) = this()
    def this(byteCount: Double, offset: Double) = this()
    def this(buffer: String, offset: js.UndefOr[scala.Nothing], length: Double) = this()
    def this(buffer: String, offset: Double, length: Double) = this()
    def this(buffer: Bytes, offset: js.UndefOr[scala.Nothing], length: Double) = this()
    def this(buffer: Bytes, offset: Double, length: Double) = this()
    def this(byteCount: Double, offset: js.UndefOr[scala.Nothing], length: Double) = this()
    def this(byteCount: Double, offset: Double, length: Double) = this()
    def this(
      buffer: String,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      littleEndian: Boolean
    ) = this()
    def this(buffer: String, offset: js.UndefOr[scala.Nothing], length: Double, littleEndian: Boolean) = this()
    def this(buffer: String, offset: Double, length: js.UndefOr[scala.Nothing], littleEndian: Boolean) = this()
    def this(buffer: String, offset: Double, length: Double, littleEndian: Boolean) = this()
    def this(
      buffer: Bytes,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      littleEndian: Boolean
    ) = this()
    def this(buffer: Bytes, offset: js.UndefOr[scala.Nothing], length: Double, littleEndian: Boolean) = this()
    def this(buffer: Bytes, offset: Double, length: js.UndefOr[scala.Nothing], littleEndian: Boolean) = this()
    def this(buffer: Bytes, offset: Double, length: Double, littleEndian: Boolean) = this()
    def this(
      byteCount: Double,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      littleEndian: Boolean
    ) = this()
    def this(byteCount: Double, offset: js.UndefOr[scala.Nothing], length: Double, littleEndian: Boolean) = this()
    def this(byteCount: Double, offset: Double, length: js.UndefOr[scala.Nothing], littleEndian: Boolean) = this()
    def this(byteCount: Double, offset: Double, length: Double, littleEndian: Boolean) = this()
  }
  
  @JSImport("jdataview", "Int64")
  @js.native
  class Int64 protected () extends Uint64 {
    def this(lo: Double, hi: Double) = this()
  }
  object Int64 {
    
    /* static member */
    @JSImport("jdataview", "Int64.fromNumber")
    @js.native
    def fromNumber(number: Double): Int64 = js.native
  }
  
  @JSImport("jdataview", "Uint64")
  @js.native
  class Uint64 protected () extends StObject {
    def this(lo: Double, hi: Double) = this()
    
    var hi: Double = js.native
    
    var lo: Double = js.native
  }
  object Uint64 {
    
    /* static member */
    @JSImport("jdataview", "Uint64.fromNumber")
    @js.native
    def fromNumber(number: Double): Uint64 = js.native
  }
  
  @js.native
  trait Buffer extends Bytes {
    
    var byteLength: Double = js.native
  }
  object Buffer {
    
    @scala.inline
    def apply(byteLength: Double, length: Double): Buffer = {
      val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bytes extends /* index */ NumberDictionary[Double] {
    
    var length: Double = js.native
  }
  object Bytes {
    
    @scala.inline
    def apply(length: Double): Bytes = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bytes]
    }
    
    @scala.inline
    implicit class BytesMutableBuilder[Self <: Bytes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait jDataView extends DataView {
    
    def createBuffer(bytes: Double*): Buffer = js.native
    
    def getBytes(length: Double): js.Array[Double] = js.native
    def getBytes(
      length: Double,
      byteOffset: js.UndefOr[scala.Nothing],
      littleEndian: js.UndefOr[scala.Nothing],
      toArray: Boolean
    ): js.Array[Double] = js.native
    def getBytes(length: Double, byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): js.Array[Double] = js.native
    def getBytes(length: Double, byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean, toArray: Boolean): js.Array[Double] = js.native
    def getBytes(length: Double, byteOffset: Double): js.Array[Double] = js.native
    def getBytes(length: Double, byteOffset: Double, littleEndian: js.UndefOr[scala.Nothing], toArray: Boolean): js.Array[Double] = js.native
    def getBytes(length: Double, byteOffset: Double, littleEndian: Boolean): js.Array[Double] = js.native
    def getBytes(length: Double, byteOffset: Double, littleEndian: Boolean, toArray: Boolean): js.Array[Double] = js.native
    
    // Strings and Blobs
    def getChar(): String = js.native
    def getChar(byteOffset: Double): String = js.native
    
    def getFloat32(): Double = js.native
    def getFloat32(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Double = js.native
    
    def getFloat64(): Double = js.native
    def getFloat64(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Double = js.native
    
    def getInt16(): Double = js.native
    def getInt16(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Double = js.native
    
    def getInt32(): Double = js.native
    def getInt32(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Double = js.native
    
    // 64 bit integers
    def getInt64(): Int64 = js.native
    def getInt64(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Int64 = js.native
    def getInt64(byteOffset: Double): Int64 = js.native
    def getInt64(byteOffset: Double, littleEndian: Boolean): Int64 = js.native
    
    // Specification getters
    def getInt8(): Double = js.native
    
    // Bitfields
    def getSigned(bitLength: Double): Double = js.native
    def getSigned(bitLength: Double, byteOffset: Double): Double = js.native
    
    def getString(byteLength: Double): String = js.native
    def getString(byteLength: Double, byteOffset: js.UndefOr[scala.Nothing], encoding: String): String = js.native
    def getString(byteLength: Double, byteOffset: Double): String = js.native
    def getString(byteLength: Double, byteOffset: Double, encoding: String): String = js.native
    
    def getUint16(): Double = js.native
    def getUint16(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Double = js.native
    
    def getUint32(): Double = js.native
    def getUint32(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Double = js.native
    
    def getUint64(): Uint64 = js.native
    def getUint64(byteOffset: js.UndefOr[scala.Nothing], littleEndian: Boolean): Uint64 = js.native
    def getUint64(byteOffset: Double): Uint64 = js.native
    def getUint64(byteOffset: Double, littleEndian: Boolean): Uint64 = js.native
    
    def getUint8(): Double = js.native
    
    def getUnsigned(bitLength: Double): Double = js.native
    def getUnsigned(bitLength: Double, byteOffset: Double): Double = js.native
    
    // Operation control
    def seek(byteOffset: Double): Double = js.native
    
    def setBytes(byteOffset: Double, bytes: js.Array[Double]): Unit = js.native
    def setBytes(byteOffset: Double, bytes: js.Array[Double], littleEndian: Boolean): Unit = js.native
    
    def setChar(byteOffset: Double, char: String): Unit = js.native
    
    def setInt64(byteOffset: Double, value: Int64): Unit = js.native
    def setInt64(byteOffset: Double, value: Int64, littleEndian: Boolean): Unit = js.native
    
    def setSigned(byteOffset: Double, value: Double, bitLength: Double): Unit = js.native
    
    def setString(byteOffset: Double, chars: String): Unit = js.native
    def setString(byteOffset: Double, chars: String, encoding: String): Unit = js.native
    
    def setUint64(byteOffset: Double, value: Uint64): Unit = js.native
    def setUint64(byteOffset: Double, value: Uint64, littleEndian: Boolean): Unit = js.native
    
    def setUnsigned(byteOffset: Double, value: Double, bitLength: Double): Unit = js.native
    
    def skip(byteLength: Double): Double = js.native
    
    def slice(start: Double): jDataView = js.native
    def slice(start: Double, end: js.UndefOr[scala.Nothing], forceCopy: Boolean): jDataView = js.native
    def slice(start: Double, end: Double): jDataView = js.native
    def slice(start: Double, end: Double, forceCopy: Boolean): jDataView = js.native
    
    def tell(): Double = js.native
    
    def wrapBuffer(byteCount: Double): Buffer = js.native
    def wrapBuffer(bytes: Bytes): Buffer = js.native
    // Internal utilities
    def wrapBuffer(string: String): Buffer = js.native
    
    def writeBytes(bytes: js.Array[Double]): Unit = js.native
    def writeBytes(bytes: js.Array[Double], littleEndian: Boolean): Unit = js.native
    
    def writeChar(char: String): Unit = js.native
    
    def writeFloat32(value: Double): Unit = js.native
    def writeFloat32(value: Double, littleEndian: Boolean): Unit = js.native
    
    def writeFloat64(value: Double): Unit = js.native
    def writeFloat64(value: Double, littleEndian: Boolean): Unit = js.native
    
    def writeInt16(value: Double): Unit = js.native
    def writeInt16(value: Double, littleEndian: Boolean): Unit = js.native
    
    def writeInt32(value: Double): Unit = js.native
    def writeInt32(value: Double, littleEndian: Boolean): Unit = js.native
    
    def writeInt64(value: Int64): Unit = js.native
    def writeInt64(value: Int64, littleEndian: Boolean): Unit = js.native
    
    // writeXXX methods
    def writeInt8(value: Double): Unit = js.native
    
    def writeSigned(value: Double, bitLength: Double): Unit = js.native
    
    def writeString(chars: String): Unit = js.native
    def writeString(chars: String, encoding: String): Unit = js.native
    
    def writeUint16(value: Double): Unit = js.native
    def writeUint16(value: Double, littleEndian: Boolean): Unit = js.native
    
    def writeUint32(value: Double): Unit = js.native
    def writeUint32(value: Double, littleEndian: Boolean): Unit = js.native
    
    def writeUint64(value: Uint64): Unit = js.native
    def writeUint64(value: Uint64, littleEndian: Boolean): Unit = js.native
    
    def writeUint8(value: Double): Unit = js.native
    
    def writeUnsigned(value: Double, bitLength: Double): Unit = js.native
  }
}
