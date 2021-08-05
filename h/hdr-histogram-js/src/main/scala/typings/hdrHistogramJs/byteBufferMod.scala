package typings.hdrHistogramJs

import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteBufferMod {
  
  @JSImport("hdr-histogram-js/ByteBuffer", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ByteBuffer {
    def this(data: Uint8Array) = this()
    
    /* CompleteClass */
    var data: Uint8Array = js.native
    
    /* CompleteClass */
    override def get(): Double = js.native
    
    /* CompleteClass */
    override def getInt32(): Double = js.native
    
    /* CompleteClass */
    override def getInt64(): Double = js.native
    
    /* CompleteClass */
    var int32ArrayForConvert: Uint32Array = js.native
    
    /* CompleteClass */
    var int8ArrayForConvert: Uint8Array = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def put(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def putArray(array: Uint8Array): Unit = js.native
    
    /* CompleteClass */
    override def putInt32(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def putInt64(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def resetPosition(): Unit = js.native
  }
  object default {
    
    @JSImport("hdr-histogram-js/ByteBuffer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def allocate(): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")().asInstanceOf[ByteBuffer]
    inline def allocate(size: Double): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(size.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  }
  
  trait ByteBuffer extends StObject {
    
    var data: Uint8Array
    
    def get(): Double
    
    def getInt32(): Double
    
    def getInt64(): Double
    
    var int32ArrayForConvert: Uint32Array
    
    var int8ArrayForConvert: Uint8Array
    
    var position: Double
    
    def put(value: Double): Unit
    
    def putArray(array: Uint8Array): Unit
    
    def putInt32(value: Double): Unit
    
    def putInt64(value: Double): Unit
    
    def resetPosition(): Unit
  }
  object ByteBuffer {
    
    inline def apply(
      data: Uint8Array,
      get: () => Double,
      getInt32: () => Double,
      getInt64: () => Double,
      int32ArrayForConvert: Uint32Array,
      int8ArrayForConvert: Uint8Array,
      position: Double,
      put: Double => Unit,
      putArray: Uint8Array => Unit,
      putInt32: Double => Unit,
      putInt64: Double => Unit,
      resetPosition: () => Unit
    ): ByteBuffer = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), getInt32 = js.Any.fromFunction0(getInt32), getInt64 = js.Any.fromFunction0(getInt64), int32ArrayForConvert = int32ArrayForConvert.asInstanceOf[js.Any], int8ArrayForConvert = int8ArrayForConvert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), putArray = js.Any.fromFunction1(putArray), putInt32 = js.Any.fromFunction1(putInt32), putInt64 = js.Any.fromFunction1(putInt64), resetPosition = js.Any.fromFunction0(resetPosition))
      __obj.asInstanceOf[ByteBuffer]
    }
    
    extension [Self <: ByteBuffer](x: Self) {
      
      inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGet(value: () => Double): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetInt32(value: () => Double): Self = StObject.set(x, "getInt32", js.Any.fromFunction0(value))
      
      inline def setGetInt64(value: () => Double): Self = StObject.set(x, "getInt64", js.Any.fromFunction0(value))
      
      inline def setInt32ArrayForConvert(value: Uint32Array): Self = StObject.set(x, "int32ArrayForConvert", value.asInstanceOf[js.Any])
      
      inline def setInt8ArrayForConvert(value: Uint8Array): Self = StObject.set(x, "int8ArrayForConvert", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPut(value: Double => Unit): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      inline def setPutArray(value: Uint8Array => Unit): Self = StObject.set(x, "putArray", js.Any.fromFunction1(value))
      
      inline def setPutInt32(value: Double => Unit): Self = StObject.set(x, "putInt32", js.Any.fromFunction1(value))
      
      inline def setPutInt64(value: Double => Unit): Self = StObject.set(x, "putInt64", js.Any.fromFunction1(value))
      
      inline def setResetPosition(value: () => Unit): Self = StObject.set(x, "resetPosition", js.Any.fromFunction0(value))
    }
  }
}
