package typings.ionicUtilsStream

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-stream", "NullStream")
  @js.native
  open class NullStream () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("@ionic/utils-stream", "ReadableStreamBuffer")
  @js.native
  open class ReadableStreamBuffer () extends Readable {
    def this(opts: ReadableStreamBufferOptions) = this()
    
    def _read(): Unit = js.native
    
    /* protected */ def _send(): Unit = js.native
    
    /* protected */ var _size: Double = js.native
    
    /* protected */ var _stopped: Boolean = js.native
    
    /* protected */ var buffer: Buffer = js.native
    
    /* protected */ var chunkSize: Double = js.native
    
    def feed(data: String): Unit = js.native
    def feed(data: String, encoding: String): Unit = js.native
    def feed(data: Buffer): Unit = js.native
    def feed(data: Buffer, encoding: String): Unit = js.native
    
    /* protected */ var growSize: Double = js.native
    
    def size: Double = js.native
    
    def stop(): Unit = js.native
    
    def stopped: Boolean = js.native
  }
  
  @JSImport("@ionic/utils-stream", "WritableStreamBuffer")
  @js.native
  open class WritableStreamBuffer () extends Writable {
    def this(opts: WritableStreamBufferOptions) = this()
    
    /* protected */ var _size: Double = js.native
    
    def _write(chunk: Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* protected */ var buffer: Buffer = js.native
    
    def consume(): Buffer = js.native
    def consume(bytes: Double): Buffer = js.native
    
    /* protected */ var growSize: Double = js.native
    
    def size: Double = js.native
  }
  
  inline def growBufferForAppendedData(buf: Buffer, actualsize: Double, appendsize: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("growBufferForAppendedData")(buf.asInstanceOf[js.Any], actualsize.asInstanceOf[js.Any], appendsize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait ReadableStreamBufferOptions
    extends StObject
       with ReadableOptions {
    
    var allocSize: js.UndefOr[Double] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var growSize: js.UndefOr[Double] = js.undefined
  }
  object ReadableStreamBufferOptions {
    
    inline def apply(): ReadableStreamBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableStreamBufferOptions]
    }
    
    extension [Self <: ReadableStreamBufferOptions](x: Self) {
      
      inline def setAllocSize(value: Double): Self = StObject.set(x, "allocSize", value.asInstanceOf[js.Any])
      
      inline def setAllocSizeUndefined: Self = StObject.set(x, "allocSize", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setGrowSize(value: Double): Self = StObject.set(x, "growSize", value.asInstanceOf[js.Any])
      
      inline def setGrowSizeUndefined: Self = StObject.set(x, "growSize", js.undefined)
    }
  }
  
  trait WritableStreamBufferOptions
    extends StObject
       with WritableOptions {
    
    var allocSize: js.UndefOr[Double] = js.undefined
    
    var growSize: js.UndefOr[Double] = js.undefined
  }
  object WritableStreamBufferOptions {
    
    inline def apply(): WritableStreamBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WritableStreamBufferOptions]
    }
    
    extension [Self <: WritableStreamBufferOptions](x: Self) {
      
      inline def setAllocSize(value: Double): Self = StObject.set(x, "allocSize", value.asInstanceOf[js.Any])
      
      inline def setAllocSizeUndefined: Self = StObject.set(x, "allocSize", js.undefined)
      
      inline def setGrowSize(value: Double): Self = StObject.set(x, "growSize", value.asInstanceOf[js.Any])
      
      inline def setGrowSizeUndefined: Self = StObject.set(x, "growSize", js.undefined)
    }
  }
}
