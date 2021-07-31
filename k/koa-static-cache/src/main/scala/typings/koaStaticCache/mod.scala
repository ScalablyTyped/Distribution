package typings.koaStaticCache

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dir: String): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: String, options: Unit, files: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: String, options: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: String, options: Files, files: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: String, options: Options): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: String, options: Options, files: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: Options, options: Unit, files: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: Options, options: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: Options, options: Files, files: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: Options, options: Options): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(dir: Options, options: Options, files: Files): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-static-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Files = StringDictionary[Options]
  
  trait Options extends StObject {
    
    var alias: js.UndefOr[js.Object] = js.undefined
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    var cacheControl: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var dynamic: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[Files] = js.undefined
    
    var filter: js.UndefOr[(js.Function1[/* path */ String, Boolean]) | js.Array[String]] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
    
    var usePrecompiledGzip: js.UndefOr[Boolean] = js.undefined
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
      def setAlias(value: js.Object): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      @scala.inline
      def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilter(value: (js.Function1[/* path */ String, Boolean]) | js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setUsePrecompiledGzip(value: Boolean): Self = StObject.set(x, "usePrecompiledGzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePrecompiledGzipUndefined: Self = StObject.set(x, "usePrecompiledGzip", js.undefined)
    }
  }
}
