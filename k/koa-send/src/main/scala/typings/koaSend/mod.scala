package typings.koaSend

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.ParameterizedContext
import typings.koaSend.koaSendBooleans.`false`
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(ctx: ParameterizedContext[DefaultState, DefaultContext], path: String, opts: SendOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("koa-send", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SendOptions extends StObject {
    
    /** Try to serve the brotli version of a file automatically when brotli is supported by a client and if the requested file with .br extension exists. (defaults to true). */
    var brotli: js.UndefOr[Boolean] = js.undefined
    
    /** Try to match extensions from passed array to search for file when no extension is sufficed in URL. First found is served. (defaults to false) */
    var extensions: js.UndefOr[js.Array[String] | `false`] = js.undefined
    
    /** If not false (defaults to true), format the path to serve static file servers and not require a trailing slash for directories, so that you can do both /directory and /directory/. */
    var format: js.UndefOr[Boolean] = js.undefined
    
    /** Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested file with .gz extension exists. (defaults to true). */
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    /** Allow transfer of hidden files. (defaults to false) */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** Tell the browser the resource is immutable and can be cached indefinitely. (defaults to false) */
    var immutable: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the index file to serve automatically when visiting the root location. (defaults to none) */
    var index: js.UndefOr[String | `false`] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /** Browser cache max-age in milliseconds. (defaults to 0) */
    var maxage: js.UndefOr[Double] = js.undefined
    
    /** Root directory to restrict file access. (defaults to '') */
    var root: js.UndefOr[String] = js.undefined
    
    /** Function to set custom headers on response. */
    var setHeaders: js.UndefOr[SetHeaders] = js.undefined
  }
  object SendOptions {
    
    inline def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    extension [Self <: SendOptions](x: Self) {
      
      inline def setBrotli(value: Boolean): Self = StObject.set(x, "brotli", value.asInstanceOf[js.Any])
      
      inline def setBrotliUndefined: Self = StObject.set(x, "brotli", js.undefined)
      
      inline def setExtensions(value: js.Array[String] | `false`): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      inline def setIndex(value: String | `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSetHeaders(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, /* path */ String, /* stats */ Stats) => js.Any
      ): Self = StObject.set(x, "setHeaders", js.Any.fromFunction3(value))
      
      inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    }
  }
  
  type SetHeaders = js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, 
    /* path */ String, 
    /* stats */ Stats, 
    js.Any
  ]
}
