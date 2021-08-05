package typings.gulpMinify

import org.scalablytyped.runtime.Shortcut
import typings.gulpMinify.anon.Asciionly
import typings.gulpMinify.anon.Booleans
import typings.gulpMinify.anon.Min
import typings.gulpMinify.gulpMinifyStrings.all
import typings.gulpMinify.gulpMinifyStrings.some
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-minify", JSImport.Namespace)
  @js.native
  val ^ : minify = js.native
  
  trait Options extends StObject {
    
    /**
      * Pass an object to specify custom compressor options. Pass false to skip compression completely.
      */
    var compress: js.UndefOr[Booleans | Boolean] = js.undefined
    
    /**
      * Will not minify files in the dirs.
      */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An object that specifies output src and minified file extensions.
      */
    var ext: js.UndefOr[Min] = js.undefined
    
    /**
      * Will not minify files which matches the pattern.
      */
    var ignoreFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If true, will mangle variable names.
      */
    var mangle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, will not output the source code in the dest dirs.
      */
    var noSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass an object if you wish to specify additional output options.The defaults are optimized for best compression.
      */
    var output: js.UndefOr[Asciionly] = js.undefined
    
    /**
      * A convenience option for options.output.comments. Defaults to preserving no comments.
      *
      * * **all**: Preserve all comments in code blocks.
      *
      * * **some**: preserve comments that start with a bang(!) or include a Closure Compiler directive(@preserve, @license, @cc_on).
      *
      * * **function**: specify your own comment preservation function. You will be passed the current node and the current comment and are expected to return a boolean.
      */
    var preserveComments: js.UndefOr[
        all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean])
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompress(value: Booleans | Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setExt(value: Min): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setIgnoreFiles(value: js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value :_*))
      
      inline def setMangle(value: Boolean): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
      
      inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
      
      inline def setNoSource(value: Boolean): Self = StObject.set(x, "noSource", value.asInstanceOf[js.Any])
      
      inline def setNoSourceUndefined: Self = StObject.set(x, "noSource", js.undefined)
      
      inline def setOutput(value: Asciionly): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPreserveComments(
        value: all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean])
      ): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      inline def setPreserveCommentsFunction2(value: (/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "preserveComments", js.Any.fromFunction2(value))
      
      inline def setPreserveCommentsUndefined: Self = StObject.set(x, "preserveComments", js.undefined)
    }
  }
  
  type _To = minify
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: minify = ^
  
  type minify = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
}
