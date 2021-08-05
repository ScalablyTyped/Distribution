package typings.gulpDiff

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Gulp task to diff files in the stream against a destination.
    * @param dest target directory to diff against, defaults to diff against original source file
    */
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(dest: String): Transform = ^.asInstanceOf[js.Dynamic].apply(dest.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gulp-diff", "diff")
  @js.native
  val diff: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof gulp_diff */ js.Any = js.native
  
  inline def reporter(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")().asInstanceOf[Transform]
  inline def reporter(opts: ReporterOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  trait ReporterOptions extends StObject {
    
    /**
      * emit an error on finding diffs, defaults to `false`
      */
    var fail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * do not show diff information, defaults to `false`
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object ReporterOptions {
    
    inline def apply(): ReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReporterOptions]
    }
    
    extension [Self <: ReporterOptions](x: Self) {
      
      inline def setFail(value: Boolean): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
