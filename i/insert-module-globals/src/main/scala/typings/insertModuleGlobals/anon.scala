package typings.insertModuleGlobals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Buffer extends StObject {
    
    def Buffer(): String = js.native
    
    @JSName("Buffer.isBuffer")
    def BufferDotisBuffer(file: String): String = js.native
    
    def __dirname(file: String, basedir: String): String = js.native
    
    def __filename(file: String, basedir: String): String = js.native
    
    def global(): String = js.native
    
    def process(file: String): String = js.native
  }
  object Buffer {
    
    @scala.inline
    def apply(
      Buffer: () => String,
      BufferDotisBuffer: String => String,
      __dirname: (String, String) => String,
      __filename: (String, String) => String,
      global: () => String,
      process: String => String
    ): Buffer = {
      val __obj = js.Dynamic.literal(Buffer = js.Any.fromFunction0(Buffer), __dirname = js.Any.fromFunction2(__dirname), __filename = js.Any.fromFunction2(__filename), global = js.Any.fromFunction0(global), process = js.Any.fromFunction1(process))
      __obj.updateDynamic("Buffer.isBuffer")(js.Any.fromFunction1(BufferDotisBuffer))
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: () => String): Self = StObject.set(x, "Buffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBufferDotisBuffer(value: String => String): Self = StObject.set(x, "Buffer.isBuffer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGlobal(value: () => String): Self = StObject.set(x, "global", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProcess(value: String => String): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      @scala.inline
      def set__dirname(value: (String, String) => String): Self = StObject.set(x, "__dirname", js.Any.fromFunction2(value))
      
      @scala.inline
      def set__filename(value: (String, String) => String): Self = StObject.set(x, "__filename", js.Any.fromFunction2(value))
    }
  }
}
