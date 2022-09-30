package typings.gulpDartSass

import org.scalablytyped.runtime.Shortcut
import typings.gulpDartSass.anon.Duration
import typings.gulpDartSass.gulpDartSassStrings.async
import typings.gulpDartSass.gulpDartSassStrings.sync
import typings.sass.typesOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-dart-sass", JSImport.Namespace)
  @js.native
  val ^ : Sass = js.native
  
  trait GulpSassOptions
    extends StObject
       with SassOptions {
    
    var errLogToConsole: js.UndefOr[Boolean] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Any]] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function1[/* css */ String, Any]] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object GulpSassOptions {
    
    inline def apply(): GulpSassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpSassOptions]
    }
    
    extension [Self <: GulpSassOptions](x: Self) {
      
      inline def setErrLogToConsole(value: Boolean): Self = StObject.set(x, "errLogToConsole", value.asInstanceOf[js.Any])
      
      inline def setErrLogToConsoleUndefined: Self = StObject.set(x, "errLogToConsole", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: /* css */ String => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  @js.native
  trait Sass extends StObject {
    
    def apply(): Any = js.native
    def apply(opts: GulpSassOptions): Any = js.native
    
    def logError(): Unit = js.native
    def logError(error: String): Unit = js.native
    
    def sync(): Any = js.native
    def sync(options: GulpSassOptions): Any = js.native
  }
  
  trait SassOptions
    extends StObject
       with Options[sync | async] {
    
    var error: js.UndefOr[js.Function1[/* err */ js.Error, Any]] = js.undefined
    
    var imagePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var success: js.UndefOr[js.Function1[/* results */ SassResults, Any]] = js.undefined
  }
  object SassOptions {
    
    inline def apply(): SassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SassOptions]
    }
    
    extension [Self <: SassOptions](x: Self) {
      
      inline def setError(value: /* err */ js.Error => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setImagePaths(value: js.Array[String]): Self = StObject.set(x, "imagePaths", value.asInstanceOf[js.Any])
      
      inline def setImagePathsUndefined: Self = StObject.set(x, "imagePaths", js.undefined)
      
      inline def setImagePathsVarargs(value: String*): Self = StObject.set(x, "imagePaths", js.Array(value*))
      
      inline def setSuccess(value: /* results */ SassResults => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  trait SassResults extends StObject {
    
    var css: String
    
    var map: String
    
    var stats: Duration
  }
  object SassResults {
    
    inline def apply(css: String, map: String, stats: Duration): SassResults = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[SassResults]
    }
    
    extension [Self <: SassResults](x: Self) {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Duration): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Sass
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Sass = ^
}
