package typings.gulpGzip

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-gzip", JSImport.Namespace)
  @js.native
  val ^ : Gzip = js.native
  
  type Gzip = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Appends .gz file extension if true.
      * @default true
      */
    var append: js.UndefOr[Boolean] = js.native
    
    /**
      * Appends an arbitrary extension to the filename. Disables append and preExtension options.
      */
    var extension: js.UndefOr[String] = js.native
    
    /**
      * Options object to pass through to zlib.Gzip.
      * See <a href='https://nodejs.org/api/zlib.html#zlib_options'>zlib</a> documentation for more information.
      */
    var gzipOptions: js.UndefOr[ZlibOptions] = js.native
    
    /**
      * Appends an arbitrary pre-extension to the filename. Disables append and extension options.
      */
    var preExtension: js.UndefOr[String] = js.native
    
    /**
      * Minimum size required to compress a file.
      * @default false
      */
    var threshold: js.UndefOr[Double | String | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setGzipOptions(value: ZlibOptions): Self = StObject.set(x, "gzipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipOptionsUndefined: Self = StObject.set(x, "gzipOptions", js.undefined)
      
      @scala.inline
      def setPreExtension(value: String): Self = StObject.set(x, "preExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreExtensionUndefined: Self = StObject.set(x, "preExtension", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double | String | Boolean): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type _To = Gzip
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Gzip = ^
}
