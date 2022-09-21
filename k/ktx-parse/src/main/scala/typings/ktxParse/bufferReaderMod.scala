package typings.ktxParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferReaderMod {
  
  @JSImport("ktx-parse/dist/buffer-reader", "BufferReader")
  @js.native
  open class BufferReader protected () extends StObject {
    def this(data: js.typedarray.Uint8Array, byteOffset: Double, byteLength: Double, littleEndian: Boolean) = this()
    
    /* private */ var _dataView: Any = js.native
    
    /* private */ var _littleEndian: Any = js.native
    
    def _nextInt32(): Double = js.native
    
    def _nextUint16(): Double = js.native
    
    def _nextUint32(): Double = js.native
    
    def _nextUint64(): Double = js.native
    
    def _nextUint8(): Double = js.native
    
    var _offset: Double = js.native
    
    def _scan(maxByteLength: Double): js.typedarray.Uint8Array = js.native
    def _scan(maxByteLength: Double, term: Double): js.typedarray.Uint8Array = js.native
    
    def _skip(bytes: Double): this.type = js.native
  }
}
