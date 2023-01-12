package typings.gulpUglify

import typings.node.NodeJS.ReadWriteStream
import typings.uglifyJs.mod.CompressOptions
import typings.uglifyJs.mod.MangleOptions
import typings.uglifyJs.mod.OutputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(options: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-uglify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Pass an object to specify custom compressor options. Pass false to skip compression completely.
      */
    var compress: js.UndefOr[CompressOptions | Boolean] = js.undefined
    
    /**
      * Pass false to skip mangling names.
      */
    var mangle: js.UndefOr[MangleOptions | Boolean] = js.undefined
    
    /**
      * Pass if you wish to specify additional output options. The defaults are optimized for best compression.
      */
    var output: js.UndefOr[OutputOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: CompressOptions | Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setMangle(value: MangleOptions | Boolean): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
      
      inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
      
      inline def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
}
