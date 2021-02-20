package typings.hdrHistogramJs

import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteBufferMod {
  
  @JSImport("hdr-histogram-js/ByteBuffer", JSImport.Default)
  @js.native
  class default protected () extends ByteBuffer {
    def this(data: Uint8Array) = this()
  }
  object default {
    
    /* static member */
    @JSImport("hdr-histogram-js/ByteBuffer", "default.allocate")
    @js.native
    def allocate(): ByteBuffer = js.native
    @JSImport("hdr-histogram-js/ByteBuffer", "default.allocate")
    @js.native
    def allocate(size: Double): ByteBuffer = js.native
  }
  
  @js.native
  trait ByteBuffer extends StObject {
    
    var data: Uint8Array = js.native
    
    def get(): Double = js.native
    
    def getInt32(): Double = js.native
    
    def getInt64(): Double = js.native
    
    var int32ArrayForConvert: Uint32Array = js.native
    
    var int8ArrayForConvert: Uint8Array = js.native
    
    var position: Double = js.native
    
    def put(value: Double): Unit = js.native
    
    def putArray(array: Uint8Array): Unit = js.native
    
    def putInt32(value: Double): Unit = js.native
    
    def putInt64(value: Double): Unit = js.native
    
    def resetPosition(): Unit = js.native
  }
  object ByteBuffer {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ByteBufferMutableBuilder[Self <: ByteBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: () => Double): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInt32(value: () => Double): Self = StObject.set(x, "getInt32", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInt64(value: () => Double): Self = StObject.set(x, "getInt64", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInt32ArrayForConvert(value: Uint32Array): Self = StObject.set(x, "int32ArrayForConvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInt8ArrayForConvert(value: Uint8Array): Self = StObject.set(x, "int8ArrayForConvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPut(value: Double => Unit): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPutArray(value: Uint8Array => Unit): Self = StObject.set(x, "putArray", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPutInt32(value: Double => Unit): Self = StObject.set(x, "putInt32", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPutInt64(value: Double => Unit): Self = StObject.set(x, "putInt64", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetPosition(value: () => Unit): Self = StObject.set(x, "resetPosition", js.Any.fromFunction0(value))
    }
  }
}
