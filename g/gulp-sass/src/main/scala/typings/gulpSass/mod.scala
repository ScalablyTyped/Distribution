package typings.gulpSass

import org.scalablytyped.runtime.Shortcut
import typings.gulpSass.anon.Duration
import typings.node.NodeJS.ReadWriteStream
import typings.nodeSass.mod.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-sass", JSImport.Namespace)
  @js.native
  val ^ : Sass = js.native
  
  @js.native
  trait GulpSassOptions extends SassOptions {
    
    var errLogToConsole: js.UndefOr[Boolean] = js.native
    
    var onError: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
    
    var onSuccess: js.UndefOr[js.Function1[/* css */ String, _]] = js.native
    
    var sync: js.UndefOr[Boolean] = js.native
  }
  object GulpSassOptions {
    
    @scala.inline
    def apply(): GulpSassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpSassOptions]
    }
    
    @scala.inline
    implicit class GulpSassOptionsMutableBuilder[Self <: GulpSassOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrLogToConsole(value: Boolean): Self = StObject.set(x, "errLogToConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrLogToConsoleUndefined: Self = StObject.set(x, "errLogToConsole", js.undefined)
      
      @scala.inline
      def setOnError(value: /* err */ Error => _): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: /* css */ String => _): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  @js.native
  trait Sass extends StObject {
    
    def apply(): ReadWriteStream = js.native
    def apply(opts: GulpSassOptions): ReadWriteStream = js.native
    
    def logError(): Unit = js.native
    def logError(error: String): Unit = js.native
    
    def sync(): ReadWriteStream = js.native
    def sync(options: GulpSassOptions): ReadWriteStream = js.native
  }
  
  @js.native
  trait SassOptions extends Options {
    
    var error: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
    
    var imagePaths: js.UndefOr[js.Array[String]] = js.native
    
    var success: js.UndefOr[js.Function1[/* results */ SassResults, _]] = js.native
  }
  object SassOptions {
    
    @scala.inline
    def apply(): SassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SassOptions]
    }
    
    @scala.inline
    implicit class SassOptionsMutableBuilder[Self <: SassOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* err */ Error => _): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setImagePaths(value: js.Array[String]): Self = StObject.set(x, "imagePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePathsUndefined: Self = StObject.set(x, "imagePaths", js.undefined)
      
      @scala.inline
      def setImagePathsVarargs(value: String*): Self = StObject.set(x, "imagePaths", js.Array(value :_*))
      
      @scala.inline
      def setSuccess(value: /* results */ SassResults => _): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  @js.native
  trait SassResults extends StObject {
    
    var css: String = js.native
    
    var map: String = js.native
    
    var stats: Duration = js.native
  }
  object SassResults {
    
    @scala.inline
    def apply(css: String, map: String, stats: Duration): SassResults = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[SassResults]
    }
    
    @scala.inline
    implicit class SassResultsMutableBuilder[Self <: SassResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Duration): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Sass
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Sass = ^
}
