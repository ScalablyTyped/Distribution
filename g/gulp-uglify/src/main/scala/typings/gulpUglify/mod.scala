package typings.gulpUglify

import typings.node.NodeJS.ReadWriteStream
import typings.uglifyJs.mod.CompressOptions
import typings.uglifyJs.mod.MangleOptions
import typings.uglifyJs.mod.OutputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-uglify", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-uglify", JSImport.Namespace)
  @js.native
  def apply(options: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Pass an object to specify custom compressor options. Pass false to skip compression completely.
      */
    var compress: js.UndefOr[CompressOptions | Boolean] = js.native
    
    /**
      * Pass false to skip mangling names.
      */
    var mangle: js.UndefOr[MangleOptions | Boolean] = js.native
    
    /**
      * Pass if you wish to specify additional output options. The defaults are optimized for best compression.
      */
    var output: js.UndefOr[OutputOptions] = js.native
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
      def setCompress(value: CompressOptions | Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setMangle(value: MangleOptions | Boolean): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
      
      @scala.inline
      def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
}
