package typings.ionicUtilsStream

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-stream", "NullStream")
  @js.native
  class NullStream () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("@ionic/utils-stream", "ReadableStreamBuffer")
  @js.native
  class ReadableStreamBuffer () extends Readable {
    def this(opts: ReadableStreamBufferOptions) = this()
    
    def _read(): Unit = js.native
    
    /* protected */ def _send(): Unit = js.native
    
    var _size: Double = js.native
    
    var _stopped: Boolean = js.native
    
    var buffer: Buffer = js.native
    
    var chunkSize: Double = js.native
    
    def feed(data: String): Unit = js.native
    def feed(data: String, encoding: String): Unit = js.native
    def feed(data: Buffer): Unit = js.native
    def feed(data: Buffer, encoding: String): Unit = js.native
    
    var growSize: Double = js.native
    
    def size: Double = js.native
    
    def stop(): Unit = js.native
    
    def stopped: Boolean = js.native
  }
  
  @JSImport("@ionic/utils-stream", "WritableStreamBuffer")
  @js.native
  class WritableStreamBuffer () extends Writable {
    def this(opts: WritableStreamBufferOptions) = this()
    
    var _size: Double = js.native
    
    def _write(chunk: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    
    var buffer: Buffer = js.native
    
    def consume(): Buffer = js.native
    def consume(bytes: Double): Buffer = js.native
    
    var growSize: Double = js.native
    
    def size: Double = js.native
  }
  
  @JSImport("@ionic/utils-stream", "growBufferForAppendedData")
  @js.native
  def growBufferForAppendedData(buf: Buffer, actualsize: Double, appendsize: Double): Buffer = js.native
  
  @js.native
  trait ReadableStreamBufferOptions extends ReadableOptions {
    
    var allocSize: js.UndefOr[Double] = js.native
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var growSize: js.UndefOr[Double] = js.native
  }
  object ReadableStreamBufferOptions {
    
    @scala.inline
    def apply(): ReadableStreamBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableStreamBufferOptions]
    }
    
    @scala.inline
    implicit class ReadableStreamBufferOptionsMutableBuilder[Self <: ReadableStreamBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocSize(value: Double): Self = StObject.set(x, "allocSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocSizeUndefined: Self = StObject.set(x, "allocSize", js.undefined)
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setGrowSize(value: Double): Self = StObject.set(x, "growSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrowSizeUndefined: Self = StObject.set(x, "growSize", js.undefined)
    }
  }
  
  @js.native
  trait WritableStreamBufferOptions extends WritableOptions {
    
    var allocSize: js.UndefOr[Double] = js.native
    
    var growSize: js.UndefOr[Double] = js.native
  }
  object WritableStreamBufferOptions {
    
    @scala.inline
    def apply(): WritableStreamBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WritableStreamBufferOptions]
    }
    
    @scala.inline
    implicit class WritableStreamBufferOptionsMutableBuilder[Self <: WritableStreamBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocSize(value: Double): Self = StObject.set(x, "allocSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocSizeUndefined: Self = StObject.set(x, "allocSize", js.undefined)
      
      @scala.inline
      def setGrowSize(value: Double): Self = StObject.set(x, "growSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrowSizeUndefined: Self = StObject.set(x, "growSize", js.undefined)
    }
  }
}
