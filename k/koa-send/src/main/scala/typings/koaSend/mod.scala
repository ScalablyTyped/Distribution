package typings.koaSend

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.ParameterizedContext
import typings.koaSend.koaSendBooleans.`false`
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-send", JSImport.Namespace)
  @js.native
  def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String): js.Promise[String] = js.native
  @JSImport("koa-send", JSImport.Namespace)
  @js.native
  def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String, opts: SendOptions): js.Promise[String] = js.native
  
  @js.native
  trait SendOptions extends StObject {
    
    /** Try to serve the brotli version of a file automatically when brotli is supported by a client and if the requested file with .br extension exists. (defaults to true). */
    var brotli: js.UndefOr[Boolean] = js.native
    
    /** Try to match extensions from passed array to search for file when no extension is sufficed in URL. First found is served. (defaults to false) */
    var extensions: js.UndefOr[js.Array[String] | `false`] = js.native
    
    /** If not false (defaults to true), format the path to serve static file servers and not require a trailing slash for directories, so that you can do both /directory and /directory/. */
    var format: js.UndefOr[Boolean] = js.native
    
    /** Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested file with .gz extension exists. (defaults to true). */
    var gzip: js.UndefOr[Boolean] = js.native
    
    /** Allow transfer of hidden files. (defaults to false) */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /** Tell the browser the resource is immutable and can be cached indefinitely. (defaults to false) */
    var immutable: js.UndefOr[Boolean] = js.native
    
    /** Name of the index file to serve automatically when visiting the root location. (defaults to none) */
    var index: js.UndefOr[String | `false`] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    /** Browser cache max-age in milliseconds. (defaults to 0) */
    var maxage: js.UndefOr[Double] = js.native
    
    /** Root directory to restrict file access. (defaults to '') */
    var root: js.UndefOr[String] = js.native
    
    /** Function to set custom headers on response. */
    var setHeaders: js.UndefOr[SetHeaders] = js.native
  }
  object SendOptions {
    
    @scala.inline
    def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrotli(value: Boolean): Self = StObject.set(x, "brotli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrotliUndefined: Self = StObject.set(x, "brotli", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String] | `false`): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      @scala.inline
      def setIndex(value: String | `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSetHeaders(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, /* path */ String, /* stats */ Stats) => js.Any
      ): Self = StObject.set(x, "setHeaders", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    }
  }
  
  type SetHeaders = js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, 
    /* path */ String, 
    /* stats */ Stats, 
    js.Any
  ]
}
