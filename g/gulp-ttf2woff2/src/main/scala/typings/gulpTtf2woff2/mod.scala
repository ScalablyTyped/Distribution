package typings.gulpTtf2woff2

import typings.node.bufferMod.global.Buffer
import typings.pluginError.mod.PluginError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a WOFF2 font from a TTF font with Gulp
    *
    * @example
    * const ttf2woff2 = require('gulp-ttf2woff2');
    *
    * gulp.task('ttf2woff2', function(){
    *   gulp.src(['fonts/ *.ttf'])
    *     .pipe(ttf2woff2())
    *     .pipe(gulp.dest('fonts/'));
    * });
    */
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(options: Options): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-ttf2woff2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * File level transform function (for use by other plugins)
    */
  inline def fileTransform(): FileTransformCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTransform")().asInstanceOf[FileTransformCallback]
  
  /**
    * Callback function handling the buffered content
    */
  type FileTransformCallback = js.Function3[
    /* err */ Any | Null, 
    /* buf */ js.UndefOr[Buffer], 
    /* cb */ js.Function2[/* err */ (PluginError[Any | js.Error]) | Null, /* buf */ js.UndefOr[Buffer], Any], 
    Any
  ]
  
  trait Options extends StObject {
    
    /**
      * Clone the file before converting him so that it will output the original file too.
      */
    @JSName("clone")
    var clone_FOptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Also convert files that doesn't have the .ttf extension.
      */
    var ignoreExt: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setIgnoreExt(value: Boolean): Self = StObject.set(x, "ignoreExt", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExtUndefined: Self = StObject.set(x, "ignoreExt", js.undefined)
    }
  }
}
