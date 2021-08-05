package typings.insertModuleGlobals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buffer extends StObject {
    
    def Buffer(): String
    
    @JSName("Buffer.isBuffer")
    def BufferDotisBuffer(file: String): String
    
    def __dirname(file: String, basedir: String): String
    
    def __filename(file: String, basedir: String): String
    
    def global(): String
    
    def process(file: String): String
  }
  object Buffer {
    
    inline def apply(
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
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setBuffer(value: () => String): Self = StObject.set(x, "Buffer", js.Any.fromFunction0(value))
      
      inline def setBufferDotisBuffer(value: String => String): Self = StObject.set(x, "Buffer.isBuffer", js.Any.fromFunction1(value))
      
      inline def setGlobal(value: () => String): Self = StObject.set(x, "global", js.Any.fromFunction0(value))
      
      inline def setProcess(value: String => String): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def set__dirname(value: (String, String) => String): Self = StObject.set(x, "__dirname", js.Any.fromFunction2(value))
      
      inline def set__filename(value: (String, String) => String): Self = StObject.set(x, "__filename", js.Any.fromFunction2(value))
    }
  }
}
