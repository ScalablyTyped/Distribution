package typings.logrotateStream

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a rotating log stream.
    * @returns a writable stream to a rotating log file
    */
  inline def apply(opts: Options): Writable = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Writable]
  
  @JSImport("logrotate-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Optionally compress rotated files with gzip.
      */
    var compress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file log file to write data to.
      */
    var file: String
    
    /**
      * The number of rotated log files to keep (including the primary log file). Additional logs are deleted no rotation.
      */
    var keep: Double
    
    /**
      * The max file size of a log before rotation occurs. Supports 1024, 1k, 1m, 1g
      */
    var size: String | Double
  }
  object Options {
    
    inline def apply(file: String, keep: Double, size: String | Double): Options = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setKeep(value: Double): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
