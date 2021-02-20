package typings.logrotateStream

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a rotating log stream.
    * @returns a writable stream to a rotating log file
    */
  @JSImport("logrotate-stream", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Writable = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Optionally compress rotated files with gzip.
      */
    var compress: js.UndefOr[Boolean] = js.native
    
    /**
      * The file log file to write data to.
      */
    var file: String = js.native
    
    /**
      * The number of rotated log files to keep (including the primary log file). Additional logs are deleted no rotation.
      */
    var keep: Double = js.native
    
    /**
      * The max file size of a log before rotation occurs. Supports 1024, 1k, 1m, 1g
      */
    var size: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(file: String, keep: Double, size: String): Options = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep(value: Double): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
