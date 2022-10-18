package typings.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsBinaryStreamMod {
  
  @JSImport("kdbxweb/dist/types/utils/binary-stream", "BinaryStream")
  @js.native
  open class BinaryStream () extends StObject {
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    
    /* private */ var _arrayBuffer: Any = js.native
    
    /* private */ val _canExpand: Any = js.native
    
    /* private */ var _dataView: Any = js.native
    
    /* private */ var _pos: Any = js.native
    
    def byteLength: Double = js.native
    
    /* private */ var checkCapacity: Any = js.native
    
    def getFloat32(littleEndian: Boolean): Double = js.native
    
    def getFloat64(littleEndian: Boolean): Double = js.native
    
    def getInt16(littleEndian: Boolean): Double = js.native
    
    def getInt32(littleEndian: Boolean): Double = js.native
    
    def getInt8(): Double = js.native
    
    def getUint16(littleEndian: Boolean): Double = js.native
    
    def getUint32(littleEndian: Boolean): Double = js.native
    
    def getUint64(littleEndian: Boolean): Double = js.native
    
    def getUint8(): Double = js.native
    
    def getWrittenBytes(): js.typedarray.ArrayBuffer = js.native
    
    def pos: Double = js.native
    
    def readBytes(size: Double): js.typedarray.ArrayBuffer = js.native
    
    def readBytesNoAdvance(startPos: Double, endPos: Double): js.typedarray.ArrayBuffer = js.native
    
    def readBytesToEnd(): js.typedarray.ArrayBuffer = js.native
    
    def setFloat32(value: Double, littleEndian: Boolean): Unit = js.native
    
    def setFloat64(value: Double, littleEndian: Boolean): Unit = js.native
    
    def setInt16(value: Double, littleEndian: Boolean): Unit = js.native
    
    def setInt32(value: Double, littleEndian: Boolean): Unit = js.native
    
    def setInt8(value: Double): Unit = js.native
    
    def setUint16(value: Double, littleEndian: Boolean): Unit = js.native
    
    def setUint32(value: Double, littleEndian: Boolean): Unit = js.native
    
    def setUint64(value: Double, littleEndian: Boolean): Unit = js.native
    
    def setUint8(value: Double): Unit = js.native
    
    def writeBytes(bytes: js.typedarray.ArrayBuffer): Unit = js.native
    def writeBytes(bytes: js.typedarray.Uint8Array): Unit = js.native
  }
}
