package typings.gulpDiff

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Gulp task to diff files in the stream against a destination.
    * @param dest target directory to diff against, defaults to diff against original source file
    */
  @JSImport("gulp-diff", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("gulp-diff", JSImport.Namespace)
  @js.native
  def apply(dest: String): Transform = js.native
  
  @JSImport("gulp-diff", "diff")
  @js.native
  val diff: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof gulp_diff */ js.Any = js.native
  
  @JSImport("gulp-diff", "reporter")
  @js.native
  def reporter(): Transform = js.native
  @JSImport("gulp-diff", "reporter")
  @js.native
  def reporter(opts: ReporterOptions): Transform = js.native
  
  @js.native
  trait ReporterOptions extends StObject {
    
    /**
      * emit an error on finding diffs, defaults to `false`
      */
    var fail: js.UndefOr[Boolean] = js.native
    
    /**
      * do not show diff information, defaults to `false`
      */
    var quiet: js.UndefOr[Boolean] = js.native
  }
  object ReporterOptions {
    
    @scala.inline
    def apply(): ReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReporterOptions]
    }
    
    @scala.inline
    implicit class ReporterOptionsMutableBuilder[Self <: ReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFail(value: Boolean): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
